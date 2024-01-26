import java.util.Scanner;

public class BaiTap13 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Mời nhập số cần tính tổng: ");
    int a = sc.nextInt();
    int sum = 0;
    if(a % 2 == 0){
      for (int i = 0; i <= a; i++){
        if(i%2==0){
          sum+=i;
        }
      }
      System.out.printf("Tổng các số chẳn từ 0 đến %s là: %s", a, sum);
    }else {
      System.out.println("Tôi không tính tổng số lẻ, bye bye");
    }

  }
}
