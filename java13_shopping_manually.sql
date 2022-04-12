-- 1. Tạo cơ sở dữ liệu java13_shopping_manually
CREATE DATABASE java13_shopping_manually CHAR SET utf8;

-- 2. Tạo table MatHang, LoaiHang
-- 3. Tạo ràng buộc PK, FK cho 2 tables trên
USE java13_shopping_manually;

-- LOAIHANG
CREATE TABLE LoaiHang(
	MaLH INT PRIMARY KEY,
	TenLH VARCHAR(50)
);

-- MATHANG
CREATE TABLE MatHang(
	MaMH INT PRIMARY KEY,	
	TenMH VARCHAR(50),
    MauSac VARCHAR(50),
    MaLH INT,
    CONSTRAINT FK_MatHang_LoaiHang FOREIGN KEY (MaLH) REFERENCES LoaiHang(MaLH)	
);
-- KICHCO
CREATE TABLE KichCo(
	MaKC INT PRIMARY KEY,
    MoTa VARCHAR(50)
);

-- CHITIETMATHANG
CREATE TABLE ChiTietMatHang(
	MaMH INT NOT NULL,
    MAKC INT NOT NULL,
    HinhAnh VARCHAR(100),
    GiaBan DOUBLE NOT NULL,
    GiaMua DOUBLE NOT NULL,
    SoLuong INT NOT NULL,
    PRIMARY KEY(MaMH, MaKC),
    CONSTRAINT FK_ChiTietMatHang_MatHang FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH),
    CONSTRAINT FK_ChiTietMatHang_KichCo FOREIGN KEY (MaKC) REFERENCES KichCo(MaKC)
);

-- 4. Thêm column NgayTao kiểu DATE vào table LoaiHang
ALTER TABLE LoaiHang 
ADD NgayTao DATE NOT NULL;

-- 5. Thay đổi tên tên column NgayTao thành NgayTaoLoaiHang trong bảng LoaiHang
ALTER TABLE LoaiHang
CHANGE NgayTao NgayTaoLoaiHang DATE NOT NULL;

-- 6. Tạo table LoaiHinhThanhToan, KhachHang, NhanVien, DonHang
CREATE TABLE DonHang(
	MaDH INT PRIMARY KEY,
    DiaChiGiaoHang VARCHAR(100),
    SDTNguoiNhan VARCHAR(11),
    ThoiGianDatHang DATETIME NOT NULL,
    PhiVanChuyen DOUBLE,
    TongTien DOUBLE,
    MaLHTT INT,
    MaKH INT,
    MaNV INT,
	CONSTRAINT FK_DonHang_LoaiHinh FOREIGN KEY (MaLHTT) REFERENCES LoaiHinhThanhToan(MaLHTT),
    CONSTRAINT FK_DonHang_KhachHang FOREIGN KEY (MaKH) REFERENCES KhachHang(MaKH),
	CONSTRAINT FK_DonHang_NhanVien FOREIGN KEY (MaNV) REFERENCES NhanVien(MaNV)
);

-- 7. Tạo table ChiTietDonHang
-- 8. Tạo ràng buộc PK, FK trong bảng ChiTietDonHang
CREATE TABLE ChiTietDonHang(
	MaDH INT NOT NULL,
    MaMH INT NOT NULL,
    SoLuong INT NOT NULL,
    PRIMARY KEY(MaDH, MaMH),
    CONSTRAINT FK_ChiTietDonHang_DonHang FOREIGN KEY (MaDH) REFERENCES DonHang(MaDH),
    CONSTRAINT FK_ChiTietDonHang_MatHang FOREIGN KEY (MaMH) REFERENCES MatHang(MaMH)
);

-- KHACHHANG
CREATE TABLE KhachHang(
	MaKH INT PRIMARY KEY,
    TenKH NVARCHAR(50) NOT NULL,
    DiaChi NVARCHAR(50),
    SoDienThoai VARCHAR(11),
    Email VARCHAR(50)    
);
 
-- LoaiHinhThanhToan
CREATE TABLE LoaiHinhThanhToan(
	MaLHTT INT PRIMARY KEY,
    MoTa VARCHAR(100)
);

-- TinhTrangDonHang
CREATE TABLE TinhTrangDonHang(
	MaTTDH INT PRIMARY KEY,
    MoTa VARCHAR(100)
);

-- ChiTietTrinhTrangDonHang
CREATE TABLE ChiTietTinhTrangDonHang(
	MaDH INT,
    MaTTDH INT,
    MaNV INT NOT NULL,
    ThoiGian TIME,
    PRIMARY KEY (MaDH, MaTTDH),
    CONSTRAINT FK_ChiTietTinhTrangDonHang_DonHang FOREIGN KEY(MaDH) REFERENCES DonHang(MaDH),
    CONSTRAINT FK_ChiTietTinhTrangDonHang_TinhTrangDonHang FOREIGN KEY(MaTTDH) REFERENCES TinhTrangDonHang(MaTTDH),
    CONSTRAINT FK_ChiTietTinhTrangDonHang_NhanVien FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV)
);

-- CuaHang
CREATE TABLE CuaHang(
	MaCH INT PRIMARY KEY,
    TenCH NVARCHAR(100),
    DiaChi NVARCHAR(100),
    SoDienThoai VARCHAR(11)
);

-- HoaDon
CREATE TABLE HoaDon(
	MaHD INT PRIMARY KEY,
    MaCH INT NOT NULL,
    MaDH INT NOT NULL,
    MaNV INT NOT NULL,
    ThoiGianXuatHoaDon DATETIME,
    CONSTRAINT FK_HoaDon_CuaHang FOREIGN KEY(MaCH) REFERENCES CuaHang(MaCH),
    CONSTRAINT FK_HoaDon_DonHang FOREIGN KEY(MaDH) REFERENCES DonHang(MaDH),
    CONSTRAINT FK_HoaDon_NhanVien FOREIGN KEY(MaNV) REFERENCES NhanVien(MaNV)
);

-- NhanVien
CREATE TABLE NhanVien(
	MaNV INT PRIMARY KEY,
    TenNV NVARCHAR(50),
    SoDienThoai VARCHAR(11),
    Email VARCHAR(50),
    MatKhau VARCHAR(50),
    MaCV INT NOT NULL,
    CONSTRAINT FK_NhanVien_ChucVu FOREIGN KEY(MaCV) REFERENCES ChucVu(MaCV)
);

CREATE TABLE ChucVu(
	MaCV INT PRIMARY KEY,
    TenCV NVARCHAR(50)
);
-- 9. Xóa column DATE_CREATED trong table LoaiHang
ALTER TABLE LoaiHang
DROP NgayTaoLoaiHang;

-- 10. Truncate table
-- INSERT INTO chucvu(MaCV, TenCV) values('1', 'abc');
-- INSERT INTO chucvu(MaCV, TenCV) values('2', 'bdc');
-- TRUNCATE chucvu;
INSERT INTO chucvu(MaCV, TenCV) values('1', 'abc');

