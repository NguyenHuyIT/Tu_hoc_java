package BaiTap;

import java.util.Scanner;

public class BaiTap19_Function {

  public static void main(String[] args) {
    System.out.print("Mời nhập vào số a: ");
    double a = new Scanner(System.in).nextDouble();
    System.out.print("Mời nhập vào số b: ");
    double b = new Scanner(System.in).nextDouble();
    System.out.print("Mời nhập vào phép tính( +, - , * , / ): ");
    String phep = new Scanner(System.in).nextLine();
    phepToan(phep, a, b);
  }

  public static void phepToan(String phep, double a, double b){
    if (phep.equals("+")) {
      System.out.printf("Kết quả = %s", a+b);
    }
    if (phep.equals("-")) {
      System.out.printf("Kết quả = %s", a-b);
    }
    if (phep.equals("*")) {
      System.out.printf("Kết quả = %s", a*b);
    }
    if (phep.equals("/")) {
      if (b == 0) {
        System.out.println("Không chia được má ơi");
      }else
        System.out.printf("Kết quả = %s", a/b);
    }

  }
}
