
-- syntax insert, delete, update
INSERT INTO table_name(column1, column2, column3)
VALUES(value1, value2, value3),
      (value11, value22, value33);
      
DELETE FROM table_name
WHERE predicate;

UPDATE table_name
SET column2 = value2
WHERE predicate;

-- demo --
-- A. INSERT
-- Sử dụng bảng dữ liệu mẫu. Thực hiện thêm dữ liệu vào cơ sở dữ liệu cho table
SET FOREIGN_KEY_CHECKS = 0;
-- + Mathang
SELECT * FROM MatHang;
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH)
VALUES(3, 'Dép sandan', 'Đen', 6);

-- + LoaiHang
SELECT * FROM LoaiHang;
INSERT INTO LoaiHang(MaLH, TenLH)
VALUES(6, 'dép');
SET FOREIGN_KEY_CHECKS = 1;
-- + Sử dụng refresh data.sql để refresh data

-- Edit --> Preferences --> SQL Editor --> Safe Updates
-- Edit --> Preferences --> SQL Editor --> Query Editor --> UPPER CASE
-- sql refresh data.sql
-- ======================= REFRESH DATA =======================
-- B. DELETE
-- 1. Xóa nhân viên có tên 'Lê Na' trong hệ thống
SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;
INSERT INTO NhanVien(MaNV, TenNV, Email, SDT, DiaChi, MatKhau, MaCV)
VALUES(6, 'Lê Văn Mới', 'com6.default.tp@gmail.com', '0936 978 033', 'Hòa Khánh - Đà Nẵng', '099ebea48ea9666a7da2177267983138', 3);
SELECT * FROM NhanVien;
SELECT * FROM chitiettinhtrangdonhang;
DELETE FROM NhanVien WHERE TenNV = 'Lê Văn Mới';
DELETE FROM NhanVien WHERE TenNV = 'Lê Na'; -- = -> equals
-- BEST PRACTICE
-- 1. FK Option: Restrict>Cascade
-- ALTER TABLE TB_NAME DROP FOREIGN KEY FK_NAME
-- ALTER TABLE TB_NAME ADD CONSTRAINTS_NAME FOREIGN KEY ... ON DELETE CASCADE || RESTRICT;
-- 2. Disable FK checks
ALTER TABLE MatHang DROP FOREIGN KEY fk_MatHang_LoaiHang1;
ALTER TABLE MatHang 
ADD CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY (MaLH) REFERENCES LoaiHang(MaLH)
ON DELETE CASCADE;

SELECT * FROM LoaiHang;
SELECT * FROM MatHang;
INSERT INTO LoaiHang(MaLH, TenLH) VALUES(6, 'Trang sức');
INSERT INTO MatHang(MaMH, TenMH, MauSac, MaLH) VALUES(13, 'Vàng', 'Vàng', 6);
DELETE FROM LoaiHang WHERE MaLH = 6;
-- 1. SET AUTO COMMIT = FALSE
-- 2. EXECUTE STATEMENTS
-- 3. COMMIT || ROLLBACK
COMMIT;
ROLLBACK;

-- 2. Xóa bộ phận giao hàng trong hệ thống
SELECT * FROM ChucVu;
DELETE FROM ChucVu
WHERE TenCV LIKE '%giao hàng%'; -- LIKE 'expressions' --> equals, startsWith, endsWith, contains

-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
SELECT * FROM MatHang;
SELECT * FROM LoaiHang;

-- SUB QUERY
SET FOREIGN_KEY_CHECKS = 1;
DELETE FROM MatHang
WHERE MaLH = (SELECT MaLH FROM LoaiHang
			  WHERE TenLH = 'Mũ');

-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM MatHang;

-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 18.12.2020
--    Thực hiện xóa các đơn hàng bị lỗi
-- 'XÓA' --> Completely delete, IS_DELETED(1|0)
-- 'yyyy-mm-dd' --> DATE
-- '###'        --> VARCHAR, INCORRECT
SELECT * FROM DonHang; -- X18.12.20 || 17.12.20 || 05.01.2021
SELECT MaDH, 
       DiaChiGiaoHang, 
       ThoiGianDatHang, 
       CAST(ThoiGianDatHang AS DATE) NgayDatHang,
       CAST(ThoiGianDatHang AS TIME) ThoiGianDatHang
FROM DonHang; 

-- 'yyyy-mm-dd' --> DEFAULT CONVERT TO DATE
-- CONVERT MANUALLY 
-- 'dd/mm/yyyy' --> 
-- 'dd.mm.yyyy' -->

SELECT * FROM DonHang;
-- WHERE CAST(ThoiGianDatHang AS DATE) = '2020-12-18';
SET FOREIGN_KEY_CHECKS = 1;
DELETE FROM DonHang
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE('18-12-2020', '%d-%m-%Y');

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 1 thành 'Bộ phận quản lý'
SELECT * FROM ChucVu;
UPDATE ChucVu
SET TenCV = 'Bộ phận quản lý'
WHERE MaCV = 1;
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
SELECT * FROM DonHang;
ALTER TABLE DonHang ADD GhiChu VARCHAR(60);
UPDATE DonHang
SET GhiChu = 'Giao hàng sau 10H sáng'
WHERE MaDH = 1;
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện 'cập nhật'
-- A. MaTT
-- B. ThoiGian
DELETE FROM chitiettinhtrangdonhang 
WHERE MaDH = 1 
	AND MaTT = 5
    AND MaNV = 2;
SELECT * FROM TinhTrangDonHang;
SELECT * FROM chitiettinhtrangdonhang;
SELECT curdate(), 
       current_date(), 
       curtime(),
       current_time(), 
       current_timestamp(), 
       current_user();
INSERT INTO chitiettinhtrangdonhang(MaDH, MaTT, MaNV, ThoiGian)
VALUES(1, 5, 2, current_date());

-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
SELECT * FROM HoaDon;
-- Opt1: JAVA passed value(890) to database --> SAVED
INSERT INTO HoaDon(MaHD, MaDH, NgayXuatHoaDon, SoTienCanThanhToan) VALUES(1, 1, current_date(), 890);
DELETE FROM HoaDon WHERE MaHD = 1;

-- Opt2: Do billing in database
-- TODO

-- 5. Cập nhật các mặt hàng thuộc loại hàng là 'Áo' thành giá bán là 199K
-- Common Table Expression - CTE

WITH MatHangAo AS (
    -- MaMH, TenMH, MauSac, MALH
	SELECT *
	FROM MatHang
	WHERE MaLH = (SELECT MaLH FROM LoaiHang WHERE TenLH = 'Áo')
)
-- SELECT * FROM chitietmathang
UPDATE ChiTietMatHang
SET GiaBan = 199
WHERE MaMH IN (SELECT MaMH FROM MatHangAo); -- (1,2,11,12)
