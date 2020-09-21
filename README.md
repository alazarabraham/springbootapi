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


NEW TABLES


MANY TO MANY ***********************************************************

CREATE TABLE `program` (
  `programId` int NOT NULL AUTO_INCREMENT,
  `programName` varchar(50) NOT NULL,
  `instructor` varchar(50) NOT NULL,
  `semester` varchar(50) NOT NULL,
  `level` varchar(50) NOT NULL,
  PRIMARY KEY (`programId`)
);

insert into program(programName) values ('Biology');

CREATE TABLE `Student` (
  `studentId` int NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) NOT NULL,
  `lastname` varchar(100) NOT NULL,
   `degreeProgram` varchar(100) Not null,
  `DOB` date not null,	
  PRIMARY KEY (`studentId`)
);

insert into student(firstname,lastname,dob)values ('Alazar','Markos','1993/12/11');


create table enrollment(
`studentId` int not null,
`programId` int not null,
foreign key (`studentId`) references `student`(`studentId`),
foreign key (`programId`) references `program`(`programId`));

insert into enrollment(studentid,programid)values(1,1);


SELECT firstname,lastname,programName
FROM enrollment
inner join student 
using (studentid)
inner join program
using (programid)
where programid=2
;

insert into enrollment(studentid,programid)values(1,1);


*************************************************************
