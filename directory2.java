import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object in current path
    File file = new File("Java Tutorial\\abc");

    // tries to create a new directory
    boolean value = file.mkdirs();
    if(value) {
      System.out.println("The new directory is created.");
    }
    else {
      System.out.println("The directory already exists.");
    }
  }
}
