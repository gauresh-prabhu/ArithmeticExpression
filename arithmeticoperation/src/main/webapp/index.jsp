<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>

	<form action="evaluate">
		Expression : <input type="text" name="expression" id="expression" />
		<input type="submit" />
	</form>

	<c:if test="${history.size() > 0}">History : </c:if>
	<BR />
	<c:forEach var="item" items="${history}">
		${item.expression} = ${item.result} <BR />
	</c:forEach>
</body>
</html>