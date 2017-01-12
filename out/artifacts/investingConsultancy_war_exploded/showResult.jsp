<%@ page import="com.ironyard.data.Investor" %><%--
  Created by IntelliJ IDEA.
  User: osmanidris
  Date: 1/11/17
  Time: 6:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Investing Consultancy</title>
</head>
<body>
<br /><br />
<%
    String invReport = (String)request.getAttribute("msg");
%>
<%=invReport%>
</body>
</html>
