import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Pebbles", LocalDate.of(2018, Month.MARCH, 4), Person.Sex.FEMALE, "pebbles@cute.com"));
        listOfPeople.add(new Person("Mitty", LocalDate.of(2012, Month.OCTOBER, 21), Person.Sex.MALE, "mitty@cute.com"));
        listOfPeople.add(new Person("Oreo", LocalDate.of(2021, Month.MARCH, 20), Person.Sex.FEMALE, "oreo@cute.com"));
        listOfPeople.add(new Person("Hammy", LocalDate.of(2020, Month.JULY, 15), Person.Sex.FEMALE, "hammy@cute.com"));

        CheckPerson tester = new CheckPerson();

        Person.printPersons(listOfPeople, tester);

        //Local Class
        printing(listOfPeople, new CheckPerson());

        //Anonymous Class
        CheckPersonInterface anonymous = new CheckPersonInterface() {
            @Override
            public boolean test(Person p) {
                return p.getAge() == -1;
            }
        };
        printing(listOfPeople, anonymous);

        //Lambda
        printing(listOfPeople, (Person p) -> p.getGender() == Person.Sex.FEMALE);
        printing(listOfPeople, (Person p) -> p.getAge() >= 10);
    }



    private static void printing(List<Person> people, CheckPersonInterface tester) {
        System.out.println();
        Person.printPersons(people, tester);
    }
}
