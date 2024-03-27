package n2exercici1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Restaurant> restaurantHashSet = new HashSet<Restaurant>();

        restaurantHashSet.add(new Restaurant("A", 1));
        restaurantHashSet.add(new Restaurant("A", 2));
        restaurantHashSet.add(new Restaurant("A", 1));
        restaurantHashSet.add(new Restaurant("B", 2));
        restaurantHashSet.add(new Restaurant("B", 2));
        restaurantHashSet.add(new Restaurant("B", 1));

        for(Restaurant a:restaurantHashSet){
            System.out.println(a.toString());
        }

    }
}
