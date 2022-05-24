import java.util.ArrayList;

public class BoxMaxWeight extends Box {
    
    private int capacity;
    private ArrayList<Item> items;

    public BoxMaxWeight(int capacity) {
        
        this.capacity = capacity;
        
        this.items = new ArrayList<>();
    }

    @Override
   
    public void add(Item item) {
        if (item.getWeight() <= this.capacity) {
            this.items.add(item);
            
            this.capacity -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        
        return (this.items.contains(item));
    }
}