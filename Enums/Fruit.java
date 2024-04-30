// Enum type representing different types of fruits
enum Fruit {
    APPLE("Red", "Sweet"),   // Enum constants with properties
    BANANA("Yellow", "Tropical"),
    ORANGE("Orange", "Citrus");

    private final String color;   // Fields specific to each enum constant
    private final String taste;

    // Constructor for enum constants
    Fruit(String color, String taste) {
        this.color = color;
        this.taste = taste;
    }

    // Method to get the color of the fruit
    public String getColor() {
        return color;
    }

    // Method to get the taste of the fruit
    public String getTaste() {
        return taste;
    }

    // Override toString() to provide a custom string representation
    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }


    public static void main(String[] args) {
        // Accessing enum constants and calling methods
        Fruit apple = Fruit.APPLE;
        System.out.println("Type: " + apple);
        System.out.println("Color: " + apple.getColor());
        System.out.println("Taste: " + apple.getTaste());

        // Enum constants are objects
        for (Fruit fruit : Fruit.values()) {
            System.out.println("\nType: " + fruit);
            System.out.println("Color: " + fruit.getColor());
            System.out.println("Taste: " + fruit.getTaste());
        }
    }
}


