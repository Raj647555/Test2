class Student3
{
 int id;
 String name;
 
 Student3()
 {
  id=101;
  name="Saify";
 }
 Student3(int r)
 {
  id=r;
 }
 Student3(int r,String n)
 {
  id=r;
  name=n;
 }


 void show()
 { 
  System.out.println("ID="+id+" "+"Name="+name);
 }

public static void main(String args[])
{
 Student3 s1=new Student3();
 Student3 s2=new Student3(201);
 Student3 s3=new Student3(202,"Burhan");
 s1.show();
 s2.show();
 s3.show();
}
}