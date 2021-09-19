+ Class
 Customer: id,name, phone, address;
 Item	 : id, os, color, cost
 
 B1: Create list of customers
 B2: Create array of items in store
 B3: Shopping function
 + Who is buying
 + List of items
 + Amount of each item
 + DateTime
 => Order: customer, item_Details[], date_time
 => ItemDetail: item, quantity
 
 ==========================================
 Customer
 c1: KH1, Adam, 123, New York
 c2: KH2, Kate, 234, California
 
 Item: 
 i1: Samsung S10+, Android, Black, 620
 i2: Samsung S20U, Android, Green, 840
 i3: iPhone 4, iOS, White, 280
 i4: iPhone 12, iOS, Black, 880
 i5: Window Phone 8, Window Phone, Blue, 560
 
 Order:
 o1: c1, {id1(i1, 3), id2(i4, 1), id3(i2, 1)}, date_timme, 10:10:10 08.05.2021
 o2: c2, {id1(i3, 2), id2(i5, 1)}, date_timme 20:40:11 07.05.2021
 o3: c3, {id1(i4, 1)}, date_timme 7:10:50 08.05.2021
 
 Function: export (order) => TotalOfAmount:Void