package bai2;

// Không được đặt tên class, hàm, biến bằng tiếng việt
// Format code
// 12đ
public class PhanTuOfMang {
public static void main(String[] args) {
	int n = 6;
	int[] A = {1,4,2,5,3};
	System.out.println(getMissingNumber(A,n));
}
public static int getMissingNumber(int[] A,int n) {
	for(int i=1;i<=n;i++) {
		// chưa format nhìn hơi nhớp
		boolean isExist = false;
		for(int j=0;j<A.length;j++) {
			if(A[j]==i) {isExist = true; break;}
			
			// E đang làm kiểu duyệt đến phần tử cho i đi so sánh với các phần tử trong mảng
			// Đến khi j = length (duyệt hết mảng) mà A[j] vẫn chưa bằng i thì e gán giá trị cần tìm a = i
			
			// Kết quả ra thì đúng. Nhưng đoạn if này thực hiện n * m lần hơi thừa
			// A tạm sửa như này theo idea của em
			
			// Hoặc e có thể áp dụng công thức tìm missing number
			// Với giá trị từ 1 đến n
			// missing number = n * (n + 1) - sum(array with missing number)
			// VD: n = 5, array = {1,2,4,5}
			// missing = 5 * 6 / 2 - (1 + 2 + 4 + 5) = 3
		}
		// phần tử i k tồn tại trong mảng
		if (!isExist) {
			return i;
		}
	}
	
	// never go to this round
	return Integer.MAX_VALUE;

}
}
