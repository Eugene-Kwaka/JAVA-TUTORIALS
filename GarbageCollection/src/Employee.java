public class Employee {
    private int id;
    private String name;
    private int age;
    private static int nextId = 1;
    // it is made static because it
    // is common among all and
    // shared by all objects
    
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Employee.nextId = nextId;
    }

    

    // Constructor method
    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.id = nextId++;
    }

    public void show()
    {
        System.out.println("Id=" + ID + "\nName=" + name
                + "\nAge=" + age);
    }
    public void showNextId()
    {
        System.out.println("Next employee id will be="
                + nextId);
    }

    protected void finalize()
    {
        --nextId;
        // In this case,
        // gc will call finalize()
        // for 2 times for 2 objects.
    }
}
