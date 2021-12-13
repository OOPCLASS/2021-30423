package ro.utcluj;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // LIST
        List<Pair<Integer, String>> pairObjects = new LinkedList<>();
        Pair<Integer, String> firstPair = new Pair(1, "one");
        pairObjects.add(firstPair);
        Pair<Integer, String> secondPair = new Pair(2, "two");
        pairObjects.add(secondPair);
        Pair thirdPair = new Pair(3, "three");
        pairObjects.add(thirdPair);
        // add directly:
        pairObjects.add(new Pair<>(4, "four"));
        pairObjects.add(new Pair<>(5, "five"));
        pairObjects.add(new Pair<>(6, "six"));

        System.out.println(pairObjects.get(0)); // get its address

        printList(pairObjects);

        pairObjects.remove(4);

        System.out.println();
        printList(pairObjects);

        pairObjects.get(4).setLeft(5);
        pairObjects.get(4).setRight("five");

        System.out.println();
        printList(pairObjects);

        // SET
        HashSet<Pair<Integer, Integer>> pairSet = new HashSet<>();
        pairSet.add(new Pair<Integer, Integer>(1, 1));
        pairSet.add(new Pair<>(2, 4));
        pairSet.add(new Pair<>(3, 9));
        Pair hashPair = new Pair(4, 16);
        pairSet.add(hashPair);

        System.out.println();
        printSet(pairSet);

        // get an element at a certain index using a for loop
        // Notice the order of elements may be different from insertion

        int currentIndex = 0; // Iterator declaration
        int desiredIndex = 3; // Desired Index

        for (Pair element : pairSet) {
            // Implementing for loop
            if (currentIndex == desiredIndex) {
                System.out.println("Pair at index " + desiredIndex + " is: " + element.getLeft() + " - " + element.getRight());
                pairSet.remove(element); // remove that element
                break;
            }
            currentIndex++;
        }

        printSet(pairSet);

        // to update an element: remove it and then add a new one

        // MAP
        Map<String, Pair<String, String>> pairMap = new HashMap<>();
        pairMap.put("child", new Pair<>("father", "mother"));
        pairMap.put("father", new Pair<>("grandfather1", "grandmother1")); // added the elements
        pairMap.put("mother", new Pair<>("grandfather2", "grandmother2"));
        pairMap.put("grandfather1", new Pair<>("great-grandfather1", "great-grandmother2"));

        System.out.println();
        printMap(pairMap);

        pairMap.remove("grandfather1"); // remove one element
        System.out.println();
        printMap(pairMap);

        pairMap.put("mother", new Pair<>("grandpa", "grandma")); // update an element
        System.out.println();
        printMap(pairMap);

        // USER and its ADDRESSES
        User user1 = new User("John Brown", 12345678);
        List<Address> addresses1 = new LinkedList<>();
        addresses1.add(new Address("Mehedinti", 3));
        addresses1.add(new Address("Napoca", 7));

        User user2 = new User("Ana Popescu", 34526816);
        List<Address> addresses2 = new LinkedList<>();
        addresses2.add(new Address("Republicii", 43));

        User user3 = new User("Anca Boca", 67209671);
        List<Address> addresses3 = new LinkedList<>();
        addresses3.add( new Address("Morii", 493));
        addresses3.add( new Address("Traian Vuia", 123));
        addresses3.add( new Address("Baritiu", 72));

        User user4 = new User("Emma Brown", 12345677);
        List<Address> addresses4 = new LinkedList<>();
        addresses4.add( new Address("Mehedinti", 3));

        Map<User, List<Address>> register = new HashMap<>();
        register.put(user1, addresses1);
        register.put(user2, addresses2);
        register.put(user3, addresses3);
        register.put(user4, addresses4);

        // get a list of addresses by a specific user
        User specificUser = new User("John Brown", 12345678); // we should also check if this user exists
        List<Address> addressesOfSpecificUser = register.get(specificUser);
        if (addressesOfSpecificUser == null) {
            System.out.println("This user doesn't exist in our register");
        } else {
            System.out.println("The addresses of " + specificUser.getName() + " are:");
            for (Address address : addressesOfSpecificUser) {
                System.out.println(address.getStreet() + " " + address.getNumber());
            }
        }

        Set<Address> distinctAddresses = new HashSet<>();
        register.forEach((user, addresses) -> {
            List<Address> listOfAddresses = register.get(user);
            distinctAddresses.addAll(listOfAddresses);
        });
        System.out.println("The distinct addresses are: ");
        for (Address address : distinctAddresses) {
            System.out.println(address.getStreet() + " " + address.getNumber());
        }

        ArrayList<String> takeALook = new ArrayList<>();
        takeALook.add("Hello");
        takeALook.add("I");
        takeALook.add("am");
        takeALook.add("here");
        // private Object[] grow() { return grow(size + 1); }
        System.out.println("size: " + takeALook.size());
        takeALook.remove("Hello");
        // in the remove(Object o) method the following method will be called:
        // private void fastRemove(Object[] es, int i) {
        //        modCount++;
        //        final int newSize;
        //        if ((newSize = size - 1) > i)
        //            System.arraycopy(es, i + 1, es, i, newSize - i);
        //        es[size = newSize] = null;
        //    }
        System.out.println("size: " + takeALook.size());

        // Explore java streams at https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/s
    }

    private static void printList(List<Pair<Integer, String>> pairObjects) {
        for (Pair<Integer, String> pair : pairObjects) {
            System.out.println(pair.getLeft() + ": " + pair.getRight());
        }
    }

    private static void printSet(HashSet<Pair<Integer, Integer>> pairSet) {
        Iterator<Pair<Integer, Integer>> iterator = pairSet.iterator();
        while (iterator.hasNext()) {
            Pair currentPair = iterator.next();
            System.out.println(currentPair.getLeft() + " - " + currentPair.getRight());
        }
    }

    private static void printMap(Map<String, Pair<String, String>> pairMap) {
        for (Map.Entry<String, Pair<String, String>> entry : pairMap.entrySet()) { //get elements
            System.out.println("The parents of " + entry.getKey() + " are: " + entry.getValue().getLeft() + " and " + entry.getValue().getRight());
        }
    }
}
