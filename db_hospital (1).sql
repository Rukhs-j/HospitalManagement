-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Aug 09, 2020 at 03:14 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_hospital`
--

-- --------------------------------------------------------

--
-- Table structure for table `doctor_tbl1`
--

CREATE TABLE `doctor_tbl1` (
  `id` int(20) NOT NULL,
  `name` varchar(200) NOT NULL,
  `specilist` varchar(200) NOT NULL,
  `timing` varchar(100) NOT NULL,
  `qualification` varchar(200) NOT NULL,
  `room_no` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='doctor table';

--
-- Dumping data for table `doctor_tbl1`
--

INSERT INTO `doctor_tbl1` (`id`, `name`, `specilist`, `timing`, `qualification`, `room_no`) VALUES
(1, 'Dr.rukhs', 'sergan', '6-7pm', 'MBBS', '8');

-- --------------------------------------------------------

--
-- Table structure for table `facilities_tbl1`
--

CREATE TABLE `facilities_tbl1` (
  `id` int(20) NOT NULL,
  `facilities` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `facilities_tbl1`
--

INSERT INTO `facilities_tbl1` (`id`, `facilities`) VALUES
(1, 'Ambulane');

-- --------------------------------------------------------

--
-- Table structure for table `lab_tbl1`
--

CREATE TABLE `lab_tbl1` (
  `facilities` varchar(200) NOT NULL,
  `cost` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `lab_tbl1`
--

INSERT INTO `lab_tbl1` (`facilities`, `cost`) VALUES
('X-ray', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `medicine_tbl1`
--

CREATE TABLE `medicine_tbl1` (
  `name` varchar(200) NOT NULL,
  `company` varchar(200) NOT NULL,
  `expiray_date` varchar(100) NOT NULL,
  `cost` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine_tbl1`
--

INSERT INTO `medicine_tbl1` (`name`, `company`, `expiray_date`, `cost`) VALUES
('cholofil', 'xyz', '2-12-20', 20);

-- --------------------------------------------------------

--
-- Table structure for table `patients_tbl1`
--

CREATE TABLE `patients_tbl1` (
  `id` int(20) NOT NULL,
  `name` varchar(200) NOT NULL,
  `disease` varchar(200) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `admit_status` varchar(50) NOT NULL,
  `age` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patients_tbl1`
--

INSERT INTO `patients_tbl1` (`id`, `name`, `disease`, `gender`, `admit_status`, `age`) VALUES
(1, 'tom', 'covid', 'Male', 'yes', 23);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `doctor_tbl1`
--
ALTER TABLE `doctor_tbl1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `facilities_tbl1`
--
ALTER TABLE `facilities_tbl1`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patients_tbl1`
--
ALTER TABLE `patients_tbl1`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `doctor_tbl1`
--
ALTER TABLE `doctor_tbl1`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `facilities_tbl1`
--
ALTER TABLE `facilities_tbl1`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `patients_tbl1`
--
ALTER TABLE `patients_tbl1`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
