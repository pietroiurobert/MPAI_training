/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionalinterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author null
 */
public class Person {

    public String name;
    public Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static void printMap() {
        Person p1 = new Person("aaa", 25);
        Person p2 = new Person("bbb", 29);
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        Map<String, Integer> map = persons.stream().collect(Collectors.toMap(p -> p.name, p -> p.age));
        System.out.println(map);
    }

    public static void printCustom() {
        Person p1 = new Person("aaa", 25);
        Person p2 = new Person("bbb", 29);
        List<Person> persons = new ArrayList<Person>();
        persons.add(p1);
        persons.add(p2);
        String s = persons.stream().collect(Collector.of(
        () -> new StringJoiner(" | "),          
        (j, p) -> j.add(p.name.toUpperCase()).add(p.age.toString()),
        (j1, j2) -> j1.merge(j2),               
        StringJoiner::toString));
        System.out.println(s);
    }

    public static void main(String[] args) {
//        printMap();
        printCustom();
    }
}
