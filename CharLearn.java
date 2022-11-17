public class CharLearn {
  public static void main (String[] args) {
    char a = 'a';
    char b = '\n'; // \转译
    char c = '9';
    char d = 97; // 数字时输出对应的unicode 字符

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println((int) a); //输出对应的unicode 97
    System.out.println(a + 3); // 100 字符型 先转unicode 区别于双引号字符串
  }
}