package n2exercici2;

import java.util.Comparator;

class SortedRestaurants implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant a, Restaurant b) {
        int i = a.getName().compareTo(b.getName());
        int j = (i != 0) ? i : Integer.compare(a.getPuntuacio(), b.getPuntuacio());
        return j;
    }
}
