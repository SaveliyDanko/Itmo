package places;

public class Town extends Place{
    private final Hotel hotel = new Hotel("Hotel");
    public Town(String name) {
        super(name);
    }

    public String openHotel(){
        return hotel.toString();
    }

    static class Hotel{
        private final String name;

        public Hotel(String name){
            this.name = name;
        }
        public String toString(){
            return name;
        }
    }
}
