package BaiHoc.Basic;

public class Bai15_DoWhile {

  public static void main(String[] args) {
    // tính tổng các số từ 1 đến 5
    int a = 1;
    int tong = 0;
    do{
      tong += a;
      a++;
    }while (a <=5);
    System.out.println("Tổng: " + tong);
  }
}
