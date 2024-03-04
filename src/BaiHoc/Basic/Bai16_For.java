package BaiHoc.Basic;

import java.util.Scanner;

public class Bai16_For {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập giá trị n: ");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++){
      System.out.println(Math.sqrt(i) + Math.pow(i, 3) + i);
    }
  }
}
