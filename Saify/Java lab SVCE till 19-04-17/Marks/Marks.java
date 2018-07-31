class Marks
{
 int eng,math,phy;

 public static void main(String args[])
 {
  Marks m1 = new Marks();
  m1.eng=90;
  m1.math=99;
  m1.phy=92;
  
  Marks m2= new Marks();
  m2.eng=80;
  m2.math=89;
  m2.phy=82;
 
  System.out.println("------------------------------");
  System.out.println("Marks of First Object");
  System.out.println("English Marks=" +m1.eng);
  System.out.println("Maths Marks=" +m1.math);
  System.out.println("Physics Marks=" +m1.phy);

  System.out.println("------------------------------");
  System.out.println("Marks of Second Object");
  System.out.println("English Marks=" +m2.eng);
  System.out.println("Maths Marks=" +m2.math);
  System.out.println("Physics Marks=" +m2.phy);
 }
}
 

  


