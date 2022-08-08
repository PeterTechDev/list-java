package application;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> AllStarList = new ArrayList<>();

        AllStarList.add("Lebron James");
        AllStarList.add("Kobe Bryant");
        AllStarList.add("Stephen Curry");
        AllStarList.add("Jayson Tatum");

        for(String player : AllStarList) {
            System.out.println(player);
        }
    }
}
