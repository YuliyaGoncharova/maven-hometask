package org.example;
import com.google.gson.Gson;
import org.example.dto.PersonDto;


public class Main {
    public static void main(String[] args) {

        PersonDto person = new PersonDto("Yuliia", "Zablotska");
        System.out.println(new Gson().toJson(person));

    }
}