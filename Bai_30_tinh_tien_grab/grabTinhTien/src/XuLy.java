import java.util.Scanner;

public class XuLy {

	// khai bao cac ham

	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;

	static final int GRAB_CAR_1TO_19 = 7500;
	static final int GRAB_SUV_1TO_19 = 8500;
	static final int GRAB_BLACK_1TO_19 = 9500;

	static final int GRAB_CAR_UPPER_19 = 7000;
	static final int GRAB_SUV_UPPER_19 = 8000;
	static final int GRAB_BLACK_UPPER_19 = 9000;

	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 3500;

	public XuLy() {
		// thay thay de khong
	}

	public static void main(String[] args) {
		// hien thi cac thong soKm
		// nhap 1 lan scanner o day, sau do nhung ham sau truyen vao thong so scanner va
		// scan
		Scanner scan = new Scanner(System.in);

		int loaiGrab = chonGrab(scan);
		float soKm = nhapSoKM(scan);
		int thoiGianCho = nhapThoiGianCho(scan);
		float tienTra = tinhTienTra(thoiGianCho, soKm, loaiGrab);
		System.out.println("TienTra: " + tienTra);
		inChiTiet(loaiGrab,soKm,thoiGianCho);

	}

	// nhap so km
	public static float nhapSoKM(Scanner scan) {
		float soKm;
		System.out.println("Vui long nhap vao so KM");
		// cho nhap vao
		soKm = Float.parseFloat(scan.nextLine());
		return soKm;
	}

	// nhap thoi giancho
	public static int nhapThoiGianCho(Scanner scan) {
		int thoiGianCho;
		System.out.println("Vui long nhap thoi gian cho");
		// cho nhap vao
		thoiGianCho = Integer.parseInt(scan.nextLine());
		return thoiGianCho;
	}

	// ham chon loai grab
	// nhap 2 tham so scanner va scan vao de tai su dung
	public static int chonGrab(Scanner scan) {
		int loai;// khai bao bien de nhan ket qua tra ve
		// Scanner scan = new Scanner(System.in);
		System.out.println("Vui long chon loai Grab");
		System.out.println(" 1. Grab Car");
		System.out.println(" 2. Grab SUV");
		System.out.println(" 3. Grab Black");
		// cho phep chon grab
		loai = Integer.parseInt(scan.nextLine());
		// chon xong thi tra ve
		return loai;
	}

	// ham tinh tien 1km dau tien
	// nhan gia tri loaiGrab tra ve gia tri float tien
	public static float tinhTienKMDauTien(int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;

		}
		return tien;
	}

	// tinh tien 1 den 19km
	public static float tinhTienKM1Den19(float soKM, int loaiGrab) {
		// tai sao dung float.taisao dung int float la co so thap phan. int so nguyen so
		// float co the la so tien le
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKM - 1) * GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + (soKM - 1) * GRAB_SUV_1TO_19;
		} else {
			tien = GRAB_BLACK_1KM + (soKM - 1) * GRAB_BLACK_1TO_19;
		}
		return tien;

	}

	// tinh tien km tren 19
	public static float tinhTienKMTren19(float soKM, int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19 + (soKM - 1) * GRAB_CAR_UPPER_19;

		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + 18 * GRAB_SUV_1TO_19 + (soKM - 1) * GRAB_SUV_UPPER_19;
		} else {
			tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKM - 1) * GRAB_BLACK_UPPER_19;
		}
		return tien;
	}

	// ham tinh tien cho
	public static float tinhTienCho(int thoiGianCho, int loaiGrab) {
		float tien = 0;
		// long if vao nhau de tinh 2 dieu kien
		// dieu kien 1 neu thoiGiancho >= 3 thi se lay bao nhieu tien
		// tuong ung voi dieu kien 2 la loai grab gi.
		if (thoiGianCho >= 3) {
			int soLanTinh = Math.round((thoiGianCho * 1.0f) / 3);
			if (loaiGrab == 1) {
				tien = soLanTinh * GRAB_CAR_WAIT;
			} else if (loaiGrab == 2) {
				tien = soLanTinh * GRAB_SUV_WAIT;
			} else {
				tien = soLanTinh * GRAB_BLACK_WAIT;
			}
		}
		return tien;
	}

	// tinh tien fai tra
	public static float tinhTienTra(int thoiGianCho, float soKM, int loaiGrab) {
		float tienTra = 0;
		// kiem tra 1 dieu kien de goi ham tuong ung, va truyen vao tham so de ham tinh
		// toan
		// diễn giải dễ hiểu, xét điều kiện soKM di được, nếuki được bao nhiêu thìruyền
		// oai grab vào vào hàm tinh tiễn , cộng với tiền
		// chờ, gán luôn tổng đo cho hàm tienTra
		if (soKM <= 1) {
			tienTra = tinhTienKMDauTien(loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		} else if (soKM > 1 && soKM <19) {
			tienTra = tinhTienKM1Den19(soKM, loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		} else {
			tienTra = tinhTienKMTren19(soKM, loaiGrab) + tinhTienCho(thoiGianCho, loaiGrab);
		}
		return tienTra;

	}
	//in km1
	public static void inDongKm1(int loaiGrab, float soKm) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_1KM;
		} else {
			donGia = GRAB_BLACK_1KM;
		}
//		float tien = tinhTienKMDauTien(loaiGrab);
		if(soKm<1) {
			System.out.println("KM DAU TIEN\t\t" + soKm + "\t\t" + donGia + "\t\t\t" + donGia ) ;
		}else {
			System.out.println("KM DAU TIEN\t\t" + 1 + "\t\t" + donGia + "\t\t\t" + donGia ) ;
		}
	}
	//in km 1-19
	public static void inDongKm1Den19(int loaiGrab,float soKm) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_1TO_19;
		} else {
			donGia = GRAB_BLACK_1TO_19;
		}
