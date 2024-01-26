import java.util.Scanner;

public class BaiTap12_For {
  //NHập vào số nguyên n và in ra kết quả n!
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên cần tính: ");
    int n = sc.nextInt();
    int giaithua = 1;
    for (int i = 1; i <= n; i++){
      giaithua *= i;
    }
      System.out.println("Kết quả " + n +  "! = " + giaithua );
  }
}
