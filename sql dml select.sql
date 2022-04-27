-- Part I: Slide demo
SELECT MaMH MatHang,
       MaKC AS KichCo,
       GiaBan,
       GiaBan * 0.9 GiaKhuyenMai,
       GiaMua,
       SoLuong
FROM ChiTietMatHang
WHERE MaMH IN (1,2,3) -- WHERE MaMH = 1 OR MaMH = 2;
ORDER BY GiaBan DESC, GiaMua DESC;
-- LIMIT 2, 3

SELECT MaMH,
	   MaKC,
       SoLuong,
       CASE HinhAnh
			WHEN 'undefined.png' THEN ''
            ELSE 'avatar' 
	   END AS HinhAnh
FROM ChiTietMatHang;

SELECT MaMH, 
       MaKC,
       SoLuong
FROM ChiTietMatHang;

SELECT MaMH,
	   GROUP_CONCAT(CONCAT(MaKC,',',SoLuong) SEPARATOR '-') ChiTietMatHang,
       SUM(SoLuong) TongSoLuong
FROM ChiTietMatHang
WHERE MaMH IN (1,2,3,4,5)
GROUP BY MaMH
HAVING TongSoLuong > 100;

SELECT GROUP_CONCAT(CONCAT(MaMH,'-',TenMH) SEPARATOR '*') 
FROM MatHang;

-- COUNT(*)      --> Đếm số dòng của table
-- COUNT(column) --> Đếm số dòng xuất hiện value(non-null) của column trong table
SELECT * FROM DonHang;
SELECT COUNT(*), 
       COUNT(MaDH),
       COUNT(GhiChu),
       COUNT(SDTNguoiNhan)
FROM DonHang;

SELECT MaNV,
       GROUP_CONCAT(MaDH SEPARATOR '-') ChiTiet,
       COUNT(*) SoDonHang
FROM DonHang
GROUP BY MaNV;

-- Liệt kê những mặt hàng thuộc loại hàng = 2
-- MaMH, TenMH, MauSac, MaLH ==> 3 4 5
SELECT * FROM MatHang WHERE MaLH = 2

UNION
-- Liệt kê những mặt hàng thuộc đơn hàng = 1
-- MaDH, MaMH, SoLuong ==> 1 3 4
SELECT * FROM ChiTietDonHang WHERE MaDH = 1; 

SELECT MaMH FROM MatHang WHERE MaLH = 2
UNION ALL
SELECT MaMH FROM ChiTietDonHang WHERE MaDH = 1;

-- SQL JOIN --> JOIN(INNER JOIN), LEFT JOIN, RIGHT JOIN, OUTER JOIN
-- Liệt kê tất cả các mặt hàng mũ trong hệ thống
SELECT *
FROM MatHang
WHERE MaLH = (SELECT MaLH FROM LoaiHang WHERE TenLH LIKE '%Áo%');

SELECT * FROM MatHang;  -- MH(1,12) LH(1,5, n, n, 99)
SELECT * FROM LoaiHang; --          LH(1,5, 6, 7, n)
INSERT INTO LoaiHang(MaLH, TenLH)
VALUES (6, 'Ví'), (7, 'Nón');
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(13, 'Máy Quạt', 'Trắng', 99);

SELECT mh.*, lh.*
FROM MatHang mh
LEFT JOIN LoaiHang lh ON mh.MaLH = lh.MaLH;
-- WHERE lh.MaLH IS NULL -- equals

SELECT lh.*,
       GROUP_CONCAT(mh.TenMH SEPARATOR ', ') DanhSachMatHanh
FROM MatHang mh
LEFT JOIN LoaiHang lh ON mh.MaLH = lh.MaLH
WHERE lh.MaLH IS NOT NULL
GROUP BY lh.MaLH;

SELECT *
FROM MatHang mh
LEFT JOIN LoaiHang lh ON mh.MaLH = lh.MaLH
UNION
SELECT *
FROM MatHang mh
RIGHT JOIN LoaiHang lh ON mh.MaLH = lh.MaLH;

-- SUB QUERY
SELECT *
FROM MatHang
WHERE MaLH = (SELECT MaLH FROM LoaiHang WHERE TenLH LIKE '%Áo%');

UPDATE ChiTietMatHang
SET GiaBan = 199
WHERE MaMH IN (SELECT MaMH FROM MatHangAo); -- (1,2,11,12)

CREATE TABLE Backup(
	ITEM_GROUP_ID INT AUTO_INCREMENT  PRIMARY KEY,
    ITEM_GROUP_NAME VARCHAR(50) NOT NULL
);

SELECT COUNT(*) FROM LoaiHang;
SELECT * FROM LoaiHang;
SELECT * FROM Backup;
INSERT INTO Backup(ITEM_GROUP_ID, ITEM_GROUP_NAME)
SELECT MaLH, TenLH FROM LoaiHang;

SET FOREIGN_KEY_CHECKS = 0;
SELECT * FROM MatHang;

INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
SELECT 14 , 'Công tắc điện', MauSac, MaLH FROM MatHang WHERE MaMH = 13;
-- VALUES(14, 'Công tắc điện', 'Trắng', 99);


-- PARALLEL QUERY - Truy vấn lồng
SELECT MaKH
FROM KhachHang kh
WHERE LoaiKH = 2  AND kh.MaKH IN (SELECT dh.MaKH
				  FROM DonHang dh 
				  WHERE  dh.SoLuong > 1);
SELECT kh.MaKH
FROM KhachHang kh
WHERE LoaiKH = 2  AND EXISTS (SELECT * -- MaKH || 1 ||
				FROM DonHang dh
				WHERE  dh.MaKH = dh.MaKH);

-- Truy vấn con, lồng phân cấp
SELECT *
FROM MatHang
WHERE MaLH IN (SELECT MaLH FROM LoaiHang WHERE TenLH LIKE '%Áo%');

-- Lồng tương quan
SELECT *
FROM MatHang mh
WHERE EXISTS (SELECT MaLH 
			  FROM LoaiHang lh
			  WHERE TenLH LIKE '%Áo%'
				AND lh.MaLH = mh.MaLH);

