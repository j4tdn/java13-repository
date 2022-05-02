-- ======================= REFRESH DATA =======================
-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
	SELECT TenMH, lh.MaLH FROM `MatHang` mh
    JOIN `LoaiHang` lh
    ON mh.MaLH = lh.MaLH
    WHERE Lh.TEnLH = 'Thắt lưng';
    
    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT mh.*, ctmh.GiaBan FROM `mathang` mh
    JOIN `chitietmathang` ctmh
    ON mh.MaMH = ctmh.MaMH
	ORDER BY ctmh.GiaBan DESC
    LIMIT 5;
-- 2. ĐƠN HÀNG
    -- Được bán trong ngày 18/12/2020
    SELECT * FROM `donhang`
    WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y');
    
    -- Được bán từ ngày 18/12/2020 đến ngày 10/01/2021
    SELECT * FROM `donhang`
    WHERE DATE(ThoiGianDatHang) 
	between STR_TO_DATE('18/12/2020', '%d/%m/%Y') and STR_TO_DATE('10/01/2021', '%d/%m/%Y');
    
    -- Được bán trong tháng 12/2020
    SELECT * FROM `donhang`
    WHERE MONTH(ThoiGianDatHang) = 12 AND YEAR(ThoiGianDatHang) = 2020;
    
    -- Được giao hàng tại Hòa Khánh
    SELECT * FROM `donhang`
    WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
    
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT *, GiaBan*(1-20/100) AS 'KM 20%'
    FROM `chitietmathang`;
    
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 17/12/2020
	-- SELECT DATE(dh.ThoiGianDatHang) AS 'Ngay Khuyen Mai', 
-- 							GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.GiaBan*(1-20/100)) SEPARATOR ',')
--                             AS 'TenMH-KichCo-GiaMoi'
--     FROM `donhang` dh
--     JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH
--     JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH
--     JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH
-- 	WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('17/12/2020', '%d/%m/%Y')
--     GROUP BY 'Ngay Khuyen Mai';
	SELECT dh.MaDH, dh.ThoiGianDatHang, dh.TongTien, dh.TongTien*(1-20/100) AS 'Sau Khi Giam Gia' FROM DonHang dh
    WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('17/12/2020', '%d/%m/%Y');
    
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	SELECT DISTINCT(MauSac) FROM MatHang;
    
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 17/12/2020
	SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang 
    FROM `donhang` dh
    JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH
    JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH
	WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('17/12/2020', '%d/%m/%Y');
    
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT mh.MaMH, 
			group_concat(CONCAT(ctmh.MaKC, '-', ctmh.GiaBan) separator ',') INFO
    FROM `mathang` mh
    JOIN `chitietmathang` ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE ctmh.GiaBan between 100 and 300
    GROUP By mh.MaMH;
    
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT lh.TenLH, 
			GROUP_CONCAT(mh.TenMH separator ',') TatCaMatHang
    FROM `mathang` mh
    JOIN `loaihang` lh
    ON mh.MaLH = lh.MaLH
    WHERE lh.TenLH = 'Mũ' OR lh.TenLH = 'Thắt Lưng'
    GROUP BY lh.MaLH;
    
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 05/01/2021)
	SELECT * FROM `donhang`
    WHERE DATE(ThoiGianDatHang) 
    BETWEEN STR_TO_DATE('28/11/2019', '%d/%m/%Y') AND STR_TO_DATE('05/01/2021', '%d/%m/%Y'); 

-- ==============================================================
WITH RESULT AS( 
SELECT mh.TenMH, ctmh.MaKC, ctmh.GiaBan FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH)
SELECT * FROM RESULT;
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
	SELECT mh.TenMH, ctmh.MaKC, ctmh.GiaBan 
    FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan;
    
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
	SELECT mh.TenMH, ctmh.MaKC, ctmh.GiaBan 
    FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan DESC;
    
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
	SELECT mh.MaMH, mh.TenMH, ctmh.MaKC, ctmh.GiaBan 
    FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    ORDER BY ctmh.GiaBan, ctmh.GiaMua DESC;
    
-- 14. Đếm số lượng các mặt hàng trong hệ thống
	SELECT COUNT(MaMH) AS SoLuongMatHang FROM `MatHang`;
    
