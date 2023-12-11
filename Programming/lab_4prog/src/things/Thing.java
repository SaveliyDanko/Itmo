package things;

public abstract class Thing {
    private String name;
    private String matereal;
    Thing(String name, String matereal){
        this.name = name;
        this.matereal = matereal;
    }
    @Override
    public String toString(){
        return name;
    }
}
