import java.util.GregorianCalendar; 

public class Student 
{
   //access modifiers: private, public
   //data fields (instance or static varibles), data fields should be private
   private String name, major, classes[];
   private int age, id;
   private GregorianCalendar dob; 
   //constructor(s), you can have one or more, has to be public, never returns a value, they have to be named exactly like the class
   public Student( String n ) 
   {
      this.name = n;
   }
   //methods (getter/setter)
   public String getName()
   {
      return this.name; 
   }
   public void setName(String newName) 
   {
      this.name = name; 
   }
   //toString method (special method because every method you write will have a toString method)
   
}