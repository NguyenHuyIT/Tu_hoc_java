package BaiHoc;

public class Bai18_Forlongnhau {

  public static void main(String[] args) {
    for (int i = 1; i <= 7; i++) { // Hàng
      for (int j = 1; j <= 7; j++) { // Cột
        System.out.print(i + "" + j + "\t");
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");
    // Vẽ chữ N
    for (int i = 1; i <= 7; i++) { // Hàng
      for (int j = 1; j <= 7; j++) { // Cột
        if (j == 1 || j == 7 || i == j){
          System.out.print("*" + "\t");
        }
        else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");
    // Vẽ hình vuông
    for (int i = 1; i <= 7; i++) { // Hàng
      for (int j = 1; j <= 7; j++) { // Cột
        if (j == 1 || j == 7 || i == 1 || i == 7){
          System.out.print("*" + "\t");
        }
        else {
          System.out.print(" " + "\t");
        }
      }
      System.out.println("");
    }

    System.out.println("");
    System.out.println("");
    System.out.println("");
    // Vẽ tam giác vuông
    for (int i = 1; i <= 7; i++) { // Hàng
      for (int j = 1; j <= i; j++) { // Cột
        System.out.print("*" + "\t");
      }
      System.out.println("");
    }
  }
}
