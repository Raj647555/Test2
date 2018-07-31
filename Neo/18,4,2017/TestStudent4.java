class Student 
{
 int rollno;
 String name;

 void InsertRecord(int r , String n)
 {
  rollno=r;
  name=n;
 }

 void displayInformation(){System.out.println("Roll Number="+rollno+"\t Name="+name);}
}

class TestStudent4
{

 public static void main(String args[])
 {
 //creating objects 
  Student s1=new Student(); 
  Student s2=new Student();
 System.out.println("------Insert and Display by Method----------------");
 //calling methods 
s1.InsertRecord(101,"Neo");
s2.InsertRecord(102,"Neeraj");
s1.displayInformation();
s2.displayInformation();
}
}