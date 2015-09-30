<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>eKart :: Index</title>
<link rel="stylesheet" type="text/css" href="<c:url value="./css/style.css" />" />
</head>


<body>
<div id="wrapper">
<div id="header">
<table style="background-color:lightsteelblue;width:100%"><tr>
<td width="10%"><img src="<c:url value="./images/logo.jpg" />" height="100" width="120" /></td>
<td style="font-size: xx-large;;align-content:center;text-align:left">eKart :: List of Mobiles</td></tr></table>
<table style="background-color:navy;width:100%;height:0"><tr><td></td></tr></table>
</div>
<div id="content">
	<table style="width:100%">
		<tr style="font-weight: bold;
			background-color: #C6C9C4;">
			<td>Mobile Name</td><td>Manufacturing Date</td><td>Price</td><td>Description</td><td></td>
		</tr>
		<c:forEach items="${mobiles}" var="mobile">
			<tr>
			<td>${mobile.mobileName}</td>
			<td>${mobile.mobileManufactureDate}</td>
			<td>${mobile.price}</td>
			<td>${mobile.description}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/addMobile' />">Add New Mobile</a>
	</div>
	<div id="footer">
	<table style="background-color:lightsteelblue;width:100%"><tr>
<td style="font-size: small;text-align:center">XP Conference India 2015 &copy; 2015</td></tr></table>
	
	</div>
	</div>
</body>
</html>