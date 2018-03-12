import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Serialization {
    public static void main(String[] args) {
        Grade programming = new Grade(10, "Programming");
        Grade art = new Grade(10, "Art");
        Grade physics = new Grade(9, "physics");
        ArrayList<Grade> my_list = new ArrayList<Grade>();
        my_list.add(programming);
        my_list.add(art);
        my_list.add(physics);
        Book book = new Book("Sapiens: A Brief History of Humankind", "Yuval Noah Harari");

        Student student = new Student("Cat_p0wer",22,my_list,book);
        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
            mapper.writeValue(new File("student.json"), student);
        }catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
