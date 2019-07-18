-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2017 at 06:53 PM
-- Server version: 10.1.25-MariaDB
-- PHP Version: 7.1.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `weighttracker`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_exercise`
--

CREATE TABLE `add_exercise` (
  `id` int(10) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `exercise_name` varchar(25) DEFAULT NULL,
  `calori_burn` double(25,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_exercise`
--

INSERT INTO `add_exercise` (`id`, `email`, `exercise_name`, `calori_burn`) VALUES
(1, 'test2@gmail.com', 'Swimming', 201.500),
(2, 'test2@gmail.com', 'Scading', 210.000),
(6, 'test2@gmail.com', 'boxin', 25.000);

-- --------------------------------------------------------

--
-- Table structure for table `add_meal`
--

CREATE TABLE `add_meal` (
  `id` int(10) NOT NULL,
  `email` varchar(25) DEFAULT NULL,
  `meal_name` varchar(25) DEFAULT NULL,
  `calori` double(25,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `add_meal`
--

INSERT INTO `add_meal` (`id`, `email`, `meal_name`, `calori`) VALUES
(2, 'test2@gmail.com', 'Mutton', 30.500),
(3, 'test2@gmail.com', 'Brad', 35.000),
(5, 'test2@gmail.com', 'rice', 23.000),
(6, 'test2@gmail.com', 'Milk', 10.000);

-- --------------------------------------------------------

--
-- Table structure for table `exercise_record`
--

CREATE TABLE `exercise_record` (
  `id` int(10) NOT NULL,
  `email` varchar(25) NOT NULL,
  `date` varchar(25) NOT NULL,
  `averageWeight` double(10,3) NOT NULL,
  `caloriBurn` double(10,3) NOT NULL,
  `exerciseName` varchar(25) NOT NULL,
  `exerciseDuration` double(10,2) NOT NULL,
  `AfterExerciseWeight` double(10,3) DEFAULT NULL,
  `weightChange` double(10,3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exercise_record`
--

INSERT INTO `exercise_record` (`id`, `email`, `date`, `averageWeight`, `caloriBurn`, `exerciseName`, `exerciseDuration`, `AfterExerciseWeight`, `weightChange`) VALUES
(2, 'test1@gmail.com', '10-12-2017', 42.500, 26460.000, 'Scading', 126.00, 42.374, 0.126),
(3, 'test1@gmail.com', '11-12-2017', 45.100, 8820.000, 'Scading', 42.00, 45.058, 0.042),
(4, 'test1@gmail.com', '12-12-2017', 45.100, 16800.000, 'Scading', 80.00, 45.020, 0.080),
(5, 'test1@gmail.com', '09-12-2017', 46.100, 31500.000, 'Scading', 150.00, 54.950, 0.150),
(6, 'test1@gmail.com', '13-12-2017', 45.000, 10500.000, 'Scading', 50.00, 44.950, 0.050),
(7, 'test1@gmail.com', '14-12-2017', 45.000, 6300.000, 'Scading', 30.00, 45.030, 0.030),
(8, 'test1@gmail.com', '15-12-2017', 45.100, 11550.000, 'Scading', 55.00, 45.155, 0.055),
(9, 'test1@gmail.com', '16-12-2017', 45.000, 11550.000, 'Scading', 55.00, 44.945, 0.055),
(10, 'test1@gmail.com', '17-12-2017', 85.050, 6015.000, 'Swimming', 30.00, 85.020, 0.030),
(11, 'test1@gmail.com', '18-12-2017', 45.010, 1500.000, 'push up', 500.00, 44.510, 0.500),
(16, 'test1@gmail.com', '19-12-2017', 45.400, 16346.000, 'boxin', 653.84, 45.400, 0.654),
(18, 'test1@gmail.com', '20-12-2017', 46.010, 3375.000, 'boxin', 135.00, 45.875, 0.135);

-- --------------------------------------------------------

--
-- Table structure for table `registation`
--

CREATE TABLE `registation` (
  `name` varchar(25) NOT NULL,
  `email` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `age` int(10) NOT NULL,
  `number` int(11) NOT NULL,
  `address` varchar(100) NOT NULL,
  `user_type` int(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registation`
--

INSERT INTO `registation` (`name`, `email`, `password`, `gender`, `age`, `number`, `address`, `user_type`) VALUES
('Rakib', 'test1@gmail.com', '123', 'Male', 21, 1680023583, 'Bangladesh', 0),
('Dilu', 'Test2@gmail.com', '123', 'Female', 25, 1680023583, 'Dhaka, Bangladesh', 1),
('Adi', 'test3@gmail.com', '123', 'Male', 26, 1710516008, 'Dhaka, Bangladesh', 0);

-- --------------------------------------------------------

--
-- Table structure for table `rules`
--

CREATE TABLE `rules` (
  `id` int(11) NOT NULL,
  `geder` varchar(20) NOT NULL,
  `day_type` varchar(20) NOT NULL,
  `rule` double(10,3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rules`
--

INSERT INTO `rules` (`id`, `geder`, `day_type`, `rule`) VALUES
(1, 'Male', 'Active', 7.500),
(2, 'Male', 'Inactive', 5.000),
(3, 'Male', 'Moderately Active', 6.000),
(4, 'Female', 'Active', 6.000),
(5, 'Female', 'Inactive', 4.000),
(6, 'Female', 'Moderately Active', 5.000);

-- --------------------------------------------------------

--
-- Table structure for table `weightandwaist`
--

CREATE TABLE `weightandwaist` (
  `id` int(25) NOT NULL,
  `email` varchar(25) NOT NULL,
  `date` varchar(50) NOT NULL,
  `exerciseShift` varchar(25) NOT NULL,
  `Weight` double(10,3) NOT NULL,
  `Waist` double(10,3) NOT NULL,
  `mealName` varchar(50) DEFAULT NULL,
  `Calori_intake` double(10,3) DEFAULT NULL,
  `need_burn` double(10,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `weightandwaist`
--

INSERT INTO `weightandwaist` (`id`, `email`, `date`, `exerciseShift`, `Weight`, `Waist`, `mealName`, `Calori_intake`, `need_burn`) VALUES
(8, 'test1@gmail.com', '09-12-2017', 'Morning', 55.000, 34.000, 'Mutton', 10675.000, 10345.000),
(9, 'test1@gmail.com', '09-12-2017', 'Evening', 55.200, 34.000, 'Brad', 11100.000, 10768.800),
(10, 'test1@gmail.com', '10-12-2017', 'Morning', 40.000, 23.000, 'Mutton', 18300.000, 17925.000),
(11, 'test1@gmail.com', '10-12-2017', 'Evening', 45.000, 22.000, 'Brad', 9000.000, 8730.000),
(12, 'test1@gmail.com', '11-12-2017', 'Morning', 45.100, 22.000, 'Brad', 9000.000, 8661.750),
(13, 'test1@gmail.com', '11-12-2017', 'Evening', 45.000, 22.000, 'Breakfast', 13650.000, 13425.000),
(14, 'test1@gmail.com', '12-12-2017', 'Morning', 45.100, 22.100, 'Brad', 9000.000, 8729.400),
(15, 'test1@gmail.com', '12-12-2017', 'Evening', 45.100, 22.100, 'Mutton', 9150.000, 8879.400),
(16, 'test1@gmail.com', '13-12-2017', 'Morning', 45.000, 22.000, 'Breakfast', 9100.000, 8762.500),
(17, 'test1@gmail.com', '13-12-2017', 'Evening', 45.000, 22.000, 'Brad', 6000.000, 5662.500),
(18, 'test1@gmail.com', '14-12-2017', 'Morning', 45.000, 22.000, 'Breakfast', 9145.500, 8808.000),
(19, 'test1@gmail.com', '14-12-2017', 'Evening', 45.000, 22.000, 'Breakfast', 8645.000, 8307.500),
(20, 'test1@gmail.com', '15-12-2017', 'Morning', 45.100, 22.010, 'Breakfast', 7052.500, 6781.900),
(21, 'test1@gmail.com', '15-12-2017', 'Evening', 45.100, 22.010, 'Brad', 4950.000, 4679.400),
(22, 'test1@gmail.com', '16-12-2017', 'Morning', 45.000, 22.000, 'Breakfast', 5915.000, 5577.500),
(23, 'test1@gmail.com', '16-12-2017', 'Evening', 45.000, 22.000, 'Breakfast', 5915.000, 5577.500),
(24, 'test1@gmail.com', '17-12-2017', 'Morning', 85.000, 40.000, 'Mutton', 3660.000, 3022.500),
(25, 'test1@gmail.com', '17-12-2017', 'Evening', 85.100, 40.200, 'Brad', 6000.000, 5361.750),
(26, 'test1@gmail.com', '18-12-2017', 'Morning', 45.000, 22.000, 'rice', 1000.000, 775.000),
(27, 'test1@gmail.com', '18-12-2017', 'Evening', 45.020, 22.100, 'Mutton', 915.000, 689.900),
(28, 'test1@gmail.com', '19-12-2017', 'Morning', 45.300, 22.300, 'Brad', 10500.000, 10273.500),
(29, 'test1@gmail.com', '19-12-2017', 'Evening', 45.500, 22.100, 'Brad', 6300.000, 6072.500),
(30, 'test1@gmail.com', '20-12-2017', 'Morning', 46.000, 23.000, 'Milk', 2500.000, 2155.000),
(31, 'test1@gmail.com', '20-12-2017', 'Evening', 46.020, 23.010, 'Mutton', 1525.000, 1179.850);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_exercise`
--
ALTER TABLE `add_exercise`
  ADD PRIMARY KEY (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `add_meal`
--
ALTER TABLE `add_meal`
  ADD PRIMARY KEY (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `exercise_record`
--
ALTER TABLE `exercise_record`
  ADD PRIMARY KEY (`id`),
  ADD KEY `email` (`email`);

--
-- Indexes for table `registation`
--
ALTER TABLE `registation`
  ADD PRIMARY KEY (`email`);

--
-- Indexes for table `rules`
--
ALTER TABLE `rules`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `weightandwaist`
--
ALTER TABLE `weightandwaist`
  ADD PRIMARY KEY (`id`),
  ADD KEY `weightandwaist_ibfk_1` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_exercise`
--
ALTER TABLE `add_exercise`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `add_meal`
--
ALTER TABLE `add_meal`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `exercise_record`
--
ALTER TABLE `exercise_record`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `rules`
--
ALTER TABLE `rules`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `weightandwaist`
--
ALTER TABLE `weightandwaist`
  MODIFY `id` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `add_exercise`
--
ALTER TABLE `add_exercise`
  ADD CONSTRAINT `add_exercise_ibfk_1` FOREIGN KEY (`email`) REFERENCES `registation` (`email`);

--
-- Constraints for table `add_meal`
--
ALTER TABLE `add_meal`
  ADD CONSTRAINT `add_meal_ibfk_1` FOREIGN KEY (`email`) REFERENCES `registation` (`email`);

--
-- Constraints for table `exercise_record`
--
ALTER TABLE `exercise_record`
  ADD CONSTRAINT `exercise_record_ibfk_1` FOREIGN KEY (`email`) REFERENCES `registation` (`email`);

--
-- Constraints for table `weightandwaist`
--
ALTER TABLE `weightandwaist`
  ADD CONSTRAINT `weightandwaist_ibfk_1` FOREIGN KEY (`email`) REFERENCES `registation` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
