<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Arithmetic Operations</title>
</head>
<body>
    <h2>Basic Arithmetic Calculator</h2>
    <form method="post">
        <label>Number 1:</label>
        <input type="text" name="num1" required><br><br>
        <label>Number 2:</label>
        <input type="text" name="num2" required><br><br>
        <label>Operation:</label>
        <select name="operation">
            <option value="add">Addition (+)</option>
            <option value="sub">Subtraction (-)</option>
            <option value="mul">Multiplication (*)</option>
            <option value="div">Division (/)</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>

    <%
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String op = request.getParameter("operation");

        if (num1Str != null && num2Str != null && op != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                double result = 0;

                switch (op) {
                    case "add":
                        result = num1 + num2;
                        out.println("<h3>Result: " + num1 + " + " + num2 + " = " + result + "</h3>");
                        break;
                    case "sub":
                        result = num1 - num2;
                        out.println("<h3>Result: " + num1 + " - " + num2 + " = " + result + "</h3>");
                        break;
                    case "mul":
                        result = num1 * num2;
                        out.println("<h3>Result: " + num1 + " * " + num2 + " = " + result + "</h3>");
                        break;
                    case "div":
                        if (num2 != 0) {
                            result = num1 / num2;
                            out.println("<h3>Result: " + num1 + " / " + num2 + " = " + result + "</h3>");
                        } else {
                            out.println("<h3 style='color:red;'>Error: Division by zero!</h3>");
                        }
                        break;
                    default:
                        out.println("<h3 style='color:red;'>Invalid operation!</h3>");
                }
            } catch (NumberFormatException e) {
                out.println("<h3 style='color:red;'>Invalid number format!</h3>");
            }
        }
    %>
</body>
</html>
