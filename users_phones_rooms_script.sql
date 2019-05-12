-- --------------------------------------------------------
-- Хост:                         127.0.0.1
-- Версия сервера:               5.5.47 - MySQL Community Server (GPL)
-- Операционная система:         Win64
-- HeidiSQL Версия:              9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Дамп структуры базы данных catalog4
CREATE DATABASE IF NOT EXISTS `catalog4` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `catalog4`;

-- Дамп структуры для таблица catalog4.phones
CREATE TABLE IF NOT EXISTS `phones` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `user_id` int(5) NOT NULL,
  `phone_number` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `phones_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;

-- Дамп данных таблицы catalog4.phones: ~3 rows (приблизительно)
/*!40000 ALTER TABLE `phones` DISABLE KEYS */;
INSERT INTO `phones` (`id`, `user_id`, `phone_number`) VALUES
	(7, 1, '050111111'),
	(8, 2, '0503333333'),
	(9, 3, '09722222');
/*!40000 ALTER TABLE `phones` ENABLE KEYS */;

-- Дамп структуры для таблица catalog4.rooms
CREATE TABLE IF NOT EXISTS `rooms` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `phone_id` int(5) NOT NULL,
  `room_number` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Дамп данных таблицы catalog4.rooms: ~6 rows (приблизительно)
/*!40000 ALTER TABLE `rooms` DISABLE KEYS */;
INSERT INTO `rooms` (`id`, `phone_id`, `room_number`) VALUES
	(1, 1, 305),
	(2, 2, 306),
	(3, 3, 307),
	(4, 7, 305),
	(5, 8, 306),
	(6, 9, 307);
/*!40000 ALTER TABLE `rooms` ENABLE KEYS */;

-- Дамп структуры для таблица catalog4.users
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Дамп данных таблицы catalog4.users: ~6 rows (приблизительно)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `name`) VALUES
	(1, 'Petrov'),
	(2, 'Ivanov'),
	(3, 'James'),
	(4, 'James'),
	(5, 'Petrov'),
	(6, 'Sidorov');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
