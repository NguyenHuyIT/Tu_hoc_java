public class Bai21_Function {

  public static void main(String[] args) {
    int kq = Cong(1, 2, 3);
    System.out.println("Tổng các số " + kq);
    // Call function
    xinChao("Female");
  }

  public static int Cong(int x, int y, int z) {
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    return x + y + z;
  }

  //hàm thủ tục
  public static void xinChao(String gioitinh){
    if (gioitinh.equalsIgnoreCase("female")) {
      System.out.println("Hello friend, I am female.");
    }else{
      System.out.println("Hello friend, I am male.");
    }
  }
}
