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
        AllStarList.add(2, "Jaylen Brown");

        for(String player : AllStarList) {
            System.out.println(player);
        }
        System.out.println(AllStarList.size());


        System.out.println("--------------------------------");

        AllStarList.remove(1);
        AllStarList.removeIf(player -> player.charAt(0) == 'S');
        for(String player : AllStarList) {
            System.out.println(player);
        }
        System.out.println(AllStarList.size());

    }
}
