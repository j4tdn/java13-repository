-- ======================= REFRESH DATA =======================
-- 1. Toàn bộ thông tin các loại hàng
SELECT * FROM LoaiHang;

-- Mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM MatHang
WHERE MaLH = 4;    

-- Top 5 mặt hàng có giá bán cao nhất
SELECT MH.*, CTMH.GiaBan FROM MatHang AS MH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
ORDER BY GiaBan DESC
LIMIT 5;

-- 2. Đơn hàng
-- Được bán trong ngày 28/11/2019
SELECT * FROM DonHang 
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("28/11/2019", "%d/%c/%Y");

-- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * FROM DonHang 
WHERE CAST(ThoiGianDatHang AS DATE) 
BETWEEN STR_TO_DATE("28/11/2020", "%d/%c/%Y") AND STR_TO_DATE("02/12/2019", "%d/%c/%Y");

-- Được bán trong tháng 11/2019
-- C1
SELECT * FROM DonHang 
WHERE CAST(ThoiGianDatHang AS DATE) 
BETWEEN STR_TO_DATE("01/11/2020", "%d/%c/%Y") AND STR_TO_DATE("31/11/2019", "%d/%c/%Y");
-- C2
SELECT * FROM DonHang 
WHERE MONTH(ThoiGianDatHang) = 11 AND YEAR(ThoiGianDatHang) = 2019;

-- Được giao hàng tại Hòa Khánh
SELECT *  
FROM DonHang 
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';

-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân\
SELECT MH.*, CTMH.MaKC, ROUND(CTMH.GiaBan * 0.8, 2) AS GiaBan
FROM MatHang AS MH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
UPDATE ChiTietMatHang AS CTMH
SET CTMH.GiaBan = ROUND((CTMH.GiaBan * 0.8), 2)
WHERE CTMH.MaMH IN
(
	SELECT MH.MaMH FROM MatHang AS MH
	INNER JOIN ChiTietDonHang AS CTDH
	ON MH.MaMH = CTDH.MaMH
	INNER JOIN DonHang AS DH
	ON CTDH.MaDH = DH.MaDH
	WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("25/11/2019", "%d/%c/%Y")
);

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT(MauSac) FROM MatHang 
GROUP BY MauSac;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT MH.MaMH, MH.TenMH, DH.ThoiGianDatHang 
FROM MatHang AS MH
INNER JOIN ChiTietDonHang AS CTDH
ON MH.MaMH = CTDH.MaMH
INNER JOIN DonHang AS DH
ON CTDH.MaDH = DH.MaDH
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("23/11/2019", "%d/%c/%Y");

-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT MH.MaMH, MH.TenMH, CTMH.MaKC, CTMH.GiaBan
FROM MatHang AS MH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
WHERE CTMH.GiaBan BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT MH.*, LH.TenLH
FROM MatHang AS MH 
INNER JOIN LoaiHang AS LH
ON MH.MaLH = LH.MaLH
WHERE LH.TenLH = 'Mũ' OR LH.TenLH = 'Thắt lưng';

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT * FROM donhang
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("28/11/2019", "%d/%c/%Y")
OR CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("14/12/2019", "%d/%c/%Y"); 

-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * FROM MatHang AS MH
INNER JOIn chitietmathang AS CTMH
ON MH.MaMH = CTMH.MaMH
ORDER BY GiaBan;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * FROM MatHang AS MH
INNER JOIn chitietmathang AS CTMH
ON MH.MaMH = CTMH.MaMH
ORDER BY GiaMua DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT * FROM MatHang AS MH
INNER JOIn chitietmathang AS CTMH
ON MH.MaMH = CTMH.MaMH
ORDER BY GiaBan, GiaMua DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AS SoLuongMatHang FROM MatHang;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT COUNT(*) AS SoLuongMatHang
FROM MatHang AS MH
INNER JOIN ChiTietDonHang AS CTDH
ON MH.MaMH = CTDH.MaMH
INNER JOIN DonHang AS DH
ON CTDH.MaDH = DH.MaDH
WHERE TenMH = 'Giày da Nam' 
AND CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE("23/11/2019", "%d/%c/%Y"); 

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
    -- MaLoai  TenLoai SoLuong
	-- 1       Giày    20
	-- 2       Áo      28
