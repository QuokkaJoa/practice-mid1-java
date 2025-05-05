package enumeration.test.http;

public enum HttpStatus {
  OK(200, "OK"),
  BAD_REQUEST(400, "BAD REQUEST"),
  NOT_FOUND(404, "NOT FOUND"),
  INTERNAL_SERVER_ERROR(500, "Internal Server Error");

  int code;
  String message;

  HttpStatus(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }

//  public static HttpStatus findByCode(int inputCode) {
//    return HttpStatus.valueOf(String.valueOf(inputCode));
//  }

  public static HttpStatus findByCode(int inputCode) {
    for (HttpStatus value : HttpStatus.values()) {
      if (value.getCode() == inputCode) {
        return value;
      }
    }
    return null;
  }

  public boolean isSuccess() {
    return code >= 200 && code <= 299;
  }
}
