-- SQL Developer ���� �� �� �ּ���

/*
    ������ �����ͺ��̽��� ���� ���
    
    1. ���̺�
      - ������ �����ͺ��̽��� �⺻������ �����͸� 2���� ������
        ǥȣ �����ϰ� ������.
      - �̷��� ǥ ������ ������ ���� ������ ���̺�(table) �̶�� ��.
      - ���̺��� 2���� �����̹Ƿ� �����ٰ� �����ٷ� ������ ��.
       * ������ : ��(row)
       * ������ : ��(column)
      
    2. ��
      - ���� �����Ϸ��� �ϳ��� ��ü�� �����ϴ� ��.
      - ���� ��ٸ� �л� �� ����� ���� ������ ������ ��.
    
    3. ��
      - �����ϴ� �����͸� ��ǥ�ϴ� �̸��� ���� Ư���� ������ ��.
      - ���� ���� ������ ����(�ڷ���)�� �ڷ����� ���� ������ �ִ� ũ��,
        �ߺ� ���θ� �����ϰ� ��.
*/

/*
    ����Ŭ���� �Ӽ��� ���� �ֿ� �ڷ���(data type)
    1. number(n, n1) : ���� �ڷ��� (����, �Ǽ�)
      * n : ��ü �ڸ���
      * n1 : �Ҽ��� �ڸ���
      * n ~ n1 : ���� �ڸ���
       ��) number(7,2) : ��ü �ڸ����� 7�ڸ��̰�, 
                         ������ 5�ڸ�,
                         �Ҽ� �ڸ����� 2�ڸ�. 
    2. char(n) : ���ڿ� n���� ����Ǵ� �ڷ���.  ==> ���� �ڷ���.
    3. varchar(n) : ���ڿ� n���� ����Ǵ� �ڷ���. ==> ���� �ڷ���.
                    * ���� ����Ŭ������ ������� �ʴ� �ڷ���.
    4. varchar2(n) : ���ڿ� n���� ����Ǵ� �ڷ���. ==> ���� �ڷ���.
                     * �ѱ��� ������ �� ���ڴ� 2����Ʈ�� ����.
    5. date : ��¥�� ����Ǵ� �ڷ���. ==> �ý����� ���� ��¥ �� �ð��� �����.
*/

/*
    ���Ἲ(Integrity) : �����ͺ��̽��� ����� ���� �װ��� ǥ���ϴ� 
                       ���� ������ ���� ���� ��ġ�ϴ� ��Ȯ���� �ǹ���.
    ���Ἲ �������� : �����ͺ��̽��� ����� �������� ��Ȯ���� �����ϱ� ���ؼ� 
                    ��Ȯ���� �ʴ� �����Ͱ� ���̺��̽� ���� ����Ǵ� ���� 
                    �����ϱ� ���� ����.
                    
    �����ͺ��̽� ������ ���Ǵ� ���Ἲ ���������� ����
    1. unique ���� ����
       ==> �ߺ��� �Ǹ� �� �Ǵ� ���� ����.
    2. not null ���� ����
       ==> ����(null) �� ������� �ʴ� ���� ����.
    3. check ���� ����
       ==> Ư���� ���� �ƴ� �����Ͱ� ������ ���ϰ� �ϴ� ���� ����.
    4. �⺻Ű(primary key) ���� ����
       ==> unique + not null ���� ����.
       ==> �⺻ Ű�� �ش� ���̺��� ��ǥ�ϴ� �÷����ν��� ������ �����ϸ�,
           �ٸ� ���̺��� �ܷ�Ű���� ������ �� �ִ� Ű�ν��� �ڰ��� ����.
    5. �ܷ�Ű(foreign key) ���� ����
       ==> �ܷ�Ű�� �ٸ� ���̺��� �⺻ Ű(primary key)�� �����ϴ� �÷��� ������.
           ���⼭�� �ܷ� Ű ���� �����ϰ� �ִ� ���̺��� �⺻ Ű�� ���� ������ ������ �� ����.
           �̸� ���� ���Ἲ(Reference integrity) ��� ��.
*/
   

