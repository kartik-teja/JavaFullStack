Select ename,sal from emp where sal>1200;

Select ename, deptno from emp where empno=7499;

Select max(sal) from emp;
Select min(sal) from emp;
Select ename,sal from emp where sal not between 5000 and 12000;

Select ename,job,hiredate from emp  where ename like 'A%' order by hiredate asc;

Select deptno,ename from emp where deptno=20 or deptno=58 order by ename asc;

Select ename employee,sal monthlysalary from emp where sal between 5000 and 12000 and deptno in (20,10);

Select ename ,hiredate from emp where  to_char(hiredate,'yyyy')=1980;

Select e1.ename,e1.job from emp e1 left join emp e2  on e1.mgr=e2.empno where e2.empno is null;

Select ename,sal,comm from emp where comm is not null order by 2 desc,3 desc;

Select last_name,salary from employees where salary>&salary; --cannot run in eclipse

select empno,ename,sal,deptno from emp where mgr=&managerid_no order by  &column_name; --7698 cannot run in eclipse

Select * from emp where ename like '__A%'

Select * from emp where ename like '%A%M%' or ename like '%M%A%';

Select ename,job,sal from emp where job in('SALESMAN','CLERK') and sal not in(2500,3500,7000);
