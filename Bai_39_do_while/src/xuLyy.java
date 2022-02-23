import java.util.Scanner;

public class xuLyy {

	public static void main(String[] aggs) {
		Scanner scan = new Scanner(System.in);
System.out.println("Moi nhap so a");
float a = Float.parseFloat(scan.nextLine());
System.out.println("Moi nhap so b");
float b = Float.parseFloat(scan.nextLine());

xulyMenu(scan, a, b);

	}

//	xay dung ham inMenu va ham xulyMenu cho cac phep tinh don gian tu 2 so do nguoi dung nhap vao. 
//	thong bao cho nguoi dung chon 
//	1.tinh tong 2. tinh hieu 3. Tinh nhan 4. Tinh chia 0. Thoat 

	public static void inMenu() { // void la khong can tham so dau vao

		System.out.println(" Chuong trinh tinh toan Vui long chon tu 1 den 4. Chon 0 de thoat");
		System.out.println("1. Tinh Tong");
		System.out.println("2. Tinh Hieu ");
		System.out.println("3. Tinh Nhan");
		System.out.println("4. Tinh Chia");
		System.out.println("0. Thoat");

	}

	public static void xulyMenu(Scanner scan, float a, float b) { // vi du boolean flag = false. thi while (!flag)
		boolean flag = true; // dau tien la gan co, cũng giống như trong while gán cho nó1 giá trị nhất định
								// để nó chạy.
		int chon;
		do {
			inMenu();
			System.out.println("Moi Chon: ");
			chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				float tong = a + b;
				System.out.println(" Tong la: " + tong);
				break;
			case 2:
				float hieu = a - b;
				System.out.println("Hieu la: " + hieu);
				break;
			case 3:
				float tich = a * b;
				System.out.println("Tich la: " + tich);
				break;
			case 4:
				if (b == 0) {
					System.out.println("b phai khac O");
				} else {
					float thuong = a / b;
					System.out.println("Thuong la : " + thuong);
				};
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui long chon 0-4");
			}
		} while (flag);
	}

//	public static float xulyMenu() {
//		return ;
//	}
}
