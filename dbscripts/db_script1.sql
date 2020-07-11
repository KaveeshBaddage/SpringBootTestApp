CREATE DATABASE tech_blogdb
  CHARACTER SET utf8 --  character set encoding to UTF-8
  COLLATE utf8_general_ci; -- data is sorted and compared in a Unicode standards

USE tech_blogdb;

CREATE TABLE `admin_uesr` (
  `id` varchar(255) NOT NULL,
  `first_name` varchar(200) NOT NULL,
  `last_name` varchar(200) NOT NULL,
  `age` int(5) DEFAULT NULL,
  `occupation` varchar(255) DEFAULT NULL,
  `email` varchar(50) NOT NULL,
  `contact_number` varchar(50) NOT NULL,
  `user_data` json NOT NULL,
  `role` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `created_by` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `admin_full_name` (`first_name`,`last_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;