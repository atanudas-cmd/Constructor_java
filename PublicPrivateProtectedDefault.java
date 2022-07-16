/**

 * 3. Apply private, public, protected and default access modifiers to the constructor
 * 4. Write constructors with return type int and String
 * 5. Try to call the constructor multiple times with the same object
 */



public class PublicPrivateProtectedDefault 
{
    int rollNo;
    String name;
    String clg;
    String city;

    {
        System.out.println("Student Details: ");}
   
    PublicPrivateProtectedDefault() {
        this(18);
    }


    public PublicPrivateProtectedDefault(int rollNo) {
        this("Atanu");
        this.rollNo = rollNo;
        System.out.println("rollNo : " + rollNo);
    }

    
    private PublicPrivateProtectedDefault(String name) {
        this("Adamas", "Kolkata");
        this.name = name;
        System.out.println("Name : " + name);
    }

   
    protected PublicPrivateProtectedDefault(String clg, String city) {
        this.clg = clg;
        this.city = city;
        System.out.println("college : " + clg);
        System.out.println("City : " + city);
    }

    public static void main(String[] args) {
        //calling the constructor multiple times with the same object
        PublicPrivateProtectedDefault obj = new PublicPrivateProtectedDefault();
    }
   
}