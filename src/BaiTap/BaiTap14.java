package BaiTap;

import java.util.Scanner;

public class BaiTap14 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Mời nhập số cần tính tổng: ");
    int n = sc.nextInt();
    int sum = 0;
    for (int i = 1; i <= n; i++){
      if(i % 2 != 0){
        if(i == 3){
          continue;
        }
          sum+=i;
      }
    }
    System.out.printf("Tổng của các số lẻ từ 1 đến %s là: %s", n, sum);
  }
}
