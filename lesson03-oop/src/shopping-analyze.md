A. Class
Customer: name, phone, id, address
Item	: id, os, color, cost
=> Order: customer, item_details[], dateTime
=>ItemDetail: item, quantity

B1: Create list of customers
B2: Create array of items in store
B3: Shopping function
+ Who is buying?
+ List of items
+ Amount of each item
+ DateTime 

==============
B. Object
c1: KH1, Adam, 123, NewYork
c2: KH2, Kate, 234, California

i1: SS10+, Android, Black, 620
i2: SS20U, Android, Green, 840
i3: IP4, IOS, While, 500
i4: IP12, IOS, Black, 880
i5: WP8, WindowPhone, Blue, 560

o1: c1, {id1(i1, 3), id(i4,1), i3(id3,1)}, 10:10:10 08.05.2021 
o2: c2, {id1(i3, 2), id(i5,1)}, 20:10:10 07.05.2021
o3: c2, {id1(i4, 1)}, 09:28:32 08.05.2021

C. Function
+ export(order) =>totalOfAmount: Void

