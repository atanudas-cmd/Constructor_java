/**
 
 * 01. Write a class with a default constructor, one argument constructor and two argument
 * constructors. Instantiate the class to call all the constructors of that class from
 * a main class
 */

class Cons1 
{
    int rollNo;
    String name;
    String branch;

    //default constructor
    Cons1() 
    {
        System.out.println("Student Details");
    }

    //one argument constructor
    Cons1(int rollNo) {
        this.rollNo = rollNo;
        System.out.println("Roll No : " + this.rollNo);
    }

    //two argument constructor
    Cons1(String name, String branch) 
    {
        this.name = name;
        this.branch = branch;
        System.out.println("Name : " + this.name);
        System.out.println("Branch : " + this.branch);
    }
}

public class DefaultOneTwoArgument 
{
    public static void main(String args[]) 
    {
        //calling constructors from main class
        //creating objects and passing values
        new Cons1();
        
        new Cons1("Atanu", "ECE");
        new Cons1(18);
    }
}
