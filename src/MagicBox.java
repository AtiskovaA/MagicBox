import java.util.Random;

public class MagicBox<T> {

    private int maxObjects;
    private T[] items;
    private int itemsNew = 0;


    public MagicBox(int maxObjects) {
        this.maxObjects = maxObjects;
        this.items = (T[]) new Object[maxObjects];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
            } else {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        T randomP;
        for (int i = 0; i < items.length; i++) {
            if (null == items[i]) {
                itemsNew = items.length - i;
                throw new RuntimeException("Коробка не полная, осталось ячеек " + itemsNew);
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(items.length);
        randomP = items[randomInt];
        return randomP;
    }
}
