public class HelloWorld {

public void nonStaticTest() {
System.out.println("non static method");
}
  public static void main(String[] args) {
  System.out.println("Hello");
HelloWorld helloWorldObject= new HelloWorld();
helloWorldObject.nonStaticTest();
}
}
