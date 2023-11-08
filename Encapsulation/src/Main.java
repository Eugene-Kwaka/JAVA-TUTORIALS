public class Main {
    public static void main(String args[])
  {
      EmployeeCount obj = new EmployeeCount ();
      obj.setNumOfEmployees(5613);
      System.out.println("No Of Employees: "+ obj.getNumOfEmployees());
      System.out.println("The company pays a total salary of $" + obj.payroll(5000));

      // System.out.println(numOfEmployees); // compilation error - cannot access numOfEmployees
  }
}
