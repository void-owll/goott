-- member 라는 테이블을 만들어 보자.

CREATE TABLE member(
    memno NUMBER PRIMARY KEY,                   --회원 번호
    memid VARCHAR2 (20) NOT NULL,              --회원 ID
    memname VARCHAR2 (30) NOT NULL,        --회원 이름
    mempw VARCHAR2 (20) NOT NULL,            --회원 비밀번호
    age NUMBER,                                                --회원 나이
    mileage NUMBER,                                          --회원 마일리지
    job VARCHAR2 (30)  ,                                    --회원 직업
    addr VARCHAR2 (500),                                  --회원 주소
    regdate DATE NOT NULL                              --회원 가입일
 );
 
 commit;
 
 SELECT * FROM member;
 
 -- member 테이블에 회원의 정보를 저장해 보자.
INSERT INTO member VALUES(1,'id1','홍길동','1111',25,0,'학생','부산시 동래구','2013-08-08');
 
INSERT INTO member VALUES(2, 'kimkd', '김길동', '2222', 30, 1500, '회사원', '서울시 강남구', '2013-09-15');

INSERT INTO member VALUES(3, 'id3', '공성현', '3333', 33, 10000, '회사원', '부산시 중구', '2013-09-09');

INSERT INTO member VALUES(4,' kimyh', '김영희', '4444', 18, 3000, '학생', '경상남도 마산시', '2014-05-23');

INSERT INTO member VALUES(5, 'id5', '박말자', '5555', 45, 5000, '주부', '경기도 남양주시', '2013-12-01');

INSERT INTO member VALUES(6, 'id6', '김철수', '6666', 55, 0, '교수', '제주도 서귀포시', '2013-01-10');

UPDATE member SET memid='kimyh' WHERE memno=4;

INSERT INTO member VALUES(7, 'hong', '홍길동', '7777', 14, 0, '학생', '경상북도 경주시', '2013-12-25');

INSERT INTO member VALUES(8, 'id8', '김상현', '8888', 31, 0, '무직', '서울시 마포구', '2013-04-22');

INSERT INTO member VALUES(9, 'id9', '이지연', '9999', 25, 0, '학생', '강원도 강릉시', '2013-10-10');

INSERT INTO member VALUES(10, 'id10', '홍길동', '1010', 52, 10000, '무직', '서울시 강북구', '2013-09-15');

ROLLBACK;

-- 카테고리 테이블을 만들어 보자.

CREATE TABLE category(
    cnum NUMBER UNIQUE,                                         --카테고리 번호
    category_code VARCHAR2 (8),                               --카테고리 코드
    category_name VARCHAR2 (30) NOT NULL,
    PRIMARY KEY(category_code)                                --테이블 상 에서 PRIMARY KEY 지정.
);

-- 카테고리 테이블에 데이터를 저장해 보자.

INSERT INTO category VALUES (1, '00010000', '전자제품');
INSERT INTO category VALUES (2, '00010001', 'TV');
INSERT INTO category VALUES (3, '00010002', '컴퓨터');
INSERT INTO category VALUES (4, '00010003', '노트북');
INSERT INTO category VALUES (5, '00010004', '에어컨');
INSERT INTO category VALUES (6, '00020000', '의류제품');
INSERT INTO category VALUES (7, '00020001', '남방');
INSERT INTO category VALUES (8, '00020002', '속옷');
INSERT INTO category VALUES (9, '00020003', '바지');
INSERT INTO category VALUES (10, '00030000', '도서');
INSERT INTO category VALUES (11, '00030001', '컴퓨터도서');
INSERT INTO category VALUES (12, '00030002', '소설');
SELECT * FROM category;
rollback;

-- 상품 정보 테이블을 만들어 보자.
create table products(
    pnum number(11) primary key,                   -- 제품 번호
    category_fk varchar2(8) not null,              -- 카테고리 코드
    products_name varchar2(50) not null,           -- 제품명
    ep_code_fk varchar2(5) not null,               -- 제품 코드
    input_price number(10) default 0 not null,     -- 제품 입고 가격
    output_price number(10) default 0 not null,    -- 제품 출고 가격
    trans_cost number(5) default 0 not null,       -- 제품 배송비
    mileage number(6) default 0 not null,          -- 제품 마일리지
    company varchar2(30),                          -- 제품 제조사
    constraint category_ref foreign key(category_fk) 
        references category(category_code)
);

