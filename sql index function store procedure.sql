SELECT * FROM `mathang`;
-- O(1)
-- EXPLAIN
SELECT * FROM `mathang` WHERE MaMH = 12;

-- O(n)
-- EXPLAIN
SELECT * FROM `mathang` WHERE TenMH = 'Quần jean Nam';

EXPLAIN
SELECT * FROM `mathang` WHERE MauSac = 'Trắng';

-- VIRTUAL CASE --> PI
CREATE INDEX IDX_MauSac ON MatHang(MauSac);
ALTER TABLE MatHang DROP INDEX IDX_MauSac;


-- Viết phương thức liệt kê các mặt hàng
DELIMITER $$
CREATE PROCEDURE selectItems()
BEGIN 
	SELECT * FROM MatHang;
END;
$$ DELIMITER 

CALL selectItems();

-- Viết phương thức liệt kê các mặt hàng theo loại hàng
DELIMITER $$
CREATE PROCEDURE selectItemsByIgId(p_igid INT)
BEGIN 
	SELECT * FROM MatHang
	WHERE MaLH = p_igid;
END;
$$ DELIMITER 

CALL selectItemsByIgId(1);


-- Viết phương thức thêm N dòng dữ liệu cho bảng loại hàng
DELIMITER $$
CREATE PROCEDURE addItemGroup(n INT)
BEGIN	
    DECLARE i INT DEFAULT 1;
    DECLARE current_igid INT DEFAULT(SELECT MAX(MALH) FROM LoaiHang); 
    WHILE i <= n DO
		INSERT INTO LoaiHang(MaLH, TenLH)
		VALUES(current_igid+i, concat('LH', current_igid+i));
		SET i = i + 1;
	END WHILE;
END $$ DELIMITER ;

SELECT * FROM LoaiHang;
CALL addItemGroup(5);

-- Viết phương thức liệt kê các phần tử chẵn nhỏ hơn N
DELIMITER $$
CREATE PROCEDURE EvenLessThanN(n INT)
BEGIN
	DECLARE i INT DEFAULT 0;
    DECLARE arr VARCHAR(100) DEFAULT '';
    WHILE i < n DO
		IF i % 2 = 0
			THEN SET arr = concat(arr, i);
        END IF;
		SET i = i + 1;
    END WHILE;
    SELECT arr;
END
$$ DELIMITER ;

CALL EvenLessThanN(10);

-- FUNCTION
-- Viết phương thức trả về tập các phần tử chẵn nhỏ hơn N
DELIMITER $$
CREATE FUNCTION EvenLessThanN(n INT)
RETURNS VARCHAR(100) DETERMINISTIC
BEGIN 
	DECLARE i INT DEFAULT 0;
	DECLARE rs VARCHAR(100) DEFAULT '';
    WHILE i < n DO
		IF i % 2 = 0
			THEN SET rs = concat(rs, i);
        END IF;
		SET i = i + 1;
	END WHILE;
    
    RETURN rs;
END $$ DELIMITER ;
SELECT EvenLessThanN(10);

-- Viết phương thức trả về tập các phần tử chẵn nhỏ hơn N
SET GLOBAL log_bin_trust_function_creators = 1;
DELIMITER $$
CREATE FUNCTION sumOfNValues(n int)
RETURNS int
BEGIN
	DECLARE i int DEFAULT 1;
    DECLARE sumOf int DEFAULT 0;
    WHILE i <= n DO
		SET sumOf = sumOf + i;
        SET i = i + 1;
    END WHILE;
    
    RETURN sumOf;
END $$ DELIMITER ;

SELECT sumOfNValues(10);