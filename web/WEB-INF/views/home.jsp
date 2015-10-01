<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Employer List</h1>
            <table border="1">
                <th>Status</th>
                <th>Nome</th>
                <th>Email</th>

                <c:forEach var="user" items="${userList}" varStatus="status">
                    <tr>
                        <td>${status.index + 1}</td>
                        <td>${user.nome}</td>
                        <td>${user.email}</td>

                    </tr>
                </c:forEach>	        	
            </table>

        </div>
    </body>
</html>
