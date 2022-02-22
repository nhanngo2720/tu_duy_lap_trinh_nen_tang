import java.util.Scanner;

public class XuLy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count= tinhDiemThi(scan);
		System.out.println("So lan thi lai: " + count);
		
	}

	public static int tinhLanThi(Scanner scan) {
		int count = 0;
		float diemThi = 0;
		while (diemThi < 5) {
			System.out.println("Nhap diem thi");
			diemThi = Float.parseFloat(scan.nextLine());
			if (diemThi < 5) {
				count++;
			} else {
				System.out.println("Chuc mung ban da thi dau");
			}
		}
		return count;
	}

//	public static int DiemThi() {
//		int diemThi;
//		int count = 0;
//		System.out.println("Nhap vao diem thi");
//		Scanner scan = new Scanner(System.in);
//		diemThi = Integer.parseInt(scan.nextLine());
//		// vi khong biet lap lai bao nhieu lan, nen phai dung while
//		while (diemThi < 5) {
//			count++;
//			diemThi = diemThi + 1;
//		}
//		System.out.println("SO LAN BAN PHAI THI LAI " + count + " LAN");
//		
//		
//		return count;
//
//	}
//	
	
	
}// con tro cuoi
