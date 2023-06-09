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

        Collections.sort(persons, (o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if (length2 < length1) {
                return -1;
            }
            if (length2 > length1) {
                return 1;
            }
            return o2.getAge() - o1.getAge();
        });

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}




