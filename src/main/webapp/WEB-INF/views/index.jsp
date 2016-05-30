<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Inicio Aplicación</h1>
  
<!--   <table> -->
<!--     <thead> -->
<!--       <th>Nombre</th> -->
<!--       <th>Descripcion</th> -->
<!--       <th>Imagen</th> -->
<!--     </thead> -->
<!--     <tbody> -->
<%--       <c:forEach var="c" items="${categorias }"> --%>
<!--         <tr> -->
<%--           <td>${c.categoryName }</td> --%>
<%--           <td>${c.description }</td> --%>
<%--           <td>${c.picture }</td> --%>
<!--         </tr> -->
<%--       </c:forEach> --%>
<!--     </tbody> -->
<!--   </table> -->
  
  <br>
  
  <table>
    <thead>
      <th>ORDER_ID</th>
      <th>SHIP_NAME</th>
      <th>CUSTOMER_CODE</th>
      <th>CONTACT_NAME</th>
    </thead>
    <tbody>
      <c:forEach var="t" items="${transform }">
        <tr>
          <td>${t.orderID }</td>
          <td>${t.shipName }</td>
          <td>${t.customerCode }</td>
          <td>${t.contactName }</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
  
  
  
</body>
</html>