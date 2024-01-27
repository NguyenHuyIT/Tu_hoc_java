package BaiHoc;

import java.util.Scanner;

public class Bai21_Function {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Mơời nhập 3 số a, b, c: ");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    String kq = GiaiPTB2(a, b, c);
    System.out.println("Kết quả của phương trình trên là: " + kq);
  }

  public static String GiaiPTB2(double a, double b, double c) {
    if (a == 0) {
      if (b == 0) {
        if (c == 0) {
          return "Phương trình vô số nghiệm.";
        } else {
          return "Phương trình vô nghiệm.";
        }
      } else {
        double x = -c / b;
        return "Nghiệm của phương trình là: " + x;
      }
    } else {
      double delta = b * b - 4 * a * c;
      if (delta < 0) {
        return "Phương trình vô nghiệm.";
      } else if (delta == 0) {
        double x = -b / (2 * a);
        return "Phương trình có nghiệm kép: x = " + x;
      } else {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return "Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
      }
    }
  }
}
