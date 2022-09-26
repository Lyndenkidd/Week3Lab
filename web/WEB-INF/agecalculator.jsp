<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 5:24:20 PM
    Author     : Lynde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
    
    <body>
        <h1>Age Calculator</h1>
        
        <form action ="age" method="post">
            Enter your age: <input type = "number" name="age" value= "${age}"> <br>
            
           <input type="submit" value="submit">
            </form>
                
                <p> ${returnStatement}</p>
                    
    </body>          
</html>