-- 제품 데이터를 저장해 보자.
insert into products
   values(1, '00010001', 'S 벽걸이 TV', '00001', 5000000, 8000000, 0, 100000, '삼성');
insert into products
   values(2, '00010001', 'L TV', '00002', 1000000, 1500000, 0, 50000, 'LG');
insert into products
   values(3, '00010004', 'S 에어컨', '00001', 1000000, 1100000, 5000, 100000, '삼성');
insert into products
   values(4, '00010000', 'C 밥솥', '00003', 200000, 220000, 5500, 0, '쿠쿠');
insert into products
   values(5, '00010004', 'L 에어컨', '00003', 1200000, 1300000, 0, 0, 'LG');
insert into products
   values(6, '00020001', '남성난방', '00002', 100000, 150000, 2500, 0, '');
insert into products
   values(7, '00020001', '여성난방', '00002', 120000, 200000, 0, 0, '');
insert into products
   values(8, '00020002', '사각팬티', '00002', 10000, 20000, 0, 0, '보디가드');
insert into products
   values(9, '00020003', '멜빵바지', '00002', 15000, 18000, 0, 0, '');
insert into products
   values(10, '00030001', '무따기 시리즈', '00001', 25000, 30000, 2000, 0, '길벗');
   
commit;
   
-- [문제1] member 테이블에서 회원의 이름과 나이, 직업을 화면에 보여주세요.
SELECT memname, age, job FROM member;
-- [문제2] products 테이블에서 제품명, 입고가, 출고가, 제조사를 화면에 보여주세요.
SELECT products_name, input_price, output_price, company FROM products;

-- KING 사원의 연봉은 60000 입니다.
-- || : 오라클에서 연결 연산자.

SELECT ename || ' 사원의 연봉은 ' || sal * 12 || ' 입니다.' AS "직원 연봉" FROM emp;

-- [문제] member 테이블의 내용을 아래와 같이 화면에 보여주세요.
-- > 홍길동 회원의 직업은 학생이고, 마일리지는 0 마일리지 입니다.

SELECT memname || ' 회원의 직업은 ' || job || '이고, 마일리지는 ' || mileage || ' 마일리지 입니다.' AS "회원의 마일리지" FROM member; --WHERE memno = 7;

-- 테이블을 삭제하는 방법
-- 형식) DROP TABLE 테이블이름 PURGE;

/*
    ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
        ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
            ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
    WHERE 조건절
    
    - 모든 데이터를 가지고 조회하는 것이 아니라 사용자가 원하는 데이터만 조회할 경우에 사용한다. 
    - WHERE 조건절은 자료를 필터링 할 때 사용되는 키워드.
    - WHERE 조건절은 FROM 테이블 이름 뒤에 가술해야 함.
    
    형식) SELECT 컬럼 FROM 테이블명 WHERE 조건식
    
    조건식에 들어가는 내용
    1) = : 조건이 같은지 여부 확인
    2) < : 조건이 작은지 여부 확인.
    3) <= : 조건이 작거나 같은지 여부 확인.
    4) > : 조건이 큰지 여부 확인.
    5) >= : 조건이 크거나 같은지 여부 확인.
    6) != : 조건이 같지 않은지 여부 확인.
    7) <> : 조건이 같지 않은지 여부 확인.  ==>  != 과 같은 의미.
    8) between A and B : A 와 B 사이에 있는지 여부 확인. == > A, B 값을 포함함.
    9) in(list) : list 값 중에 어느 하나와 일치하는지 여부 확인.
   10) not between A and B : A 와 B 사이에 있지 않은지 여부 확인.
         ==> A, B 값을 포함하지 않음.
   11) not in(list) : list 값과 일치하지 않는지 여부 확인.
*/

-- EMP 테이블에서 담당업무가 'MANAGER' 인 사원의 모든 정보를 보여주세요.

SELECT * FROM emp WHERE job = 'MANAGER';

-- EMP 테이블에서 담당업무가 'SALES' 인 사원의 모든 정보를 보여주세요.

