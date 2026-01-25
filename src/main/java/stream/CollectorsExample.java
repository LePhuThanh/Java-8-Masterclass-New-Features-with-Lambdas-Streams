package main.java.stream;

import main.java.entity.Person;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectorsExample {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        try (
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            CollectorsExample.class.getResourceAsStream("people.txt")));


            Stream<String> stream = reader.lines();
        ){
            stream.map(line -> {
                String[] s = line.split(" ");
                Person p = new Person(s[0].trim(), Integer.parseInt(s[1]));
                persons.add(p);
                return p;
            })
                    .forEach(System.out::println);

        }catch(IOException ex){
            System.out.println(ex);
        }
    }
}
