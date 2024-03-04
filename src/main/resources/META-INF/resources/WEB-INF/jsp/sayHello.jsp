
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Visitor Counter</title>
</head>
<body>
    <h1>Welcome to Our Website</h1>
    <%

        Integer count = (Integer)session.getAttribute("visitCount");
        
        if(count == null) {
            count = 1;
        } else {

            count++;
        }
        
        session.setAttribute("visitCount", count);
    %>
    <p>You are visitor number <%= count %> to this site.</p>
    
    <form action = "factorial.jsp">
    <input type = "text" name = "val">
    <input type="submit" value="Submit">
    </form>
</body>
</html>