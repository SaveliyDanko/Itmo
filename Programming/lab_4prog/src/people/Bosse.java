package people;

import bodypart.BodyPart;
import things.Thing;

public class Bosse extends Person{
    public Bosse(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String escape(Thing thing){
        return "escape" + " " + thing;
    }
    public String avoid(Person person){
        return "avoid" + " " + person;
    }

    public String avoid(BodyPart bodyPart){
        return "avoid" + " " + bodyPart;
    }
    public String avoid(String string){
        return "avoid" + " " + string;
    }
}
