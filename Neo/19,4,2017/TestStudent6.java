class Student 
{
 int rollno;
 String name;

 Student()
 {
  rollno=101;
  name="Neo";
 }

 void displayInformation(){System.out.println("Roll Number="+rollno+"\t Name="+name);}
}

class TestStudent6
{

 public static void main(String args[])
 {
 //creating objects 
 System.out.println("------Initializing Using Constructor----------------");
  Student s1=new Student(); 
  Student s2=new Student();
s1.displayInformation();
s2.displayInformation();
}
}