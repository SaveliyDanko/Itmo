package people;

import bodypart.Eye;
import places.Place;
import things.Thing;

import java.util.List;

public class UncleUlius extends Person implements UliusAction{
    public UncleUlius(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String beRelative(){
        return " be a relative ";
    }
    public String liveIn(String str){
        return " live in " + str;
    }
    public String liveIn(Thing thing){
        return " live in " + thing;
    }
    public String liveIn(Place place){
        return "live in " + place;
    }
    public String torment(){
        return "torment";
    }
    public String cry(){
        return "cry";
    }
    public String step(){
        return "step";
    }
    public String picky() {
        return "picky";
    }
    public String visit(){
        return "visit";
    }
    public String have(){
        return " have ";
    }

    public String spent(){
        return " spent ";
    }

    public String go(){
        return " go ";
    }

    public String resist(){
        return " resist ";
    }

    public String say(String str){
        return " say " + str;
    }

    public String consult(Person person){
        return " consult with " + person;
    }

    public List<Eye> eyes;
}
