<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<html>
	<head>
		<title>Hello Web</title>
	</head>
	<body>
		<h2>Student Information</h2>
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
		<form:form method="get" modelAttribute="student" action="/SpringSample/students/addStudent">
			<table>
				<tbody>
					<tr>
						<th>Name: </th>
						<td><form:input path="name"/></td>
					</tr>
					<tr>
						<th>Age: </th>
						<td><form:input path="age"/></td>
					</tr>
					<tr>
						<th>Id: </th>
						<td><form:input path="id"/></td>
					</tr>
					<tr>
						<th><input type="submit" value="submit"></th>
					</tr>
				</tbody>
			</table>
		</form:form>
	</body>
</html>
