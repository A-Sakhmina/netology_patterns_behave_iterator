package randoms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    ;
    private List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        int randomValue = 0;
        int stopValue = 100;
        while (randomValue != stopValue) {
            randomValue = random.nextInt(max + 1 - min) + min;
            list.add(randomValue);
        }
    }

    @Override
    public Iterator<Integer> iterator() {

        return new Iterator<Integer>() {
            int indexNext = 0;

            @Override
            public boolean hasNext() {
                return indexNext < list.size();
            }

            @Override
            public Integer next() {
                int value = list.get(indexNext);
                indexNext++;
                return value;
            }
        };
    }

    //...
}
