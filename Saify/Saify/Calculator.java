import java.util.Scanner;

class Calculator
{ 
public static void main(String[]args)
{
Scanner s=new Scanner(System.in);
System.out.println("Please Select which Operation you want to preform:");
System.out.println("1. ADDITION");
System.out.println("2. SUBTRACTION");
System.out.println("3. MULTIPLICATION");
System.out.println("4. DIVISION");
System.out.print("ENTER YOUR CHOICE:  ");
int i=s.nextInt();
System.out.print("ENTER FIRST NUMBER  ");
int a=s.nextInt();
System.out.print("ENTER SECOND NUMBER  ");
int b=s.nextInt();
double result=0;//'result'willstoretheresultofoperation
switch(i)
{
    case 1:
result=a+b;
break;
    case 2:
result=a-b;
break;
    case 3:
result=a*b;
break;
    case 4:
if(b==0)//whendenominatorbecomeszero
{
System.out.println("DIVISION NOT POSSIBLE");
break;
}
else
result=a/b;
break;
default:
System.out.println("YOU HAVE ENTERED A WRONG CHOICE");
}
System.out.println("RESULT="+result);
}
}
    