SELECT * FROM emp WHERE job = 'SALESMAN';

-- [문제] emp 테이블에서 담당업무가 'CLERK' 인 사원의 사번, 이름, 담당업무, 급여를 화면에 보여주셍9ㅛ.

SELECT empno, ename, job, sal FROM emp WHERE job='CLERK';

-- [문제2] emp 테이블에서 1982년 1월 1일 이후에 입사한
-- 사원의 사번, 이름, 담당업무, 급여, 입사일자를 화면에 보여주세요.

SELECT empno, ename, job, sal, hiredate FROM emp where hiredate > '82-1-1';

--[문제3] emp 테이블에서 급여가 1300 ~ 1500 사이인 사원의 이름과 담당업무, 급여, 부서번호를 화면에 보여주세요.
SELECT ename, job, sal, deptno FROM emp WHERE sal BETWEEN 1300 AND 1500;

-- [문제4] emp 테이블에서 사번이 7902, 7788, 7566 인 사원의 사번, 이름, 담당업무를 화면에 보여주세요.
SELECT empno, ename, job FROM emp WHERE empno in (7902, 7788, 7566);

--[ 문제5] emp 테이블에서 보너스가 300 이거나 500 이거나 1400 인 사원의 모든 정보를 화면에 보여주세요.
SELECT * FROM emp WHERE comm in (300, 500, 1400);

-- [문제6] member 테이블에서 이름이 홍길동이면서 직업이 학생인 회원의 모든 정보를 화면에 보여주세요.
SELECT * FROM member WHERE memname = '홍길동' AND job = '학생';
SELECT * FROM member;

-- [문제7] products 테이블에서 제조사가 '삼성' 또는 '현대' 이면서 
--입고가가 100만원 이하인 상품의 상품명과 입고가 그리고 충고가를 화면에 보여주세요.
SELECT products_name, input_price, output_price FROM products WHERE company in ('삼성', '현대') and input_price <= 1000000 ;
SELECT products_name, input_price, output_price, company FROM products;
-- [문제8] emp 테이블에서 급여가 1100 이상이고, 담당업무가 'MANAGER'인 사원의 사번, 이름, 담당업무, 급여를 화면에 보여주세요.
SELECT empno, ename, job, sal FROM emp WHERE sal >= 1100 AND job = 'MANAGER';
SELECT empno, ename, job, sal FROM Emp;



/*
    ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
    like 키워드 : 검색을 하는 키워드.
    
    1) WHERE ename LIKE '%S%'
        ==> ename 컬럼에 S 자를 포함하는 사원의 이름을 검색.
       
    2) WHERE ename LIKE 'S%'
        ==>  ename 컬럼에 S 자로 시작하는 사원의 이름을 검색.
        
    3) WHERE ename LIKE '%S'
        ==> ename 컬럼에 S 자로 끝나는 사원의 이름을 검색.
        
    4) WHERE ename LIKE '_S%'
        ==> ename 컬럼에 두번째 글자가 S자를 포함하는 사원의 이름을 검색.
        
    
*/

-- emp 테이블에서 사원명에 'A' 라는 글자를 포함하는 사원의 모든 정보를 보여주세요.

SELECT * FROM emp WHERE ename LIKE '%A%';

-- [문제1] emp 테이블에서 사원명에 'M' 이라는 글자를 포함하는 사원의 모든 정보를 화면에 보여주세요.
SELECT * FROM emp WHERE ename LIKE '%M%';

-- [문제2] emp 테이블에서 사원명의 두번째 글자에 'I' 라는 글자를 포함하는 사원의 모든 정보를 화면에 보여주세요.
SELECT * FROM emp WHERE ename LIKE '_I%';

-- [문제3] emp 테이블에서 사원명에 이름이 'S' 라는 글자로 끝나는 사원의 사번과 이름, 담당업무, 부서번호를 화면에 보여주세요.
SELECT empno, ename, job, deptno FROM emp WHERE ename LIKE '%S';

--[문제4] emp 테이블에서 사원명의 세 번째 글자가 'R' 이라는 글자를 포함하는 사원의 이름과 담당업무, 급여를 화면에 보여주세요.
SELECT ename, job, sal FROM emp WHERE ename LIKE '__R%';

