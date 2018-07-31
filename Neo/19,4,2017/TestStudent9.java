class Student 
{
 int rollno;
 String name;

Student (int rollno , String name)
{
  this.rollno=rollno;
  this.name=name;
}
  void Display()
 {
 System.out.println("Roll Number="+rollno+"\t Name="+name);
 }
}

class TestStudent9
{
 public static void main(String args[])
 {
System.out.println("----Initialize Using This Keyword-------");
 Student s1=new Student(101,"Neo"); 
Student s2=new Student(102,"Neeraj");
s1.Display();
s2.Display(); 
}
}