//		float tien = tinhTienKM1Den19(soKm, loaiGrab);
		//tan dung dong di hon 1 km 
		inDongKm1(loaiGrab,soKm);
		//in ra dong di tu 2km tro len 
		if(soKm<19) {
			System.out.println("Tu 2 den" + (soKm-1) + "\t\t" + (soKm-1) + "\t\t" + donGia + "\t\t\t" + donGia*(soKm-1 ));
		}else {
			System.out.println("Tu 2 den" + 18 + "\t\t" + 18 + "\t\t" + donGia + "\t\t\t" + donGia*18);	
		}
		
		
	}
	public static void inDongKmTren19(int loaiGrab, float soKm ) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_UPPER_19;
		} else {
			donGia = GRAB_BLACK_UPPER_19;
		}
//		inDongKm1(loaiGrab,soKm); khong can vi no co san trong ham inDongKm1Den19 
		inDongKm1Den19(loaiGrab,soKm);
		if(soKm >19) {
			System.out.println(" Tu 19 den " + soKm +  "\t\t"+  (soKm - 19) + "\t\t" + donGia + "\t\t\t" + donGia* (soKm-19) );
		}
	}

	public static void inThoiGianCho(int loaiGrab, int thoiGianCho) {
		int donGia;
		if (loaiGrab == 1) {
			donGia = GRAB_CAR_WAIT;
		} else if (loaiGrab == 2) {
			donGia = GRAB_SUV_WAIT;
		} else {
			donGia = GRAB_BLACK_WAIT;
		}
		float tienCho = tinhTienCho(loaiGrab,thoiGianCho);
		System.out.println("Thoi gian cho \t\t " + thoiGianCho +"\t\t" + donGia + "\t\t\t" + tienCho );
		
	}
	public static void inChiTiet(int loaiGrab, float soKm, int thoiGianCho ) {
		System.out.println("(****************** CHI TIET HOA DON ************** ");
		System.out.println("CHI TIET \t\t SU DUNG \t DON GIA(1000d)\t THANH TIEN (1000d)");
		if(soKm <1 ) {
			inDongKm1(loaiGrab, soKm);
		}else if (1<soKm && soKm<19) {
			inDongKm1Den19(loaiGrab, soKm);
		}else {
			inDongKmTren19(loaiGrab, soKm);
		}
		inThoiGianCho(loaiGrab, thoiGianCho);
		float tongTien = tinhTienTra(loaiGrab, soKm,thoiGianCho);
		System.out.println("------------------------------------------------");
		System.out.println(" \t\t\t\t\t\t\t\t\t" + tongTien );

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}// controcuoicung
