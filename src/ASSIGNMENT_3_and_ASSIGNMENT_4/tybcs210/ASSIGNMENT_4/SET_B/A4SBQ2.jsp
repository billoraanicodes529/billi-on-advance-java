<%-- SET:B:Q:2: Write a jsp program to accept name and nickname of student and display the same. --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:B:Q:2</title>
</head>
<body>
    <%
        String str1 = request.getParameter("n1");

        out.print("Student Name is " + str1);

        String str2 = request.getParameter("n2");

        out.print("<h3>Student Nick Name is <i>" + str2 + "</i></h3>");
    %>
    
    <h3></h3>
</body>
</html>