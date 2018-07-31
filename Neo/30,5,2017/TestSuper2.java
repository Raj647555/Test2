class Animal{  
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
System.out.println("---Super can be used to invoke parent class method---");
Dog d=new Dog();  
d.work();  
}}  

/*super can be used to invoke
 parent class method*/