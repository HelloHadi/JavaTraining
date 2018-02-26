<html>  
<body>  
<%  											
String name=request.getParameter("uname");
out.print("welcome "+name+"\n");
%>  <!-- scriptlet tag -->

<%= "welcome to welcome \n" %>   <!-- expression tag, no need semi colon -->

Current Time: <%= java.util.Calendar.getInstance().getTime() %>  

<%= "Welcome "+request.getParameter("uname") %>    

<%! int data=50; %> <!-- this is declaration tag for data field -->
  
<%= "Value of the variable is:"+data+"\n" %>  

<%!   
int cube(int n){  
return n*n*n;  
}  
%> <!-- this declaration tag for method -->  

<%= "Cube of 3 is:"+cube(3)+"\n" %> 

  
</body>  
</html>