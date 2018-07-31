class Animal{  
String color="white";  
}  
class Dog extends Animal{  
String color="black";  
void printColor(){  

System.out.println("prints color of Dog class  ");//prints color of Dog class  
System.out.println(color);

System.out.println("prints color of Animal class");
System.out.println(super.color);//prints color of Animal class  
}  
}  
class TestSuper1{  
public static void main(String args[]){  
System.out.println("--super is used to refer immediate parent class instance variable.--");
Dog d=new Dog();  
d.printColor();  
}}  

/*super is used to refer immediate 
parent class instance variable.*/