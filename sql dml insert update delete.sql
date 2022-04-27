-- syntax insert, delete, update
INSERT INTO table_name(column1, column2, column3)
VALUES(value1, value2, value3),
      (value11, value22, value33);
      
DELETE FROM table_name
WHERE predicate;

UPDATE table_name
SET column2 = value2chitietdonhang
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
-- ======================= REFRESH DATA =======================

-- B. DELETE
-- 1. Xóa nhân viên có tên 'Lê Na' trong hệ thống
INSERT INTO NhanVien(MaNV, TenNV, Email, SDT, DiaChi, MatKhau, MaCV)
VALUES(6, 'Le Van Moi', 'com6.default.tp@gmail.com', '070 396 2314', 'Hoà Khánh-Đà Nẵng', 'c4ded2b85cc5be82fa1d2464eba9a7d3', 1);
USE java13_shopping;
DELETE FROM NhanVien WHERE TenNV = 'Le Van Moi';
SET FOREIGN_KEY_CHECKS = 0;
DELETE FROM NhanVien WHERE TenNV = 'Lê Na';
SET FOREIGN_KEY_CHECKS = 1;


-- 2. Xóa bộ phận giao hàng trong hệ thống
SELECT * FROM ChucVu;
DELETE FROM ChucVu
WHERE TenCV LIKE '%giao hàng%';


-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
SELECT * FROM MatHang;
SELECT * FROM LoaiHang;
-- SUB QUERY
DELETE FROM MatHang 
WHERE MaLH = (SELECT MaLH FROM LoaiHang WHERE TenLH = 'Mũ');



-- 4. Xóa tất cả các mặt hàng trong hệ thống
DELETE FROM MatHang;

-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 18/12/2020
-- SELECT * FROM DonHang
-- WHERE CAST(ThoiGianDatHang AS DATE) = '2020-12-18';

DELETE FROM DonHang
WHERE CAST(ThoiGianDatHang AS DATE) = STR_TO_DATE('18/12/2020', '%d/%m/%Y');


--    Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 1 thành 'Bộ phận quản lý'
SELECT * FROM ChucVu;
UPDATE ChucVu 
SET TenCV = 'Bộ phận quản lí'
WHERE MaCV = 1;
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
SELECT * FROM DonHang;
ALTER TABLE DonHang ADD GhiChu VARCHAR(50);

UPDATE DonHang
SET GhiChu = 'Giao hàng sau 10H sáng'
WHERE MaDH = 1;

-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
SELECT * FROM ChiTietTinhTrangDonHang;
DELETE FROM ChiTietTinhTrangDonHang 
WHERE MaDH = 1 AND MaTT = 5 AND MANV = 2;

SELECT curdate(), current_date(), curtime(), current_time(), current_timestamp(), current_user();
INSERT INTO ChiTietTinhTrangDonHang(MaDH, MaTT, MaNV, ThoiGian) 
VALUES('1', '5', '2', now());

-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
SELECT * FROM HoaDon;

-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K

-- Common Table Expression - CTE
WITH MatHangAo AS (
		SELECT MaMH FROM MatHang
		WHERE MALH = (SELECT MALH From LoaiHang WHERE TenLH = 'Áo')
)

UPDATE ChiTietMatHang
SET GiaBan = 199
WHERE MaMH IN (SELECT * FROM MatHangAo);

SELECT * FROM ChiTietMatHang;



