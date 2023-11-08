package VariableScopes;

public class InstanceVariable {
    //variable visible to any child class
    public String pName;
    //variable visible to product class only
    private double pPrice;
    //creating a constructor and parsed product name as a parameter
    public InstanceVariable (String pName)
    {
        this.pName = pName;
    }
    //function sets the product price
    public void setPrice(double pPrice)
    {
        this.pPrice= pPrice;
    }
    //method prints all product info
    public void getInfo()
    {
        System.out.println("Product Name: " + this.pName );
        System.out.println("Product Price: " + this.pPrice);
    }
    public static void main(String[] args)
    {
        InstanceVariable pro = new InstanceVariable("Mac Book");
        pro.setPrice(65000);
        pro.getInfo();
    }
}
