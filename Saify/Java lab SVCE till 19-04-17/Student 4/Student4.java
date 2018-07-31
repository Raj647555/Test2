class Student4
{
 int id;
 String name;
 

 Student4(int id,String name)
 {
  this.id=id;
  this.name=name;
 }


 void show()
 { 
  System.out.println("ID="+id+" "+"Name="+name);
 }

public static void main(String args[])
{
  System.out.println("----Using THIS keyword----");
  Student4 s1=new Student4(202,"Burhan");
 Student4 s2=new Student4(203,"Saify");
 s1.show();
 s2.show();
 }
}