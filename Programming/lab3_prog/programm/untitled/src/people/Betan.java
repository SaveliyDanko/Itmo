package people;

import bodypart.BodyPart;
import jdk.jshell.PersistentSnippet;
import things.Thing;

public class Betan extends Person{
    public Betan(String name, int age, Gender gender){
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
