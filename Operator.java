public class Operator {
  public static void main (String[] args) {
    System.out.println(10 / 4); // int 2
    System.out.println(10.0 / 4); // double 2.5
    double res = 10 / 4; // 2 => 2.0
    System.out.println(res); // 2.0

    int days = 100;
    int weeks = 100 / 7;
    int leftDays = 100 % 7;
    System.out.println(weeks + "," + leftDays);

    double h = 234.5;
    double s = 5.0 / 9 * (h - 100);
    System.out.println(s);

    byte a = 1;
    a++; // a = (byte)(a + 1); 复合运算会隐式发生强制转换
    System.out.println(a);
  }
}