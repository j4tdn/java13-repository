-- ======================= REFRESH DATA =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM loaihang;
--     -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT mathang.*, loaihang.TenLH
FROM mathang 
INNER JOIN loaihang ON mathang.MaLH = loaihang.MaLH
WHERE loaihang.TenLH = "Thắt lưng";
--     -- Top 5 mặt hàng có giá bán cao nhất
SELECT mh.MaMH, 
	   mh.TenMH,
       ctmh.GiaBan
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan DESC
LIMIT 5;
-- 2. Đơn hàng
SELECT * FROM donhang;
--     -- Được bán trong ngày 18/12/2020
SELECT * FROM donhang
WHERE CAST(ThoiGianDatHang AS DATE) =  str_to_date("2020, 12, 18","%Y,%m,%d");
--     -- Được bán từ ngày 20/11/2020 đến ngày 20/12/2020
SELECT * FROM donhang 
WHERE CAST(ThoiGianDatHang AS DATE) BETWEEN str_to_date("2020, 11, 20","%Y,%m,%d") AND str_to_date("2020, 12, 20","%Y,%m,%d");
--     -- Được bán trong tháng 1/2021
SELECT * FROM donhang
WHERE CAST(ThoiGianDatHang AS DATE) BETWEEN str_to_date("2021, 01, 01","%Y,%m,%d") AND str_to_date("2021, 01, 31","%Y,%m,%d");

--     -- Được giao hàng tại Hòa Khánh
SELECT * FROM donhang
WHERE DiaChiGiaoHang LIKE "%Hòa Khánh%";
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT mh.MaMH, 
	   mh.TenMH,
       ctmh.GiaBan * 0.8 AS GiaKhuyenMai
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 18/12/2020


-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac FROM mathang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 18/12/2020
SELECT ctdh.MaMH,
	   mh.TenMH, 
       dh.ThoiGianDatHang
FROM donhang dh
INNER JOIN chitietdonhang ctdh ON dh.MaDH = ctdh.MaDH
INNER JOIN mathang mh ON mh.MaMH = ctdh.MaMH
WHERE CAST(ThoiGianDatHang AS DATE) =  str_to_date("2020, 12, 18","%Y,%m,%d");

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT mh.MaMH, mh.TenMH, ctmh.GiaBan
FROM mathang mh 
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
WHERE ctmh.GiaBan BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT * FROM mathang
WHERE MaLH IN (SELECT MaLH FROM loaihang
				WHERE TenLH = "Mũ" OR TenLH = "Thắt lưng");
-- 10. Liệt kê các đơn hàng được đặt trong ngày (17/12/2020, 18/12/2020)
SELECT * FROM donhang
WHERE CAST(ThoiGianDatHang AS DATE) = str_to_date("2020, 12, 17","%Y,%m,%d") 
OR CAST(ThoiGianDatHang AS DATE) = str_to_date("2020, 12, 18","%Y,%m,%d");


-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT mh.MaMH, 
	   mh.TenMH,
       ctmh.GiaBan
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan ASC;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT mh.MaMH, 
	   mh.TenMH,
       ctmh.GiaMua
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaMua DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT mh.MaMH, 
	   mh.TenMH,
       ctmh.GiaBan,
       ctmh.GiaMua
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan ASC, ctmh.GiaMua DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AS SoLuongMatHang FROM mathang;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 18/12/2020
SELECT  mh.TenMH, SUM(ctdh.SoLuong) SoLuong
FROM donhang dh
INNER JOIN chitietdonhang ctdh ON dh.MaDH = ctdh.MaDH
INNER JOIN mathang mh ON ctdh.MaMh = mh.MaMH
WHERE CAST(ThoiGianDatHang AS DATE) = str_to_date("2020, 12, 18","%Y,%m,%d") 
		AND mh.TenMH = "Giày da nam";

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT lh.MaLH, lh.TenLH, SUM(ctmh.SoLuong)
FROM loaihang lh
INNER JOIN mathang mh ON lh.MaLH = mh.MaLH
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY lh.TenLH;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT mh.*, ctmh.GiaBan
FROM mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
WHERE MaLH = (SELECT MaLH FROM loaihang WHERE TenLH = "Giày dép")
ORDER BY ctmh.GiaBan DESC 
LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT mh.*, 
	   ctmh.GiaBan
