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
<c:set var="StudentId" value="117"/>  
<sql:update dataSource="${db}" var="count">  
DELETE FROM employees WHERE Id = ?  
 <sql:param value="${StudentId}" />  
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
<td><c:out value="${table.FirstName}"/></td>  
<td><c:out value="${table.LastName}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  