-- 15. Số lượng 'Quần tây Nam' được bán trong ngày 18/12/2020
	SELECT mh.TenMH, ctdh.SoLuong, dh.ThoiGianDatHang FROM `chitietdonhang` ctdh
    JOIN `donhang` dh  ON ctdh.MaDH - dh.MaDH
    JOIN `mathang` mh  ON ctdh.MaMH = mh.MaMH
    WHERE DATE(dh.ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y')
			AND mh.TenMH = 'Quần Tây Nam';
    
    
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
	SELECT lh.*, SUM(ctmh.SoLuong) AS TongSoLuong FROM `chitietmathang` ctmh
    JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
    JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
    GROUP BY lh.MaLH;
    
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày dép'
	SELECT * FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE ctmh.GiaBan = (
		SELECT MAX(GiaBan) FROM `MatHang` mh
		JOIN `LoaiHang` lh ON mh.MaLH = lh.MaLH 
		JOIN `ChiTietMatHang` ctmh ON mh.MaMH = ctmh.MaMH
		WHERE lh.TenLH = 'Giày dép'
    );
    
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
	
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 160
	WITH RESULT AS(
		SELECT lh.*, SUM(ctmh.SoLuong) AS 'TongSoLuong' FROM `chitietmathang` ctmh
		JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
		JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
		GROUP BY lh.MaLH
    )
	SELECT * FROM RESULT
    WHERE TongSoLuong > 160;

-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 200 mặt hàng >> HAVING
-- ==============================================================
	SELECT lh.*, SUM(ctmh.SoLuong) AS 'TongSoLuong' FROM `chitietmathang` ctmh
	JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
	JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
	GROUP BY lh.MaLH
	HAVING TongSoLuong > 200;
    
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng    

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
	SELECT SUM(GiaBan)/Count(GiaBan) AS 'Giá bán trung bình' FROM `chitietmathang` ctmh
    JOIN `mathang` mh ON mh.MaMH = ctmh.MaMH
    JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
    GROUP BY lh.MaLH;
    
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
	SELECT lh.MaLH, SUM(SoLuong) FROM `loaihang` lh
    JOIN `mathang` mh ON lh.MaLH = mh.MaLH
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH 
    GROUP BY lh.MaLH
	ORDER BY SUM(SoLuong) DESC
    LIMIT 3;
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
	SELECT * FROM `mathang` mh
    JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
    JOIN `chitietdonhang` ctdh ON ctdh.MaMH = mh.MaMH
    JOIN `donhang` dh ON ctdh.MaDH = dh.MaDH
    WHERE lh.MaLH = 2 AND dh.MaDH = 1;
    
-- 25. Tìm những mặt hàng có Mã Loại = 1 và đã được bán trong ngày 17/12
	SELECT * FROM `mathang` mh
    JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
    JOIN `chitietdonhang` ctdh ON ctdh.MaMH = mh.MaMH
    JOIN `donhang` dh ON ctdh.MaDH = dh.MaDH
    WHERE lh.MaLH = 1 AND DAY(dh.ThoiGianDatHang) = 17 AND MONTH(dh.ThoiGianDatHang)=12;

-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
	SELECT * FROM `mathang` mh
    JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
    JOIN `chitietdonhang` ctdh ON ctdh.MaMH = mh.MaMH
    JOIN `donhang` dh ON ctdh.MaDH = dh.MaDH
    WHERE lh.TenLh = 'Mũ' AND dh.ThoiGianDatHang <> STR_TO_DATE('14/02/2019', '%d/%m/%Y');
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
	UPDATE `chitietmathang` ctmh
    JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
    JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
    SET ctmh.GiaBan = 199
    WHERE lh.TenLH = 'Áo';
    
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu
	CREATE TABLE LoaiHang_SaoLuu(
		MaLoai INT PRIMARY KEY AUTO_INCREMENT,
        TenLoai VARCHAR(50) NOT NULL
    );
    
    SELECT * FROM `LoaiHang_SaoLuu`;
    INSERT INTO LoaiHang_SaoLuu(MaLoai, TenLoai)
    SELECT MaLH, TenLH FROM `LoaiHang`;
-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
	SELECT * FROM `loaihang` lh
    JOIN `mathang` mh ON lh.MaLH = mh.MaLH
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH 
    WHERE lh.TenLH = 'Áo'
	ORDER BY SoLuong DESC
    LIMIT 2;
    
    SELECT * FROM chitietmathang;
    SELECT * FROM `loaihang` lh
    JOIN `mathang` mh ON lh.MaLH = mh.MaLH
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH 
    WHERE lh.TenLH = 'Quần'
	ORDER BY SoLuong DESC
    LIMIT 2;
-- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- B2: ORDER BY SoLuongTon DESC
-- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100

 
 