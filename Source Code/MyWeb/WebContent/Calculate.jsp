<body>
  <%@ page errorPage="Receiver.jsp" %>

  <%
    int fn = Integer.parseInt(request.getParameter("t1"));    
    int sn = Integer.parseInt(request.getParameter("t2"));    
  %>

    <h3>Your first number is <%= fn %> and second number is <%= sn %>. <br>
    Quotient is <%= fn/sn %> </h3>.

</body>