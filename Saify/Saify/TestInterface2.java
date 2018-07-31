interface Printable
{
void print();
}

interface Showable extends Printable
{
void show();
}

class TestInterface2 implements Showable
{
public void print (){System.out.println("Hello method of Interface 1 ");}
public void show (){System.out.println("Welcome method of Interaface 2  ");}

public static void main(String [] args)
{

System.out.println("-----Interface Extends Interface ---- ");
TestInterface2 obj=new TestInterface2();
obj.print();
obj.show();
}
}