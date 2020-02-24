![image](https://note.youdao.com/yws/public/resource/ce8b594ba5508f61192bd83e5f2918dc/xmlnote/594DE25E16834C55B0E29D1CC4C6DD46/5001)  
### 授课:尹浩亮
### 邮箱:yinhaoliang@neusoft.com  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/8CCF9CC3EF5C490AAD420A9A78489DB5/15417)  
# 数据库和SQL概述    
### 数据库的好处  
- 实现数据持久化  
- 使用完整的管理系统统一管理，易于查询  
- DB  
数据库（database）：存储数据的“仓库”。它保存了一系列有组织的数据.  
DBMS  
数据库管理系统（Database Management System）。数据库是通过DBMS创
建和操作的容器  
- SQL  
结构化查询语言（Structure Query Language）:专门用来与数据库通信的语言  
- 数据库管理系统(DBMS)  
- ![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/3F5CB3AA96D048F0B782566C1FBB5BE7/15436)  
- 常见的数据库管理系统:MySQL、Oracle、DB2、SqlServer  
- SQL的优点  
1.不是某个特定数据库供应商专有的语言，几乎所有
DBMS都支持SQL  
2.简单易学  
3.虽然简单，但实际上是一种强有力的语言，灵活使
用其语言元素，可以进行非常复杂和高级的数据库操作  
1、DML（Data Manipulation Language):数据操纵语句，用于添
加、删除、修改、查询数据库记录，并检查数据完整性  
2、DDL（Data Definition Language):数据定义语句，用于库和
表的创建、修改、删除.  
3、DCL（Data Control Language):数据控制语句，用于定义用
户的访问权限和安全级别.  
#### DML  
DML用于查询与修改数据记录，包括如下SQL语句:  
- INSERT：添加数据到数据库中
- UPDATE：修改数据库中的数据
- DELETE：删除数据库中的数据
- SELECT：选择（查询）数据
- SELECT是SQL语言的基础，最为重要.  
#### DDL  
DDL用于定义数据库的结构，比如创建、修改或删除
数据库对象，包括如下SQL语句:  
CREATE TABLE：创建数据库表  
ALTER TABLE：更改表结构、添加、删除、修改列长度  
DROP TABLE：删除表  
CREATE INDEX：在表上建立索引  
DROP INDEX：删除索引  
#### DCL  
DCL用来控制数据库的访问，包括如下SQL语句:  
GRANT：授予访问权限  
REVOKE：撤销访问权限  
COMMIT：提交事务处理  
ROLLBACK：事务处理回退  
SAVEPOINT：设置保存点  
LOCK：对数据库的特定部分进行锁定  

### MySQL语法规范  
- 不区分大小写
- 每句话用;或\g结尾
- 各子句一般分行写
- 关键字不能缩写也不能分行
- 用缩进提高语句的可读性  
### MySQL的简单使用  
1. 进入 mysql, 在命令行中输入: mysql –uroot –p#### (其中：####表示密码)  
2. 查看 mysql 中有哪些个数据库: show databases;  
3. 使用一个数据库: use 数据库名称;  
4. 新建一个数据库: create database 数据库名  
5. 查看指定的数据库中有哪些数据表: show tables;  
6. 建表  
````sql
create table coutomer(
id varchar(30),
age int,
name varchar(30),
birthday date
)
````  
7.查看表的结构：desc 表名  
8.删除表: drop table 表名  
9.查看表中的所有记录: select * from 表名;  
10.向表中插入记录：insert into 表名(列名列表)   values(列对应的值的列表);  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/737FA5B8DA044C3D8B7E0C3826300C62/15521)    
注意：插入 varchar 或 date 型的数据要用 单引号 引起来  
11.修改记录: update 表名 set 列1 = 列1的值, 列2 = 列2的值 where 

````sql
update customer  
set age = 22,birthday='1988-03-05' where id = '10002';
````  

12.删除记录: delete from 表名 where  
13.查询特定的列: select 列名1,列名2, … from 表名  
14.对查询的数据进行过滤：使用 where 子句  
15.运算符  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/A9B7DCDA4F2E418A9ADBF15F93BC6B09/15542)  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/4C464F3A42264955BAA813B37D9D739A/15545)  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/C3EE2E966CA64EC3A1A5DC26C040B6F1/15548)  
![image](https://note.youdao.com/yws/public/resource/ae03e06f0fd637cb082215b2706643bc/xmlnote/8A3CF3FC17E143DB972EB9EDCCC30644/15551)






