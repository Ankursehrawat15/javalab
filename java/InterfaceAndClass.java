
interface A {
void meth1();
void meth2();
}
interface B extends A {
void meth2();  //Overriding the method in A ??
}
class MyClass implements B {
public void meth1() {
System.out.println("Implement meth1().");
}
public void meth2() 
{
System.out.println("Implement meth2().");
}
public void meth3() {
System.out.println("Implement meth3().");
}
}
class InterfaceAndClass {
public static void main(String arg[]) {
B ob = new MyClass(); // Interface refrence variable 
ob.meth1();
ob.meth2(); 
}
}