SELECT LH.MaLH, LH.TenLH, COUNT(*) AS SoLuong
FROM LoaiHang AS LH
INNER JOIN MatHang AS MH
ON MH.MaLH = LH.MaLH
GROUP BY LH.MaLH;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT LH.TenLH, MH.MaMH, MH.TenMH, CTMH.GiaBan
FROM MatHang AS MH
INNER JOIN LoaiHang AS LH
ON MH.MaLH = LH.MaLH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
WHERE LH.TenLH = 'Giày'
ORDER BY GiaBan DESC
LIMIT 1;

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT LH.*, MH.MaMH, MH.TenMH, Max(CTMH.GiaBan) AS GiaCaoNhat
FROM MatHang AS MH
INNER JOIN LoaiHang AS LH
ON MH.MaLH = LH.MaLH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
GROUP BY LH.MaLH;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16 (duplicated)
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
    -- Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
SELECT LH.MaLH, LH.TenLH, COUNT(*) AS SoLuong
FROM LoaiHang AS LH
INNER JOIN MatHang AS MH
ON MH.MaLH = LH.MaLH
GROUP BY LH.MaLH
HAVING COUNT(*) > 20;

-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT  LH.*, MH.MaMH, MH.TenMH,  MAX(SoLuong) AS SoLuong 
FROM LoaiHang AS LH
INNER JOIN MatHang AS MH
ON MH.MaLH = LH.MaLH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
GROUP BY LH.MaLH;

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT  LH.*, ROUND(AVG(GiaBan), 2) AS GiaBanTrungBinh 
FROM LoaiHang AS LH
INNER JOIN MatHang AS MH
ON MH.MaLH = LH.MaLH
INNER JOIN ChiTietMatHang AS CTMH
ON MH.MaMH = CTMH.MaMH
GROUP BY LH.MaLH;

-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
SELECT LH.*, SoLuongBanDau, SoLuongBan, (SoLuongBanDau - SoLuongBan) AS SoLuongConLai
FROM LoaiHang AS LH
INNER JOIN (
	SELECT LH.*, SUM(SoLuong) AS SoLuongBanDau
	FROM LoaiHang AS LH
	INNER JOIN MatHang AS MH
	ON LH.MaLH = MH.MaLH
	INNER JOIN ChiTietMatHang AS CTMH
	ON MH.MaMH = CTMH.MaMH
	GROUP BY LH.MaLH
) AS SLBD
ON LH.MaLH = SLBD.MaLH
INNER JOIN (
	SELECT LH.*, SUM(SoLuong) AS SoLuongBan
	FROM LoaiHang AS LH
	INNER JOIN MatHang AS MH
	ON LH.MaLH = MH.MaLH
	INNER JOIN ChiTietDonHang AS CTDH
	ON MH.MaMH = CTDH.MaMH
	GROUP BY LH.MaLH
) AS SLB
ON LH.MaLH = SLB.MaLH
ORDER BY SoLuongConLai DESC
LIMIT 3;

-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT MH.*, DH.MaDH 
FROM MatHang AS MH
INNER JOIN ChiTietDonHang AS CTDH 
ON MH.MaMH = CTDH.MaMH 
INNER JOIN DonHang AS DH
ON DH.MaDH = CTDH.MaDH
WHERE MH.MaLH = 2 AND DH.MaDH = 100100;

