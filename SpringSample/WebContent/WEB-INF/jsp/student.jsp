<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
		<title>Hello Web</title>
	</head>
	<body>
		<h2>Student Information</h2>
		${a }
		<table border="1">
			<thead>
				<tr><th>Id</th><th>Name</th><th>Age</th></tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${studentList}" varStatus="status">
					<tr>
						<td>${status.index + 1 }</td>
						<td>${student.name }</td>
						<td>${student.age }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		
		<h2>Add student</h2>
<%-- 		<form:form method="get" modelAttribute="student" action="/student/addStudent"> --%>
<!-- 			<table> -->
<!-- 				<tbody> -->
<!-- 					<tr> -->
<!-- 						<th>Name: </th> -->
<%-- 						<td><form:input path="name"/></td> --%>
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<th>Age: </th> -->
<%-- 						<td><form:input path="age"/></td> --%>
<!-- 					</tr> -->
<!-- 					<tr> -->
<!-- 						<th>Id: </th> -->
<%-- 						<td><form:input path="id"/></td> --%>
<!-- 					</tr> -->
<!-- 				</tbody> -->
<!-- 			</table> -->
<%-- 		</form:form> --%>
	</body>
</html>
