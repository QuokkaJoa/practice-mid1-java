package lang.string.test;

public class TestString10 {

  public static void main(String[] args) {
    String fruits = "apple,banana,mango";
    String[] parts = fruits.split(",");
    for (String part : parts) {
      System.out.println("part = " + part);
    }

    String joined = String.join("->", parts);
    System.out.println("joined = " + joined);
  }

}
