
public class SampleClass {
    public int a;
    public boolean b;

    //    implement a custom .equals(SampleClass other){} method here.
    public boolean equals(SampleClass other){
        if (this.a == other.a && this.b == other.b){
            return true;
        }
        else{
            return false;
        }
    }

    //    implement a custom .toString(){} method here.

    public String toString(){
        return "a=" + a + ", b=" + b;
    }
}