--[문제5] emp 테이블에서 사원명에 두 번째 글자가 'O' 이라는 글자를 포함하는 사원의 모든 정보를 화면에 보여주세요.
SELECT * FROM emp WHERE ename LIKE '_O%';

--[문제6] emp 테이블에서 입사년도가 82년도인 사원의 사번, 이름, 담당업무, 입사일자를 화면에 보여주세요.
SELECT empno, ename, job, hiredate FROM emp WHERE hiredate LIKE '82%';

--[문제7] member 테이블에서 성이 '김'씨 인 회원의 모든 정보를 화면에 보여주세요.
SELECT * FROM member WHERE memname LIKE '김%';

--[문제8] member 테이블에서 주소가 '서울시'가 들어가는 회원의 이름, 주소, 직업을 화면에 보여주세요.
SELECT memname, addr, job FROM member WHERE addr LIKE '서울시%';

--[문제9] products  테이블에서 제품명에 '에어컨'을 포함하는  제품의 제품명, 입고가, 출고가, 제조사를 화면에 보여주세요.
SELECT products_name, input_price, output_price, company FROM products WHERE products_name LIKE '%에어컨%';

/*
    ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
    ORDER BY 절
    - 자료를 정렬하여 표시할 때 사용하는 명령어.
    - ORDER BY 절을 사용할 때는 SELECT 구문의 맨 마지막에 위치해야 한다.
    
    SELECT 컬럼 AS 별칭 FROM 릴레이션 WHERE 조건 ORDER BY 정렬기준컬럼 (ASC/DESC)
    - ASC : 오름차순 정렬 (기본 값, 생략시 이것으로 적용)
    - DESC : 내림차순 정렬
*/

-- member 테이블에서 이름을 기준으로 오름차순으로 정렬을 하여 모든 정보를 화면에 보여주세요.

SELECT * FROM member ORDER BY memname, age DESC;

-- [문제1] emp 테이블에서 부서번호를 기준으로 오름차순 정렬을 하고, 부서번호가 같은 경우 급여를 기준으로 내림차순으로 정렬을 하여 화면에 보여주세요.
SELECT * FROM emp ORDER BY deptno, sal DESC, empno;

-- [문제2] products 테이블에서 판매가격을 기준으로 내림차순으로 정렬을 하여 모든 정보를 화면에 보여주세요.
SELECT * FROM products ORDER BY output_price DESC;

-- [문제3] products 테이블에서 배송비를 기준으로 내림차순으로 정렬하세요. 단, 배송비가 가은 경우 마일리지를 기준으로 내림차순으로 정렬하여 모든 정보를 화면에 보여주세요.
SELECT * FROM products ORDER BY trans_cost DESC, mileage DESC;

-- [문제4] emp 테이블에서 입사일자가 오래 된 사원부터  최근에 입사한 사원을 기준으로 정렬하되, 사원명, 입사일자를 화면에 보여주세요.
SELECT ename, hiredate FROM emp ORDER BY hiredate;

-- [문제5] emp 테이블에서 급여를 기준으로 내림차순으로 정렬을 하여 모든 정보를 화면에 보여주세요.
SELECT * FROM emp ORDER BY sal DESC;

-- [문제6] emp 테이블에서 급여가 1100 이상인 사원들의 정보를 보여주되, 입사일자가 빠른 순으로 정렬하여 화면에 보여주세요.
SELECT * FROM emp WHERE sal >= 1100 ORDER BY hiredate ;

-- [문제7] emp 테이블에서 부서번호를 기준으로 오름차순 정렬하여 나타내고, 부서번호가 같은 경우 담당업무를 기준으로 오름차순하여 정렬하세요.
--              만약 담당업무가 같다고 하면, 급여가 많은 데서 적은 순으로 정렬하여 화면에 보여주세요.
SELECT * FROM emp ORDER BY deptno, job, sal DESC;

/*
    NOT 키워드 : 부정
    - 부정을 처리하는 경우에는 일단은 긍정의 쿼리문을 작성하고 나서 NOT 을 붙인다.
    
    
*/

