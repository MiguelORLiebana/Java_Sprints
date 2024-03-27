package n2exercici2;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurantHashSet = new HashSet<Restaurant>();

        restaurantHashSet.add(new Restaurant("A", 1));
        restaurantHashSet.add(new Restaurant("A", 2));
        restaurantHashSet.add(new Restaurant("A", 1));
        restaurantHashSet.add(new Restaurant("B", 2));
        restaurantHashSet.add(new Restaurant("B", 2));
        restaurantHashSet.add(new Restaurant("B", 1));
        restaurantHashSet.add(new Restaurant("D", 1));
        restaurantHashSet.add(new Restaurant("E", 5));
        restaurantHashSet.add(new Restaurant("E", 1));
        restaurantHashSet.add(new Restaurant("Z", 1));
        restaurantHashSet.add(new Restaurant("Z", 3));

        List<Restaurant> ListR = new ArrayList<Restaurant>(restaurantHashSet);
        Collections.sort(ListR, new SortedRestaurants());

        for(Object a:ListR){
            System.out.println(a.toString());
        }

    }
}

