-- ======================= REFRESH DATA =======================
-- D. SELECT - SLIDE 25-44
-- 1. Toàn bộ thông tin các loại hàng
SELECT *
FROM LoaiHang;
    -- Mặt hàng thuộc loại hàng là 'Thắt lưng'
    SELECT *
    FROM MatHang
    WHERE MaLH = (SELECT MaLH
				  FROM LoaiHang
                  WHERE TenLH = 'Thắt lưng');
                  
	SELECT *
    FROM MatHang mh
    WHERE EXISTS (SELECT MaLH
				  FROM LoaiHang lh
                  WHERE mh.MaLH = lh.MaLH AND
                  TenLH = 'Thắt lưng');
                  
	SELECT mh.*
    FROM MatHang mh
    JOIN LoaiHang lh ON mh.MaLH = lh.MaLH
    WHERE lh.TenLH = 'Thắt lưng';
    
    -- Top 5 mặt hàng có giá bán cao nhất
   SELECT mh.*, 
		  ctmh.GiaBan,
          ctmh.MaKC
   FROM MatHang mh
   JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
   ORDER BY GiaBan DESC
   LIMIT 5;
   
	SELECT mh.*, 
		  avg(ctmh.GiaBan) GiaBan
   FROM MatHang mh
   JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
   GROUP BY ctmh.MaMH
   ORDER BY GiaBan DESC
   LIMIT 5;
   
-- 2. Đơn hàng
    -- Được bán trong ngày 28/11/2019
    SELECT *
    FROM DonHang
    WHERE CAST(ThoiGianDatHang AS DATE) = '2020-12-18';
    
    -- Được bán từ ngày 28/11/2019 đến ngày 02/12/2019
    SELECT *
    FROM DonHang
    WHERE CAST(ThoiGianDatHang AS DATE) BETWEEN '2019-11-18' AND '2022-02-12';
    
    -- Được bán trong tháng 11/2019
    SELECT *
    FROM DonHang
    WHERE MONTH(ThoiGianDatHang) = 12
    AND YEAR(ThoiGianDatHang) = 2020;
    
    -- Được giao hàng tại Hòa Khánh
    SELECT *
    FROM DonHang
    WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';
    
-- 3. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT mh.*,
	   ROUND(ctmh.GiaBan * 0.8, 2) GiaKhuyenMai
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH;

-- 4. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT mh.*,
	   ROUND(ctmh.GiaBan * 0.8, 2) GiaKhuyenMai
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
WHERE current_date() = '2019-05-04';

-- 5. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT MauSac
FROM MatHang;

-- 7. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT mh.MaMH, mh.TenMH, dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh ON ctdh.MaDH = dh.MaDH
WHERE CAST(ThoiGianDatHang AS DATE) = '2020-12-18';
-- 8. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT mh.*,
	   ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
WHERE GiaBan BETWEEN 100 AND 300;

-- 9. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
    FROM MatHang
    WHERE MaLH IN (SELECT MaLH
				  FROM LoaiHang
                  WHERE TenLH = 'Thắt lưng' OR TenLH = 'Mũ');

-- 10. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)


-- ==============================================================
-- 11. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT mh.*,
	   ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY (mh.MaMH)
ORDER BY ctmh.GiaBan;

-- 12. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT mh.*,
	   ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY (mh.MaMH)
ORDER BY ctmh.GiaBan DESC;

-- 13. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT mh.*,
	   ctmh.GiaBan,
       ctmh.GiaMua
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
ORDER BY ctmh.GiaBan ASC, ctmh.GiaMua DESC;

-- 14. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) TongSoMatHang
FROM MatHang;

-- 15. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT mh.MaMH,
	   mh.TenMH,
       SUM(ctdh.SoLuong) SoLuong,
       dh.ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ctdh ON mh.MaMH = ctdh.MaMH
JOIN DonHang dh ON ctdh.MaDH = dh.MaDH
WHERE mh.TenMH = 'Áo sơ mi Nam';

-- 16. Đếm số lượng các mặt hàng theo từng loại hàng
--     MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT mh.MaLH,
       SUM(ctmh.SoLuong) SoLuong
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY MaLH;

-- 17. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT mh.*,
	   lh.TenLH,
       ctmh.GiaBan
FROM MatHang mh
JOIN LoaiHang lh ON mh.MaLH = lh.MaLH
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
WHERE lh.TenLH = 'Giày dép'
ORDER BY ctmh.GiaBan DESC
LIMIT 1;
-- 18. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
WITH LoaiHang_GBLN AS (SELECT 
	   lh.MaLH,
       MAX(ctmh.GiaBan) GiaBanLonNhat
FROM MatHang mh
JOIN LoaiHang lh ON lh.MaLH = mh.MaLH
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
GROUP BY lh.MaLH)

SELECT mh.*,
	   ctmh.GiaBan
FROM MatHang mh
JOIN ChiTietMatHang ctmh ON mh.MaMH = ctmh.MaMH
JOIN LoaiHang_GBLN lhln ON mh.MaLH = lhln.MaLH
WHERE ctmh.GiaBan = lhln.GiaBanLonNhat;

-- 19. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT *
FROM MatHang mh

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


