<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <title>JSP - Hello World</title>
    </head>
    <body>
        <h1><%= "Hello!" %>
        </h1>
        <br/>
        <form action="${pageContext.request.contextPath}/user" method="post">
            <label>
                Name:
                <input type="text" name="name" placeholder="Type name">
            </label>
            <br />
            <label>
                Position:
                <input type="text" name="position" placeholder="Type position">
            </label>
            <br />
            <input type="submit" value="Submit">
        </form>
    </body>
</html>