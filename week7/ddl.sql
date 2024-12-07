Insert into  Dept values(10,'Accounts');
Insert into dept values(11,'TT');/*cannot insert null as it is primary key*/
Update set dept_id=20 where Dept_name='TT';
Update dept set dept_id=30 where dept_name='Accounts';


Create table emp(id number(7) primary key, last_name varchar2(25) not null,
First_name varchar2(25),dept_id number(7));

Create table dept1(id number(7) references emp(dept_id)); --foreign key referenceing ivaledu
Insert into emp values(101,'sam','sundar',10);
Insert into emp values(101,'ram','krishna',20);  ---it will not accept because of primary key
Insert into emp values(102,'gopi',null,40);  
Insert into emp values(103,null,'ram',20);  ---it will not accept because of not  null constraint on last_name


