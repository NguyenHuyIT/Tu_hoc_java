import java.util.Scanner;

public class Bai14_While {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Mời nhập vào số nguyên từ 1 - 99: ");
    int n = sc.nextInt();
    while(n<=1 || n>99){
      System.out.println("Nhập lại n, n chỉ được từ 1 - 99; ");
      n = sc.nextInt();
    }
    System.out.println("Bạn đã nhập xong n = " + n);
  }
}
