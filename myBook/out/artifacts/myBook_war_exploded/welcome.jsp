<%@ page import="com.sun.xml.internal.ws.api.server.LazyMOMProvider" %>
<%--
  Created by IntelliJ IDEA.
  User: mark
  Date: 4/13/15
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<h1>Hello, welcome to my page. <%=(String)request.getAttribute("name")%></h1>
</body>
</html>
