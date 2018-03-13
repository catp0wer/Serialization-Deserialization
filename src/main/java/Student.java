import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
@JsonIgnoreProperties
//({"student"})
@JsonRootName(value = "student")
public class Student {
    String name;
    int age;
    ArrayList<Grade> grades;
    Book book;
    ArrayList<Hobby> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Grade> grades) {
        this.grades = grades;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student(String name, int age, ArrayList<Grade> grades, Book book, ArrayList<Hobby> hobby){
        this.name = name;
        this.age = age;
        this.grades = grades;
        this.book = book;
        this.hobby = hobby;

    }


    public ArrayList<Hobby> getHobby() {
        return hobby;
    }

    public void setHobby(ArrayList<Hobby> hobby) {
        this.hobby = hobby;
    }


    public Student(){}
}