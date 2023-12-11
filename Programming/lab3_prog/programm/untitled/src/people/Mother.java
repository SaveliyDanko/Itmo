package people;

public class Mother extends Person{
    public Mother(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String silent(){
        return "silent";
    }
    public String tense(){
        return "tense";
    }
}