FROM mathang mh 
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
WHERE ctmh.GiaBan IN (SELECT MAX(ctmh.GiaBan) AS GiaBanCaoNhat
						FROM mathang mh
                        INNER JOIN loaihang lh ON mh.MaLh = lh.MaLH
                        INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
                        GROUP BY  mh.MaLH);


-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT lh.MaLH,
	   lh.TenLH,
       SUM(ctmh.SoLuong)
FROM loaihang lh
INNER JOIN mathang mh ON lh.MaLH = mh.MaLH
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMh
GROUP BY MaLH;
        
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT lh.MaLH,
	   lh.TenLH,
       SUM(ctmh.SoLuong) AS TongSoLuong
FROM loaihang lh
INNER JOIN mathang mh ON lh.MaLH = mh.MaLH
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMh
GROUP BY lh.MaLH
HAVING TongSoLuong > 20;


-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
WITH TongSLMoiMH AS
(SELECT mh.MaMH,
		mh.TenMH,
        mh.MaLH,
        SUM(ctmh.SoLuong) AS TongSLMoiMH
FROM  mathang mh
INNER JOIN chitietmathang ctmh ON mh.MaMH = ctmh.MaMH
INNER JOIN loaihang lh ON mh.MaLH = lh.MaLH
GROUP BY ctmh.MaMH
)

-- SELECT * FROM TongSLMoiMH;
SELECT * FROM TongSLMoiMH 
WHERE TongSLMoiMH IN (SELECT MAX(TongSLMoiMH) FROM TongSLMoiMH
					  GROUP BY MaLH);


-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT lh.MaLH, 
	   lh.TenLH,
	   AVG(ctmh.giaban) AS GiaBanTrungbinh 
FROM mathang mh
INNER JOIN chitietmathang ctmh on mh.MaMH = ctmh.MaMH
INNER JOIN loaihang lh on mh.malh = lh.MaLH
GROUP BY lh.maLH;
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 1
SELECT mh.*,
	   ctdh.SoLuong,
       dh.MaDH
FROM donhang dh
INNER JOIN chitietdonhang ctdh ON ctdh.MaDH = dh.MaDH
INNER JOIN mathang mh ON ctdh.MaMH = mh.MaMH
WHERE mh.MaLH = 2 AND dh.MaDH = 1;
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 18/12/2020
SELECT mh.*,
	   dh.MaDH,
       dh.ThoiGianDatHang,
       ctdh.SoLuong
FROM donhang dh
INNER JOIN chitietdonhang ctdh ON ctdh.MaDH = dh.MaDH
INNER JOIN mathang mh ON ctdh.MaMH = mh.MaMH
WHERE mh.MaLH = 2 AND CAST(dh.ThoiGianDatHang AS DATE) = str_to_date("2020, 12, 18","%Y,%m,%d");
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 18/12/2020
SELECT * FROM mathang
WHERE TenMH LIKE '%Mũ%' 
AND MaMH NOT IN  (SELECT mh.MaMH
					FROM donhang dh
					INNER JOIN chitietdonhang ctdh ON dh.MaDH = ctdh.MaDH
					INNER JOIN mathang mh ON ctdh.MaMH = mh.MaMH
					WHERE mh.MaLH = 5 AND CAST(dh.ThoiGianDatHang AS DATE) = str_to_date("2020, 12, 18","%Y,%m,%d"));
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 299
UPDATE chitietmathang 
SET GiaBan = 299
WHERE MaMH IN 
(
SELECT MaMH FROM mathang
WHERE MaLH = 1);
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE LoaiHang_SaoLuu
(
MaLoai INT AUTO_INCREMENT PRIMARY KEY,
TenLoai VARCHAR(50) NOT NULL
);
INSERT INTO loaihang_saoluu(MaLoai, TenLoai)
SELECT MaLH, TenLH FROM loaihang;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100
SELECT dh.MaDH,
		GROUP_CONCAT(CONCAT(mh.TenMH,':', ctmh.GiaBan, ':',ctdh.SoLuong) SEPARATOR ',' ) AS ChiTietDonHang,
		SUM(GiaBan * ctdh.SoLuong) AS TongTien
FROM donhang dh
INNER JOIN chitietdonhang ctdh ON dh.MaDH = ctdh.MaDH
INNER JOIN mathang mh ON ctdh.MaMH = mh.MaMH
INNER JOIN chitietmathang ctmh ON ctmh.MaMH = mh.MaMH

WHERE dh.MaDH = 2
GROUP BY ctdh.MaDH;




