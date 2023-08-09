import org.junit.Assert;
import org.junit.Test;

import java.time.Month;

public class PersonTest {
    @Test
    public void getAge() {
        //Given
        int expected = 4;
        Person p = new Person();
        p.setBirthday(2018, Month.DECEMBER, 25);
        //When
        int actual = p.getAge();
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getGender() {
        //Given
        Person.Sex expected = Person.Sex.FEMALE;
        Person p = new Person();
        p.setGender(expected);
        //When
        Person.Sex actual = p.getGender();
        //Then
        Assert.assertEquals(expected, actual);
    }
}
