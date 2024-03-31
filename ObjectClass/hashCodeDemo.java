public class hashCodeDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        pizza1.size = 10;
        pizza1.topping = "pepperoni";
        System.out.println(pizza1.hashCode());
        
        Pizza pizza2 = new Pizza();
        pizza2.size = 12;
        pizza2.topping = "steak";
        System.out.println(pizza2.hashCode());
    }
}

class Pizza{
    int size = 0;
    String topping = null;
    public int hashCode(){
        if (topping != null){
            return size * topping.hashCode();
        } else{
            return size;
        }
        
    }
    

         
}

