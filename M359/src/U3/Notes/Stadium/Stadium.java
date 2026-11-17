package U3.Notes.Stadium;

public class Stadium {
    //Stadium:
    //○ String variables: name, city, and state.
    //○ int variable: capacity
    //○ Constructor that takes parameters for all four variables
    //○ Constructor that takes a Stadium object
    //○ toString that returns a String in this format:
    //■ Soldier Field, Chicago, IL (61500 seats)
    //○ get/set methods for all variables
    private String name, city, state;
    private  int capacity;

    public Stadium(String name, String city, String state, int capacity) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.capacity = capacity;
    }

    public Stadium(Stadium a) {
        this.name = a.name;
        this.city = a.city;
        this.state = a.state;
        this.capacity = a.capacity;
    }
    public String toString(){
        return name + ", " + city + ", " + state + " (" + capacity + " seats)";
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
