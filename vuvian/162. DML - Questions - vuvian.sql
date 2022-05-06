-- bài tập database --
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM loaihang;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    SELECT * 
    FROM MatHang mh
    WHERE EXISTS  ( SELECT MaLH 
					FROM Loaihang lh
                    WHERE  lh.MaLH = mh.MaLh
                     AND TenLH = 'That Lung');
     SELECT * 
     FROM MatHang mh
     JOIN LoaiHang lh ON mh.MaLh = lh.MaLH
     WHERE lh.TenLh = 'That Lung';
    -- Top 5 mặt hàng có giá bán cao nhất
	SELECT mh *
		avg(ctmh.GiaBan) GiaBan
    FROM MatHang mh
    JOIN ChiTietMatHang mh ON mh.MaMH = ctmh.MaMH
    GROUP BY mh.MaMH
    ORDER BY ctmt.GiaBan DESC
    LIMIT 0,5;
    
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    SELECT *
    FROM DonHang
    WHERE cast(ThoiGianDatHang as DATE) = '2019-11-28';
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT * 
    FROM DonHang
     WHERE cast(ThoiGianDatHang as DATE) BETWEEN  '2019-11-28' AND '2022-02-12';
    -- Được bán trong tháng 11/2019
    SELECT *
    FROM DonHang
    WHERE month(ThoiGianDatHang) = 12
		AND YEAR(ThoiGianDatHang) = 2019;
    -- Được giao hàng tại Hòa Khánh
    SELECT *
    FROM DonHang
    WHERE DiaChiGiaoHang LIKE '%HòaKháng%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT mh.MatHang,
		   mh.TenMH,
           ctmt.GiaBan,
           round(ctmh.GiaBan * 0.8 ,2) AS GiaKhuyenMai
	FROM MatHang mh
	JOIN ChiTietMatHang ctmt
    ON mh.MatHang = ctmh.ChiTietMatHang;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT mh.MatHang,
		   mh.TenMH,
           ctmt.GiaBan,
           round(ctmh.GiaBan * 0.8 ,2) AS GiaKhuyenMai
	FROM MatHang mh
	JOIN ChiTietMatHang ctmt
    ON mh.MatHang = ctmh.ChiTietMatHang
    WHERE curdate() = '2022-05-04';
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac FROM MatHang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT mh.MatHang,
	   mh.TenMH,
       tgdt.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh
	ON ctdh.MaDH = mh.MaMH
JOIN DonHang dh
	ON ctdt.MaDH = dh.MaDH
WHERE CAST(ThoiGianDatHang AS DATE) = '23-11-2019';
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
 SELECT * 
    FROM MatHang mh
    WHERE MaLH IN  ( SELECT MaLH 
					FROM Loaihang lh
                     WHERE TenLH IN ('That Lung' , 'Mu') );
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT mh.TenMH, 
		avg(ctmh.GiaBan) GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh 
	ON mh.MatHang = ctmh.ChiTietMatHang
ORDER BY ctmh.GiaBan ;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT mh.TenMH,
       ctmh.MaKC,
       ctmh.GiaMua
FROM MatHang mh
JOIN ChiTietMatHang ctmh 
ON mh.MatHang = ctmh.ChiTietMatHang
ORDER BY ctmh.GiaMua DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT mh.MaMH,
       mh.TenMH,
       ctmh.MaKC, 
	   ctmh.GiaBan ,
       ctmh.GiaMua
    FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan, ctmh.GiaMua DESC;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT count(MaMH) AS SoLuongMatHang FROM MatHang;
-- 15. Số lượng 'Ao somi Nan' được bán trong ngày 23/11/2019
SELECT mh.MaMH,
       mh.TenMH,
       SUM(ctdh.SoLuong) SoLuong,
       dh.ThoiGianDatHang
FROM ChiTietDonHang ctdh
JOIN DonHang dh ON ctdh.MaDH = dh.MaDH
JOIN MatHang mh ON ctdh.MaMH = mh.MaMH
WHERE mh.TenMH ='Ao somi Nam'; 
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
   --  MaLoai  TenLoai SoLuong
	-- 1       Giày    20
	-- 2       Áo      28
SELECT mh.MaLH,
	  GROUP_CONCAT(CONCAT(mh.TenMh, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) DanhSachMatHang,
      SUM (ctmh.SoLuong) SoLuong
FROM MatHang mh
JOIN ChiTietMatHang ctmh
	ON mh.MaMH = ctmh.MaMH
    GROUP BY mh.MaLH;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT *
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmt.MaMH
JOIN LoaiHang lh ON lh.MaLH= mh.MaLH
WHERE mh.TenLH = 'Giay Dep'
ORDER BY ctmh.GiaBan DESC
LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
WITH LoaiHang_GBLN AS (SELECT lh.MaLH,
       max(ctmh.GiaBan) AS GiaBanLonNhat
FROM MatHang mh
JOIN LoaiHang lh
	ON mh.MaLH =lh.MaLH
JOIN ChiTietMatHang ctmh
	ON ctmh.MaMH = mh.MaMH)
    
 SELECT *
 FROM MatHang mh
 JOIN ChiTietMatHang ctmh
	ON mh.MaMH = ctmh.MaMH
 JOIN LoaiHang_GBLN lhln
	ON mh.MaLh =lhln.MaLH
    WHERE ctmh.GiaBan = lhln.GiaBanLonNhat;
    
    SELECT * FROM chitietdonhang;
        

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
   --  Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT mh.MaLH,
	  GROUP_CONCAT(CONCAT(mh.TenMh, ' - ', ctmh.MaKC, ' - ', ctmh.SoLuong)) DanhSachMatHang,
      SUM (ctmh.SoLuong) SoLuong
FROM MatHang mh
JOIN ChiTietMatHang ctmh
	ON mh.MaMH = ctmh.MaMH
    GROUP BY mh.MaL
    HAVING SoLuong > 20;
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT MAX(SoLuong) 
FROM chitietmathang ctmh
JOIN mathang mh ON ctmh.MaMH = mh.MaMH
JOIN loaihang lh ON lh.MaLH = mh.MaLH
GROUP BY lh.MaLH;
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT  lh.*, ROUND(AVG(GiaBan), 2) AS GiaBanTrungBinh 
FROM LoaiHang lh
INNER JOIN MatHang mh ON mh.MaLH = lh.MaLH
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY lh.MaLH;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- 25. Tìm những mặt hàng có Mã Loại = 1 và đã được bán trong ngày 28/11
SELECT * FROM mathang mh
JOIN loaihang lh ON mh.MaLH = lh.MaLH
JOIN chitietdonhang ctdh ON ctdh.MaMH = mh.MaMH
JOIN donhang dh ON ctdh.MaDH = dh.MaDH
WHERE lh.MaLH = 1 AND DAY(dh.ThoiGianDatHang) = 17 AND MONTH(dh.ThoiGianDatHang)=12;
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE chitietmathang ctmh
JOIN mathang mh ON ctmh.MaMH = mh.MaMH
JOIN loaihang lh ON lh.MaLH = mh.MaLH
SET ctmh.GiaBan = 199
WHERE lh.TenLH = 'Áo';
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
   --  Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
  --   Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100