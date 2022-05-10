-- ======================= REFRESH DATA =======================
-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
	SELECT * FROM `MatHang` mh
    JOIN `LoaiHang` lh
    ON mh.MaLH = lh.MaLH
    WHERE Lh.TenLH = 'Thắt lưng';
    
    SELECT *  FROM `MatHang` mh
    WHERE EXISTS(
		SELECT * FROM `LoaiHang` lh
		WHERE lh.TenLH = 'Thắt lưng' AND mh.MaLH = lh.MaLH
	);
    
    
    
    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT mh.*, ctmh.MaKC, ctmh.GiaBan FROM `mathang` mh
    JOIN `chitietmathang` ctmh
    ON mh.MaMH = ctmh.MaMH
	ORDER BY ctmh.GiaBan DESC
    LIMIT 0, 5;
    
    -- => Trường hợp một mặt hàng có kích thước khác nhau nhưng cùng có giá bán cao nhất
	SELECT mh.*, ctmh.MaKC, ctmh.GiaBan, AVG(ctmh.GiaBan) GiaBanTB FROM `mathang` mh
    JOIN `chitietmathang` ctmh
    ON mh.MaMH = ctmh.MaMH
    GROUP BY mh.MaMH
	ORDER BY AVG(ctmh.GiaBan) DESC
    LIMIT 0, 5;
    -- offsite, size
    SELECT * FROM `chitietmathang`;
-- 2. ĐƠN HÀNG
    -- Được bán trong ngày 18/12/2020
    SELECT * FROM `donhang`
    WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y');
    
    -- Được bán từ ngày 18/12/2020 đến ngày 10/01/2021
    SELECT * FROM `donhang`
    WHERE DATE(ThoiGianDatHang) 
	BETWEEN STR_TO_DATE('18/12/2020', '%d/%m/%Y') AND STR_TO_DATE('10/01/2021', '%d/%m/%Y');
    
    -- Được bán trong tháng 12/2020
    SELECT * FROM `donhang`
    WHERE MONTH(ThoiGianDatHang) = 12 AND YEAR(ThoiGianDatHang) = 2020;
    
    -- Được giao hàng tại Hòa Khánh
    SELECT * FROM `donhang`
    WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
    
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT  mh.MaMH,
			mh.TenMH,
            ctmh.GiaBan,
            ctmh.MaKC,
            ROUND(GiaBan*0.8,2) AS 'KM 20%'
    FROM `mathang` mh
    JOIN `chitietmathang` ctmh 
    ON mh.MaMH = ctmh.MaMH;
    
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày hôm nay
	SELECT  mh.MaMH,
			mh.TenMH,
            ctmh.GiaBan,
            ctmh.MaKC,
            ROUND(GiaBan*0.8,2) AS 'KM 20%'
    FROM `mathang` mh
    JOIN `chitietmathang` ctmh 
    ON mh.MaMH = ctmh.MaMH
    WHERE current_date() = '2022-5-5';
    
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
	SELECT DISTINCT(MauSac) FROM MatHang;
    
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 17/12/2020
	SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang 
    FROM `donhang` dh
    JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH
    JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH
	WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('17/12/2020', '%d/%m/%Y');
    
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT  mh.MaMH, 
			group_concat(CONCAT(ctmh.MaKC, '-', ctmh.GiaBan) separator ',') INFO
    FROM `mathang` mh
    JOIN `chitietmathang` ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE ctmh.GiaBan between 100 and 300
    GROUP BY mh.MaMH;
    
-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT lh.TenLH, 
			GROUP_CONCAT(mh.TenMH separator ',') TatCaMatHang
    FROM `mathang` mh
    JOIN `loaihang` lh
    ON mh.MaLH = lh.MaLH
    WHERE lh.TenLH IN ('Mũ','Thắt Lưng')
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
	SELECT  dh.MaDH,
			mh.TenMH, 
			ctdh.SoLuong SoLuong,
			dh.ThoiGianDatHang 
    FROM `chitietdonhang` ctdh
    JOIN `donhang` dh  ON ctdh.MaDH = dh.MaDH
    JOIN `mathang` mh  ON ctdh.MaMH = mh.MaMH
    WHERE DATE(dh.ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y')
			AND mh.TenMH = 'Quần tây Nam';
    
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
	SELECT  GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.SoLuong) SEPARATOR ',') DanhSachMatHang,
			SUM(ctmh.SoLuong) AS TongSoLuong  
    FROM `chitietmathang` ctmh
    JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
    GROUP BY mh.MaLH;
    
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày dép'
	SELECT mh.TenMH,
           ctmh.MaKC,
           ctmh.GiaBan
    FROM `MatHang` mh
    JOIN `ChiTietMatHang` ctmh
    ON mh.MaMH = ctmh.MaMH
    WHERE ctmh.GiaBan IN (
		SELECT MAX(GiaBan) 
        FROM `MatHang` mh
		JOIN `LoaiHang` lh ON mh.MaLH = lh.MaLH 
		JOIN `ChiTietMatHang` ctmh ON mh.MaMH = ctmh.MaMH
		WHERE lh.TenLH = 'Giày dép'
    );
	
    -- TH sorted and limit 
    
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
	WITH LoaiHang_GBCN  AS
		(
        SELECT  lh.MaLH,
				 MAX(ctmh.GiaBan) AS MAX
		FROM `chitietmathang` ctmh
		JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
		JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
		GROUP BY lh.MaLH
        )
		
    SELECT mh.*,
		   ctmh.GiaBan 
    FROM `mathang` mh
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH
    JOIN LoaiHang_GBCN lhcn ON mh.MaLH = lhcn.MaLH
    WHERE ctmh.GiaBan = lhcn.MAX
    GROUP BY mh.MaLH;
    
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
	SELECT  lh.*,
			SUM(ctmh.SoLuong) AS 'TongSoLuong' 
    FROM `chitietmathang` ctmh
	JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
	JOIN `loaihang` lh ON mh.MaLH = lh.MaLH
	GROUP BY lh.MaLH
	HAVING TongSoLuong > 200;
    
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
	WITH RESULT AS(
		WITH SoLuongNhieuNhat AS (
			WITH MatHang_SoLuong AS
				(
				SELECT  mh.*,
						SUM(ctmh.SoLuong) AS TongSoLuong
				FROM `chitietmathang` ctmh
				JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
				JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
				GROUP BY mh.MaMH
				)
			SELECT lh.*,
				   MAX(mhsl.TongSoLuong) AS MAX
			FROM MatHang_SoLuong mhsl
			JOIN `loaihang` lh ON lh.MaLH = mhsl.MaLH
			GROUP BY mhsl.MaLH
		)
		SELECT mh.*, MAX,  SUM(ctmh.SoLuong) AS TongSoLuong
			FROM `chitietmathang` ctmh
			JOIN `mathang` mh ON ctmh.MaMH = mh.MaMH
			JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
			JOIN SoLuongNhieuNhat slnn ON slnn.MaLH = lh.MaLH
			GROUP BY mh.MaMH
	)
	SELECT rs.MaMH, rs.TenMH, rs.TongSoLuong FROM RESULT rs
    WHERE rs.MAX = rs.TongSoLuong;
    
