# springbootapi
Kill the instance of the server:

netstat -ao | find "8080"
Taskkill /PID  12592 /F

Database name: studentregistration

CREATE TABLE `program` (
  `id` int NOT NULL AUTO_INCREMENT,
  `programName` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
);

CREATE TABLE `Student` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
  `DOB` date not null,
  `programid` int not null,	
  PRIMARY KEY (`id`),
  foreign key(`programid`) references `program`(`id`)
);

