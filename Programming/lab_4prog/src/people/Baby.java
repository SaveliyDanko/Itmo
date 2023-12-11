package people;

public class Baby extends Person{
    public Baby(String name, int age, Gender gender) {
        super(name, age, gender);
    }
    public String beKind(){
        return " be kind ";
    }

    public String annoy(){
        return " annoy";
    }

    public String draw(){
        return " draw ";
    }
}
