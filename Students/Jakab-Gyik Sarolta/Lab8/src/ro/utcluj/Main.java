package ro.utcluj;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//map = hash table in C
//collections: lists, arraylists, linkedlists - dont have to specify the size
//sequential memory, time complexities => choose which data structure to use
//set = elements unique
//always use common interface as a type
//treeset, hashset
//map - all the keys are unique - if you add an old key, u just update the old value, the most common mistake
//must overwrite hash method together with equals method
/**
 * - Implement Pair generic class
 *      - it should have two attributes named 'left' & 'right'
 *      - create a list of pair objects
 * - Perform the following operations on a list, set and map: CRUD operations
 *      - add one element
 *      - get one element
 *      - remove one element
 *      - update one element
 * - A User can have multiple Address(es) - create the 2 classes
 *      - choose a collection to store users&addresses objects so that you could
 *      get a list of addresses by a specific user
 *      - choose a different collection to store all the addresses of all users with
 *      no duplicates
 *      - take a look at the implementation of ArrayList.add method and note how the
 *      data structure gets resized. What happens with the data structure on removing elements
 *
 *
 * - Explore java streams (search for online tutorials)
 *      e.g.: https://winterbe.com/posts/2014/07/31/java8-stream-tutorial-examples/
 *
 *      Lambda expressions - functional programming in Java
 *          -> an anonymous function that doesnt have a name
 *          -> doesnt belong to any class
 *          -> it provides a clear way to represent a method interface via an expression
 *          -> always connected with a functional interface
 *     PARAMETER->EXPRESSION BODY
 *     Functional interface:
 *     1. an interface that contains exactly 1 abstract method
 *     2. it can have any nr of default or static methods along with object class methods
 *     3. java provides predefined interfaces to deal with functional programming
 *     4. ex: Runnable, ActionListener, comparable
 * @FunctionalInterface annotation
 *
 * ex: interface Cab{
 *     void bookCab();
 * }
 * public class LambdaApp{
 *     Cab cab = ()->{
 *         System.out.println("Cab booked!!");
 *     }
 *     cab.bookCab();
 * }
 *      Lambda parameters:
 *      zero, one or multiple parameters
 *
 * ex: interface Cab{
 *  *     void bookCab(String source, String destination);
 *  * }
 *  * public class LambdaApp{
 *  *     Cab cab = (source, destination)->{
 *  *         System.out.println("Cab booked from " + source + " to " + destination + "!!");
 *  *     }
 *  *     cab.bookCab("Kolozsvar", "Kisbacs");
 *  * }
 *
 *      Variable capture: local variable, instance variable, static variable
 *      Method references as Lambdas:
 */
public class Main {

    public static void main(String[] args) {

        /*IntegerBox integerBox1 = new IntegerBox(123);

        String[] namesVector = new String[10];
        // List<String> names = new ArrayList<>();
        List<String> names = new ArrayList<>();
        Map<String, IntegerBox> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            names.add(String.valueOf(i));
        }

        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String currentName = iterator.next();
            if (currentName.equals("0")) {
                iterator.remove();
            }
        }*/
        Pair<String> newString = new Pair<>("leftBranch", "rightBranch");
        Pair<Integer> newInt = new Pair<>(11, 12);
        Pair<Double> newDouble = new Pair<>(11.1, 12.2);
        List<Pair> newPair = new ArrayList<>();
        newPair.add(newString);
        newPair.add(newInt);
        newPair.add(newDouble);
        if (newPair.isEmpty()){
            System.out.println("The list is empty");
        }
        else{
            System.out.println("The list contains elements");
        }
        System.out.println("The size of the list is: " + newPair.size());
        for(int i = 0; i < newPair.size(); i++) {
            System.out.print(newPair.get(i));
        }
        for(int i = 0; i < newPair.size(); i++) {
            System.out.println(newPair.toString());
        }
        newPair.remove(newInt);
        System.out.println(newPair.toString());
        Pair<String> newString1 = new Pair<>("leftBranch1", "rightBranch1");
        Pair<Integer> newInt1 = new Pair<>(11, 12);
        Pair<Double> newDouble1 = new Pair<>(11.11, 12.22);
        List<Pair> newPair1 = new ArrayList<>();
        newPair1.add(newString1);
        newPair1.add(newInt1);
        newPair1.add(newDouble1);
        System.out.println("Elements to be removed:" + newPair1.toString());
        newPair.removeAll(newPair1);
        System.out.println(newPair.toString());


        List<String> myList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        System.out.println(myList.get(2));
        System.out.println(myList.toString());
        myList.set(2, "hohoho");
        myList.remove(1);
        System.out.println(myList.toString());
        myLinkedList.add("hey");
        myLinkedList.add("ho");
        myLinkedList.add("oh");
        myLinkedList.add("lol");
        System.out.println(myLinkedList.toString());
        myLinkedList.addAll(myList);
        System.out.println(myLinkedList.toString());
        //look at steams!! - more readable code, more straight forward

        User user1 = new User("Martha", 22, "mypassw");
        User user2 = new User("Josh", 34, "heyho");
        User user3 = new User("Anne", 26, "secret");
        User user4 = new User("Pali", 66, "whoami");
        Address add1 = new Address("St Andrews drive", 4719, 1, "Baytown");
        Address add2 = new Address("Buffalo street", 22, 3, "Clearlake");
       Address add3 = new Address("Transylvania street", 56, 1, "Pasadena");
       Address add4 = new Address("Fishers drive", 768, 5, "New Haven");

        HashSet<User> hs = new HashSet<User>();
        hs.add(user1);
        hs.add(user2);
        hs.add(user3);
        hs.add(user4);
        System.out.println("Before removing any item from hash set:\n" + hs);

        hs.remove(user2);
        System.out.println("The new hash set is:\n" + hs);

        hs.add(null);
        hs.add(null);
        System.out.println(hs);

        HashMap <User,Address> hm = new HashMap<User, Address>();

        hm.put(user1, add1);
        hm.put(user2, add4);
        hm.put(user3, add2);
        hm.put(user4, add3);
        //for some reason none of these options print the map, they only print their memory location
        System.out.println(Arrays.asList(hm));
        hm.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        hm.put(user1, add1); //it updates the value since it is a duplicate->no change
        System.out.println("The has map is:\n" + hm);

        /*List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        myList.stream() //intermediate op-s
                .filter(s -> s.startsWith("c")) //lambda expression
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println); //terminal op

        Arrays.asList("a1", "a2", "a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);  // a1

        Stream.of("a1", "a2", "a3") //without creating an array
                .findFirst()
                .ifPresent(System.out::println);  // a1

        IntStream.range(1, 4) //to work with int-s
                .forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3})
                .map(n -> 2 * n + 1)
                .average()
                .ifPresent(System.out::println);  // 5.0

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1)) //"1", "2", "3"
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);  // 3

        IntStream.range(1, 4)
                .mapToObj(i -> "a" + i) //transform a primitive stream to object stream
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                }) //this only executes if the terminal operation is there
                .forEach(s -> System.out.println("forEach: " + s));

        Stream.of("d2", "a2", "b1", "b3", "c")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A"); //stops at A
                });*/
    }
}
