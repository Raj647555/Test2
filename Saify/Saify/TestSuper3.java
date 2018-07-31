class Animal 
{
Animal() 
{
System.out.println("Animal is created");
}
}

class Dog extends Animal
{
Dog()
{
super();
System.out.println("Dog is created");
}
}

class TestSuper3
{
public static void main(String args[])
{
System.out.println("--Parent class Constructor called by super keyword--");
Dog d= new Dog();
}
}