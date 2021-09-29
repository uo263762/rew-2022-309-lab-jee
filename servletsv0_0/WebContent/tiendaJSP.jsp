<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="java.util.*" %>
<%@ page language="java" import="com.tew.Beans.Counter"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Tienda Virtual JSP</h1>
<form action="/servletsv0_0/CompraCarritoServletJSP" method="post">
	<br>
	<table>
	<tr>
		<td >escoja el artículo que desea:</td>
	</tr>
	<tr>
		<td>
		<select name="product_id" size="1">
			<option value="010">la trampa</option>
			<option value="345">los pájaros</option>
			<option value="554">matrix reloaded</option>
		</select>
		</td>
	</tr>
	<tr>
		<td ><input type="submit" value="añadir al carrito..."></td>
	</tr>
	</table>
</form>



<h1>Carrito</h1>

<jsp:useBean id="carrito" class="java.util.HashMap" scope="application"/> 

<ul>
  <c:forEach var="entry" items="${carrito}"> 
    <li> 
      <c:out value="Del producto ${entry.key}, ${entry.value} unidades"/> 
    </li> 
  </c:forEach> 
</ul>

</body>
</html>