class Student2
{
 int id;
 String name;
 
 void show()
 { 
  System.out.println("ID="+id+" ""Name="+name);
 }

public static void main(String args[])
{
 Student2 s1=new Student2();
 Student2 s2=new Student2();
 s1.show();
 s2.show();
 }
}