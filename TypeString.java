public class TypeString {
  public static void main (String[] args) {
    // 其他转字符串
    String a = 123 + "";
    // 字符串转其他 类型.parse类型();
    int b = Integer.parseInt("123");
    // int c = a.charAt(0);
    // 字符串转字符
    char c = a.charAt(0);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(a.charAt(0));
  }
}