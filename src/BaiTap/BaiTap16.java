package BaiTap;

public class BaiTap16 {

  public static void main(String[] args) {
    int sum= 0, temp = 1;
    for(int i = 1; i<=10; i++){
      int factorial = 1;
      for (int j = 1; j <= i; j++){
        factorial*=j;
      }
      sum+=factorial;
    }
    System.out.println(sum);
  }

}
