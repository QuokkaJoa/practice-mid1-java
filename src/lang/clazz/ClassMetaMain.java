package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {

  public static void main(String[] args) throws Exception {
    //Class 조회
    Class clazz = String.class; // 1. 클래스에서 조회
    // Class clazz1 = new String().getClass(); // 인스턴스에서 조회
    // Class clazz2 = Class.forName("java.lang.String");

    // 모든 필드 출력
    Field[] fields = clazz.getDeclaredFields();
    for (Field field : fields) {
      System.out.println("field = " + field.getType() + " " + field.getName());
    }

    //모든 메서드 출력
    Method[] declaredMethods = clazz.getDeclaredMethods();
    for (Method method : declaredMethods) {
      System.out.println("method = " + method.getName());
    }

    //상위 클래스 정보 출력
    System.out.println("SuperClass = " + clazz.getSuperclass().getName());

    // 인터페이스 정보 출력
    Class[] interfaces = clazz.getInterfaces();
    for (Class i : interfaces) {
      System.out.println("Interface = " + i.getName());
    }

  }

}
