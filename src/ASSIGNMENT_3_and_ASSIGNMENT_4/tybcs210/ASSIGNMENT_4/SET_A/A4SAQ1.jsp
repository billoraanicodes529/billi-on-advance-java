<%-- SET:A:Q:1: Write a Program to make use of following JSP implicit objects:
i. out: To display current Date and Time.
ii. request: To get header information.
iii. response: To Add Cookie
iv. config: get the parameters value defined in <init-psaram>
v. application: get the parameter value defined in <context-param>
vi. session: Display Current Session ID
vii. pageContext: To set and get the attributes.
viii. page: get the name of Generated Servlet --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:A:Q:1</title>
</head>
<body>
    <%@ page import="java.util.*" %>
    <%@ page import="java.io.*" %>

    <%
        PrintWriter pw = response.getWriter();
        pw.print("This is JSP.");
    %>

    <h3>
        <%= new java.util.Date() %><br>

        <%= request.getLocale().toString() %><br>

        <%= application.getServerInfo() %><br>

        <%=  config.getServletName() %><br>

        <%= session.getCreationTime() %><br>

        <% pageContext.setAttribute("hi", "hello"); %><br>

        <%= pageContext.getAttribute("hi") %><br>

        <%= page.getClass().getName() %><br>
    </h3>
    
</body>
</html>