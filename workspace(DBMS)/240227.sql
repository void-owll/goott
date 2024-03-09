-- member ��� ���̺��� ����� ����.

CREATE TABLE member(
    memno NUMBER PRIMARY KEY,                   --ȸ�� ��ȣ
    memid VARCHAR2 (20) NOT NULL,              --ȸ�� ID
    memname VARCHAR2 (30) NOT NULL,        --ȸ�� �̸�
    mempw VARCHAR2 (20) NOT NULL,            --ȸ�� ��й�ȣ
    age NUMBER,                                                --ȸ�� ����
    mileage NUMBER,                                          --ȸ�� ���ϸ���
    job VARCHAR2 (30)  ,                                    --ȸ�� ����
    addr VARCHAR2 (500),                                  --ȸ�� �ּ�
    regdate DATE NOT NULL                              --ȸ�� ������
 );
 
 commit;
 
 SELECT * FROM member;
 
 -- member ���̺� ȸ���� ������ ������ ����.
INSERT INTO member VALUES(1,'id1','ȫ�浿','1111',25,0,'�л�','�λ�� ������','2013-08-08');
 
INSERT INTO member VALUES(2, 'kimkd', '��浿', '2222', 30, 1500, 'ȸ���', '����� ������', '2013-09-15');

INSERT INTO member VALUES(3, 'id3', '������', '3333', 33, 10000, 'ȸ���', '�λ�� �߱�', '2013-09-09');

INSERT INTO member VALUES(4,' kimyh', '�迵��', '4444', 18, 3000, '�л�', '��󳲵� �����', '2014-05-23');

INSERT INTO member VALUES(5, 'id5', '�ڸ���', '5555', 45, 5000, '�ֺ�', '��⵵ �����ֽ�', '2013-12-01');

INSERT INTO member VALUES(6, 'id6', '��ö��', '6666', 55, 0, '����', '���ֵ� ��������', '2013-01-10');

UPDATE member SET memid='kimyh' WHERE memno=4;

INSERT INTO member VALUES(7, 'hong', 'ȫ�浿', '7777', 14, 0, '�л�', '���ϵ� ���ֽ�', '2013-12-25');

INSERT INTO member VALUES(8, 'id8', '�����', '8888', 31, 0, '����', '����� ������', '2013-04-22');

INSERT INTO member VALUES(9, 'id9', '������', '9999', 25, 0, '�л�', '������ ������', '2013-10-10');

INSERT INTO member VALUES(10, 'id10', 'ȫ�浿', '1010', 52, 10000, '����', '����� ���ϱ�', '2013-09-15');

ROLLBACK;

-- ī�װ� ���̺��� ����� ����.

CREATE TABLE category(
    cnum NUMBER UNIQUE,                                         --ī�װ� ��ȣ
    category_code VARCHAR2 (8),                               --ī�װ� �ڵ�
    category_name VARCHAR2 (30) NOT NULL,
    PRIMARY KEY(category_code)                                --���̺� �� ���� PRIMARY KEY ����.
);

-- ī�װ� ���̺� �����͸� ������ ����.

INSERT INTO category VALUES (1, '00010000', '������ǰ');
INSERT INTO category VALUES (2, '00010001', 'TV');
INSERT INTO category VALUES (3, '00010002', '��ǻ��');
INSERT INTO category VALUES (4, '00010003', '��Ʈ��');
INSERT INTO category VALUES (5, '00010004', '������');
INSERT INTO category VALUES (6, '00020000', '�Ƿ���ǰ');
INSERT INTO category VALUES (7, '00020001', '����');
INSERT INTO category VALUES (8, '00020002', '�ӿ�');
INSERT INTO category VALUES (9, '00020003', '����');
INSERT INTO category VALUES (10, '00030000', '����');
INSERT INTO category VALUES (11, '00030001', '��ǻ�͵���');
INSERT INTO category VALUES (12, '00030002', '�Ҽ�');
SELECT * FROM category;
rollback;

