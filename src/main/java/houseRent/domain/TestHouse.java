package houseRent.domain;

public class TestHouse {
    public static void main(String[] args) {


        House house = new House(3, "mary", 116, "昌平区", 1500, "已出租");
        System.out.println(house.toString());

    }

}
