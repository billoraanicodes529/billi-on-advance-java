<%-- 
SET:A:Q:6: Write a JSP program which takes multiplier and multiplier from user as input. After clicking on
multiply button it will display product. 
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:A:Q:6</title>
</head>
<body>
    <h1>Multiplication is: 
    <% 
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));

        int mul = n1 * n2;

        out.print(mul);
    %>
    </h1>

</body>
</html>