-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
	SELECT SUM(GiaBan)/Count(GiaBan) AS 'Giá bán trung bình' FROM `chitietmathang` ctmh
    JOIN `mathang` mh ON mh.MaMH = ctmh.MaMH
    JOIN `loaihang` lh ON lh.MaLH = mh.MaLH
    GROUP BY lh.MaLH;
    
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
	SELECT lh.MaLH, SUM(SoLuong) AS TongSoLuong
    FROM `loaihang` lh
    JOIN `mathang` mh ON lh.MaLH = mh.MaLH
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH 
    GROUP BY lh.MaLH
	ORDER BY TongSoLuong DESC
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
    
    
    SELECT * FROM `loaihang` lh
    JOIN `mathang` mh ON lh.MaLH = mh.MaLH
    JOIN `chitietmathang` ctmh ON mh.MaMH = ctmh.MaMH 
    WHERE lh.TenLH = 'Quần'
	ORDER BY SoLuong DESC
    LIMIT 2;

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

-- 	=> Thêm vào bảng chi tiết đơn hàng mã kích cỡ
	ALTER TABLE `chitietdonhang`
    DROP FOREIGN KEY FK_CTDH_MH;
	
    ALTER TABLE `chitietdonhang`
    DROP PRIMARY KEY;
    
    ALTER TABLE `chitietdonhang`
    ADD MaKC VarChar(10) NOT NULL AFTER MaMH;
    
	ALTER TABLE `chitietdonhang`
    ADD CONSTRAINT PK_CTDH PRIMARY KEY(MaDH, MaMH, MaKC);
    
    ALTER TABLE `chitietdonhang`
    ADD CONSTRAINT FK_CTDH_CTMH FOREIGN KEY(MaMH, MaKC)
    REFERENCES chitietmathang(MaMH, MaKC);
    
	SELECT dh.MaDH, GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.GiaBan, '-', ctdh.SoLuong) SEPARATOR ',') HoaDon, 
					SUM(ctdh.SoLuong*ctmh.GiaBan) TongTien
    FROM `donhang` dh
    JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH
    JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH
	JOIN `chitietmathang` ctmh ON ctdh.MaMH = ctmh.MaMH AND ctdh.MaKC = ctmh.MAKC
--     WHERE dh.MaDH = 2;
    GROUP BY dh.MaDH;
    
    
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100

-- 33. Thêm dữ liệu vào bảng hóa đơn từ dữ liệu vừa tính được 
	INSERT INTO HoaDon(MaHD, MaDH, NgayXuatHoaDon, SoTienCanThanhToan) 
	WITH DuLieu_HoaDon AS(
		SELECT dh.MaDH, GROUP_CONCAT(CONCAT(mh.TenMH, '-', ctmh.MaKC, '-', ctmh.GiaBan, '-', ctdh.SoLuong) SEPARATOR ',') HoaDon, 
						SUM(ctdh.SoLuong*ctmh.GiaBan) TongTien
		FROM `donhang` dh
		JOIN `chitietdonhang` ctdh ON dh.MaDH = ctdh.MaDH
		JOIN `mathang` mh ON ctdh.MaMH = mh.MaMH
		JOIN `chitietmathang` ctmh ON ctdh.MaMH = ctmh.MaMH AND ctdh.MaKC = ctmh.MAKC
	--     WHERE dh.MaDH = 2;
		GROUP BY dh.MaDH
    )
    SELECT MaDH, MaDH, CURRENT_DATE(), TongTien
    FROM DuLieu_HoaDon;
    
    SELECT * FROM HoaDon;