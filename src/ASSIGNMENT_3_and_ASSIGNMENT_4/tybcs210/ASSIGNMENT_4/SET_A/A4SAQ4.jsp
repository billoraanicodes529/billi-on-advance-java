<%-- SET:A:Q:4: Write a JSP program to accept two numbers from user and perform addition. --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:A:Q:4</title>
</head>
<body>
    <h1>Addition of Two Numbers: 
    <%
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));

        int sum = n1 + n2;

        out.print(sum);
    %>
    </h1>

</body>
</html>