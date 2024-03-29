public class CovarianceDemo {
    public static void main(String[] args) {
        // Building a chair obj of type Chair with Furniture reference type
        Furniture chair = new Chair();
        Furniture table = new Table();
        sell(chair);
        sell(table);
    }
   
    public static void sell (Furniture obj){
        System.out.println(obj);
    }
}

class Furniture{}

class Chair extends Furniture{}

class Table extends Furniture{}