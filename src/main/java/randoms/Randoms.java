package randoms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private List<Integer> list = new ArrayList<>();

    public Randoms(int min, int max) {
        random = new Random();
        list.add(random.nextInt(max) + min);
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
