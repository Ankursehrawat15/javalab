import java.util.Scanner;
class demoexception {
int num1, num2;
void dividefunction() {
System.out.println("Enter two numbers: ");
Scanner in = new Scanner(System.in);
num1 = in.nextInt();
num2 = in.nextInt();
try { // here it will throw exception
int result = num1 / num2;
System.out.println(result);
int result = num1 / num2;
System.out.println(result);
} catch (ArithmeticException e) 
{
System.out.println("A number can not be divided by 0");
}
}

public class Exception2 {
public static void main(String[] args) {
demoexception obj = new demoexception();
obj.dividefunction();
}
}
  

