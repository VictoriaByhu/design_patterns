package behavioral.iterator;

public class ItemInventory implements Inventory {
    private String[] items = {"Sword", "Potion", "Shield", "Map"};

    @Override
    public MyIterator createIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements MyIterator {
        private int position = 0;

        @Override
        public boolean hasNext() {
            return position < items.length;
        }

        @Override
        public Object next() {
            return items[position++];
        }
    }
}
