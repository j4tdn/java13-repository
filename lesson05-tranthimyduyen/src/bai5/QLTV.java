package bai5;

/**
 * Em hiểu bài code tốt. Nhưng
 * Code đặt tên tiếng việt, code còn lộn xộn chưa format
 * Rút kinh nghiệm lần sau: 20đ
 */
public class QLTV {
public static void main(String[] args) {
	
	SachGK sgk1=new SachGK("SGK1",100000,"Kim Đồng",true);
	SachGK sgk2=new SachGK("SGK2",90000,"Kim Vàng",true);
	SachGK sgk3=new SachGK("SGK3",80000,"Kim Bạc",true);
	
	SachTK stk1=new SachTK("STK1",50000,"Nhi Đồng",0.2);
	SachTK stk2=new SachTK("STK2",60000,"Kim Vàng",0.15);
	
	Sach[] book =  {sgk1,sgk2,sgk3,stk1,stk2};
	//Toàn bộ sách thuộc NXB Nhi Đồng
	NXBNĐ(book);
	//Toàn bộ sách đơn giá nhỏ nhơ 50000
	DonGia(book);
	//Toàn bộ sách giáo khoa đơn giá từ 100000 đến 200000
	sgk100(book);
}
public static void NXBNĐ(Sach[] book) {
	for(int i=0;i<5;i++) {
		if(book[i].getNXB()=="Nhi Đồng") {
			System.out.println("Sach co NXB là Nhi Đồng :"+book[i].getMasach());
		}
	}
}
public static void DonGia(Sach[] book) {
	for(int i=0;i<5;i++) {
		if(book[i].getDongia()<50000) {
			System.out.println("Sach co đơn giá nhỏ hơn 50000 là :"+book[i].getMasach());
		}
	}
}
public static void sgk100(Sach[] book) {
	for(int i=0;i<5;i++) {
		if(book[i].getDongia()>100000&&book[i].getDongia()<200000) {
			if(i<3) {System.out.println("Sach co đơn giá nhỏ hơn 50000 là :"+book[i].getMasach());}
		}
	}
}

}
