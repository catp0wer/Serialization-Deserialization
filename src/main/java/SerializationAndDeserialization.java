import com.fasterxml.jackson.databind.*;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SerializationAndDeserialization {
    public static void main(String[] args) {
        Grade programming = new Grade(10, "Programming");
        Grade art = new Grade(10, "Art");
        Grade physics = new Grade(9, "physics");
        ArrayList<Grade> grade_list = new ArrayList<Grade>();
        grade_list.add(programming);
        grade_list.add(art);
        grade_list.add(physics);
        Book book = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");
        Hobby hobby1 = new Hobby("Swimming", 4);
        Hobby hobby2 = new Hobby("Yoga",6);
        ArrayList<Hobby> hobby_list = new ArrayList<Hobby>();
        hobby_list.add(hobby1);
        hobby_list.add(hobby2);


        Student student = new Student("Cat_p0wer",22,grade_list,book,hobby_list);
        ObjectMapper mapper = new ObjectMapper();

        try {
            //wrapping root element student
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            //serialization with Jackson (object to json)
            mapper.writeValue(new File("student.json"), student);

            //unwrapping the root element 'student'
            mapper.enable(DeserializationFeature.UNWRAP_ROOT_VALUE);
            //deserialization with Jackson library (json to object)
             Student obj = mapper.readValue(new File("student.json"),Student.class);
            String objPrint = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
            System.out.println(objPrint);

            //Serialization with Xstream  (object to xml)
            XStream xstream = new XStream();
            xstream.toXML(student, new FileWriter("studentxml.xml"));


        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
