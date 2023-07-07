public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");

    double l = 5;
    System.out.println("Площадь кв со стороной " + l + " = " + area(l));

    double a = 4;
    double b = 6;
    System.out.println("Площадь прям со сторонами " + a + " и " + b + " равна " + area(a, b));
  }

  public static void hello(String somebody) {
    System.out.println("Hello " + somebody + "!");
  }

  public static double area(double len) {
    return len * len;
  }

  public static double area(double a, double b) {
    return a * b;
  }

}