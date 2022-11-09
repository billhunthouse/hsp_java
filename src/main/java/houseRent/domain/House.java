package houseRent.domain;

public class House {
    private int id;
    private String name;
    private int number;
    private String address;
    private int rent;
    private String state;

    public House(int id, String name, int number, String address, int rent, String state) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRent() {
        return rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    public String toString() {
        return
                id +
                "\t" + name  +
                "\t" + number +
                "\t" + address +
                "\t" + rent +
                "\t" + state ;

    }

}
