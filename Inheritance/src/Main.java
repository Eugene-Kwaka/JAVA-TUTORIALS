public class Main {
    public static void main(String[] args) {
        /* dex is object of the Dog class and is stored in a reference variable of type Dog. 
           dex has full access to all the members and methods defined in both the Dog class and its superclass, Animal.
        */
        Dog dex = new Dog();
        dex.speak();
        dex.hunted();
        dex.hunter();

        /* chi is an object of type Dog class but stored in a reference to type Animal.
           chi can only access the members and methods defined in the Animal class, 
           even though it refers to an actual object of the Dog class.
           chi can only invoke methods and access fields COMMON TO BOTH ANIMAL AND DOG classes */
        // THIS IS A FORM OF UPCASTNG
        Animal chi = new Dog();
        chi.speak();
        chi.hunted();
        //chi.hunter();
        
    }
}




