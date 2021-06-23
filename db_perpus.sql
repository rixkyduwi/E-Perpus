-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jan 11, 2021 at 12:07 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpus`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE "admin"(codename varchar20) ;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`codename`, `password`) VALUES('admin', 'admin123');

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE "buku" ;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`id`, `ISBN`, `JUDUL`, `PENULIS`, `PENERBIT`, `JB`) VALUES(1, 271639821, 'wqrkndbwkqjf', 'wqrjbf', 'Gramedia', 'N');
INSERT INTO `buku` (`id`, `ISBN`, `JUDUL`, `PENULIS`, `PENERBIT`, `JB`) VALUES(2, 183261289, 'saifwefioe', 'fewkfn', 'Gramedia', 'N');
INSERT INTO `buku` (`id`, `ISBN`, `JUDUL`, `PENULIS`, `PENERBIT`, `JB`) VALUES(4, 24124213, 'ewftweftwdq', 'werf23rwqd', 'Erlangga', 'N');
INSERT INTO `buku` (`id`, `ISBN`, `JUDUL`, `PENULIS`, `PENERBIT`, `JB`) VALUES(5, 1234567890123, 'matematika dasar', 'tim mgmp', 'zamrud', 'N');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
