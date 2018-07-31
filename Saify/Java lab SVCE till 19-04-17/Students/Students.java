class Students
{
 int rollno;
 String name;
 static String college= "IIT";
 Students(int r,String n)
 { 
  rollno=r;
  name=n;
 }
 void change()
 {
  college="SVCE";
 }

 void display()
 {
 System.out.println("Roll Number=" +rollno);
 System.out.println("Student Name=" +name);
 System.out.println("College=" +college);
 }
  
 public static void main(String args[])
 {
  Students s1 =new Students(025,"Burhan");
  Students s2 =new Students(026,"Saify");
  s1.display();
  s2.display();
  s2.change();
  s2.display();
 }
}