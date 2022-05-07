SELECT * FROM MatHang;

-- INDEX
-- PRIMARY KEY --> QUERY
-- FOREIGN KEY --> JOIN

-- CUSTOM: COLUMN THAT used to query(where) many, many time and facing and performance issue
-- INDEX

-- O(1)
SELECT * FROM MatHang WHERE MaMH = 10;

-- O(n)
SELECT * FROM MatHang WHERE TenMH = 'Mũ thể thao Nam';

EXPLAIN SELECT * FROM MatHang WHERE MauSac = 'Trắng';

-- VIRTUAL CASE --> PI
CREATE INDEX IDX_MauSac ON MatHang(MauSac);
ALTER TABLE MatHang DROP INDEX IDX_MauSac;

SELECT * FROM MatHang WHERE MauSac = 'Đen';

-- Viết phương thức liệt kê các mặt hàng
DELIMITER &&
CREATE PROCEDURE selectItems()
BEGIN
	SELECT * FROM MatHang;
END &&
DELIMITER ;
CALL selectItems();

-- Viết phương thức liệt kê các mặt hàng theo mã loại hàng
DELIMITER &&
CREATE PROCEDURE selectItemsByIgId(p_igid INT)
BEGIN
	SELECT * FROM MatHang WHERE MaLH = p_igid;
END &&
DELIMITER ;

CALL selectItemsByIgId(2);

-- Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
DELIMITER &&
CREATE PROCEDURE additemGroups(n INT)
BEGIN
	
    DECLARE i INT DEFAULT 1;
    DECLARE current_igid INT DEFAULT (SELECT MAX(MaLH) FROM LoaiHang); -- 7
    
    WHILE i <= n DO
		INSERT INTO LoaiHang(MaLH, TenLH)
        VALUES(current_igid + i, concat('LH', current_igid + i));
		SET i = i + 1;
    END WHILE;
END &&
DELIMITER ;
SELECT * FROM LoaiHang;
CALL additemGroups(3);

-- Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N

