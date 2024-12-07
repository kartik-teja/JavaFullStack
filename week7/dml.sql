/*connect to java profile*/

Create table employees(employeeid NUMBER (6),first_name VARCHAR2(28),last_name VARCHAR2(25),
DEPARTMENT_ID NUMBER(4),salary NUMBER (8,2));
DESC employees;/*only work in sql not in ecllipse*/


Create table MY_EMPLOYEE as Select * from EMPLOYEES where 1=2;

Insert into employees values(201,'machael','Harstein',20,13000);

Insert into employees values(202,'pat','Fay',20,null);

Insert into employees values(205,'shelley','higgins',110,12000);
Insert into employees values(100,'steven','king',90,24000);
Insert into employees values(101,'Neena','kochhar',90,17000); 
Insert into employees values(102,'Lex Den','Haan',90,17000);
Insert into employees values(111,'ismael','sciarra',100,7700);
Insert into employees values(112,'jose','Manuel urma',100,7800);
Insert into employees values(204,'Hermann','Baer',70,10000);

Update employees set salary =salary+(salary/100)*10 where DEPARTMENT_ID=90;

Update employees set employeeid=282 where last_name='higgins'

Delete from employees where last_name like '%Man%' or first_name like '%man%';

Create table Dept(Dept_ID number(7) primary key,Dept_name varchar(20))
