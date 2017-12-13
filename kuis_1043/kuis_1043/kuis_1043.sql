-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 13 Des 2017 pada 16.12
-- Versi Server: 5.7.15-log
-- PHP Version: 5.6.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kuis_1043`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `identitas_1043`
--

CREATE TABLE `identitas_1043` (
  `nim` bigint(20) NOT NULL,
  `kelas` varchar(255) DEFAULT NULL,
  `nama` varchar(100) DEFAULT NULL,
  `id_ipk_id_ipk` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `identitas_1043`
--

INSERT INTO `identitas_1043` (`nim`, `kelas`, `nama`, `id_ipk_id_ipk`) VALUES
(12, 'tia', 'martin', 2),
(13, 'tia', 'eva', 1),
(14, 'tia', 'dimas', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `ipk_1043`
--

CREATE TABLE `ipk_1043` (
  `id_ipk` bigint(20) NOT NULL,
  `dosen` varchar(255) DEFAULT NULL,
  `nilai` varchar(255) DEFAULT NULL,
  `pelajaran` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data untuk tabel `ipk_1043`
--

INSERT INTO `ipk_1043` (`id_ipk`, `dosen`, `nilai`, `pelajaran`) VALUES
(1, 'mike', '90', 'animasi'),
(2, 'van', '80', 'animasi'),
(3, 'eda', '90', 'animasi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `identitas_1043`
--
ALTER TABLE `identitas_1043`
  ADD PRIMARY KEY (`nim`),
  ADD KEY `FKtquisplmxiq4j570t39bj3f48` (`id_ipk_id_ipk`);

--
-- Indexes for table `ipk_1043`
--
ALTER TABLE `ipk_1043`
  ADD PRIMARY KEY (`id_ipk`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `identitas_1043`
--
ALTER TABLE `identitas_1043`
  MODIFY `nim` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;
--
-- AUTO_INCREMENT for table `ipk_1043`
--
ALTER TABLE `ipk_1043`
  MODIFY `id_ipk` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `identitas_1043`
--
ALTER TABLE `identitas_1043`
  ADD CONSTRAINT `FKtquisplmxiq4j570t39bj3f48` FOREIGN KEY (`id_ipk_id_ipk`) REFERENCES `ipk_1043` (`id_ipk`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
