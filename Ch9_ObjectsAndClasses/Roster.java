public class Roster
{ 
   public static void main(String[] args)
   {
      Student s1 = new Student("Luis Villalon");
      Student s2 = new Student("John Johnson");
      //you cannot access s1.name because name is private
      //you can call s1.getName()
      System.out.println( s1.getName() );
      s2.setName("Dwane Wayne");
   }
}