-- emp 테이블에서 담당업무가 'MANAGER', 'CLERK', 'ANALYST'가 아닌 사원의 사번,이름, 담당업무, 급여를 보여주세요.
SELECT empno, ename, job, sal FROM emp WHERE job NOT IN ('MANAGER', 'CLERK', 'ANALYST');

-- [문제1] emp 테이블에서 이름에 'S' 자가 들어가지 않는 사원의 이름과 담당업무를 화면에 보여주세요.
SELECT ename, job FROM emp WHERE ename NOT LIKE '%S%';

-- [문제2] emp 테이블에서 부서번호가 10번 부서가 아닌 사원의 이름, 담당어무, 부서번호를 화면에 보여주세요.
SELECT ename, job, deptno FROM emp WHERE NOT deptno =  10; -- WHERE deptno != 10;     WHERE deptno <> 10;

-- [문제3] member 테이블에서 주소가 '서울시'가 아닌 회원의 모든 정보를 화면에 보여주세요.
SELECT * FROM member WHERE addr NOT LIKE '%서울시%';

-- [문제4] products 테이블에서 출고가가 100만원 미만이 아닌 제품의 제품명과 출고가를 화면에 보여주세요.
SELECT products_name, output_price FROM products WHERE NOT output_price < 1000000;

-- [문제5] emp 테이블에서 보너스가 null이 아닌 사원의 모든 정보를 화면에 보여주세요.
SELECT * FROM emp WHERE comm IS NOT null;

/*
    ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
    
    - 사용자 계정을 만드는 방법
    - CREATE USER 사용자이름 IDENTIFIED BY 비밀번호;
    
    - 만들어진 계정을 사용하기 위해 권한을 설정을 해주셔야 한다.
    - GRANT CONNECT, RESOURCE TO 사용자계정명;
    
    - ROLE : 사용자에게 보다 효율적으로 권한을 부여할 수 있도록 여러 개의 권한을 묶어 놓은 것을 말함.
    
    - CONNECT ROLE : 
        ==> 오라클에 접속할 수 있는 세션 설정 및 사용자가 데이터베이스에 접속이 가능하도록 하기 위해서 가장 기본적인 시스템 권한을 묶어 놓은 것을 말함.
        
    - RESOURCE ROLE
        ==> 사용자가 테이블을 생성할 수 있도록 하기 위해서 시스템 권한을 묶어 놓은 것을 말함.
                또한 INSERT, UPDATE, DELETE  구문을 사용할 수 있는 권한을 묶어 놓은 것을 말함.
                
*/


/*
    그룹함수
    ==> 여러 행 또는 테이블 전체에 대하여 함수가 적용되어 하나의 결과값을 가져오는 함수.
    
    1) avg( ) : 평균값을 구하는 함수.
    2) count( ) : 행(레코드)의 갯수를 구하는 함수.
                       =->  null 값은 무시하고 행의 갯수를 구함.
    3) max( ) : 최대값을 구하는 함수.
    4) min( ) : 최소값을 구하는 함수. 
    5) sum( ) : 총 합을 구하는 함수.
    
*/

-- emp 테이블에서 사번을 가지고 있는 모든 사원의 수를 구하여 화면에 보여주세요.

SELECT count(empno) FROM emp;

-- [문제1] emp 테이블에서 관리자(mgr)의 수를 구하여 화면에 보여주세요.
SELECT count(DISTINCT mgr) FROM emp ;

-- [문제2] emp 테이블에서 보너스를 가진 사원의 수를 구하여 화면에 보여주세요.
SELECT count(comm) FROM emp;

-- [문제3] emp 테이블에서 모든 'SALESMAN'의 급여 평균과 급여 최고액, 급여 최저액, 급여 합계액을 구하여 화면에 보여주세요.
SELECT avg(sal), max(sal), min(sal), sum(sal) FROM emp WHERE job='SALESMAN';

-- [문제4] emp 테이블에서 등록되어 있는 사원의 총 수, 보너스가 NULL 이 아닌 사원 수, 보너스의 평균, 등록되어 있는 부서의 수를 구하여 화면에 보여주세요.
SELECT  count(*), count(comm), avg(comm), count(DISTINCT deptno)  FROM emp;