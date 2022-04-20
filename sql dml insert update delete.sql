
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
-- ======================= REFRESH DATA =======================

-- B. DELETE
-- 1. Xóa nhân viên có tên 'Lê Na' trong hệ thống
-- 2. Xóa bộ phận giao hàng trong hệ thống
-- 3. Xóa tất cả các mặt hàng thuộc loại hàng là mũ
-- 4. Xóa tất cả các mặt hàng trong hệ thống
-- 5. Vì hệ thống bị lỗi. Hủy tất cả các đơn hàng ngày 23/11/2019
--    Thực hiện xóa các đơn hàng bị lỗi

-- ======================= REFRESH DATA =======================
-- C. UPDATE
-- 1. Cập nhật tên mới cho phòng ban có MaPB = 2 thành 'Bộ phận quản lý'
-- 2. Cập nhật ghi chú của đơn hàng 01 thành 'Giao hàng sau 10H sáng'
-- 3. Đơn hàng 01 đã được giao hàng thành công. Thực hiện cập nhật
--    MaTT = 03, TrangThai = 'Đã giao', ThoiGian = Thời gian hiện tại
-- 4. Cập nhật số tiền cần thanh toán trong bảng hóa đơn thành 890 cho đơn hàng 01
-- 5. Cập nhật tất cả các mặt hàng thuộc loại hàng là 'Mũ' với giá bán là 199K
