-- 2020.11.12

-- DDL

-- 테이블 생성 : 
-- create table table_name
-- (
--    column_name domain [constraint],
--    column_name domain [constraint],
--    column_name domain [constraint]
--    ...
-- )
drop table test_tbl;
create table test_tbl (
    no number(4),
    user_name varchar2(10),
    user_id varchar2(16),
    user_password varchar2(12),
    reg_date Timestamp DEFAULT SYSDATE
);
desc test_tbl;

-- 사원 테이블과 유사한 구조의 사원번호, 사원이름, 급여 3개의 칼럼으로 구성된 EMP01 테이블을 생성해 봅시다.
desc emp;

create table emp01 (
    empno number(4),
    ename varchar2(10),
    sal number(7,2)
    
);
desc emp01;

-- Create table ~ as ~  : 테이블 복사, 제약조건은 복사되지 않는다.
-- CREATE TABLE 명령어 다음에 컬럼을 일일이 정의하는 대신 
-- AS 절을 추가하여 EMP 테이블과 동일한 내용과 구조를 갖는 
-- EMP02 테이블을 생성해 봅시다.
create table emp02 
as
select * from emp;
desc emp02;
desc emp;
select * from emp02;

-- 서브 쿼리문의 SELECT 절에 * 대신 원하는 컬럼명을 명시하면 
-- 기존 테이블에서 일부의 컬럼만 복사할 수 있습니다.
create table emp03
as
select empno, ename, sal from emp
;
desc emp03;
select * from emp03;

--서브 쿼리문의 SELECT 문을 구성할 때 
-- WHERE 절을 추가하여 원하는 조건을 제시하면 
-- 기존 테이블에서 일부의 행만 복사합니다.
create table emp04
as
select * from emp where deptno=10
;
select * from emp04;


-- WHERE 조건 절에 항상 거짓이 되는 조건을 지정하게 되면 
-- 테이블에서 얻어질 수 있는 로우가 없게 되므로 빈 테이블이 생성되게 됩니다.
create table emp05
as
select * from emp where 1=2
;
select * from emp05;

select * from tab;

-- 테이블의 삭제 ; 저장공간을 삭제 -> 저장되어 있는 데이터도 모두 삭제
-- drop table table_name
drop table test_tbl;

-- TRUNCATE : 테이블의 모든 행을 바로 삭제 물리적인 적용도 바로 진행
create table emp06
as
select * from emp;
select * from emp06;
truncate table emp06;

-- RENAME 현재 테이블 이름 to 새이름
rename emp06 to new_emp;
select * from tab;
rename new_emp to hot_emp;
SELECT * FROM hot_emp;

-- 테이블 구조의 변경
-- alter table table_name {add(컬럼의 추가) | modify(컬럼의 수정) | drop(컬럼의 삭제)} 

-- 기존 테이블에 속성을 추가 : 각 행의 컬럼 데이터는 null 값으로 채워진다.
-- emp01 job 컬럼을 추가 job varchar2(10)
desc emp01;
alter table emp01 
add (deptno number(2))
;

-- 기존 테이블의 컬럼 변경 : 새롭게 정의된 컬럼으로 교체하는것
alter table emp01
MODIFY (deptno number(10))
;

-- 기존 테이블의 컬럼 삭제 : 데이터도 모두 삭제
alter table emp01
drop (deptno)
;

-- 제약 조건 정의
insert into dept values(10, 'test', 'seoul');

desc emp01;
insert into emp01 values(null, null, 1000, 'tester');
select * from emp01;

-- emp01 테이블 삭제
drop table emp01;
-- emp01테이블 새성 : empno, ename에 null 값이 들어가지 않도록 제약
create table emp01(
    empno number(4) not null,
    ename varchar2(10) not null,
    job varchar(9),
    deptno number(2)
);
insert into emp01 values(null, null, 'tester', 10);
insert into emp01 values(1, 'test1', 'tester', 10);
select * from emp01 where empno=1;

-- 데이터의 중복 금지 : unique
drop table emp02;
create table emp02(
    empno number(4) unique,
    ename varchar2(10) not null
);
desc emp02;
insert into emp02 values(1, 'test1');
insert into emp02 values(1, 'test2');
select * from emp02;

-- empno not null, unique 제약을 동시에 적용
drop table emp03;
create table emp03(
    empno number(4) not null unique,
    ename varchar2(10) not null
);
insert into emp03 values(null, 'test1');
insert into emp03 values(1, null);
insert into emp03 values(1, 'test1');
insert into emp03 values(1, 'test2');
insert into emp03 values(2, 'test2');
select * from emp03;

-- 기본키 제약 : 기본키 설정 -> not null, unique
drop table emp04;
create table emp04(
    empno number(4) primary key,
    ename varchar2(10) not null
);
insert into emp04 values (null, 'test');
insert into emp04 values (1, 'test');

-- 외래키 제약 : 참조하는 테이블과 컬럼을 정의
drop table emp05;
create table emp05(
    empno number(4) primary key ,
    ename varchar2(10) not null,
    deptno number(2) REFERENCES dept(deptno)
);

insert into emp05 values(1, 'test', 10);
insert into emp05 values(2, 'test', 60);
insert into emp05 values(2, 'test', null);

select * from dept;

-- check : 특정 범위 제한
drop table emp06;
create table emp06(
    empno number(4) primary key,
    ename varchar2(10) not null,
    sal number(7,2) CHECK (sal>=800)
);
insert into emp06 values(1, 'test', 1000);
insert into emp06 values(1, 'test', 799);


