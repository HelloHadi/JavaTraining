<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
 <html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/ebookshop"  
     user="myuser"  password="p@@s"/>  
 <sql:query dataSource="${db}" var="rs">  
SELECT * from books;  
</sql:query>  
 <table border="2" width="50%" align="center">  
<tr>  
<th>ID</th>  
<th>Title</th>  
<th>Author</th>  
<th>Price</th> 
<th>Quantity</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.title}"/></td>  
<td><c:out value="${table.author}"/></td>  
<td><c:out value="${table.price}"/></td>
<td><c:out value="${table.Qty}"/></td>  
</tr>  
</c:forEach>  
</table>  
  </body>  
</html>