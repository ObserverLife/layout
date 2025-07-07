<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>webapp/WEB-INF/views/</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp" />
<jsp:include page="/WEB-INF/views/${targetpage}.jsp" />
<jsp:include page="/WEB-INF/views/footer.jsp"/>
</body>
</html>