package practical1;

public class Main{
    static void myMethod(String fname) { 
        // parameter are specified after the method name
        // can call any parameters as you want, just separate them with a commna
        // The following example has a method that takes a String called fname as parameter
        // When the method is called, we pass along a first name,
        // which is used inside the method to print the full name
        System.out.println(fname + " Refsnes");
    }

    public static void main (String[] args){
        myMethod("Anna");
        myMethod("Jenny");
        myMethod("Anja"); 
    }
}
// output are the name these 3 person with the same last name Refsnes
// When a parameter is passed to the method, it is called an argument. 
// from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.
// when working with multiple parameters, the method call must have the same number of arguments as there are parameters