package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
        System.out.println("Tamanho da lista: " + AllStarList.size());



        System.out.println("--------------------------------");

        AllStarList.remove(1);
        AllStarList.removeIf(player -> player.charAt(0) == 'S');
        for(String player : AllStarList) {
            System.out.println(player);
        }
        System.out.println("Tamanho da lista: " + AllStarList.size());
        System.out.println("Index of James Harden: " + AllStarList.indexOf("James Harden")); // quiando não encontra shows -1
        List<String> result = AllStarList.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }
        System.out.println("--------------------------------");
        String name = AllStarList.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
