<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2022, 6:52:45 PM
    Author     : Lynde
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <form action ="arithmetic" method="post">
            First Number: <input type = "number" name="firstnum" value= "${firstnum}"> <br>
             Second Number Number: <input type = "number" name="secondnum" value= "${secondnum}"> <br>
             
            
           <input type="submit" value="+">
            <input type="submit" value="-">
             <input type="submit" value="*">
              <input type="submit" value="%">
            </form>
        
    </body>
</html>
