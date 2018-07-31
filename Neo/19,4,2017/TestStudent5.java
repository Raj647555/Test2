class Student 
{
 int rollno;
 String name;

 void displayInformation(){System.out.println("Roll Number="+rollno+"\t Name="+name);}
}

class TestStudent5
{

 public static void main(String args[])
 {
 //creating objects 
  Student s1=new Student(); 
  Student s2=new Student();
 System.out.println("-------Automatic Calling Of A Constructor------");
s1.displayInformation();
s2.displayInformation();
}
}