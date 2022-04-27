/* DEMO
   1. CREATE/DROP DATABASE
   2. CREATE/DROP TABLE
   3. ALTER TABLE
      + ADD/DROP COLUMN
      + ADD/DROP CONSTRAINT
*/

-- 1. Tạo cơ sở dữ liệu java13_shopping_manually
CREATE SCHEMA java13_shopping_manually CHAR SET utf8;

USE java13_shopping_manually;
-- 2. Tạo table MatHang, LoaiHang
-- 3. Tạo ràng buộc PK, FK cho 2 tables trên
CREATE TABLE LoaiHang
(
	MaLH INT PRIMARY KEY,
    TenLH VARCHAR(50)
);

CREATE TABLE MatHang
(
	MaMH INT PRIMARY KEY,
    TenMH VARCHAR(50),
    MauSac VARCHAR(50),
    MaLH INT,
    CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY (MaLH) REFERENCES LoaiHang(MaLH) 
);

-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
ALTER TABLE LoaiHang
ADD NgayTao DATE NOT NULL;

-- 5. Thay đổi tên tên column NgayTao thành NgayTaoLoaiHang trong bảng LoaiHang
ALTER TABLE LoaiHang
CHANGE NgayTao NgayTaoLoaiHang DATE NOT NULL;

-- 6. Tạo table DonHang, MatHang
CREATE TABLE DonHang
(
	MaDH INT PRIMARY KEY,
	MaKH INT NOT NULL,
	DiaChiGiaoHang TEXT NOT NULL,
	SDTNguoiNhan VARCHAR(50) NOT NULL,
	MaLHTT INT NOT NULL,
	ThoiGianDatHang DATETIME,
	PhiVanChuyen DOUBLE,
	TongTien DOUBLE,
	MaNV INT NOT NULL
);

CREATE TABLE LoaiHinhThanhToan(
	MaLHTT INT,
    MoTa TEXT NOT NULL,
    CONSTRAINT PK_LHTT PRIMARY KEY (MaLHTT)
);

ALTER TABLE DonHang
ADD CONSTRAINT FK_DonHang_LHTT FOREIGN KEY (MaLHTT) REFERENCES LoaiHinhThanhToan(MaLHTT)
-- ON DELETE CASCADE ;

-- 7. Tạo table ChiTietDonHang
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
CREATE TABLE ChiTietDonHang
(
	MaDH INT,
    MaMH INT,
    SoLuong INT NOT NULL,
    CONSTRAINT PK_ChiTietDonHang PRIMARY KEY (MaDH, MaMH),
    CONSTRAINT FK_ChiTietDonHang_DonHang FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH),
    CONSTRAINT FK_ChiTietDonHang_MatHang FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH)
);

-- 9. Xóa column NgayTaoLoaiHang trong table LoaiHang
ALTER TABLE LoaiHang
DROP COLUMN NgayTaoLoaiHang;

-- 10. TODO - Truncate table

