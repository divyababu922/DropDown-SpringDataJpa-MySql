<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Drop Down Form</title>
</head>
<body>
    <div align="center">
        <h2>DROP DOWN Users</h2>
        <form:form id="dropdownuser" action="dropdownuser" method="post">
             
            <form:label>Select Users</form:label>
            <form:select multiple=true path="name" items="${customer.name}" /><br/>
                 
            <form:button>Submit</form:button>
        </form:form>
        
    </div>
</body>
</html>