package org.example;
import com.google.gson.Gson;
import org.example.dto.PersonDto;


public class Main {
    public static void main(String[] args) {
//        String personData = "{\n"
//            + "    \"name\": \"Alya\",\n"
//            +"    \"lastName\": \"Zablotska\"\n"
//            +"}";
//        PersonDto person = new Gson().fromJson(personData, PersonDto.class);
//        System.out.println(person.getName() + " " + person.getLastName());

        PersonDto person = new PersonDto("Yulia", "Zablotska");

//        Gson personToGson = new Gson();
//        String personToJson = personToGson.toJson(person);
//        String personToJson = new Gson().toJson(person);
//        System.out.println(personToJson);
        System.out.println("My data in Json = " + new Gson().toJson(person));








    }
}