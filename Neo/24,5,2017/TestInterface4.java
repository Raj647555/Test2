interface Drawable
{
void draw();
static int cube(int x ){return x*x*x;}
}

class Rectangle implements Drawable 
{
public void draw (){System.out.println("  Drawing Rectangle  ");}
}

class Circle implements Drawable 
{
public void draw (){System.out.println("  Drawing Circle ");}
}

class TestInterface4
{
public static void main(String [] args)
{

System.out.println("-----Static Method in Interface---- ");
Drawable obj=new Circle();
Drawable obj1=new Rectangle();
obj.draw();
obj1.draw();
System.out.println("Cube of 3 ="+Drawable.cube(3));
}
}