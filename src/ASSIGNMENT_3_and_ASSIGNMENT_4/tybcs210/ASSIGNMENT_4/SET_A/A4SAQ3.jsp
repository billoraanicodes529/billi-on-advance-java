<%-- SET:A:Q:3: Write a JSP program to accept a number from user and display its factorial. --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:A:Q:3</title>
</head>
<body>
    <h1>Factorial of a Number: 

    <%! int fact = 1, i = 0; %>

    <%
        int num = Integer.parseInt(request.getParameter("num"));

        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }

        out.print(fact);
    %>
    </h1>
    
</body>
</html>