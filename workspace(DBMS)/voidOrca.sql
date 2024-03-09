-- SQL Developer 에서 한 줄 주석문

/*
    관계형 데이터베이스의 구성 요소
    
    1. 테이블
      - 관계형 데이터베이스는 기본적으로 데이터를 2차원 형태의
        표호 저장하고 관리함.
      - 이러한 표 형태의 데이터 저장 공간을 테이블(table) 이라고 함.
      - 테이블은 2차원 형태이므로 가로줄과 세로줄로 구성이 됨.
       * 가로줄 : 행(row)
       * 세로줄 : 열(column)
      
    2. 행
      - 행은 저장하려는 하나의 객체를 구성하는 값.
      - 예를 든다면 학생 한 사람에 대한 정보를 저장한 것.
    
    3. 열
      - 저장하는 데이터를 대표하는 이름과 공통 특성을 정의한 것.
      - 열은 저장 정보의 종류(자료형)과 자료형의 저장 가능한 최대 크기,
        중복 여부를 설정하게 됨.
*/

/*
    오라클에서 속성에 들어가는 주요 자료형(data type)
    1. number(n, n1) : 숫자 자료형 (정수, 실수)
      * n : 전체 자릿수
      * n1 : 소숫점 자릿수
      * n ~ n1 : 정수 자릿수
       예) number(7,2) : 전체 자릿수는 7자리이고, 
                         정수는 5자리,
                         소수 자릿수는 2자리. 
    2. char(n) : 문자열 n개가 저장되는 자료형.  ==> 고정 자료형.
    3. varchar(n) : 문자열 n개가 저장되는 자료형. ==> 가변 자료형.
                    * 현재 오라클에서는 사용하지 않는 자료형.
    4. varchar2(n) : 문자열 n개가 저장되는 자료형. ==> 가변 자료형.
                     * 한글은 무조건 한 글자당 2바이트씩 사용됨.
    5. date : 날짜가 저장되는 자료형. ==> 시스템의 현재 날짜 및 시간이 저장됨.
*/

/*
    무결성(Integrity) : 데이터베이스에 저장된 값과 그것이 표현하는 
                       현실 세계의 실제 값이 일치하는 정확성을 의미함.
    무결성 제약조건 : 데이터베이스에 저장된 데이터의 정확성을 보장하기 위해서 
                    정확하지 않는 데이터가 데이베이스 내에 저장되는 것을 
                    방지하기 위한 조건.
                    
    데이터베이스 내에서 사용되는 무결성 제약조건의 종류
    1. unique 제약 조건
       ==> 중복이 되면 안 되는 제약 조건.
    2. not null 제약 조건
       ==> 공백(null) 을 허용하지 않는 제약 조건.
    3. check 제약 조건
       ==> 특정한 값이 아닌 데이터가 들어오지 못하게 하는 제약 조건.
    4. 기본키(primary key) 제약 조건
       ==> unique + not null 제약 조건.
       ==> 기본 키는 해당 테이블을 대표하는 컬럼으로써의 역할을 수행하며,
           다른 테이블에서 외래키들이 참조할 수 있는 키로써의 자격을 가짐.
    5. 외래키(foreign key) 제약 조건
       ==> 외래키는 다른 테이블의 기본 키(primary key)를 참조하는 컬럼의 집합임.
           여기서의 외래 키 값은 참조하고 있는 테이블의 기본 키에 없는 내용을 참조할 수 없음.
           이를 참조 무결성(Reference integrity) 라고 함.
*/
   

/*
    학생 테이블을 만들어 보자.
    
    구성 요소(컬럼 - 속성)
    ==> 학번, 이름, 학과, 연락처, 주소, 재학여부, 등록일(입학일) 등등
    
    형식) 
        CREATE TABLE 테이블이름(
            학번 자료형(크기) [제약조건],
            이름 자료형(크기) [제약조건],
            학과 자료형(크기) [제약조건],
            연락처 자료형(크기) [제약조건],
            주소 자료형(크기) [제약조건],
            재학여부 자료형(크기) [제약조건],
            등록일 자료형(크기) [제약조건]
        );
*/

