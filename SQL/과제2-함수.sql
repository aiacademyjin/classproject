-- 함수

-- 16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
-- substr(문자열 원본, 시작 인텍스, 개수)
-- '81/02/21' -> '81/02' -> 1,5

--select substr('81/02/21', 1,5)
--from dual;

select hiredate, substr(hiredate, 1,5)
from emp
;


​

​

​

​

-- 17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오. --> 80/04/01

select *--ename, hiredate, substr(hiredate, 4,2)
from emp
where substr(hiredate, 4,2)='04'
;

​

​

​

​

-- 18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.

--select mod(10,2)
--from dual;
select *
from emp
where mod(empno, 2)=0
;
​

​

​

​

-- 19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
-- to_char(날짜, 'YY MM DY')

select hiredate, to_char(hiredate, 'YY MM DY')
from emp
--where to_char(hiredate, 'YY')='81'
;

​

​

​

-- 20. 올해 몇 칠이 지났는지 출력하시오. 
--     현재 날짜에서 올해 1월 1일을 뺀 결과를 출력하고 
--     TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.

select sysdate, to_date('2020-01-01', 'YYYY-MM-DD'), round(sysdate-to_date('2020-01-01', 'YYYY-MM-DD'),0)
from dual
;

​

​

​

​

-- 21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
-- nvl(컬럼, 치환값)

select ename, nvl(mgr, 0) 
from emp
;

​

​

​

​

-- 22. DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 
--     직급이 ‘ANALYST”인 사원은 200, 
--           ‘SALESMAN’인 사원은 180, 
--           ‘MANAGER’인 사원은 150, 
--           ‘CLERK”인 사원은 100을 인상하시오.

select ename, sal, job,
        decode(job,
            'ANALYST', sal+200,
            'SALESMAN', sal+180,
            'MANAGER', sal+150,
            'CLERK', sal+100 ,
            'PRESIDENT', sal
        ) as upsal
from emp
;
​

​

​

​

​

-- 23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 
--     평균에 대해서는 정수로 반올림하시오.

select max(sal), min(sal), sum(sal), round(avg(sal),0)
from emp
;

​

​

​

​

-- 24. 각 담당 업무 유형별로
--     급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 
--     평균에 대해서는 정수로 반올림 하시오.

select job, max(sal), min(sal), sum(sal), round(avg(sal),0)
from emp
group by job
;

​

​

​

​

-- 25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.

select job, count(*)
from emp
group by job
order by job
;

​

​

​

​

-- 26. 관리자 수를 출력하시오.

select count(distinct mgr)
from emp
order by mgr
;

​

​

​

​

-- 27. 급여 최고액, 급여 최저액의 차액을 출력하시오.

select max(sal), min(sal), max(sal)-min(sal)
from emp
;

​

​

​

​

-- 28. 직급별 사원의 최저 급여를 출력하시오. 
--     관리자를 알 수 없는 사원과 -           where 에서 제외
--     최저 급여가 2000 미만인 그룹은 제외시키고    having 에서 조건
--     결과를 급여에 대한 내림차순으로 정렬하여 출력하시오.

select job, min(sal)
from emp
where mgr is not null
group by job
having min(sal)>=2000
order by min(sal) desc
;

​

​

​

​

-- 29. 각 부서에 대해 부서번호, 사원 수, 부서 내의 모든 사원의 평균 급여를 출력하시오.
--     평균 급여는 소수점 둘째 자리로 반올림 하시오.

select deptno, count(*), round(avg(sal),2)
from emp
group by deptno
;

​

​

​

​

-- 30. 각 부서에 대해 
--     부서번호 이름, 지역 명, 사원 수, 부서내의 모든 사원의 평균 급여를 출력하시오. 
--     평균 급여는 정수로 반올림 하시오. DECODE 사용. 부서명, 지역명

select deptno, 
        decode( deptno,
            10, 'ACCOUNTING',
            20, 'RESEARCH',
            30, 'SALES',
            40, 'OPERATIONS'
        ) AS DEPTNAME,
        DECODE( DEPTNO,
            10, 'NEW YORK',
            20, 'DALLAS',
            30, 'CHICAGO',
            40, 'BOSTON'            
        ) AS LOC,
        round(avg(sal),0) 
from emp
group by deptno
;

​

​

​

​

-- 31. 업무를 표시한 다음 해당 업무에 대해 부서 번호별   group by job, deptno
--     급여 및 부서 10, 20, 30의 급여 총액을 각각 출력하시오. 
--     별칭은 각 job, dno, 부서 10, 부서 20, 부서 30, 총액으로 지정하시오. 
--    ( hint. Decode, group by )

select job,--, deptno,
        decode(deptno, 10, sum(sal)) as "부서 10",
        decode(deptno, 20, sum(sal)) as "부서 20",
        decode(deptno, 30, sum(sal)) as "부서 30",
        sum(sal) as "총액"
from emp
group by job, deptno
order by deptno, job
;


