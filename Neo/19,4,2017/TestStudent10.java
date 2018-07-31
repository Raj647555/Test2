class Student 
{
 int rollno;
 String name;

Student (int r , String n)
{
  rollno=r;
  name=n;
}

Student (Student s){
rollno=s.rollno;
name=s.name;
}

  void Display()
 {
 System.out.println("Roll Number="+rollno+"\t Name="+name);
 }
}

class TestStudent10
{
 public static void main(String args[])
 {
System.out.println("----Copy Constructor Type1------");
 Student s1=new Student(101,"Neo"); 
Student s2=new Student(s1);
s1.Display();
s2.Display(); 
}
}