-- ��ǰ ���� ���̺��� ����� ����.
create table products(
    pnum number(11) primary key,                   -- ��ǰ ��ȣ
    category_fk varchar2(8) not null,              -- ī�װ� �ڵ�
    products_name varchar2(50) not null,           -- ��ǰ��
    ep_code_fk varchar2(5) not null,               -- ��ǰ �ڵ�
    input_price number(10) default 0 not null,     -- ��ǰ �԰� ����
    output_price number(10) default 0 not null,    -- ��ǰ ��� ����
    trans_cost number(5) default 0 not null,       -- ��ǰ ��ۺ�
    mileage number(6) default 0 not null,          -- ��ǰ ���ϸ���
    company varchar2(30),                          -- ��ǰ ������
    constraint category_ref foreign key(category_fk) 
        references category(category_code)
);

-- ��ǰ �����͸� ������ ����.
insert into products
   values(1, '00010001', 'S ������ TV', '00001', 5000000, 8000000, 0, 100000, '�Ｚ');
insert into products
   values(2, '00010001', 'L TV', '00002', 1000000, 1500000, 0, 50000, 'LG');
insert into products
   values(3, '00010004', 'S ������', '00001', 1000000, 1100000, 5000, 100000, '�Ｚ');
insert into products
   values(4, '00010000', 'C ���', '00003', 200000, 220000, 5500, 0, '����');
insert into products
   values(5, '00010004', 'L ������', '00003', 1200000, 1300000, 0, 0, 'LG');
insert into products
   values(6, '00020001', '��������', '00002', 100000, 150000, 2500, 0, '');
insert into products
   values(7, '00020001', '��������', '00002', 120000, 200000, 0, 0, '');
insert into products
   values(8, '00020002', '�簢��Ƽ', '00002', 10000, 20000, 0, 0, '���𰡵�');
insert into products
   values(9, '00020003', '�ủ����', '00002', 15000, 18000, 0, 0, '');
insert into products
   values(10, '00030001', '������ �ø���', '00001', 25000, 30000, 2000, 0, '���');
   
commit;
   
-- [����1] member ���̺��� ȸ���� �̸��� ����, ������ ȭ�鿡 �����ּ���.
SELECT memname, age, job FROM member;
-- [����2] products ���̺��� ��ǰ��, �԰�, ���, �����縦 ȭ�鿡 �����ּ���.
SELECT products_name, input_price, output_price, company FROM products;

-- KING ����� ������ 60000 �Դϴ�.
-- || : ����Ŭ���� ���� ������.

SELECT ename || ' ����� ������ ' || sal * 12 || ' �Դϴ�.' AS "���� ����" FROM emp;

-- [����] member ���̺��� ������ �Ʒ��� ���� ȭ�鿡 �����ּ���.
-- > ȫ�浿 ȸ���� ������ �л��̰�, ���ϸ����� 0 ���ϸ��� �Դϴ�.

SELECT memname || ' ȸ���� ������ ' || job || '�̰�, ���ϸ����� ' || mileage || ' ���ϸ��� �Դϴ�.' AS "ȸ���� ���ϸ���" FROM member; --WHERE memno = 7;

-- ���̺��� �����ϴ� ���
-- ����) DROP TABLE ���̺��̸� PURGE;

/*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
        �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
            �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    WHERE ������
    
    - ��� �����͸� ������ ��ȸ�ϴ� ���� �ƴ϶� ����ڰ� ���ϴ� �����͸� ��ȸ�� ��쿡 ����Ѵ�. 
    - WHERE �������� �ڷḦ ���͸� �� �� ���Ǵ� Ű����.
    - WHERE �������� FROM ���̺� �̸� �ڿ� �����ؾ� ��.
    
    ����) SELECT �÷� FROM ���̺�� WHERE ���ǽ�
    
    ���ǽĿ� ���� ����
    1) = : ������ ������ ���� Ȯ��
    2) < : ������ ������ ���� Ȯ��.
    3) <= : ������ �۰ų� ������ ���� Ȯ��.
    4) > : ������ ū�� ���� Ȯ��.
    5) >= : ������ ũ�ų� ������ ���� Ȯ��.
    6) != : ������ ���� ������ ���� Ȯ��.
    7) <> : ������ ���� ������ ���� Ȯ��.  ==>  != �� ���� �ǹ�.
    8) between A and B : A �� B ���̿� �ִ��� ���� Ȯ��. == > A, B ���� ������.
    9) in(list) : list �� �߿� ��� �ϳ��� ��ġ�ϴ��� ���� Ȯ��.
   10) not between A and B : A �� B ���̿� ���� ������ ���� Ȯ��.
         ==> A, B ���� �������� ����.
   11) not in(list) : list ���� ��ġ���� �ʴ��� ���� Ȯ��.
*/

