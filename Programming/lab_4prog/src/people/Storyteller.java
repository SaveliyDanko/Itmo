package people;

public class Storyteller extends Person {
    public Storyteller(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String regret(Person person){
        return "regret " + person;
    }
    public String beKind(Person person){
        return "be kind to " + person;
    }
}