/*
    �л� ���̺��� ����� ����.
    
    ���� ���(�÷� - �Ӽ�)
    ==> �й�, �̸�, �а�, ����ó, �ּ�, ���п���, �����(������) ���
    
    ����) 
        CREATE TABLE ���̺��̸�(
            �й� �ڷ���(ũ��) [��������],
            �̸� �ڷ���(ũ��) [��������],
            �а� �ڷ���(ũ��) [��������],
            ����ó �ڷ���(ũ��) [��������],
            �ּ� �ڷ���(ũ��) [��������],
            ���п��� �ڷ���(ũ��) [��������],
            ����� �ڷ���(ũ��) [��������]
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

-- student ���̺� ������(�л� ����)�� �߰��� ����.
-- ����1)
--      INSERT INTO ���̺��̸� VALUES( �÷�1������, �÷�2������, �÷�3������... );
INSERT INTO student VALUES ('2024_001', 'ȫ�浿', '�����а�', 
                            '010-1111-1234', '����� ���α�', 'Y', sysdate);
-- ����2)
--      INSERT INTO ���̺��̸�(NOT NULL �������� �÷���) VALUES()
INSERT INTO student(hakbun, name, phone, regdate) 
    VALUES('2024_002', '�������', '010-3222-2334', sysdate);

commit;

INSERT INTO student VALUES ('2024_003', '������', '�����а�', '010-2222-2222', '����� ������', 'N', sysdate);

INSERT INTO student(hakbun, name, phone, status, regdate) VALUES ('2024_004', '������', '010-3152-5221', 'Y', sysdate);

INSERT INTO student VALUES ('2024_005', '�����', '�����а�', '010-9999-9876', '��⵵ �����', 'Y', SYSDATE);

INSERT INTO student VALUES ('2024_006', '��ŷ', '���λ���а�', '010-5545-6543', '��� ��õ��', 'N', SYSDATE);

commit;

CREATE TABLE major(
    major VARCHAR2(20) PRIMARY KEY,
    professor VARCHAR2(15) NOT NULL,
    room VARCHAR2(20) NOT NULL
    );
    
INSERT INTO major VALUES('�����а�','���ﱤ','L-201');
INSERT INTO major VALUES('���λ���а�', '���ʽ�', 'C-01N');
INSERT INTO major VALUES('�����а�','�����','2-C0N0MY');
commit;

/*
    ���࿡ Table�� Column�� �߰��ؾ� �ϴ� ���
    ����) ALTER TABLE ���̺��̸� ADD(�߰����÷��� �ڷ���(ũ��) ��������);
*/

ALTER TABLE student ADD(age number);

DROP TABLE major PURGE;
-- PURGE ��ɾ� : �α׸� ����(�������)

-- ���̺��� �÷��� �����ϴ� ���(�÷��� ��ü���� ���� ����)
-- ����) ALTER TABLE ���̺��̸� MODIFY(�������÷��� �ڷ���(ũ��) [��������]);
ALTER TABLE student MODIFY(age VARCHAR2(3));

-- ���̺��� �÷����� �����ؾ� �ϴ� ���
-- ����) ALTER TABLE ���̺��̸� RENAME COLUMN �����÷��� TO ���÷���;
ALTER TABLE student RENAME COLUMN name TO irum;

-- ���̺��� �÷��� �����ؾ� �ϴ� ���
-- ����) ALTER TABLE ���̺��̸� DROP COLUMN �������÷���;
ALTER TABLE student DROP COLUMN age;

/*
    1. DDL - Data Definition Language : ������ ���Ǿ�
        - CREATE : �����ͺ��̽� �Ǵ� ���̺��� �����ϴ� ��ɾ�
        - ALTER : ���̺��� �����ϴ� ��ɾ�
        - DROP : �����ͺ��̽� �Ǵ� ���̺��� �����ϴ� ��ɾ�
        - TRUNCATE : ���̺��� �ʱ�ȭ�ϴ� ��ɾ�

    2. DML - Data Manipulation Language : ������ ���۾�
        ==> �����ͺ��̽����� ���� ���� ����ϴ� ��ɾ�.
        - SELECT : �����͸� �˻��ϴ� ��ɾ� (VIEW �� ������)
        - INSERT : �����͸� �߰��ϴ� ��ɾ�
        - UPDATE : �����͸� �����ϴ� ��ɾ�
        - DELETE : �����͸� �����ϴ� ��ɾ�
        
    3. DCL - Data Control Language : ������ �����
        - GRANT : Ư�� �����ͺ��̽� ����ڿ��� �۾��� Ư�� ���� ������ �ο��ϴ� ��ɾ�
        - REVOKE : Ư�� �����ͺ��̽� ����ڿ��� �۾��� Ư�� ���� ������ ȸ���ϴ� ��ɾ�
        - COMMIT : Ʈ����� �۾��� �Ϸ��ϴ� ��ɾ�.
        - ROLLBACK : Ʈ����� �۾��� ����ϰų� ���� ���·� �����ϴ� ������ �ϴ� ��ɾ�
*/

