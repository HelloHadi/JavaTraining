<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
  
<c:catch var ="errormsg">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${errormsg != null}">  
   <p>The type of exception is : ${errormsg} <br />  
   There is an exception: ${errormsg}</p>  
</c:if>  
  
</body>  
</html>