import java.util.Scanner;

public class App {
//nhap function cho 3 loai xe, va function thoi gian cho
//sau do cho nguoi dung nhap loai xe va thoi gian cho
//dua vao loai xe va thoi gian cho goi ham ra tinh toan thanh tien
//dang ket o cho khong biet goi ham loai xe tuong ung

//thoi gian cho
    public static int tgianCho(int a){
        return a/3;
    };

//loai GrabCar
    public static int loaiXe(int a){
        //truong hop di duoi 19km 
        if(a <= 19){
            int thanhTien = ( 8000 + (a - 1)*7500 );
        //truong hop di tren 19km     
        }if(a >19){ 
            int thanhTien = ( 8000 + 18*7500 + (a-19)*7000 );
        }
        return thanhTien;

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Chuong trinh tinh so tien xe");
        System.out.println("vui long nhap nhap loai xe");
        int x = Integer.parseInt(scan.nextLine());
        System.out.println("Vui long nhap quang duong di duoc");
        int y = Integer.parseInt(scan.nextLine());
        System.out.println("Vui long nhap thoi gian cho");
        int z = Integer.parseInt(scan.nextLine());
        int tongTien = loaiXe(y)+ tgianCho(z);
        System.out.println("tong tien phai tra la " + tongTien);

    }
}