-- EMP ���̺��� �������� 'MANAGER' �� ����� ��� ������ �����ּ���.

SELECT * FROM emp WHERE job = 'MANAGER';

-- EMP ���̺��� �������� 'SALES' �� ����� ��� ������ �����ּ���.

SELECT * FROM emp WHERE job = 'SALESMAN';

-- [����] emp ���̺��� �������� 'CLERK' �� ����� ���, �̸�, ������, �޿��� ȭ�鿡 �����ּ�9��.

SELECT empno, ename, job, sal FROM emp WHERE job='CLERK';

-- [����2] emp ���̺��� 1982�� 1�� 1�� ���Ŀ� �Ի���
-- ����� ���, �̸�, ������, �޿�, �Ի����ڸ� ȭ�鿡 �����ּ���.

SELECT empno, ename, job, sal, hiredate FROM emp where hiredate > '82-1-1';

--[����3] emp ���̺��� �޿��� 1300 ~ 1500 ������ ����� �̸��� ������, �޿�, �μ���ȣ�� ȭ�鿡 �����ּ���.
SELECT ename, job, sal, deptno FROM emp WHERE sal BETWEEN 1300 AND 1500;

-- [����4] emp ���̺��� ����� 7902, 7788, 7566 �� ����� ���, �̸�, �������� ȭ�鿡 �����ּ���.
SELECT empno, ename, job FROM emp WHERE empno in (7902, 7788, 7566);

--[ ����5] emp ���̺��� ���ʽ��� 300 �̰ų� 500 �̰ų� 1400 �� ����� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE comm in (300, 500, 1400);

-- [����6] member ���̺��� �̸��� ȫ�浿�̸鼭 ������ �л��� ȸ���� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM member WHERE memname = 'ȫ�浿' AND job = '�л�';
SELECT * FROM member;

-- [����7] products ���̺��� �����簡 '�Ｚ' �Ǵ� '����' �̸鼭 
--�԰��� 100���� ������ ��ǰ�� ��ǰ��� �԰� �׸��� ����� ȭ�鿡 �����ּ���.
SELECT products_name, input_price, output_price FROM products WHERE company in ('�Ｚ', '����') and input_price <= 1000000 ;
SELECT products_name, input_price, output_price, company FROM products;
-- [����8] emp ���̺��� �޿��� 1100 �̻��̰�, �������� 'MANAGER'�� ����� ���, �̸�, ������, �޿��� ȭ�鿡 �����ּ���.
SELECT empno, ename, job, sal FROM emp WHERE sal >= 1100 AND job = 'MANAGER';
SELECT empno, ename, job, sal FROM Emp;



/*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    like Ű���� : �˻��� �ϴ� Ű����.
    
    1) WHERE ename LIKE '%S%'
        ==> ename �÷��� S �ڸ� �����ϴ� ����� �̸��� �˻�.
       
    2) WHERE ename LIKE 'S%'
        ==>  ename �÷��� S �ڷ� �����ϴ� ����� �̸��� �˻�.
        
    3) WHERE ename LIKE '%S'
        ==> ename �÷��� S �ڷ� ������ ����� �̸��� �˻�.
        
    4) WHERE ename LIKE '_S%'
        ==> ename �÷��� �ι�° ���ڰ� S�ڸ� �����ϴ� ����� �̸��� �˻�.
        
    
*/

-- emp ���̺��� ����� 'A' ��� ���ڸ� �����ϴ� ����� ��� ������ �����ּ���.

SELECT * FROM emp WHERE ename LIKE '%A%';

-- [����1] emp ���̺��� ����� 'M' �̶�� ���ڸ� �����ϴ� ����� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE ename LIKE '%M%';

-- [����2] emp ���̺��� ������� �ι�° ���ڿ� 'I' ��� ���ڸ� �����ϴ� ����� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE ename LIKE '_I%';

-- [����3] emp ���̺��� ����� �̸��� 'S' ��� ���ڷ� ������ ����� ����� �̸�, ������, �μ���ȣ�� ȭ�鿡 �����ּ���.
SELECT empno, ename, job, deptno FROM emp WHERE ename LIKE '%S';

