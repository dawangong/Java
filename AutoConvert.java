public class AutoConvert {
  public static void main (String[] args) {
    // 自动转换 低 => 高 
    // char => int => long => float => double
    // byte => short => int => long => float => double
    // float a = 10.1; // false double => float
    byte a = 10; // 范围对了 就不考虑默认 int 转 byte
    // char c = a; // false byte short char 不能转换,可以计算,计算前先全转int
    // 计算中,计算结果会转子项最大的类型
    double res = 1 + 1.1; // double

    System.out.println(a);
    System.out.println(res);
  }
}