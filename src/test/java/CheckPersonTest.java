import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class CheckPersonTest {
    @Test
    public void testLocalClass() {
        //Given
        List<Person> listOfPeople = new ArrayList<>();
        listOfPeople.add(new Person("Pebbles", LocalDate.of(2018, Month.MARCH, 4), Person.Sex.FEMALE, "pebbles@cute.com"));
        listOfPeople.add(new Person("Mitty", LocalDate.of(2012, Month.OCTOBER, 21), Person.Sex.MALE, "mitty@cute.com"));
        listOfPeople.add(new Person("Oreo", LocalDate.of(2021, Month.MARCH, 20), Person.Sex.FEMALE, "oreo@cute.com"));
        listOfPeople.add(new Person("Hammy", LocalDate.of(2020, Month.JULY, 15), Person.Sex.FEMALE, "hammy@cute.com"));

        CheckPerson tester = new CheckPerson();

        //When
        Person.printPersons(listOfPeople, tester);
    }
}
