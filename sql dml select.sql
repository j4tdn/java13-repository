USE java13_shopping;

-- Part I: Slide demo
SELECT * FROM ChiTietMatHang;
SELECT MaMH, MaKC, SoLuong,
		CASE HinhAnh
			WHEN 'undefined.png' THEN ''
            ELSE 'avatar'
		END AS HinhAnh
FROM ChiTietMatHang;

SELECT MaMH, GROUP_CONCAT(CONCAT(MaKC, '-', SoLuong) SEPARATOR ',' ) ChiTietMatHang, SUM(SoLuong) AS SoLuong
FROM ChiTietMatHang
GROUP BY MaMH
HAVING SoLuong > 100;

-- Liệt kê những mặt hàng thuộc đơn hàng = 2
SELECT * FROM MatHang WHERE MaLH = 2
UNION
-- Liệt kê những mặt hàng thuộc đơn hàng = 1 
SELECT * FROM ChiTietDonHang WHERE MaDH = 1;


-- Liệt kê những mặt hàng thuộc đơn hàng = 2
SELECT MaMH FROM MatHang WHERE MaLH = 2
UNION ALL
-- Liệt kê những mặt hàng thuộc đơn hàng = 1 
SELECT MaMH FROM ChiTietDonHang WHERE MaDH = 1;

SELECT MaMH FROM MatHang;
SELECT MaMH FROM ChiTietDonHang;

--  SQL JOIN --> JOIN(INNER JOIN), LEFT JOIN, RIGHT JOIN, OUTER JOIN
-- Liệt kê tất cả các mặt hàng mũ trong hệ thống
SELECT * 
FROM MatHang
WHERE MaLH = (SELECT MALH FROM LoaiHang WHERE TenLH LIKE '%Áo');

SELECT * FROM MatHang; -- MH(1,12) LH(1,5,99)
SELECT * FROM LoaiHang; -- 		   LH(1,5,6,7)


INSERT INTO LoaiHang(MaLH, TenLH)
VALUES(6, 'Ví'), (7, 'Nón');
SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(13, 'Máy Quạt', 'Trắng', 99);
SET FOREIGN_KEY_CHECKS = 1;


SELECT mh.*, lh.*
FROM MatHang mh
JOIN LoaiHang lh 
	ON mh.MaLH = lh.MaLH;
-- WHERE lh.TenLH LIKE '%Mũ%';
	
-- OUTER JOIN : MySQL doesn't support
-- Custom OUTER JOIN
SELECT mh.*, lh.*
FROM MatHang mh
LEFT JOIN LoaiHang lh 
	ON mh.MaLH = lh.MaLH
UNION
SELECT mh.*, lh.*
FROM MatHang mh
RIGHT JOIN LoaiHang lh 
	ON mh.MaLH = lh.MaLH;
    
-- Liệt kê danh sách mặt hàng theo mã loại hàng    
SELECT lh.*,
		GROUP_CONCAT(mh.TenMH SEPARATOR ', ') DanhSachMatHang
FROM MatHang mh
LEFT JOIN LoaiHang lh on mh.MaLH = lh.MaLH
WHERE lh.MaLH IS NOT NULL
GROUP BY lh.MaLH;

CREATE TABLE Backup(
	ITEM_GROUP_ID INT PRIMARY KEY AUTO_INCREMENT,
    ITEM_GROUP_NAME VARCHAR(50) NOT NULL
);

-- COPY VALUES FROM LoaiHang TO Backup Table
SELECT *  FROM Backup;
INSERT INTO Backup(ITEM_GROUP_ID, ITEM_GROUP_NAME)
SELECT MaLH, TenLH
FROM LoaiHang;

SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
-- VALUES(14, 'Công Tắc Điện', 'Trắng', 99);
SELECT 14, 'Công Tắc Điện', MauSac, MaLH FROM MatHang WHERE MaMH = 13;
SET FOREIGN_KEY_CHECKS = 1;


SELECT * FROM MatHang;


-- Truy vấn con, lồng phân cấp (xử lý con rồi đến cha)
SELECT * 
FROM MatHang
WHERE MaLH = (SELECT MALH FROM LoaiHang WHERE TenLH LIKE '%Áo');
-- Lồng tương quan (xử lý song song)
SELECT * 
FROM MatHang mh
WHERE EXISTS (SELECT MALH FROM LoaiHang lh 
				WHERE lh.TenLH LIKE '%Áo'
                AND lh.MaLH = mh.MaLH
			);