-- default : insert 시에 데이터가 입력되지 않을 때 자동으로 등록되는 데이터 정의
drop table emp07;
create table emp07(
    empno number(4) primary key,
    ename varchar2(10) not null,
    sal number(7,2) check (sal>=500),
    comm number(7,2) default 0,
    hiredate date default sysdate
);
insert into emp07 (empno, ename, sal) 
values (1, 'test', 3000);
select * from emp07;

-- 제약 조건에 이름 부여
drop table emp08;
create table emp08(
    empno number(4) constraint emp08_empno_PK  primary key,
    ename varchar2(10) constraint emp08_ename_NN not null,
    sal number(7,2) constraint emp08_sal_CK check (sal>=500),
    comm number(7,2) default 0,
    hiredate date default sysdate
);
insert into emp08 (empno, ename, sal) values (1, 'test', 3000);
select * from emp07;


-- 테이블 레벨에서 제약조건 정의
drop table emp09;
create table emp09(
    empno number(4),
    ename varchar2(10) not null,
    job varchar2(9),
    deptno number(10), -- 컬럼 정의 끝
    constraint emp09_empno_pk primary key (empno),
    constraint emp09_job_uk unique (job),
    constraint emp09_deptno_fk foreign key (deptno) references dept(deptno) -- 제약조건의 정의 끝
);

insert into emp09 values (null,null, 'job1', 50);
insert into emp09 values (1, 'tester', 'job1', 40);
insert into emp09 values (2, 'tester', 'job2', 40);
select * from emp09;


---------------------------------------------------------------------------
-- DML : 데이터의 삽입, 수정, 삭제
-- DML 의 대상은 행이다. 행단위 입력, 행단 위 수정, 행단위 삭제

-- 데이터 삽입
-- insert into table_name (데이터 저장할 컬럼들) values(저장할 데이터들)

-- dept01 테이블 생성
create table dept01
as
select * from dept where 1=2
;
insert into dept01 (deptno, dname, loc)
          values (10, '마케팅', '서울')
;
select * from dept01;

desc dept01;
insert into dept01 values (20, '디자인', '부산');

-- null 값의 입력
insert into dept01 (deptno, dname) values (30, 'QC');
insert into dept01 values (40, 'DEV', null);


-- 서브쿼리를 이용해서 데이터 입력
drop table dept02;
create table dept02
as
select * from dept where 1=2
;

select * from dept02;

insert into dept02
select * from dept
;


-- 데이터의 수정 
-- update table_name set culumn_name = value, ...,   where 행을 찾기위한 조건


drop table emp10;
create table emp10
as
select * from emp
;

select * from emp10;

-- 모든 사원의 부서번호를 30번으로 수정합시다.
update emp10 set deptno=30;

-- 이번엔 모든 사원의 급여를 10% 인상시키는 UPDATE 문을 보겠습니다.
update emp10
set sal = sal*1.1
;

-- 모든 사원의 입사일을 오늘로 수정하려면 다음과 같이 합니다.
update emp10
set hiredate = sysdate
;

-- 급여가 3000 이상인 사원만
-- 급여를 10% 인상합시다.
update emp10
set sal = sal*1.1
where sal>= 3000
;

-- 1987년에 입사한 사원의 
-- 입사일이 오늘로 수정합시다. 
-- 사원의 입사일을 오늘로 수정한 후에 테이블 내용을 살펴봅시다.
update emp10
set hiredate=sysdate
--where hiredate between '87/01/01' and '87/12/31'
where substr(hiredate,1,2)='87'
;
select * from emp10;
select * from emp10 where substr(hiredate,1,2)='87';

-- 전체 데이터를 삭제 DDL
truncate table emp10;
insert into emp10
select * from emp
;

-- SCOTT 사원의 부서번호는 20번으로, 직급은 MANAGER로 한꺼번에 수정하도록 합시다.
update emp10
set deptno=20, job='MANAGER'
where ename='SCOTT';

select * from emp10;

-- SCOTT 사원의 입사일자는 오늘로, 급여를 50 으로 커미션을 4000 으로 수정합시다.
update emp10
set sal=50, comm=4000
where ename='SCOTT'
;
select * from emp10 where ename='SCOTT';

-- 20번 부서의 지역명을 
-- 40번 부서의 지역명으로 
-- 변경하기 위해서 서브 쿼리문을 사용해 봅시다.
drop table dept01;
create table dept01
as
select * from dept
;

select * from dept01 where deptno=20;

update dept01
set loc=(select loc from dept01 where deptno=40)
where deptno=20
;

-- 부서 번호가 20번인 부서의 이름과 지역은 RESEARCH와 DALLAS입니다. 
-- 부서번호가 20인 부서의 부서명과 지역명을 
-- 부서 번호가 40번인 부서와 동일하게 변경하기 위한 UPDATE 명령문

update dept01
set dname=(select dname from dept01 where deptno=40), loc=(select loc from dept01 where deptno=40)
where deptno=20
;
update dept01
set (loc, dname) = (select loc, dname from dept01 where deptno=40)
where deptno=20
;

select * from dept01;

-- 테이블의 행 삭제 
-- delete from table_name  : 행단위 삭제, where 가 없으면 전체 행이 대상

-- dept01 테이블의 모든 데이터를 삭제
select * from dept01;
delete from dept01;

-- emp10
select * from emp10;

-- emp10 테이블의 데이터중  부서번호가 10번 부서의 사원들을 삭제
delete from emp10 where deptno=10;

-- 사원 테이블에서 부서명이 SALES인 사원을 모두 삭제해봅시다.
delete from emp10
where deptno=(
                select deptno from dept where dname='SALES'
)
;

rollback;

select * from emp10;





















