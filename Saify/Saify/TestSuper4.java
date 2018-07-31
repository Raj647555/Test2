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
System.out.println("Dog is created");
}
}

class TestSuper4
{
public static void main(String args[])
{
System.out.println("--Implicit call to super() by the compiler --");
Dog d= new Dog();
}
}