-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT MH.*, DH.MaDH, ThoiGianDatHang 
FROM MatHang AS MH
INNER JOIN ChiTietDonHang AS CTDH 
ON MH.MaMH = CTDH.MaMH 
INNER JOIN DonHang AS DH
ON DH.MaDH = CTDH.MaDH
WHERE MH.MaLH = 2 
AND (DAY(ThoiGianDatHang) = 28 AND MONTH(ThoiGianDatHang) = 11);

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
SELECT MH.*, TenLH, ThoiGianDatHang  
FROM MatHang AS MH 
INNER JOIN LoaiHang AS LH
ON MH.MaLH = LH.MaLH
INNER JOIN ChiTietDonHang AS CTDH
ON MH.MaMH = CTDH.MaMH
INNER JOIN DonHang AS DH
ON DH.MaDH = CTDH.MaDH
WHERE TenLH = 'Áo' 
AND CAST(ThoiGianDatHang AS DATE) <> STR_TO_DATE("14/02/2019", "%d/%c/%Y");

-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE ChiTietMatHang AS CTMH
SET CTMH.GiaBan = 199
WHERE CTMH.MaMH IN
(
	SELECT MH.MaMH
	FROM MatHang AS MH
	INNER JOIN LoaiHang AS LH
	ON MH.MaLH = LH.MaLH
	WHERE TenLH = 'Áo' 
);

-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
    -- Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE LoaiHang_SaoLuu(
	MaLoai INT AUTO_INCREMENT,
    TenLoai VARCHAR(255),
    CONSTRAINT PK_LoaiHang_SaoLuu PRIMARY KEY(MaLoai)
);
INSERT INTO LoaiHang_SaoLuu(MaLoai, TenLoai)
SELECT MaLH, TenLH FROM LoaiHang;

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2
SELECT MH.MaMH, MH.TenMH, SoLuongBanDau, SoLuongDaBan, (SoLuongBanDau - SoLuongDaBan) AS SoLuongTonKho
FROM MatHang AS MH
INNER JOIN ( 
	SELECT MH.MaMH, MH.TenMH, SUM(SoLuong) AS SoLuongBanDau
	FROM MatHang AS MH
	INNER JOIN ChiTietMatHang AS CTMH
	ON MH.MaMH = CTMH.MaMH
	GROUP BY MH.MaMH
) AS SLBD
ON MH.MaMH = SLBD.MaMH
INNER JOIN (
	SELECT MH.MaMH, MH.TenMH, SUM(SoLuong) AS SoLuongDaBan
	FROM MatHang AS MH
	INNER JOIN ChiTietDonHang AS CTDH
	ON MH.MaMH = CTDH.MaMH
	GROUP BY MH.MaMH
) AS SLDB
ON MH.MaMH = SLDB.MaMH	
INNER JOIN LoaiHang AS LH
ON MH.MaLH = LH.MaLH
WHERE TenLH = 'Áo' OR TenLH = 'Quần'
ORDER BY SoLuongTonKho DESC
LIMIT 2;

-- 31. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
SELECT DH.MaDH, SUM(SoLuong) AS TongTien
FROM DonHang AS DH
INNER JOIN ChiTietDonHang AS CTDH 
ON DH.MaDH = CTDH.MaDH
WHERE DH.MaDH = 2;

-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
        -- 02   TenMH:GiaBan:SoLuong     100
SELECT DH.MaDH, 
	   GROUP_CONCAT(CONCAT(TenMH, ':', GiaBan, ':', CTDH.SoLuong) SEPARATOR ', ') AS ChiTietDonHang, 
       SUM(GiaBan * CTDH.SoLuong) AS TongTien
FROM DonHang AS DH
INNER JOIN ChiTietDonHang AS CTDH 
ON DH.MaDH = CTDH.MaDH
INNER JOIN MatHang AS MH 
ON CTDH.MaMH = MH.MaMH
INNER JOIN ChiTietMatHang AS CTMH 
ON MH.MaMH = CTMH.MaMH
GROUP BY DH.MaDH
HAVING DH.MaDH = '2';


