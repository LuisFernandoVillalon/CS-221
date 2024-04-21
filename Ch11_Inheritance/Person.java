public class Person
{
   //Data fields (instance & static variables)
   protected String firstName, lastName, sex;
   protected int age;
   
   //Constructor (executed when new Person is created)
   public Person( String fN, String lN, String s, int a )
   {
      this.firstName = fN;
      this.lastName = lN;
      this.sex = s;
      this.age = a;
   }
   
   //mutator/setter methods (used to modify private data fields)
   public void setFirstName( String fN ){ this.firstName = fN; }
   public void setLastName( String lN ){ this.lastName = lN; }
   public void setSex( String s ){ this.sex = s; }
   public void setAge( int a ){ this.age = a; }
   
   //accessor/getter methods (used to access value of private data fields)
   public String getFirstName(){ return this.firstName; }
   public String getLastName(){ return this.lastName; }
   public String getSex(){ return this.sex; }
   public int getAge(){ return this.age; }
   
   //toString method (returned when Person object is referenced)
   @Override
   public String toString(){
      return "Name: " + this.firstName + " " + this.lastName + "\n" + 
             "Age: " + this.age + "\n" + 
             "Sex: " + this.sex;
   }
}