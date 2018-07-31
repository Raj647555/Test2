class Bike10{  
  final int speedlimit;//blank final variable  
    
  Bike10(){  
  speedlimit=70;  
  System.out.println("Can We Initialize Blank Final Variable");  
  System.out.println("Yes, but only in constructor.");  
  System.out.println(speedlimit);  
  }  
  
  public static void main(String args[]){  
    new Bike10();  
 }  
}  

//Can We Initialize Blank Final Variable