--[����4] emp ���̺��� ������� �� ��° ���ڰ� 'R' �̶�� ���ڸ� �����ϴ� ����� �̸��� ������, �޿��� ȭ�鿡 �����ּ���.
SELECT ename, job, sal FROM emp WHERE ename LIKE '__R%';

--[����5] emp ���̺��� ����� �� ��° ���ڰ� 'O' �̶�� ���ڸ� �����ϴ� ����� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE ename LIKE '_O%';

--[����6] emp ���̺��� �Ի�⵵�� 82�⵵�� ����� ���, �̸�, ������, �Ի����ڸ� ȭ�鿡 �����ּ���.
SELECT empno, ename, job, hiredate FROM emp WHERE hiredate LIKE '82%';

--[����7] member ���̺��� ���� '��'�� �� ȸ���� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM member WHERE memname LIKE '��%';

--[����8] member ���̺��� �ּҰ� '�����'�� ���� ȸ���� �̸�, �ּ�, ������ ȭ�鿡 �����ּ���.
SELECT memname, addr, job FROM member WHERE addr LIKE '�����%';

--[����9] products  ���̺��� ��ǰ�� '������'�� �����ϴ�  ��ǰ�� ��ǰ��, �԰�, ���, �����縦 ȭ�鿡 �����ּ���.
SELECT products_name, input_price, output_price, company FROM products WHERE products_name LIKE '%������%';

/*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    ORDER BY ��
    - �ڷḦ �����Ͽ� ǥ���� �� ����ϴ� ��ɾ�.
    - ORDER BY ���� ����� ���� SELECT ������ �� �������� ��ġ�ؾ� �Ѵ�.
    
    SELECT �÷� AS ��Ī FROM �����̼� WHERE ���� ORDER BY ���ı����÷� (ASC/DESC)
    - ASC : �������� ���� (�⺻ ��, ������ �̰����� ����)
    - DESC : �������� ����
*/

-- member ���̺��� �̸��� �������� ������������ ������ �Ͽ� ��� ������ ȭ�鿡 �����ּ���.

SELECT * FROM member ORDER BY memname, age DESC;

-- [����1] emp ���̺��� �μ���ȣ�� �������� �������� ������ �ϰ�, �μ���ȣ�� ���� ��� �޿��� �������� ������������ ������ �Ͽ� ȭ�鿡 �����ּ���.
SELECT * FROM emp ORDER BY deptno, sal DESC, empno;

-- [����2] products ���̺��� �ǸŰ����� �������� ������������ ������ �Ͽ� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM products ORDER BY output_price DESC;

-- [����3] products ���̺��� ��ۺ� �������� ������������ �����ϼ���. ��, ��ۺ� ���� ��� ���ϸ����� �������� ������������ �����Ͽ� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM products ORDER BY trans_cost DESC, mileage DESC;

-- [����4] emp ���̺��� �Ի����ڰ� ���� �� �������  �ֱٿ� �Ի��� ����� �������� �����ϵ�, �����, �Ի����ڸ� ȭ�鿡 �����ּ���.
SELECT ename, hiredate FROM emp ORDER BY hiredate;

-- [����5] emp ���̺��� �޿��� �������� ������������ ������ �Ͽ� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp ORDER BY sal DESC;

-- [����6] emp ���̺��� �޿��� 1100 �̻��� ������� ������ �����ֵ�, �Ի����ڰ� ���� ������ �����Ͽ� ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE sal >= 1100 ORDER BY hiredate ;

-- [����7] emp ���̺��� �μ���ȣ�� �������� �������� �����Ͽ� ��Ÿ����, �μ���ȣ�� ���� ��� �������� �������� ���������Ͽ� �����ϼ���.
--              ���� �������� ���ٰ� �ϸ�, �޿��� ���� ���� ���� ������ �����Ͽ� ȭ�鿡 �����ּ���.
SELECT * FROM emp ORDER BY deptno, job, sal DESC;

/*
    NOT Ű���� : ����
    - ������ ó���ϴ� ��쿡�� �ϴ��� ������ �������� �ۼ��ϰ� ���� NOT �� ���δ�.
    
    
*/

-- emp ���̺��� �������� 'MANAGER', 'CLERK', 'ANALYST'�� �ƴ� ����� ���,�̸�, ������, �޿��� �����ּ���.
SELECT empno, ename, job, sal FROM emp WHERE job NOT IN ('MANAGER', 'CLERK', 'ANALYST');

