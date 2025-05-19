<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.io.*, java.util.*, javax.servlet.http.*, javax.servlet.*" %>

        <% Integer visitorCount=(Integer) application.getAttribute("visitorCount"); 
        if (visitorCount==null)
            visitorCount=0; 
        visitorCount++; 
        application.setAttribute("visitorCount", visitorCount); 
        String name="" ,
            email="" , gender="" , password="" , error="" ; 
            boolean registered=false; 
            if ("POST".equalsIgnoreCase(request.getMethod())) { try { name=request.getParameter("name");
            email=request.getParameter("email"); 
            gender=request.getParameter("gender");
            password=request.getParameter("password"); 
            if (name.isEmpty() || email.isEmpty() || gender==null ||
            password.isEmpty()) { error="All fields are required." ; 
        } else { session.setAttribute("userName", name);
            registered=true; 
        } } catch (Exception e) {
            error="Upload failed: " + e.getMessage(); } } String sessionUserName=(String)
            session.getAttribute("userName"); %>

            <html>

            <head>
                <title>Register</title>
                <style>
                    body {
                        font-family: Arial;
                        padding: 30px;
                        background: #f2f2f2;
                    }

                    form {
                        background: white;
                        padding: 20px;
                        max-width: 400px;
                        margin: auto;
                        border-radius: 8px;
                        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
                    }

                    input,
                    select {
                        width: 100%;
                        padding: 8px;
                        margin-top: 10px;
                    }

                    .btn {
                        margin-top: 15px;
                        background: #007bff;
                        color: white;
                        border: none;
                        padding: 10px;
                        cursor: pointer;
                    }

                    .error {
                        color: red;
                        text-align: center;
                    }

                    .visitor {
                        text-align: center;
                        margin-bottom: 10px;
                    }

                    .welcome {
                        text-align: center;
                    }
                </style>
            </head>

            <body>

                <div class="visitor">
                    <h3>Visitor Count: <%= visitorCount %>
                    </h3>
                </div>

                <% if (sessionUserName !=null) { %>
                    <div class="welcome">
                        <h2>Welcome, <%= sessionUserName %>!</h2>
                      
                    </div>
                    <% } else { %>

                        <form method="post" >
                            <h2>Register</h2>
                            <% if (!error.isEmpty()) { %>
                                <p class="error">
                                    <%= error %>
                                </p>
                                <% } %>
                                    <input type="text" name="name" placeholder="Name" required>
                                    <select name="gender">
                                        <option value="">Select Gender</option>
                                        <option value="Male">Male</option>
                                        <option value="Female">Female</option>
                                    </select>
                                    <input type="email" name="email" placeholder="Email" required>
                                    <input type="password" name="password" placeholder="Password" required>
                                    <button type="submit" class="btn">Register</button>
                        </form>

                        <% } %>

            </body>

            </html>