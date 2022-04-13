-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema java13_shopping_manually
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `java13_shopping_manually` ;

-- -----------------------------------------------------
-- Schema java13_shopping_manually
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `java13_shopping_manually` DEFAULT CHARACTER SET utf8 ;
USE `java13_shopping_manually` ;

-- -----------------------------------------------------
-- Table `java13_shopping_manually`.`KichCo`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping_manually`.`KichCo` ;

CREATE TABLE IF NOT EXISTS `java13_shopping_manually`.`KichCo` (
  `MaKC` INT NOT NULL,
  `MoTa` TEXT NOT NULL,
  PRIMARY KEY (`MaKC`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java13_shopping_manually`.`LoaiHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping_manually`.`LoaiHang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping_manually`.`LoaiHang` (
  `MaLH` INT NOT NULL,
  `TenLH` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`MaLH`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java13_shopping_manually`.`MatHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping_manually`.`MatHang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping_manually`.`MatHang` (
  `MaMH` INT NOT NULL,
  `TenMH` VARCHAR(50) NOT NULL,
  `MauSac` VARCHAR(50) NULL,
  `MaLH` INT NOT NULL,
  PRIMARY KEY (`MaMH`),
  INDEX `fk_MatHang_LoaiHang_idx` (`MaLH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_LoaiHang`
    FOREIGN KEY (`MaLH`)
    REFERENCES `java13_shopping_manually`.`LoaiHang` (`MaLH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `java13_shopping_manually`.`KichCoMatHang`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `java13_shopping_manually`.`KichCoMatHang` ;

CREATE TABLE IF NOT EXISTS `java13_shopping_manually`.`KichCoMatHang` (
  `MaMH` INT NOT NULL,
  `MaKC` INT NOT NULL,
  `HinhAnh` TEXT NULL,
  `GiaBan` DOUBLE NOT NULL,
  `GiaMua` DOUBLE NOT NULL,
  `SoLuong` INT NOT NULL,
  PRIMARY KEY (`MaMH`, `MaKC`),
  INDEX `fk_MatHang_has_KichCo_KichCo1_idx` (`MaKC` ASC) VISIBLE,
  INDEX `fk_MatHang_has_KichCo_MatHang1_idx` (`MaMH` ASC) VISIBLE,
  CONSTRAINT `fk_MatHang_has_KichCo_MatHang1`
    FOREIGN KEY (`MaMH`)
    REFERENCES `java13_shopping_manually`.`MatHang` (`MaMH`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_MatHang_has_KichCo_KichCo1`
    FOREIGN KEY (`MaKC`)
    REFERENCES `java13_shopping_manually`.`KichCo` (`MaKC`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
