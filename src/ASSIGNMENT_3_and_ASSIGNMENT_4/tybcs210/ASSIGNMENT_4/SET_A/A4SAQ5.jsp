<%-- 
    SET:A:Q:5: Write a JSP program to accept username and password from user. If username is cs and password is
    bcs display the welcome message in bold text. 
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:A:Q:5</title>
</head>
<body>
    <%
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        String requiredUser = "Yunus";
        String requiredPass = "Yunus101";

        if (requiredUser.equals(user) && requiredPass.equals(pass)) {

    %>

    <b>Welcome, <%= user %>! You have successfully logged in.</b>

    <%
        } else {
    %>

    <b>Invalid Username or Password. Please Try Again.</b>

    <a href="A4SAQ5.html">To Login Again, Click Here!</a>

    <%
        }
    %>
</body>
</html>