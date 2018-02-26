<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:update Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/emp"  
     user="myuser"  password="p@@s"/>  
<sql:update dataSource="${db}" var="count">  
INSERT INTO employees VALUES (121, 25, 'Nasreen', 'jihi');
INSERT INTO employees VALUES (122, 25, 'Nasreen', 'jahu');
INSERT INTO employees VALUES (123, 25, 'Nasreen', 'jaho');
INSERT INTO employees VALUES (124, 25, 'Nasreen', 'jahe');
INSERT INTO employees VALUES (125, 25, 'Nasreen', 'jehi');  
</sql:update>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from employees;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.firstName}"/></td>  
<td><c:out value="${table.lastName}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  