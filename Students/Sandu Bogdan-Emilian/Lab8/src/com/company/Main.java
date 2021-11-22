package com.company;

import java.util.*;

/**
 * Didn't do all the CRUDE operations on SET, MAP, LIST etc.
 * Created 2 User classes because I interpreted wrong the assignment
 * (I came up to that conclusion later during the homework, and it was easier to just make a new class).
 */
public class Main {


    static void getUserAdr(User user, Set<User> users) {
        for (User u : users) {
            if (u.equals(user))
                Arrays.stream(u.getAddresses()).forEach(e -> System.out.println(e.getNumber()));
        }
    }

    public static void main(String[] args) {
        List<Pair<String>> pairsList = new LinkedList<>();
        pairsList.add(new Pair<>("5", "-5"));
        pairsList.add(new Pair<>("6", "-6"));
        pairsList.add(new Pair<>("7", "-7"));
        pairsList.add(new Pair<>("8", "-8"));


        pairsList.forEach(e -> System.out.println(e.getLeft() + " " + e.getRight()));
        System.out.println("---");

//
//        for (Pair<String> stringPair : pairsList) {
//            System.out.println(stringPair.getLeft() + " " + stringPair.getRight());
//        }
//        System.out.println("---");

        pairsList.remove(2);
        pairsList.get(2).setLeft("mhm");
        pairsList.get(2).setRight("sandvis");

        pairsList.forEach(e -> System.out.println(e.getLeft() + " " + e.getRight()));
        System.out.println("---");


        Set<Pair<Integer>> pairsSet = new HashSet<>();
        pairsSet.add(new Pair<>(1, -1));
        pairsSet.add(new Pair<>(1, -1));
        pairsSet.add(new Pair<>(2, -2));
        pairsSet.add(new Pair<>(3, -3));
        pairsSet.add(new Pair<>(4, -4));


        pairsSet.forEach(e -> System.out.println(e.getLeft() + " " + e.getRight()));
        System.out.println("---");

        Address[] addresses = new Address[3];
        addresses[0] = new Address("test", "test", "test", 0);
        addresses[1] = new Address("test", "test", "test", 1);
        addresses[2] = new Address("test", "test", "test", 2);
        User user = new User(addresses);

        Address[] addresses1 = new Address[3];
        addresses1[0] = new Address("test1", "test", "test", 5);
        addresses1[1] = new Address("test1", "test", "test", 6);
        addresses1[2] = new Address("test1", "test", "test", 7);
        User user1 = new User(addresses1);

        Address add1 = new Address("haha", "haha", "haha", 5);
        user.addAddress(add1);
        Arrays.stream(user.getAddresses()).forEach(e -> System.out.println(e.getNumber()));
        System.out.println("---");

        Set<User> users = new HashSet<>();
        users.add(user);
        users.add(user1);

        getUserAdr(user1, users);
        System.out.println("---");
        User1 uwu = new User1("bogdan");
        User1 uwu1 = new User1("Alex");

        Map<User1, Address[]> user1Map = new HashMap<>();
        user1Map.put(uwu, addresses);
        user1Map.put(uwu1, addresses1);

        System.out.println("yay maps");
        Arrays.stream(user1Map.get(uwu1)).forEach(e -> System.out.println(e.getNumber()));

        System.out.println("---");

        Set<Address> uniqueAddresses = new HashSet<>();
        for (Map.Entry<User1, Address[]> mapElement : user1Map.entrySet()) {
            uniqueAddresses.addAll(Arrays.asList(mapElement.getValue()));
        }

        uniqueAddresses.forEach(e -> System.out.println(e.getNumber()));
    }
}