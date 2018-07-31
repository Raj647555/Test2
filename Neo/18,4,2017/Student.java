class Student 
{
int id;
String name;
}

class TestStudent3
{

 public static void main(String args[])
 {
 //creating objects 
  Student s1=new Student(); 
  Student s2=new Student();
 
 //initializing objects
s1.id=101;
s1.name="Neo";
s2.id=102;
s2.name="Neeraj";

//printing data
System.out.println("-----Class and Object Using Refrence variable------");
System.out.println("id="+s1.id+"\t Name="+s1.name);
System.out.println("id="+s2.id+"\t Name="+s2.name);
}
}