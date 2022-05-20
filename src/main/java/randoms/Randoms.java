package randoms;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;


    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator();
    }

    private class RandomsIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            //т.к. итерация бесконечна
            return true;
        }

        @Override
        public Integer next() {
            random = new Random();
            //генерируем случайное число
            int randomValue = random.nextInt(max + 1 - min) + min;
            return randomValue;
        }
    }
}
