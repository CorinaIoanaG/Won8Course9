package Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Person> company = new ArrayList<>();

    public Person getManager() {
        for (Person item : company) {
            if (item.getPosition().equals("manager")) {
                return item;
            }
        }
        return null;
    }

    public List<Person> getPersons(String proffesion) {
        List<Person> persons = new ArrayList<>();
        for (Person item : company) {
            if (item.getPosition().equals(proffesion)) {
                persons.add(item);
            }
        }
        return persons;
    }

    public List<Person> getPersonsOlder(int age) {
        List<Person> persons = new ArrayList<>();
        for (Person item : company) {
            if (item.getAge() > age) {
                persons.add(item);
            }
        }
        return persons;
    }

    public List<Person> getPerson(String filterName) {
        List<Person> persons = new ArrayList<>();
        for (Person item : company) {
            if (item.getName().contains(filterName)) {
                persons.add(item);
            }
        }
        return persons;
    }

    public boolean employ(Person person) {
        if (getManager() == null) {
            company.add(person);
            return true;
        } else if (person.getPosition().equals("welder") || person.getPosition().equals("carpenter") ||
                person.getPosition().equals("plummer")) {
            company.add(person);
            return true;
        } else {
            return false;
        }
    }
}
