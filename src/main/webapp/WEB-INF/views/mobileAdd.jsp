<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>eKart :: Add Mobile</title>
<link rel="stylesheet" type="text/css" href="<c:url value="./css/style.css" />" />
<style>

	.error {
		color: #ff0000;
	}
</style>
</head>


<body>
<div id="wrapper">
<div id="header">
<table style="background-color:lightsteelblue;width:100%"><tr>
<td width="10%"><img src="<c:url value="./images/logo.jpg" />" height="100" width="120" /></td>
<td style="font-size: xx-large;;align-content:center;text-align:left">eKart :: Add Mobile</td></tr></table>
<table style="background-color:navy;width:100%;height:0"><tr><td></td></tr></table>
</div>
<div id="content">
		<form:form method="POST" modelAttribute="mobile" action="addMobile">
		<table>
			<tr>
				<td>Mobile Name: </td>
				<td><form:input path="mobileName" id="mobileName"/></td>
		    </tr>
	    
			<tr>
				<td>Manufacturing Date: </td>
				<td><form:input path="mobileManufactureDate" id="mobileManufactureDate"/></td>
		    </tr>
	
			<tr>
				<td>Price:  </td>
				<td><form:input path="price" id="price"/></td>
		    </tr>
	
			<tr>
				<td>Description: </td>
				<td><form:input path="description" id="description"/></td>
		    </tr>
		    	
		    <tr>
		    	<td>
		    		<input type="submit" value="Add Mobile"/>
						
				</td>
			</tr>
		</table>
	</form:form>
	<br/>
	<br/>
	Go back to <a href="<c:url value='/listMobiles' />">List of All Mobiles</a>

	</div>
	<div id="footer">
	<table style="background-color:lightsteelblue;width:100%"><tr>
<td style="font-size: small;text-align:center">XP Conference India 2015 &copy; 2015</td></tr></table>
	
	</div>
	</div>
</body>
</html>