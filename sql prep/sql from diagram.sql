-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
-- -----------------------------------------------------
-- Schema java13_shopping
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java13_shopping` ;

-- -----------------------------------------------------
-- Schema java13_shopping
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java13_shopping` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`KichCo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`KichCo` ;

CREATE TABLE IF NOT EXISTS `mydb`.`KichCo` (
  `MaKC` VARCHAR(10) NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaKC`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LoaiHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LoaiHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LoaiHang` (
  `MaLH` INT NOT NULL,
  `TenLH` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`MatHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`MatHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`MatHang` (
  `MaMH` INT NOT NULL,
  `TenMH` VARCHAR(255) NOT NULL,
  `MauSac` VARCHAR(255) NOT NULL,
  `MaLH` INT NOT NULL,
  PRIMARY KEY (`MaMH`),
  INDEX `fk_MatHang_LoaiHang1_idx` (`MaLH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_LoaiHang1`
    FOREIGN KEY (`MaLH`)
    REFERENCES `mydb`.`LoaiHang` (`MaLH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ChiTietMatHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ChiTietMatHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ChiTietMatHang` (
  `MaMH` INT NOT NULL,
  `MaKC` VARCHAR(10) NOT NULL,
  `HinhAnh` VARCHAR(255) NOT NULL,
  `GiaBan` DOUBLE NOT NULL,
  `GiaMua` DOUBLE NOT NULL,
  `SoLuong` INT NOT NULL,
  PRIMARY KEY (`MaMH`, `MaKC`),
  INDEX `fk_MatHang_has_KichCo_KichCo1_idx` (`MaKC` ASC) VISIBLE,
  INDEX `fk_MatHang_has_KichCo_MatHang_idx` (`MaMH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_has_KichCo_MatHang`
    FOREIGN KEY (`MaMH`)
    REFERENCES `mydb`.`MatHang` (`MaMH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MatHang_has_KichCo_KichCo1`
    FOREIGN KEY (`MaKC`)
    REFERENCES `mydb`.`KichCo` (`MaKC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`TinhTrangDonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`TinhTrangDonHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`TinhTrangDonHang` (
  `MaTT` INT NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaTT`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ChucVu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ChucVu` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ChucVu` (
  `MaCV` INT NOT NULL,
  `TenCV` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaCV`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`NhanVien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`NhanVien` ;

CREATE TABLE IF NOT EXISTS `mydb`.`NhanVien` (
  `MaNV` INT NOT NULL,
  `TenNV` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `SDT` VARCHAR(255) NOT NULL,
  `DiaChi` TEXT NOT NULL,
  `MatKhau` VARCHAR(255) NOT NULL,
  `MaCV` INT NOT NULL,
  PRIMARY KEY (`MaNV`),
  INDEX `fk_NhanVien_ChucVu1_idx` (`MaCV` ASC) VISIBLE,
  CONSTRAINT `fk_NhanVien_ChucVu1`
    FOREIGN KEY (`MaCV`)
    REFERENCES `mydb`.`ChucVu` (`MaCV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`KhachHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`KhachHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`KhachHang` (
  `MaKH` INT NOT NULL,
  `TenKH` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `DiaChi` TEXT NOT NULL,
  `SDT` VARCHAR(255) NOT NULL,
  `MXH` VARCHAR(255) NULL,
  PRIMARY KEY (`MaKH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`LoaiHinhThanhToan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`LoaiHinhThanhToan` ;

CREATE TABLE IF NOT EXISTS `mydb`.`LoaiHinhThanhToan` (
  `MaLHTT` INT NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLHTT`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`DonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`DonHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`DonHang` (
  `MaDH` INT NOT NULL,
  `DiaChiGiaoHang` TEXT NOT NULL,
  `SDTNguoiNhan` VARCHAR(255) NOT NULL,
  `ThoiGianDatHang` DATETIME NOT NULL,
  `PhiVanChuyen` DOUBLE NOT NULL,
  `TongTien` DOUBLE NOT NULL,
  `MaNV` INT NOT NULL,
  `MaKH` INT NOT NULL,
  `MaLHTT` INT NOT NULL,
  PRIMARY KEY (`MaDH`),
  INDEX `fk_DonHang_NhanVien1_idx` (`MaNV` ASC) VISIBLE,
  INDEX `fk_DonHang_KhachHang1_idx` (`MaKH` ASC) VISIBLE,
  INDEX `fk_DonHang_LoaiHinhThanhToan1_idx` (`MaLHTT` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_NhanVien1`
    FOREIGN KEY (`MaNV`)
    REFERENCES `mydb`.`NhanVien` (`MaNV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_KhachHang1`
    FOREIGN KEY (`MaKH`)
    REFERENCES `mydb`.`KhachHang` (`MaKH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_LoaiHinhThanhToan1`
    FOREIGN KEY (`MaLHTT`)
    REFERENCES `mydb`.`LoaiHinhThanhToan` (`MaLHTT`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ChiTietDonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ChiTietDonHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ChiTietDonHang` (
  `MaDH` INT NOT NULL,
  `MaMH` INT NOT NULL,
  `SoLuong` INT NULL,
  PRIMARY KEY (`MaDH`, `MaMH`),
  INDEX `fk_DonHang_has_MatHang_MatHang1_idx` (`MaMH` ASC) VISIBLE,
  INDEX `fk_DonHang_has_MatHang_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_has_MatHang_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `mydb`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_has_MatHang_MatHang1`
    FOREIGN KEY (`MaMH`)
    REFERENCES `mydb`.`MatHang` (`MaMH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`HoaDon`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`HoaDon` ;

CREATE TABLE IF NOT EXISTS `mydb`.`HoaDon` (
  `MaHD` INT NOT NULL,
  `MaDH` INT NOT NULL,
  `NgayXuatHoaDon` DATETIME NULL,
  `SoTienCanThanhToan` DOUBLE NULL,
  PRIMARY KEY (`MaHD`),
  INDEX `fk_HoaDon_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_HoaDon_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `mydb`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ChiTietTinhTrangDonHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`ChiTietTinhTrangDonHang` ;

CREATE TABLE IF NOT EXISTS `mydb`.`ChiTietTinhTrangDonHang` (
  `MaDH` INT NOT NULL,
  `MaTT` INT NOT NULL,
  `MaNV` INT NOT NULL,
  `ThoiGian` DATETIME NULL,
  PRIMARY KEY (`MaDH`, `MaTT`),
  INDEX `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1_idx` (`MaTT` ASC) VISIBLE,
  INDEX `fk_DonHang_has_TinhTrangDonHang_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  INDEX `fk_ChiTietTinhTrangDonHang_NhanVien1_idx` (`MaNV` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `mydb`.`DonHang` (`MaDH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1`
    FOREIGN KEY (`MaTT`)
    REFERENCES `mydb`.`TinhTrangDonHang` (`MaTT`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ChiTietTinhTrangDonHang_NhanVien1`
    FOREIGN KEY (`MaNV`)
    REFERENCES `mydb`.`NhanVien` (`MaNV`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `java13_shopping` ;

-- -----------------------------------------------------
-- Table `java13_shopping`.`khachhang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`khachhang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`khachhang` (
  `MaKH` INT(11) NOT NULL,
  `TenKH` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `DiaChi` TEXT NOT NULL,
  `SDT` VARCHAR(255) NOT NULL,
  `MXH` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`MaKH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`loaihinhthanhtoan`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`loaihinhthanhtoan` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`loaihinhthanhtoan` (
  `MaLHTT` INT(11) NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLHTT`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`chucvu`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`chucvu` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`chucvu` (
  `MaCV` INT(11) NOT NULL,
  `TenCV` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaCV`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`nhanvien`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`nhanvien` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`nhanvien` (
  `MaNV` INT(11) NOT NULL,
  `TenNV` VARCHAR(255) NOT NULL,
  `Email` VARCHAR(255) NOT NULL,
  `SDT` VARCHAR(255) NOT NULL,
  `DiaChi` TEXT NOT NULL,
  `MatKhau` VARCHAR(255) NOT NULL,
  `MaCV` INT(11) NOT NULL,
  PRIMARY KEY (`MaNV`),
  INDEX `fk_NhanVien_ChucVu1_idx` (`MaCV` ASC) VISIBLE,
  CONSTRAINT `fk_NhanVien_ChucVu1`
    FOREIGN KEY (`MaCV`)
    REFERENCES `java13_shopping`.`chucvu` (`MaCV`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`donhang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`donhang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`donhang` (
  `MaDH` INT(11) NOT NULL,
  `DiaChiGiaoHang` TEXT NOT NULL,
  `SDTNguoiNhan` VARCHAR(255) NOT NULL,
  `ThoiGianDatHang` DATETIME NOT NULL,
  `PhiVanChuyen` DOUBLE NOT NULL,
  `TongTien` DOUBLE NOT NULL,
  `MaNV` INT(11) NOT NULL,
  `MaKH` INT(11) NOT NULL,
  `MaLHTT` INT(11) NOT NULL,
  PRIMARY KEY (`MaDH`),
  INDEX `fk_DonHang_NhanVien1_idx` (`MaNV` ASC) VISIBLE,
  INDEX `fk_DonHang_KhachHang1_idx` (`MaKH` ASC) VISIBLE,
  INDEX `fk_DonHang_LoaiHinhThanhToan1_idx` (`MaLHTT` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_KhachHang1`
    FOREIGN KEY (`MaKH`)
    REFERENCES `java13_shopping`.`khachhang` (`MaKH`),
  CONSTRAINT `fk_DonHang_LoaiHinhThanhToan1`
    FOREIGN KEY (`MaLHTT`)
    REFERENCES `java13_shopping`.`loaihinhthanhtoan` (`MaLHTT`),
  CONSTRAINT `fk_DonHang_NhanVien1`
    FOREIGN KEY (`MaNV`)
    REFERENCES `java13_shopping`.`nhanvien` (`MaNV`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`loaihang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`loaihang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`loaihang` (
  `MaLH` INT(11) NOT NULL,
  `TenLH` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaLH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`mathang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`mathang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`mathang` (
  `MaMH` INT(11) NOT NULL,
  `TenMH` VARCHAR(255) NOT NULL,
  `MauSac` VARCHAR(255) NOT NULL,
  `MaLH` INT(11) NOT NULL,
  PRIMARY KEY (`MaMH`),
  INDEX `fk_MatHang_LoaiHang1_idx` (`MaLH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_LoaiHang1`
    FOREIGN KEY (`MaLH`)
    REFERENCES `java13_shopping`.`loaihang` (`MaLH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`chitietdonhang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`chitietdonhang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`chitietdonhang` (
  `MaDH` INT(11) NOT NULL,
  `MaMH` INT(11) NOT NULL,
  `SoLuong` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`MaDH`, `MaMH`),
  INDEX `fk_DonHang_has_MatHang_MatHang1_idx` (`MaMH` ASC) VISIBLE,
  INDEX `fk_DonHang_has_MatHang_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_DonHang_has_MatHang_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `java13_shopping`.`donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_MatHang_MatHang1`
    FOREIGN KEY (`MaMH`)
    REFERENCES `java13_shopping`.`mathang` (`MaMH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`kichco`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`kichco` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`kichco` (
  `MaKC` VARCHAR(10) NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaKC`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`chitietmathang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`chitietmathang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`chitietmathang` (
  `MaMH` INT(11) NOT NULL,
  `MaKC` VARCHAR(10) NOT NULL,
  `HinhAnh` VARCHAR(255) NOT NULL,
  `GiaBan` DOUBLE NOT NULL,
  `GiaMua` DOUBLE NOT NULL,
  `SoLuong` INT(11) NOT NULL,
  PRIMARY KEY (`MaMH`, `MaKC`),
  INDEX `fk_MatHang_has_KichCo_KichCo1_idx` (`MaKC` ASC) VISIBLE,
  INDEX `fk_MatHang_has_KichCo_MatHang_idx` (`MaMH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_has_KichCo_KichCo1`
    FOREIGN KEY (`MaKC`)
    REFERENCES `java13_shopping`.`kichco` (`MaKC`),
  CONSTRAINT `fk_MatHang_has_KichCo_MatHang`
    FOREIGN KEY (`MaMH`)
    REFERENCES `java13_shopping`.`mathang` (`MaMH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`tinhtrangdonhang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`tinhtrangdonhang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`tinhtrangdonhang` (
  `MaTT` INT(11) NOT NULL,
  `MoTa` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`MaTT`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`chitiettinhtrangdonhang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`chitiettinhtrangdonhang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`chitiettinhtrangdonhang` (
  `MaDH` INT(11) NOT NULL,
  `MaTT` INT(11) NOT NULL,
  `MaNV` INT(11) NOT NULL,
  `ThoiGian` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`MaDH`, `MaTT`),
  INDEX `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1_idx` (`MaTT` ASC) VISIBLE,
  INDEX `fk_DonHang_has_TinhTrangDonHang_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  INDEX `fk_ChiTietTinhTrangDonHang_NhanVien1_idx` (`MaNV` ASC) VISIBLE,
  CONSTRAINT `fk_ChiTietTinhTrangDonHang_NhanVien1`
    FOREIGN KEY (`MaNV`)
    REFERENCES `java13_shopping`.`nhanvien` (`MaNV`),
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `java13_shopping`.`donhang` (`MaDH`),
  CONSTRAINT `fk_DonHang_has_TinhTrangDonHang_TinhTrangDonHang1`
    FOREIGN KEY (`MaTT`)
    REFERENCES `java13_shopping`.`tinhtrangdonhang` (`MaTT`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `java13_shopping`.`hoadon`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping`.`hoadon` ;

CREATE TABLE IF NOT EXISTS `java13_shopping`.`hoadon` (
  `MaHD` INT(11) NOT NULL,
  `MaDH` INT(11) NOT NULL,
  `NgayXuatHoaDon` DATETIME NULL DEFAULT NULL,
  `SoTienCanThanhToan` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`MaHD`),
  INDEX `fk_HoaDon_DonHang1_idx` (`MaDH` ASC) VISIBLE,
  CONSTRAINT `fk_HoaDon_DonHang1`
    FOREIGN KEY (`MaDH`)
    REFERENCES `java13_shopping`.`donhang` (`MaDH`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
