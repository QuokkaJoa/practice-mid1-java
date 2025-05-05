package enumeration.test;

public class AuthGradeMain1 {

  public static void main(String[] args) {
    AuthGrade[] values = AuthGrade.values();
    for (AuthGrade value : values) {
      print(value);
    }
  }

  private static void print(AuthGrade grade) {
    System.out.println("grade=" + grade.name() + ", level=" + grade.getLevel() + ", 설명=" + grade.getDescription());
  }
}
