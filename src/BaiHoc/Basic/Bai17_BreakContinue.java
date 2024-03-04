package BaiHoc.Basic;

public class Bai17_BreakContinue {

  public static void main(String[] args) {
    //Tính tổng từ 1 đến 5 nhưng bỏ qua 3
    int tong = 0;
    for(int i = 0; i <= 5; i++){
      if (i==3)
        continue; //Bỏ qua
      else
        tong+=i;
    }
    System.out.println("Tổng = " + tong);

    int n = 0;
    while(n < 100){
      System.out.println("n = " + n);
      if(n == 15)
        break;
      n++;
    }
  }
}
