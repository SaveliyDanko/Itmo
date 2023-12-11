package people;

public class Father extends Person{
    public Father(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String silent(){
        return "silent";
    }
    public String tense(){
        return "tense";
    }
}
