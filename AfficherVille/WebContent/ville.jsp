<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP List Users Records</title>
</head>
<body>
    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://127.0.0.1/eseo_tp_maven"
        user="maven" password="network"
    />
     
    <sql:query var="listVille"   dataSource="${myDS}">
        SELECT * FROM ville_france LIMIT 100;
    </sql:query>
     
      <form name="form1" method="post" action="DistanceVille">
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of ville</h2></caption>
            <tr>
                <th>Code_commune</th>
                <th>Nom_commune</th>
                <th>Select</th>
            </tr>
            <c:forEach var="ville" items="${listVille.rows}">
                <tr>
                    <td><c:out value="${ville.Code_commune_INSEE}" /></td>
                    <td><c:out value="${ville.Nom_commune}" /></td>
                    <td><input type="checkbox" id="radioButtonVille" value="${ville.Code_postal}">
                    	<input type="hidden" id="lat" name="lat" value="${ville.Latitude}">
                    	<input type="hidden" id="lng" name="lng" value="${ville.Longitude}"></td>
                </tr>
            </c:forEach>
        </table>
        <button type="submit">Valider</button>
    </div>
    </form>
</body>


</html>