public class vehicle {
    // int is used if the variable can accept up to 2,000,000,000
    int speed = 20000000;

    // for shorter numbers use Byte. Numbers < 127.
    byte wheels = 4;

    // short is used if the number < 2000.
    short weight = 2000;

    // Single char for type of Fuel. 'D' for Diesel. It only works with single quotes
    char fuel = 'D';

    //Boolean to show whether the Engine can run.
    boolean running = true;

    // When writing Long data types, it is encouraged that they end with 'L'. Best practices.
    long serial = 123456789054L;
    
    // if float is declared, the value needs to end with an 'f' similar to Long
    float fuelRemaining = 100.12243543554f; // -> Float will display 100.123 

    // NON PRIMITIVE DATA TYPES
    String carMake = "Tesla";

    void accelarate(){

    }
}
