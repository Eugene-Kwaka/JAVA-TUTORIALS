public class EqualsDemo {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        System.out.println(pizza1 == pizza2); // -> returns false because the two objects have different memmory addresses
        System.out.println(pizza1.equals(pizza2)); // -> returns true because the properties(size & toppings are the same)
    }
}

class Pizza{
    int size = 20;
    String topping = "pepperoni";
    // overriding the equals method
    public boolean equals(Object o){
        // if this (current object) and o(object compared with) have the same memory address, return true
        if (this == o){
            return true;
        }
        // if o is not an instance of the Pizza class, return false
        if (! (o instanceof Pizza)){
            return false;
        }
        // Downcasting o to be an object of type Pizza in a new variable called other
        Pizza other = (Pizza) o;
        // confirm that if the size and topping of this(current object) and other are equal, then return true
        if (this.size == other.size && this.topping.equals(other.topping)) {
                return true;
        }
        return false;

         
    }
}
