class EmployeeCount
{
   // private field
    private int numOfEmployees = 0;
   
    // Setter method
   public void setNumOfEmployees (int count)
   {
       numOfEmployees = count;
   }

   // Getter method
   public int getNumOfEmployees () 
   {
       return numOfEmployees;
   }

   public int payroll(int averageSalary){
        int totalPayroll = numOfEmployees * averageSalary;
        return totalPayroll;
   }
}