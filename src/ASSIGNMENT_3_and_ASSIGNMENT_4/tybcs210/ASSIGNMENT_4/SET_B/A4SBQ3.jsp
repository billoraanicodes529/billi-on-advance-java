<%-- SET:B:Q:3: Write a JSP program to display the following: --%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>SET:B:Q:3</title>
    <style>
        table, tr, td, th {
            text-align: center; 
            padding: 10px;
            background-color: lightgray;  
            border: 1px solid black;
            border-collapse: collapse;
        }

        table {
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <h1 style="text-align: center;">A Sample Order Form</h1>

    <%!
        String item[] = {"DVD", "CD", "Diskette"};
        double price[] = {19.99, 12.99, 1.99};
        int quantity[] = {2, 9, 24};
    %>

    <div>
        <table>
            <tr>
                <th>Item</th>
                <th>Price</th>
                <th>Quantity</th>
                <th>Total Price</th>
            </tr>

            <% for (int i = 0; i < 3; i++) { %>

            <tr>
                <td><%= item[i] %></td>
                <td><%= price[i] %></td>
                <td><%= quantity[i] %></td>
                <td><%= price[i] * quantity[i] %></td>
            </tr>
            <% } %>
        </table>
    </div>
    
</body>
</html>