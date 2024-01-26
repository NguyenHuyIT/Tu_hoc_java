public class BaiTap17 {
  public static void main(String[] args) {
    for (int i = 2; i <= 1000; i++) {
      int sum = 1;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          sum += j;
          int n = i / j;
          if (j != n) {
            sum += n;
          }
        }
      }
      if (sum == i) {
        System.out.println(i);
      }
    }
  }
}