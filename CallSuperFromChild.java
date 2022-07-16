/**
 
 * 02. Call the constructors(both default and argument constructors) of super class from a child
 * class
 */


class Animal 
{

        // default  constructor
        Animal() 
        {
          System.out.println("I am an animal");
        }
      
        // parameterized constructor
        Animal(String type) 
        {
          System.out.println("Type: "+type);
        }
}
      
      class Dog extends Animal 
      {
      
        // default constructor
        Dog() 
        {
      
          // calling parameterized constructor of the superclass
          super("Animal");
      
          System.out.println("I am a dog");
        }
      }
      
      class Main 
      {
        public static void main(String[] args) 
        {
          Dog dog = new Dog();
        }
      }