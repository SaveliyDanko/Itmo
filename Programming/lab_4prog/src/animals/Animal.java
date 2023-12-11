package animals;


public abstract class Animal {
    private String name;

    protected Animal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }
}
