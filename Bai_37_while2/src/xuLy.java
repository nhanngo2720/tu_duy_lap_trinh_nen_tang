import java.util.Scanner;

public class xuLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float tong = tongCacSoDaNhapCach2(scan);
		System.out.println("Tong cac soan nhap la: " + tong);
	}

	public static float tongCacSoDaNhapCach1(Scanner scan) {
		float tong = 0;// tao bien tich luy ngoai vong lap
		int nhap = 1;

		while (nhap > 0) {
			System.out.println("Nhap vao so >= 0. Nhap <= 0 de dung");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap > 0) {
				// dung toan tu += a+=b nghia la a= a+b , tích luỹ thêm cho tổng
				tong += nhap;
			}
		}
		return tong;
	}

	// cach 2 dung flag
	public static float tongCacSoDaNhapCach2(Scanner scan) {
		float tong = 0;
		boolean flag = true;
		while (flag) {
			System.out.println("Nhap vao so >= 0. Nhap <= 0 de dung");
			int nhap = Integer.parseInt(scan.nextLine());
			if (nhap > 0) {
				// dung toan tu += a+=b nghia la a= a+b , tích luỹ thêm cho tổng
				tong += nhap;
			} else {
				flag = false;
			}
		}
		return tong;
	}

}// con dau cuoi
