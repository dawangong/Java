public class ForceConvert {
  public static void main (String[] args) {
    float a = 1.8F;
    // 大 => 小
    //强转(x),会导致精度丢失或者数据溢出
    int b = (int)a;
    int c = 1000;
    byte d = (byte)c; // -24 二进制后溢出部分被截断


    System.out.println(b);
    System.out.println(d);
  }
}