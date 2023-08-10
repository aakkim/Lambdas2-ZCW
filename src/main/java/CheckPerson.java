public class CheckPerson implements CheckPersonInterface{
    @Override
    public boolean test(Person p) { //filters ppl based on conditions provided
        return (p.getAge() != -1 || p.getGender() != null); //check if there is an age & gender
    }
}