CREATE TABLE student(
    hakbun VARCHAR2(10) PRIMARY KEY,
    name VARCHAR2(30) NOT NULL,
    major VARCHAR2(40),
    phone VARCHAR2(15) NOT NULL UNIQUE,
    addr VARCHAR2(200),
    status VARCHAR2(1),
    regdate date NOT NULL, 
    CONSTRAINT status_chk CHECK(status IN('Y', 'N'))
);

-- student 테이블에 데이터(학생 정보)를 추가해 보자.
-- 형식1)
--      INSERT INTO 테이블이름 VALUES( 컬럼1데이터, 컬럼2데이터, 컬럼3데이터... );
INSERT INTO student VALUES ('2024_001', '홍길동', '경제학과', 
                            '010-1111-1234', '서울시 구로구', 'Y', sysdate);
-- 형식2)
--      INSERT INTO 테이블이름(NOT NULL 제약조건 컬럼명) VALUES()
INSERT INTO student(hakbun, name, phone, regdate) 
    VALUES('2024_002', '세종대왕', '010-3222-2334', sysdate);

commit;

INSERT INTO student VALUES ('2024_003', '김유신', '전쟁학과', '010-2222-2222', '서울시 강남구', 'N', sysdate);

INSERT INTO student(hakbun, name, phone, status, regdate) VALUES ('2024_004', '유관순', '010-3152-5221', 'Y', sysdate);

INSERT INTO student VALUES ('2024_005', '곽재우', '전쟁학과', '010-9999-9876', '경기도 시흥시', 'Y', SYSDATE);

INSERT INTO student VALUES ('2024_006', '오킹', '코인사기학과', '010-5545-6543', '충북 제천시', 'N', SYSDATE);

commit;

CREATE TABLE major(
    major VARCHAR2(20) PRIMARY KEY,
    professor VARCHAR2(15) NOT NULL,
    room VARCHAR2(20) NOT NULL
    );
    
INSERT INTO major VALUES('전쟁학과','전쟁광','L-201');
INSERT INTO major VALUES('코인사기학과', '위너스', 'C-01N');
INSERT INTO major VALUES('경제학과','김노잼','2-C0N0MY');
commit;

/*
    만약에 Table에 Column을 추가해야 하는 경우
    형식) ALTER TABLE 테이블이름 ADD(추가할컬럼명 자료형(크기) 제약조건);
*/

ALTER TABLE student ADD(age number);

DROP TABLE major PURGE;
-- PURGE 명령어 : 싸그리 삭제(남김없이)

-- 테이블의 컬럼을 수정하는 방법(컬럼의 전체적인 내용 수정)
-- 형식) ALTER TABLE 테이블이름 MODIFY(수정할컬럼명 자료형(크기) [제약조건]);
ALTER TABLE student MODIFY(age VARCHAR2(3));

-- 테이블의 컬럼명을 변경해야 하는 경우
-- 형식) ALTER TABLE 테이블이름 RENAME COLUMN 기존컬럼명 TO 새컬럼명;
ALTER TABLE student RENAME COLUMN name TO irum;

-- 테이블의 컬럼을 삭제해야 하는 경우
-- 형식) ALTER TABLE 테이블이름 DROP COLUMN 삭제할컬럼명;
ALTER TABLE student DROP COLUMN age;

/*
    1. DDL - Data Definition Language : 데이터 정의어
        - CREATE : 데이터베이스 또는 테이블을 생성하는 명령어
        - ALTER : 테이블을 수정하는 명령어
        - DROP : 데이터베이스 또는 테이블을 삭제하는 명령어
        - TRUNCATE : 테이블을 초기화하는 명령어

    2. DML - Data Manipulation Language : 데이터 조작어
        ==> 데이터베이스에서 가장 많이 사용하는 명령어.
        - SELECT : 데이터를 검색하는 명령어 (VIEW 를 생성함)
        - INSERT : 데이터를 추가하는 명령어
        - UPDATE : 데이터를 수정하는 명령어
        - DELETE : 데이터를 삭제하는 명령어
        
    3. DCL - Data Control Language : 데이터 제어어
        - GRANT : 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 부여하는 명령어
        - REVOKE : 특정 데이터베이스 사용자에게 작업의 특정 수행 권한을 회수하는 명령어
        - COMMIT : 트랜잭션 작업을 완료하는 명령어.
        - ROLLBACK : 트랜잭션 작업을 취소하거나 이전 상태로 복구하는 역할을 하는 명령어
*/

