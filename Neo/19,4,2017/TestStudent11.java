class Student 
{
 int rollno;
 String name;

Student (int r , String n)
{
  rollno=r;
  name=n;
}

Student (){}

  void Display()
 {
 System.out.println("Roll Number="+rollno+"\t Name="+name);
 }
}

class TestStudent11
{
 public static void main(String args[])
 {
System.out.println("----Copy Constructor type 2-------");
 Student s1=new Student(101,"Neo"); 
Student s2=new Student();
s2.rollno=s1.rollno;
s2.name=s1.name;
s1.Display();
s2.Display(); 
}
}