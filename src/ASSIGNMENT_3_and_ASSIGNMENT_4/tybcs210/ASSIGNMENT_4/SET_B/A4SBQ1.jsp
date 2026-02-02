<%-- SET:B:Q:1: Write a JSP program to display date and time of system. --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:B:Q:1:</title>
</head>
<body>
    <%@ page import="java.util.Date" %>
    <%!
        Date date;
    %>
    <%
        date = new Date();
    %>

    <h1>System Date And Time: </h1><h2><%= date %></h2>
</body>
</html>