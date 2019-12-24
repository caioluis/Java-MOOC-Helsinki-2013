
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
     public static void addSuitcasesFullOfBricks(Container container){
         for (int i = 1; i < 100; i++) {
            Thing brick = new Thing("Brick", i);
            Suitcase x = new Suitcase(100);
            x.addThing(brick);
            container.addSuitcase(x);
         }
     }

}
