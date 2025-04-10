package lang.string.method;

public class StringSplitJoinMain {

  public static void main(String[] args) {
    String str = "Apple,Banana,Orange";

    //split()
    String[] splitString = str.split(",");
    for (String s : splitString) {
      System.out.println(s);
    }

    // join
    String joinedStr = String.join("-", "A", "B", "C");
    System.out.println("연결된 문자열 = " + joinedStr);

    // 문자열 배열 연결
    String reuslt = String.join("-", splitString);
    System.out.println("reuslt = " + reuslt);
  }

}
