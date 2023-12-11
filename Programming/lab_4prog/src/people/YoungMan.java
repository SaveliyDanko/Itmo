package people;

public class YoungMan extends Person implements YoungManAction{
    public YoungMan(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String beRelative(Person person){
        return "be a relative to " + person;
    }
    public String beKind(Person person){
        return "be kind to " + person;
    }
}
