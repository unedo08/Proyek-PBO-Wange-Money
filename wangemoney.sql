-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 12, 2020 at 02:48 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wangemoney`
--

-- --------------------------------------------------------

--
-- Table structure for table `transaksi`
--

CREATE TABLE `transaksi` (
  `username` varchar(12) NOT NULL,
  `saldo` int(11) NOT NULL,
  `no_va` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaksi`
--

INSERT INTO `transaksi` (`username`, `saldo`, `no_va`) VALUES
('aldalg', 10000, 11234),
('unedo08', 147, 12345);

-- --------------------------------------------------------

--
-- Table structure for table `tregister`
--

CREATE TABLE `tregister` (
  `name` varchar(50) NOT NULL,
  `no_telp` bigint(12) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `postal_code` int(8) NOT NULL,
  `username` varchar(12) NOT NULL,
  `password` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tregister`
--

INSERT INTO `tregister` (`name`, `no_telp`, `address`, `postal_code`, `username`, `password`, `email`) VALUES
('alda', 8134567890, 'Tarutung', 12345, 'aldalg', '78901', 'aldalg@gmail.com'),
('Unedo Manalu', 82165162549, 'Doloksanggul', 2213, 'unedo08', '123456', 'manaluuunedo80@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD PRIMARY KEY (`username`);

--
-- Indexes for table `tregister`
--
ALTER TABLE `tregister`
  ADD PRIMARY KEY (`username`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `transaksi`
--
ALTER TABLE `transaksi`
  ADD CONSTRAINT `transaksi_ibfk_1` FOREIGN KEY (`username`) REFERENCES `tregister` (`Username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
