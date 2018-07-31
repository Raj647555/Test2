interface Drawable
{
void draw();
}

class Rectangle implements Drawable 
{
public void draw (){System.out.println("  Drawing Rectangle  ");}
}

class Circle implements Drawable 
{
public void draw (){System.out.println("  Drawing Circle ");}
}

class TestInterface 
{
public static void main(String [] args)
{

System.out.println("-----Multiple inheritance through Interface---- ");
Drawable obj=new Circle();
Drawable obj1=new Rectangle();
obj.draw();
obj1.draw();
}
}