-- 데이터를 수정하는 방법
-- 형식) UPDATE 테이블이름 SET 수정할컬럼명 = 값, 수정할컬럼명 = 값....
--                  WHERE 기본키컬럼명 = 값;
UPDATE student SET major = '코인사기학과', addr = '서울시 중구', status = 'Y' WHERE hakbun = '2024_003';


UPDATE student SET major = '코인사기학과', addr = '위너스', status = 'N' 
WHERE hakbun = '2024_001';


-- 데이터를 삭제하는 방법
-- 형식) DELETE FROM 테이블이름 WHERE 기본키컬럼명 = 값;
DELETE FROM student WHERE hakbun = '2024_004';


-- 데이터를 검색하는 명령어
-- STUDENT 테이블에 있는 모든 데이터를 화면에 보여주세요.
-- 형식) SELECT * FROM 테이블이름;
SELECT * FROM student;

-- [문제1] EMP 테이블에서 empno, ename, job, deptno 컬럼을 화면에 보여주세요.
SELECT empno, ename, job, deptno FROM emp;

SELECT hakbun,irum FROM student WHERE major = '코인사기학과';

-- [문제2] emp 테이블에서 이름, 입사일, 급여를 화면에 보여주세요.
SELECT ename, hiredate, sal FROM emp;
-- [문제3] emp 테이블에서 사번, 이름, 담당업무, 보너스를 화면에 보여주세요.
SELECT empno, ename, job, comm FROM emp;
-- [문제4] emp 테이블에서 사번, 이름, 급여, 보너스, 급여 + 보너스 결과를 화면에 보여주세요.
SELECT empno, ename, sal, comm, comm+sal FROM emp;
-- NULL 값을 가지는 컬럼은 다른 컬럼과 연산을 하면 모두 NULL 로 처리된다.
-- NULL 을 처리해 주는 함수 : nvl() 함수 ==> null 값을 특정한 값으로 변경시켜주는 함수.
--                                                                     모든 자료형에 적용이 가능한 것이 특징.
--                                                                      nvl 함수를 사용할 때에는 전환되는 값의 자료형을 일치시켜 주어야 함.
-- UPDATE emp SET comm = 0 where COMM IS NULL;   대신에 아래처럼 쓴다.
-- nvl(null값이들어가있는컬럼명, 변경할값)
SELECT empno, ename, sal, comm, sal + nvl(comm,0) FROM emp;
-- nvl2() 함수 : 자바에서의 3항 연산자와 비슷한 함수.
-- 형식) nvl2(컬럼명, expr1, expr2)
--           ==> 컬럼에 들어 있는 값이 NULL 이 아니면 expr1 값을 반환, NULL 이면 expr2
SELECT empno, ename, sal, comm, sal + nvl2(comm, comm, 0) FROM emp;

-- AS 키워드 : 컬럼의 제목(title)의 이름을 변경시키는 키워드. 별명 또는 별칭이라고 함.
--                   보통 별칭은 ""(쌍따옴표) 안에 작성을 함. 
--                   AS 라는 키워드를 생략해도 됨.
SELECT empno, ename, sal, comm, sal + nvl2(comm, comm, 0) "총 급여" FROM emp;

SELECT * FROM emp;

--[문제5] emp 테이블에서 사번, 이름, 급여, 급여의 10% 인상액을 화면에 보여주세요.

SELECT empno, ename, sal, (sal*1.1) "인상액" FROM emp;

--emp 테이블에서 각 사원의 담당업무를 화면에 보여주세요.
SELECT job FROM emp;

--emp 테이블에서 각 사원의 관리자를 화면에 보여주세요.
SELECT mgr FROM emp;

/*
    distinct 키워드 : 중복을 제거해주는 명령어(키워드)
    - 주로 하나의 컬럼에서 중복된 값을 제거하고 보여줄 때 사용함.
    - distinct 키워드는 항상 select 키워드 다음에 기술한다.
    - distinct 키워드 뒤에 나오는 컬럼들은 모두 distinct의 영향을 받는다.
    - distinct 키워드 뒤에 여러 개의 컬럼이 기술이 되면 해당 컬럼들은 중복이 되지 않게 나타난다.
*/