-- �����͸� �����ϴ� ���
-- ����) UPDATE ���̺��̸� SET �������÷��� = ��, �������÷��� = ��....
--                  WHERE �⺻Ű�÷��� = ��;
UPDATE student SET major = '���λ���а�', addr = '����� �߱�', status = 'Y' WHERE hakbun = '2024_003';


UPDATE student SET major = '���λ���а�', addr = '���ʽ�', status = 'N' 
WHERE hakbun = '2024_001';


-- �����͸� �����ϴ� ���
-- ����) DELETE FROM ���̺��̸� WHERE �⺻Ű�÷��� = ��;
DELETE FROM student WHERE hakbun = '2024_004';


-- �����͸� �˻��ϴ� ��ɾ�
-- STUDENT ���̺� �ִ� ��� �����͸� ȭ�鿡 �����ּ���.
-- ����) SELECT * FROM ���̺��̸�;
SELECT * FROM student;

-- [����1] EMP ���̺��� empno, ename, job, deptno �÷��� ȭ�鿡 �����ּ���.
SELECT empno, ename, job, deptno FROM emp;

SELECT hakbun,irum FROM student WHERE major = '���λ���а�';

-- [����2] emp ���̺��� �̸�, �Ի���, �޿��� ȭ�鿡 �����ּ���.
SELECT ename, hiredate, sal FROM emp;
-- [����3] emp ���̺��� ���, �̸�, ������, ���ʽ��� ȭ�鿡 �����ּ���.
SELECT empno, ename, job, comm FROM emp;
-- [����4] emp ���̺��� ���, �̸�, �޿�, ���ʽ�, �޿� + ���ʽ� ����� ȭ�鿡 �����ּ���.
SELECT empno, ename, sal, comm, comm+sal FROM emp;
-- NULL ���� ������ �÷��� �ٸ� �÷��� ������ �ϸ� ��� NULL �� ó���ȴ�.
-- NULL �� ó���� �ִ� �Լ� : nvl() �Լ� ==> null ���� Ư���� ������ ��������ִ� �Լ�.
--                                                                     ��� �ڷ����� ������ ������ ���� Ư¡.
--                                                                      nvl �Լ��� ����� ������ ��ȯ�Ǵ� ���� �ڷ����� ��ġ���� �־�� ��.
-- UPDATE emp SET comm = 0 where COMM IS NULL;   ��ſ� �Ʒ�ó�� ����.
-- nvl(null���̵��ִ��÷���, �����Ұ�)
SELECT empno, ename, sal, comm, sal + nvl(comm,0) FROM emp;
-- nvl2() �Լ� : �ڹٿ����� 3�� �����ڿ� ����� �Լ�.
-- ����) nvl2(�÷���, expr1, expr2)
--           ==> �÷��� ��� �ִ� ���� NULL �� �ƴϸ� expr1 ���� ��ȯ, NULL �̸� expr2
SELECT empno, ename, sal, comm, sal + nvl2(comm, comm, 0) FROM emp;

-- AS Ű���� : �÷��� ����(title)�� �̸��� �����Ű�� Ű����. ���� �Ǵ� ��Ī�̶�� ��.
--                   ���� ��Ī�� ""(�ֵ���ǥ) �ȿ� �ۼ��� ��. 
--                   AS ��� Ű���带 �����ص� ��.
SELECT empno, ename, sal, comm, sal + nvl2(comm, comm, 0) "�� �޿�" FROM emp;

SELECT * FROM emp;

--[����5] emp ���̺��� ���, �̸�, �޿�, �޿��� 10% �λ���� ȭ�鿡 �����ּ���.

SELECT empno, ename, sal, (sal*1.1) "�λ��" FROM emp;

--emp ���̺��� �� ����� �������� ȭ�鿡 �����ּ���.
SELECT job FROM emp;

--emp ���̺��� �� ����� �����ڸ� ȭ�鿡 �����ּ���.
SELECT mgr FROM emp;

/*
    distinct Ű���� : �ߺ��� �������ִ� ��ɾ�(Ű����)
    - �ַ� �ϳ��� �÷����� �ߺ��� ���� �����ϰ� ������ �� �����.
    - distinct Ű����� �׻� select Ű���� ������ ����Ѵ�.
    - distinct Ű���� �ڿ� ������ �÷����� ��� distinct�� ������ �޴´�.
    - distinct Ű���� �ڿ� ���� ���� �÷��� ����� �Ǹ� �ش� �÷����� �ߺ��� ���� �ʰ� ��Ÿ����.
*/