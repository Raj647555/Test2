class A 
{
void m(){System.out.println("-*-*- Hello m -*-*-");}
void n()
{
System.out.println("-*-*- Hello n -*-*-");
this.m();
}
}

class TestThis
{
 public static void main(String args[])
 {
System.out.println("----This is used to invoke method------\n");
 A a=new A(); 
a.n();
}
}