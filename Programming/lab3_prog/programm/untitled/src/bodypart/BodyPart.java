package bodypart;

import people.Person;

import java.security.SecureRandom;

public abstract class BodyPart {
    protected String name;
    protected BodyPart(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return name;
    }
    public String affiliation(Person person){
        return person + " " + name;
    }
}
