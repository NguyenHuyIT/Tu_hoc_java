package BaiTap;

import java.util.Scanner;

public class BaiTap15 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for(int i = 10; i <= 50; i++){
      if(i % 3 == 0){
        System.out.print(i + " ");
      }
    }
  }
}
