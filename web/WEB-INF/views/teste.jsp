<%-- 
    Document   : teste
    Created on : 03/09/2015, 05:41:58
    Author     : Junior Falcão
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="resources/js/jquery-2.1.4.min.js"></script>
        <script src="resources/js/modernizr.custom.30686.js"></script>
        <title>Testando Modernizr</title>
        <script>

            if (Modernizr.webgl) {
                console.log('The test passed!');
            }
            else {
                console.log('The test failed!');
            }

        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