-- [����1] emp ���̺��� �̸��� 'S' �ڰ� ���� �ʴ� ����� �̸��� �������� ȭ�鿡 �����ּ���.
SELECT ename, job FROM emp WHERE ename NOT LIKE '%S%';

-- [����2] emp ���̺��� �μ���ȣ�� 10�� �μ��� �ƴ� ����� �̸�, ���, �μ���ȣ�� ȭ�鿡 �����ּ���.
SELECT ename, job, deptno FROM emp WHERE NOT deptno =  10; -- WHERE deptno != 10;     WHERE deptno <> 10;

-- [����3] member ���̺��� �ּҰ� '�����'�� �ƴ� ȸ���� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM member WHERE addr NOT LIKE '%�����%';

-- [����4] products ���̺��� ����� 100���� �̸��� �ƴ� ��ǰ�� ��ǰ��� ����� ȭ�鿡 �����ּ���.
SELECT products_name, output_price FROM products WHERE NOT output_price < 1000000;

-- [����5] emp ���̺��� ���ʽ��� null�� �ƴ� ����� ��� ������ ȭ�鿡 �����ּ���.
SELECT * FROM emp WHERE comm IS NOT null;

/*
    �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
    
    - ����� ������ ����� ���
    - CREATE USER ������̸� IDENTIFIED BY ��й�ȣ;
    
    - ������� ������ ����ϱ� ���� ������ ������ ���ּž� �Ѵ�.
    - GRANT CONNECT, RESOURCE TO ����ڰ�����;
    
    - ROLE : ����ڿ��� ���� ȿ�������� ������ �ο��� �� �ֵ��� ���� ���� ������ ���� ���� ���� ����.
    
    - CONNECT ROLE : 
        ==> ����Ŭ�� ������ �� �ִ� ���� ���� �� ����ڰ� �����ͺ��̽��� ������ �����ϵ��� �ϱ� ���ؼ� ���� �⺻���� �ý��� ������ ���� ���� ���� ����.
        
    - RESOURCE ROLE
        ==> ����ڰ� ���̺��� ������ �� �ֵ��� �ϱ� ���ؼ� �ý��� ������ ���� ���� ���� ����.
                ���� INSERT, UPDATE, DELETE  ������ ����� �� �ִ� ������ ���� ���� ���� ����.
                
*/


/*
    �׷��Լ�
    ==> ���� �� �Ǵ� ���̺� ��ü�� ���Ͽ� �Լ��� ����Ǿ� �ϳ��� ������� �������� �Լ�.
    
    1) avg( ) : ��հ��� ���ϴ� �Լ�.
    2) count( ) : ��(���ڵ�)�� ������ ���ϴ� �Լ�.
                       =->  null ���� �����ϰ� ���� ������ ����.
    3) max( ) : �ִ밪�� ���ϴ� �Լ�.
    4) min( ) : �ּҰ��� ���ϴ� �Լ�. 
    5) sum( ) : �� ���� ���ϴ� �Լ�.
    
*/

-- emp ���̺��� ����� ������ �ִ� ��� ����� ���� ���Ͽ� ȭ�鿡 �����ּ���.

SELECT count(empno) FROM emp;

-- [����1] emp ���̺��� ������(mgr)�� ���� ���Ͽ� ȭ�鿡 �����ּ���.
SELECT count(DISTINCT mgr) FROM emp ;

-- [����2] emp ���̺��� ���ʽ��� ���� ����� ���� ���Ͽ� ȭ�鿡 �����ּ���.
SELECT count(comm) FROM emp;

-- [����3] emp ���̺��� ��� 'SALESMAN'�� �޿� ��հ� �޿� �ְ��, �޿� ������, �޿� �հ���� ���Ͽ� ȭ�鿡 �����ּ���.
SELECT avg(sal), max(sal), min(sal), sum(sal) FROM emp WHERE job='SALESMAN';

-- [����4] emp ���̺��� ��ϵǾ� �ִ� ����� �� ��, ���ʽ��� NULL �� �ƴ� ��� ��, ���ʽ��� ���, ��ϵǾ� �ִ� �μ��� ���� ���Ͽ� ȭ�鿡 �����ּ���.
SELECT  count(*), count(comm), avg(comm), count(DISTINCT deptno)  FROM emp;