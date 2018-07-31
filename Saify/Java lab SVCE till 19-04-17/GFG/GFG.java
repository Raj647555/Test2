class GFG
{
  {
    System.out.println("Common part of constructors invoked!!");
   }

 public GFG()
{
      System.out.println("Default constructor invoked!!");
 }   
  public GFG(int x)
      {
         System.out.println("Parametrized constructor invoked!!");
       }
    
  public static void main (String args[])
 {
   GFG obj1 = new GFG();
   GFG obj2 = new GFG(10);
 }
}