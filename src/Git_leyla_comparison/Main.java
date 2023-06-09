package Git_leyla_comparison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", "Wonder-Wonder", 7));
        persons.add(new Person("Bunny", "Bugs-Bear", 80));
        persons.add(new Person("Darth", "Vader-Vader", 41));
        persons.add(new Person("Edward", "Hands", 23));
        persons.add(new Person("Bender", "Bending", 1066));

        Collections.sort(persons, new PersonComparator());
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}