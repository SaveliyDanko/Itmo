package people;

import javax.naming.ldap.PagedResultsResponseControl;

public abstract class Person {
    private String name;
    private int age;
    private Gender gender;

    protected Person(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    @Override
    public String toString(){
        return name;
    }

}
