package people;

import bodypart.Eye;
import things.Thing;

import java.util.List;

public class UncleUlius extends Person implements UliusAction{
    public UncleUlius(String name, int age, Gender gender){
        super(name, age, gender);
    }
    public String beRelative(){
        return "be a relative";
    }
    public String liveInHouse(Thing thing){
        return "live in " + thing;
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

    public List<Eye> eyes;
}
