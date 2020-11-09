-- 2020.11.09
-- Select 기본

-- scott 계정으로 로그인
-- scott 계정이 소유한 테이블 객체를 확인 : Tab -> 사용자가 가지는 테이블의 정보를 저장하는 데이터 딕셔너리
select * from tab;

-- 테이블의 구조 확인 : DESC
-- 테이블의 데이터를 검색하기전 구조를 확인 할 때
Desc emp;
desc dept;

-- 데이터의 조회 명령 : Select
-- SELECT 컬럼명 , ... FROM 테이블 이름(조회의 대상) --> 기본 문법
-- SELECT의 결과는 -> TABLE 이다!!!

SELECT      -- 조회하는 명령어
    *       -- 컴럼 이름들을 기술해준다. 기술하는 순서에 따라 결과도 순서에 맞게 출력
FROM emp    -- 조회하고자하는 테이블 이름을 기술
;           -- sql 의 종료

-- 부서 테이블의 모든 데이터를 조회하자
select *
from dept
;

desc dept;

-- 부서 테이블에서   --> FROM
-- 부서의 이름과 위치를 출력  --> SELECT
select dname,loc
from dept
;

select loc, deptno, dname, dname
from dept
;

-- 모든 사원의 정보를 출력하자
select *
from emp
;

-- 사원의 이름, 사번, 직급(직무)를 포함하는 리스트 출력
select ename, empno, job
from emp
;

-- select 절의 컬럼의 사칙연산 가능
-- 임시 테이블 dual : 컬럼은 x 를 가지는 테이블
select 100+200, 200-100, 100*10, 100/10
from dual;

select ename, sal, sal*12
from emp
;

-- 연봉의 계산을 sal*12+comm으로 계산하자
select ename, sal, sal*12, comm, sal*12+comm
from emp
;

-- null : 값은 존재하는데 정해지지 않은 값
-- 연산이 불가 : 사칙연산, 비교연산

-- nvl 함수 : null 값을 치환 해주는 함수
-- nvl(컬럼, 대체값) : 컬럼의 값이 null 일 때 대체값으로 치환, 이 때 대체값은 컬럼의 타입에 맞는 데이터 이어야 한다.
-- 연봉의 계산을 sal*12+comm으로 계산하자
select ename, sal, sal*12 sal12, nvl(comm,0) as comm, sal*12+nvl(comm, 0) as "12개월 연봉"
from emp
;

-- 데이터베이스의 sql 내부의 문자열 처리는 작은 따움표 ''
-- 문자열의 조합
select ename || '의 직무는 ' || job ||'입니다.'
from emp;

-- Distinct : 데이터의 중복값을 제거 하고 출력
select deptno
from emp;

select DISTINCT deptno
from emp;


-- 특정 데이터를 추출하는 where 절
-- select 컬럼명... from 테이블 이름 where 조건식

-- 급여가 3000 이상인 사원의 리스트를 출력하자

select ename, job, sal
from emp
where sal>=3000
;

select ename --, job, sal
from emp
where sal > 4000
;


-- 10번 부서에 소속된
-- 사원들의 리스트를 출력
select ename
from emp
where deptno=10
;

-- 사원이름이 FORD 인 
-- 사원의 정보를 출력
select *
from emp
where ename='FORD'
;

-- 81/11/17에 입사한 사원의 정보를 출력
select *
from emp
where hiredate='81/11/17'   -- 날짜 비교에서도 날짜도 작은 따움표로 묶어서 사용
;

-- 10번 부서 소속인 사원들 중에서  --> and
-- 직급이 MANAGER인 사람을 검색하여 
-- 사원명, 부서번호, 직급을 출력하려고 한다면 
-- 두 가지 조건을 제시해야 합니다.
-- 행을 찾는 조건
-- [조건1] 10번 부서 소속인 사원 : DEPTNO=10
-- [조건2] 직급이 MANAGER인 사원 : JOB='MANAGER'

Select ename, deptno, job
from emp
where deptno=10 and job='MANAGER'
;

