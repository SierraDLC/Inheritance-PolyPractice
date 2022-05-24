
public class HerdMain {

    public static void main(String[] args) {
        
        Herd herd = new Herd();
        herd.addToHerd(new Organism(42, 41));
        herd.addToHerd(new Organism(56, 95));
        herd.addToHerd(new Organism(76, 24));
        herd.addToHerd(new Organism(57, 107));
        System.out.println(herd);
        
        
        System.out.println("\n Moving...");
        
        herd.move(42, 24);
        
        System.out.println(herd);
        
    }
}