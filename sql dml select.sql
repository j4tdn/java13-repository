-- Part I: Slide demo
SELECT MaMH MatHang, 
	   MaKC AS KichCo,
       GiaBan,
       GiaBan * 0.9 AS GiaKhuyenMai,
       GiaMua,
       SoLuong
FROM ChiTietMatHang
WHERE MaMH IN (1, 2) -- WHERE MaMH = 1 OR MaMH = 2;
ORDER BY GiaBan DESC, GiaMua ASC; 
-- LIMIT 2, 3;

SELECT MaMH, 
	   MaKC,
       SoLuong,
       CASE HinhAnh
			WHEN 'undefined.png' THEN ''
            ELSE 'avatar'
	   END AS HinhAnh
FROM  chitietmathang;
 
 SELECT MaMH,
		MaKC, 
        SoLuong
 FROM chitietmathang;
 
 SELECT MaMH, 
		GROUP_CONCAT(CONCAT(MaKC, ', ' , SoLuong) SEPARATOR '-') ChiTietMatHang,
		SUM(SoLuong) TongSoLuong
 FROM chitietmathang
 GROUP BY MaMH
 HAVING TongSoLuong > 100;

-- COUNT(*) -> đếm số dòng của table
-- COUNT(column) đếm số dòng xuất hiện value non null của column trong table 
 SELECT * FROM DonHang;
 SELECT COUNT(*), 
		COUNT(MaDH),
		COUNT(GhiChu),
        COUNT(SDTNguoiNhan)
 FROM DonHang;
 
 SELECT MaNV, 
		GROUP_CONCAT(MaDH SEPARATOR '-') AS ChiTiet,
		COUNT(*) SoDongHang
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
SELECT * FROM MatHang;
SELECT * FROM LoaiHang;
INSERT INTO LoaiHang(MaLH, TenLH)
VALUES('7', 'Ví'), ('8', 'Nón');
-- A, B, C
-- E, F, A

SELECT * 
FROM MatHang MH
JOIN LoaiHang LH ON MH.MaLH = LH.MaLH;

SELECT * 
FROM MatHang MH
LEFT JOIN LoaiHang LH ON MH.MaLH = LH.MaLH
UNION 
SELECT * 
FROM MatHang MH
RIGHT JOIN LoaiHang LH ON MH.MaLH = LH.MaLH;

-- SUB QUERY 
CREATE TABLE Backup(
	ITEM_GROUP_ID INT AUTO_INCREMENT PRIMARY KEY ,
    ITEM_GROUP_NAME VARCHAR(50) NOT NULL
);

SELECT * FROM Backup;
INSERT INTO Backup(ITEM_GROUP_ID, ITEM_GROUP_NAME)
SELECT MaLH, TenLH FROM LoaiHang;
SELECT * FROM MatHang;

SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
SELECT 13 MaMH, 'Công tắc điện' AS TenMH, MauSac, MaLH FROM MatHang WHERE MaMH = 12;
-- VALUES(14, 'Công tắc điện', 'Trắng', 99);

-- PARALELL QUERY 
-- Lồng tương quan
SELECT * 
FROM MatHang mh
WHERE EXISTS (SELECT MaLH
			  FROM LoaiHang lh
              WHERE TenLH LIKE 'Áo');