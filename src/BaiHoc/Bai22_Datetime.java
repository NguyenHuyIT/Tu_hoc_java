package BaiHoc;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Bai22_Datetime {

  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal);

    //Get ngày tháng năm
    int nam = cal.get(Calendar.YEAR);
    int thang = cal.get(Calendar.MONTH);
    int ngay = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println(nam);
    System.out.println(thang + 1);
    System.out.println(ngay);

    // Set ngày tháng năm
    cal.set(Calendar.YEAR, 2024);
    cal.set(Calendar.MONTH, 11);
    cal.set(Calendar.DAY_OF_MONTH, 31);
    // Kiểm tra ngày tháng sau thiết lập
    int namsinh = cal.get(Calendar.YEAR);
    int thangsinh = cal.get(Calendar.MONTH);
    int ngaysinh = cal.get(Calendar.DAY_OF_MONTH);
    System.out.println("Ngày tháng năm sinh: " + ngaysinh + "/" + (thangsinh + 1) + "/" + namsinh);

    // Xuất theo định dạng
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
    // Hàm toString() trả về chuỗi định dạng được thiết lập trong SimpleDateFormat
    System.out.println("Ngày tháng năm sinh: " + sdf.format(cal.getTime()));

  }
}
