class Student 
{
 int rollno;
 String name;

Student (int r , String n)
{
  rollno=r;
  name=n;
System.out.println("Roll Number="+rollno+"\t Name="+name);
}
Student (String n )
{
  name=n;
System.out.println("Name="+name);
}

Student (int r )
{
  rollno=r;
System.out.println("Roll Number="+rollno);
}

}

class TestStudent7
{

 public static void main(String args[])
 {
 //creating objects 

System.out.println("---- Parameterized Constructor OverLoading-------");
  Student s1=new Student(101,"Neo"); 
 Student s2=new Student(101); 
 Student s3=new Student("XYZ");  
Student s4=new Student(102,"Neeraj");
 Student s5=new Student(102); 
 Student s6=new Student("ABC");  

}
}