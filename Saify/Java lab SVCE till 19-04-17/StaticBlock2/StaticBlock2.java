class StaticBlock2
{
 static{
 System.out.println("Hey!! I am first Static block");
 }
 
 StaticBlock2()
 {
  System.out.println("Hey!! I am Constructor");
 }   


 public static void main(String args[])
 {
  System.out.println("Hey!! I am Main");
  StaticBlock2 s1=new StaticBlock2();
 }

 static{
 System.out.println("Hey!! I am second Static block");
 }
}