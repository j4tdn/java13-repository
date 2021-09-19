+ A.Class:
	Customer : id, name, phone , address
	Item	 : id, os, color ,cost
	
B1: khởi tạo danh sách khách hàng ( Create list of customre)
B2: Tạo mảng danh sách hàng tại cửa hàng ( create array of item in store)
B3: Thưc hiện quá trình mua hàng - ( shopping function)
	+ Ai là người mua hàng ( who is buying)
	+ Danh sách mặt hàng cần mua (List of items)
	+ Số lượng của mỗi mặt hàng (Amount of reach item)
	+ Thời gian mua ( time buy)
=> Tạo thêm class mua hàng ( vì mỗi khách hàng mua đều thực hiện những bước mua hàng trên)
Class mua hàng : có phương thức : customer, items_details[],  datatime
=> cần biết được khách hàng mua mặt hàng gì và bao nhiêu => tạo class item_details
=> Class ItemDetails : item, quantity
Khách hàng có thể mua nhiều mặt hàng cùng lúc nên tạo mảng các mặt hàng

========================================================
B.Object
c1: KH1, Adam , 123 , NewYork
c1: KH2, Kate , 243, Calofonia

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, IOS , White , 280
i4: IP12, IOS, Black , 880
i5: WP8, WindownPhone, Blue,560

Order1 : c1, {id1(i1,3), id2(i4,1), id3(i2,1)}, 10:10:10 0.05.2021
Order2 : c2, {id1(i3,2), id2(i5,1)}, 20:10:12 07.05.2021
Order3 : c2, {id1(i4,1)}, 09:28:32 08.05.2021

C.Function 
+ export(order) => totalofAmout:Void*



