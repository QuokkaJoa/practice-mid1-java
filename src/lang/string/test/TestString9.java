package lang.string.test;

public class TestString9 {

  public static void main(String[] args) {
    String email = "hello@example.com";
    String[] splited = email.split("@");

    String idPart = splited[0];
    String domainPart = splited[1];
    System.out.println("ID : " + idPart);
    System.out.println("Domain : " + domainPart);
  }
}
