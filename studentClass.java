// CONSTRUCTORS
public class studentClass {
    String name;
    int age;
    boolean isActive = true;

    // Parameterized constructors
    // constructor 1
    public studentClass(int age, String name){
        this.age = 26;
        this.name = name;
    }
    // constructor 2
    public studentClass(boolean isActive){
        this.isActive = isActive;
    }

    //main method
    public static void main(String[] args){
        studentClass prefect = new studentClass(false);
        studentClass gatherer = new studentClass(25, "Boniface");
        System.out.println(prefect);
        System.out.println(gatherer);
        
    }
}

// class Student5{  
//     int id;  
//     String name;  
//     int age;  
//     //creating two argument constructor  
//     Student5(int i,String n){  
//     id = i;  
//     name = n;  
//     }  
//     //creating three argument constructor  
//     Student5(int i,String n,int a){  
//     id = i;  
//     name = n;  
//     age=a;  
//     }  
//     void display(){System.out.println(id+" "+name+" "+age);}  
   
//     public static void main(String args[]){  
//     Student5 s1 = new Student5(111,"Karan");  
//     Student5 s2 = new Student5(222,"Aryan",25);  
//     s1.display();  
//     s2.display();  
//    }  
// } 