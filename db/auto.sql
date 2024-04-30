-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-04-2024 a las 01:59:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `automovil`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `auto`
--

CREATE TABLE `auto` (
  `id` int(11) NOT NULL,
  `modelo` varchar(100) DEFAULT NULL,
  `marca` varchar(100) DEFAULT NULL,
  `motor` varchar(100) DEFAULT NULL,
  `color` varchar(50) DEFAULT NULL,
  `patente` varchar(20) DEFAULT NULL,
  `cantPuertas` int(11) DEFAULT NULL,
  `fecha` date NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `auto`
--

INSERT INTO `auto` (`id`, `modelo`, `marca`, `motor`, `color`, `patente`, `cantPuertas`, `fecha`) VALUES
(2, 'RHDHS475', 'HONDA ACCORD', '2.0 TURBO', 'BLANCO PERLA ', 'A4BB', 4, '2024-04-25'),
(3, 'CVRFS', 'HONDA CIVIC 2018', '1.5 TURBO', 'NEGRO', 'FFT85', 4, '2024-04-25'),
(4, 'CVRFS', 'HONDA CIVIC 2018', '1.5 TURBO', 'NEGRO', 'FFT85', 4, '2024-04-26'),
(5, 'CVRFS', 'HONDA CRV 2022', '1.5 TURBO', 'NEGRO', 'FFT853WQ', 4, '2024-04-26'),
(11, 'CH-RTY856954', 'TOYOTA CAMRY xls 2023, SEDAN', '2.0 TUBO EZQ', 'BLACK PERLADO', 'AA458SD', 4, '2024-04-26'),
(12, 'RDHFT7856', 'KIA SORENTO 2024 XLS', '1.8 TURBO DGI', 'BLANCO PERLA', '785RTP', 4, '2024-04-27'),
(13, 'MTR453234', 'TOYOTA PRADO XL', '2.0 TR', 'NEGO PERLA ', 'AA445', 4, '2024-04-28');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `auto`
--
ALTER TABLE `auto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
