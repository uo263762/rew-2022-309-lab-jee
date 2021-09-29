<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.lang.Integer" %>
<%@ page import="com.tew.Beans.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/servletsv0_0/Calculadora">
  <input name="num1" value="7"><br>
  <input name="num2" value="4"><br><br>
  <select name="operator">
	  <option value="SUMA">SUMA</option>
	  <option value="PRODUCTO">PRODUCTO</option>
	  <option value="RESTA">RESTA</option>
	  <option value="DIVISION">DIVISION</option>
  </select>
  <input type="submit" value="Submit">
</form>



<jsp:useBean id="cal" class="com.tew.Beans.Calculator" scope="application"/> 

<jsp:getProperty property="valor" name="cal"/> <<<


</body>
</html>