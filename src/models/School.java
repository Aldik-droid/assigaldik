package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public void displayMembers() {
        for (Person member : members) {
            System.out.println(member.toString());
        }
    }
}
