public enum Compass {
    NORTH("North", 0),
    EAST("East", 90),
    SOUTH("South", 180),
    WEST("West", 270);

    // Fields specific to each enum constant
    private final String direction;  
    private final int degrees;

    // Constructor for enum constants
    Compass(String direction, int degrees) {
        this.direction = direction;
        this.degrees = degrees;
    }

    // Method to get the direction
    public String getDirection() {
        return direction;
    }

    // Method to get the degrees of the direction
    public int getDegrees() {
        return degrees;
    }

    // Override toString() to provide a custom string representation
    @Override
    public String toString() {
        return direction;
    }

    public static void main(String[] args) {
        // Accessing enum constants and calling methods
        Compass north = Compass.NORTH;
        System.out.println("Direction: " + north.getDirection());
        System.out.println("Degrees: " + north.getDegrees());

        // the values() class returns an array of constants that can be iterated over
        for (Compass compass : Compass.values()) {
            System.out.println("\nDirection: " + compass.getDirection());
            System.out.println("Degrees: " + compass.getDegrees());
        }
    }
}
