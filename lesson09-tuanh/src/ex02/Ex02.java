package ex02;
/**
 * Cho n xâu chuỗi, mỗi chuỗi bao gồm các ký tự la tinh thường và chữ số. Đoạn các
ký tự số liên tục tạo thành một số nguyên. Ở mỗi xâu chuỗi trích ra các số nguyên và tìm số lớn
nhất, sắp xếp các số lớn nhất nhận được từ các xâu đã cho và in ra theo thứ tự không giảm, mỗi số
được đưa ra dưới dạng không có các số 0 không có nghĩa (024)
Nếu chuỗi rỗng hoặc chuỗi chỉ chứa các ký tự latinh thì số lớn nhất của chuỗi đó là 0
 */
public class Ex02 {
	public static void main(String[] args) {
		String[] st = {"01a2b3456cde478"};
		int[] results = new int[st.length];
		int a = 0;
		for(int i = 0; i < st.length; i++) {
			results[a] = getLargestNumber(st[i]);
			a++;
		}
		int resultFinal = getLargestNumber(st[0]);
		System.out.println(resultFinal);
	}
	
	private static int getLargestNumber(String s) {
		String[] charac = s.split("[a-z]+");
		int[] n = new int[charac.length];
		
		int max = 0;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(charac[i]); 
		}
		for (int i = 0; i < n.length; i++) {
			if(n[i] > max) {
				max = n[i];
			}
		}
		return max;
	}
	
}
