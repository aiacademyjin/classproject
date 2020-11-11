-- 2020.11.11

-- JOIN

-- CROSS JOIN : 조건 없이 테이블과 테이블을 붙여준다
select *
from emp, dept
;

-- ANSI JOIN : CROSS JOIN
select *
from emp cross join dept
;



-- Equi JOIN
select *
from emp, dept
where emp.deptno=dept.deptno
;

-- SCOTT 의 사원번호와 이름, -- EMP
-- 부서이름, 지역을 출력  -- DEPT
Select emp.empno, emp.ename, emp.deptno, dept.dname, dept.loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT'
;

Select empno, ename, dept.deptno, dname, loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT'
;

Select e.empno, e.ename, e.deptno, d.dname, d.loc
from emp e, dept d
where e.deptno=d.deptno and e.ename='SCOTT'
;

-- ANSI -> T1 INNER JOIN T2 ON 조인의 조건
select *
from emp inner join dept
on emp.deptno=dept.deptno
;

select deptno
from emp join dept
--on emp.deptno=dept.deptno
USING(deptno)   -- 공통 컬럼은 하나만 가지게 해준다. 공통걸럼을 구별할 필요가 없다
;

-- NATURAL JOIN : 동일 컬럼 조인의 조건을 생략, 같은 이름의 컬럼은 하나씩
select ename, deptno, dname
from emp NATURAL JOIN dept
;




-- Non Equi JOIN : 동등 비교가 아닌 비교연산이 가능
-- 급여 등급을 5개로 나누어 놓은 salgrade에서 정보를 얻어 와서 
-- 각 사원의 급여 등급을 지정해보도록 합시다. 
-- 이를 위해서 사원(emp) 테이블과 급여 등급(salgrade) 테이블을 조인하도록 합시다. 
-- 사원의 급여가 몇 등급인지 살펴보자

-- 1. CROSS JOIN -> 조건
select *
from emp e, salgrade s
where e.sal BETWEEN s.losal AND s.hisal
;

select * from salgrade;





-- Self JOIN : 자신의 테이블을 조인
-- SMITH의 매니저 이름이 무엇인지

select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr=m.empno
and e.ename='SMITH'
;

select ename from emp where empno=7902;


-- OUTER JOIN : 정보가 부족해도 출력하도록 하는 JOIN
select e.ename, e.mgr, m.ename
from emp e, emp m
where e.mgr=m.empno(+)
;


-- ANSI outer JOIN
-- T1 [LEFT | RIGHT | FULL] OUTER JOIN T2

select *
from emp m right outer join emp e
on e.mgr=m.empno
;

select *
from emp e left outer join emp m
on e.mgr=m.empno
;

-- 회원 , 구매
-- customer , orders
select * from customer;
select * from orders order by custid;

select *
from customer c, orders o
where c.custid=o.custid(+)
;

-- 회원별 구매 횟수
select c.name, count(o.orderid), sum(o.saleprice), avg(o.saleprice)
from customer c, orders o
where c.custid=o.custid(+)
group by c.name
;


