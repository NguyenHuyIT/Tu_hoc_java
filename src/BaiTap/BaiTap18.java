package BaiTap;

import java.util.Scanner;

public class BaiTap18 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.print("Nhập vào số cần kiểm tra có phải số nguyên tố hay không: ");
      int n = sc.nextInt();
      int count = 0;
      for (int i = 1; i <= Math.sqrt(n); i++) {
        if (n % i == 0) {
          count++;
        }
      }
      if (count == 1) {
        System.out.printf("%s là số nguyên tố\n", n);
      } else {
        System.out.printf("%s không là số nguyên tố\n", n);
      }
      System.out.print("Bạn có muốn tiếp tục chương trình không, bấm y để thoát: ");
      String anser = new Scanner(System.in).nextLine();
      if (anser.equalsIgnoreCase("y")) {
        return;
      }
    }
  }

}
