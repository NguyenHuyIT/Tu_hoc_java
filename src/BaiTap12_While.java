import java.util.Scanner;

public class BaiTap12_While {
  //NHập vào số nguyên n và in ra kết quả n!
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhập số nguyên cần tính: ");
    int n = sc.nextInt();
    int factorial = 1, i = 1;
    while(i <= n){
      factorial*=i;
      i++;
    }
    System.out.println("Kết quả " + n +  "! = " + factorial );
  }
}
