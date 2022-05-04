-- ======================= REFRESH DATA =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    SELECT * FROM MatHang
		WHERE MaLH IN (Select MaLH
					   FROM LoaiHang
					   WHERE TenLH = 'Thắt lưng');
    -- Top 5 mặt hàng có giá bán cao nhất
    SELECT mh.*, ctmh.GiaBan 
    FROM mathang mh
    JOIN chitietmathang ctmh
    ON mh.MaMH = ctmh.MaMH
	ORDER BY ctmh.GiaBan DESC
    LIMIT 5;
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
SELECT * 
FROM donhang
WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y');
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
FROM donhang
WHERE DATE(ThoiGianDatHang) between STR_TO_DATE('18/12/2020', '%d/%m/%Y') and STR_TO_DATE('02/12/2020', '%d/%m/%Y');
    -- Được bán trong tháng 11/2019
SELECT * 
FROM donhang
WHERE MONTH(ThoiGianDatHang) = 11 AND YEAR(ThoiGianDatHang) = 2019;
    -- Được giao hàng tại Hòa Khánh
SELECT * 
FROM donhang
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *, GiaBan*0.8 AS 'Giam Gia'
    FROM chitietmathang;
-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT dh.*, dh.TongTien*0.8  AS 'Giam Gia' 
FROM DonHang dh
WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('17/12/2020', '%d/%m/%Y');
-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac
FROM MatHang;
-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT * FROM mathang; -- MaMH TenMH
SELECT * FROM donhang; -- ThoiGianDatHang, maDH
SELECT * FROM chitietdonhang; -- MaDH MaMH

SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang 
FROM donhang dh
    JOIN chitietdonhang ctdh ON dh.MaDH = ctdh.MaDH
    JOIN mathang mh ON ctdh.MaMH = mh.MaMH
	WHERE DATE(ThoiGianDatHang) = STR_TO_DATE('23/11/2019', '%d/%m/%Y');
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
FROM MatHang mh
WHERE EXISTS (SELECT MaLH 
			  FROM LoaiHang lh
			  WHERE (TenLH LIKE '%Mũ%' OR TenLH LIKE '%Thắt lưng%')
				AND lh.MaLH = mh.MaLH);
-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT * FROM DonHang;
SELECT *
FROM DonHang
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE('28-11-2019', '%d-%m-%Y') 
					AND STR_TO_DATE('14-12-2019', '%d-%m-%Y');
-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT mh.*, ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan;
-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT mh.*, ctmh.GiaMua
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan DESC;
-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT mh.*, ctmh.GiaBan, ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan ASC, ctmh.GiaMua DESC;
-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT * FROm mathang;
SELECT * FROm chitietmathang;
SELECT sum(SoLuong) SLMHTrongHeThong
FROM chitietmathang;
-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT * FROM donhang; -- Thời gian
SELECT * FROM chitietdonhang; -- số lượng
SELECT * FROM mathang; -- tên mặt hàng
SELECT mh.TenMH, ctdh.SoLuong, dh.ThoiGianDatHang FROM chitietdonhang ctdh
    JOIN donhang dh  ON ctdh.MaDH - dh.MaDH
    JOIN mathang mh  ON ctdh.MaMH = mh.MaMH
    WHERE DATE(dh.ThoiGianDatHang) = STR_TO_DATE('18/12/2020', '%d/%m/%Y')
			AND mh.TenMH = 'Giày da Nam';
-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT * FROM mathang; -- maMH, maLH
SELECT * FROM loaihang; -- maLH, ten LH
SELECT * FROM chitietmathang; -- số lượng, maMH 
SELECT lh.*, SUM(ctmh.SoLuong) AS TongSoLuong FROM chitietmathang ctmh
    JOIN mathang mh ON ctmh.MaMH = mh.MaMH
    JOIN loaihang lh ON mh.MaLH = lh.MaLH
    GROUP BY lh.MaLH;
-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT * FROM chitietmathang; -- số lượng, maMH , Ma KC, GiaBan, Gia Mua 
SELECT * FROM mathang; -- maMH, maLH
SELECT * FROM loaihang; -- maLH, ten LH
SELECT mh.* , lh.TenLH
FROM mathang mh
	JOIN mathang mh ON ctmh.MaMH = mh.MaMH
    JOIN loaihang lh ON mh.MaLH = lh.MaLH
    WHERE lh.TenLH = 'Giày dép';

-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

SELECT mh.MaMH,(GiaBan) giaban FROM chitietmathang ctmh
    JOIN mathang mh ON ctmh.MaMH = mh.MaMH
    JOIN loaihang lh ON lh.MaLH = mh.MaLH
    GROUP BY lh.MaLH;
-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
-- 20. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng >> HAVING
-- ==============================================================
-- 21. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng

-- 22. Hiển thị giá bán trung bình của mỗi loại hàng
-- 23. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại
-- 24. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
-- 25. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
-- 26. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
-- 27. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
-- 28. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 30. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'
-- -- B1: Tìm số lượng hàng còn lại của mỗi mặt hàng thuộc loại hàng 'Áo', 'Quần'
-- -- B2: ORDER BY SoLuongTon DESC
-- -- B3: LIMIT 2

-- 31. Tính tổng tiền cho đơn hàng 02
--     Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng
-- 32. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
-- 	SoDH ChiTietDonHang           TongTien
--         02   TenMH:GiaBan:SoLuong     100



