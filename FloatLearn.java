public class FloatLearn {
  public static void main(String[] arg) {
    float a = .123F; // float后面带F
    double b = 2.345; // 默认 double
    double c = 5.2e2; // 科学记数法
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    
    double d1 = 8.1;
    double d2 = 2.7;
    double e1 = 8.1 / 2.7;
    double e2 = d1 / d2;
    // 貌似目前java计算,即便是赋值,计算也无法知道具体精度
    System.out.println(e1);
    // 2.9999999999999996
    System.out.println(e2);
    // 2.9999999999999996
  };
}