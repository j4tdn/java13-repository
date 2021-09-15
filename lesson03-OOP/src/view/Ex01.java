package view;

import been.Rectangel;

public class Ex01 {	
		public static void main(String[] args) {
			//demo create object from Rectangel class
			//Rectangel() : contructor of Rectangel class
			//R1 : W8 ; H4
			//Khởi tạo đối tượng, chưa truyền giá trị cho thuộc tính
			//Đối tượng sẽ có giá mặc định cho mõi thuộc tính
			Rectangel r1 = new Rectangel();//w0 h0
			r1.setWidth(8);
			r1.setHeigh(4);
			System.out.println("r1: " + r1);
			
			//r2 : w10 - h6
			
			Rectangel r2 = new Rectangel();
			r2.setWidth(10);
			r2.setHeigh(6);
			System.out.println("r1: " + r2);
			
			//r3 : w2 ; h6
			//vừa khởi tạo và truyền giá trị cho thuộc tính
			Rectangel r3 = new Rectangel(2, 6);
			System.out.println("r1: " + r3);
		}
		//Class, Object
		//Attribute , Method >> non - Static
		//Constructor
		//Getter , Setter, toString
}
