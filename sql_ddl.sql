Use java13_shopping_manually;
create table khachhang 
(
MAKH int primary key,
TenKH varchar(50),
DiaChi varchar(50),
SDT varchar(50),
email varchar(50) 
);
create table donhang 
(
MADH int primary key,
MaKH int,
DiaChiGiaoHang varchar(50),
SDT varchar(50),
MaLHTT varchar(50),
ThoiGianDatHang varchar(50),
PhiVanChuyen varchar(50),
TongTien varchar(50),
MaNV int,
constraint FK_DonHang_KhachHang Foreign key (MaKH) references khachhang(MAKH)
);
create table tinhtrangdonhang
(
MaTTDH int primary key,
MoTa varchar(50)
);
create table loaihinhthanhtoan
(
MaLHTT int primary key,
MoTa varchar(50)
);
create table chucvu
(
MaCV int primary key,
TenCV varchar(50)
);
create table cuahang
(
MaCH int primary key,
TenCH varchar(50),
DiaChi varchar(50),
SDT varchar(11)
);
 create table nhanvien
 (
 MaNV int primary key,
 TenNV varchar(50),
 SDT varchar(11),
 email varchar(50),
 matkhau varchar(225),
 MaCV int,
 constraint FK_nhanvien_chucvu foreign key (MaCV) references chucvu(MaCV)
 );
create table hoadon 
(
MaHD int primary key,
MaCH int,
MaDH int,
MaNV int,
NgayXuatHD date,
SoTienCanThanhToan double,
constraint FK_hoadon_cuahang foreign key (MaCH) references cuahang(MaCH),
constraint FK_hoadon_donhang foreign key (MaDH) references donhang(MADH),
constraint FK_hoadon_nhanvien foreign key (MaNV) references nhanvien(maNV)
);
create table chitietdonhang
(
MaDH int,
MaMH int,
Soluong int,
primary key (MaDH, MaMH),
constraint FK_chitietdonhang_donhang foreign key (maDH) references donhang(MADH),
constraint FK_chitietdonhang_mathang foreign key (MaMH) references mathang(MaMH)
);
create table chitiettinhtrangdonhang
(
MaDH int,
MaTTDH int,
MaNV int,
ThoiGian date,
primary key (MaDH, MaTTDH),
constraint FK_chitiettinhtrangdonhang_donhang foreign key (MaDH) references donhang(MADH),
constraint FK_chitiettinhtrangdonhang_mathang foreign key (MaTTDH) references tinhtrangdonhang(MaTTDH),
constraint FK_chitiettinhtrangdonhang_nhanvien foreign key (MaNV) references nhanvien(MaNV)
);
alter table donhang change MaLHTT MaLHTT int;
alter table donhang 
add constraint FK_donhang_loaihinhthanhtoan foreign key (MaLHTT) references loaihinhthanhtoan(MaLHTT);
alter table loaihang
drop column NgayTaoLoaiHang;