/*connect to the system profile instead of java to run the below*/

Select * from department;

SELECT empno AS "Employee ID",
       ename AS "Name",
       job AS "Job",
       hiredate AS STARTDATE
FROM emp;

Select empno,ename,job,hiredate as startdtae from emp;

Select distinct job from emp;

Select empno Emp#, ename Employee, job ,hiredate hire_date from emp;