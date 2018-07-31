class A 
{
A()
{System.out.println("-*-*- Hello Default Constructor -*-*-");

}

A(int m)
{
this();
System.out.println("-*-*- Hello Parameterized Constructor -*-*-");

}

}

class TestThis1
{
 public static void main(String args[])
 {
System.out.println("----This is used to invoke Constructor------\n");
 A a=new A(10); 
}
}