public class CovarianceDemo {
    public static void main(String[] args) {
        // Building a chair obj of type Chair with Furniture reference type
        Furniture chair = new Chair();
        Furniture table = new Table();

        //When the sell method takes an object of its actual subtype as its argument, it returns the subtype
        sell(chair); // -> Chair@1f32e575
        sell(table); // -> Table@279f2327
    }
   
    // The sell method takes an object of supertype Furniture
    public static void sell (Furniture obj){
        System.out.println(obj);
    }
    
}

class Furniture{}

class Chair extends Furniture{}

class Table extends Furniture{}