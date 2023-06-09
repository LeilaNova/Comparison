package Git_leyla_comparison;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        if (calclenSurname(o2) < calclenSurname(o1)) {
            return -1;
        }
        if (calclenSurname(o2) > calclenSurname(o1)) {
            return 1;
        }
        return o2.getAge() - o1.getAge();
    }

    protected int calclenSurname(Person person) {
        String surname = person.getSurname();
        return surname.split("-").length;
    }
}
