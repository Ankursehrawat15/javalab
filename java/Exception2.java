import java.util.Scanner;
class demoexception {
int num1, num2;
void dividefunction() {
System.out.println("Enter two numbers: ");
Scanner in = new Scanner(System.in);
num1 = in.nextInt();
num2 = in.nextInt();
try { // here it will throw exception

