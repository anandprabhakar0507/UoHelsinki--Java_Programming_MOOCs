
public class Main {

    public static void main(String[] Container) {
        Container container = new Container(1000);
        container.printThings();
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
//    public static void addSuitcasesFullOfBricks(Container container){
//        for (int i  = 0; i < 44; i++){
//            Suitcase s = new Suitcase(100);
//            Thing b = new Thing("Brick", 1);
//            s.addThing(b);
//            container.addSuitcase(s);
//        }
//        
//        for (int i = 0; i < 44; i++){
//            for (int j = 0; j < 100; j++){
//                Thing b = new Thing("Brick", j+2);
//                container.getSuitcases().get(i).addThing(b);
//            }
//        }
//        
//    }
    
    public static void addSuitcasesFullOfBricks(Container container){
        int brickWeight = 1;
        
        for(int i = 0; i < 100; i++){
            Suitcase s = new Suitcase(100);
            Thing b = new Thing("Brick", brickWeight);
            s.addThing(b);
            container.addSuitcase(s);
            brickWeight++;
        }
        //brickWeight = s.heaviestThing().getWeight()+1;
    }
        
        
   

}
