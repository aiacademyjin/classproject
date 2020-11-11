-- 2020.11.11

-- JOIN

-- CROSS JOIN : 조건 없이 테이블과 테이블을 붙여준다
select *
from emp, dept
;

-- Equi JOIN
select *
from emp, dept
where emp.deptno=dept.deptno
;

-- SCOTT 의 사원번호와 이름, -- EMP
-- 부서이름, 지역을 출력  -- DEPT
Select empno, ename, dname, loc
from emp, dept
where emp.deptno=dept.deptno and ename='SCOTT'
;


