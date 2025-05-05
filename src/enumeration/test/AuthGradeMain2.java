package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean outer = true;
    boolean inner = true;
    while (outer) {
      System.out.print("당신의 등급을 입력하세요" + gradeGenerator() + ": ");
      String grade = sc.nextLine();

      AuthGrade authGrade = AuthGrade.valueOf(grade);
      System.out.println("당신의 등급은 " + authGrade.getDescription() + "입니다.");
      while (inner) {
        if (grade != null) {
          System.out.println("==메뉴 목록==");
          if (AuthGrade.valueOf(grade) == AuthGrade.GUEST) {
            System.out.println("- 메인화면");
            break;
          } else if (AuthGrade.valueOf(grade) == AuthGrade.LOGIN) {
            System.out.println("- 메인화면");
            System.out.println("- 이메일 관리 화면");
            break;
          } else if (AuthGrade.valueOf(grade) == AuthGrade.ADMIN) {
            System.out.println("- 메인화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");
            break;
          } else {
            inner = false;
          }
        }
      }
    }
  }

  private static String gradeGenerator() {
    AuthGrade[] values = AuthGrade.values();
    return Arrays.toString(values);
  }

}
