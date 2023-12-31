package places;

public abstract class Place{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

}
