import java.util.Arrays;
//located in the same directory
public class Student extends Person
{
   //declare all fields (instance variables)
   private String email;
   private int[] grades;
   private String[] classes;
      
   //multiple argument constructor (executed when Student object is created)
   public Student(String fN, String lN, String ge, int a, String e, int[] g, String[] c )
   {
      super(fN, lN, ge, a);       //call to constructor of superclass
      this.email = e;
      this.grades = g;
      this.classes = c;
   }
   
   //mutator/setter (used to change value of fields)
   public void setEmail( String e ) { this.email = e; }
   public void setGrades( int[] g ){ this.grades = g; }
   public void setClasses( String[] c ) { this.classes = c; }
   
   //accessor/getter (used to access value of fields)
   public String getEmail() { return this.email; }
   public int[] getGrades() { return this.grades; }
   public String[] getClasses() { return this.classes; }
  
   //traverses grades field to calculate and return Student's gpa
   public double calcGPA()
   {
      double sum = 0.0;
      for( int g : this.grades )
      {
         if( g >= 90 ) { sum += 4.0; }
         else if ( g >= 80 ) { sum += 3.0; }
         else if ( g >= 70 ) { sum += 2.0; }
         else if ( g >= 60 ) { sum += 1.0; }
      }      
      return sum/this.grades.length;
   }
   
   //toString method (returned when the Student object is referenced)
   public String toString()
   {
      return "Student Name: " + super.firstName + " " + super.lastName + 
             "\nEmail: " + this.email + 
             "\nClasses: " + Arrays.toString( this.classes ) +
             "\nGrades: " + Arrays.toString( this.grades );
   } 
   
}