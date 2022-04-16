/*
	1. CREATE/DROP DATABASE
    2. CREATE/DROP TABLE
    3. ALTER TABLE
		+ ADD/DROP COLUMN
        + ADD/DROP CONSTRAINT
*/
USE java13_shopping_manually;
-- 1. Tạo cơ sở dữ liệu java13_shopping_manually
CREATE SCHEMA java13_shopping_manually CHAR SET utf8;
-- 2. Tạo Table MaHang, LoaiHang
-- 3. Tạo ràng buộc, khoá chính, khoá ngoại
CREATE TABLE LoaiHang 
(
	MaLH int primary key,
    TenLH varchar(50)
);
CREATE TABLE MatHang
(
	MaMH int primary key,
    TenMH varchar(50),
    MauSac varchar(50),
    MaLH int,
    constraint fk_MatHang_LoaiHang foreign key (MaLH) references LoaiHang(MaLH)
);
-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
ALTER TABLE LoaiHang
ADD NgayTao DATE NOT NULL;
-- 5. Thay đổi tên column NgayTao thành DATE_CREATED trong bảng LoaiHang
ALTER TABLE LoaiHang
CHANGE NgayTao NgayTaoLoaiHang DATE NOT NULL;
-- 6. Tạo table DonHang, MatHang
CREATE TABLE DonHang
(
	MaDH int primary key,
    MaKH int not null, 
    DiaChiGiaoHang text not null,
    SDTNguoiNhan varchar(50) not null,
    MaLHTT int not null,
    ThoiGianDatHang datetime,
    PhiVanChuyen double,
    TongTien double,
    MaNV int not null
);
CREATE TABLE LoaiHinhThanhToan
(
	MaLHTT int,
    Mota text not null,
    CONSTRAINT PK_LHTT PRIMARY KEY (MaLHTT)
    
);

ALTER TABLE DonHang
ADD CONSTRAINT FK_DonHang_LHTT FOREIGN KEY (MaLHTT) REFERENCES LoaiHinhThanhToan(MaLHTT);

-- 7. Tạo table ChiTietDonHang
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
CREATE TABLE ChiTietDonHang
(
	MaDH int,
    MaMH int,
    SoLuong int not null,
    CONSTRAINT PK_ChiTietDonHang PRIMARY KEY(MaDH, MaMH),
    CONSTRAINT FK_ChiTietDonHang_DonHang FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH),
    CONSTRAINT FK_ChiTietDonHang_MatHang FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH)
);

-- 9. Xoá column NgayTaoLoaiHang trong table LoaiHang
ALTER TABLE LoaiHang
DROP COLUMN NgayTaoLoaiHang;