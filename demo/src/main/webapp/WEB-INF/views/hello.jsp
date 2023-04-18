<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<%request.setCharacterEncoding("utf-8"); %>

<html>
<head>
<script src="${contextPath}/js/scriptTest.js" type="text/javascript"></script>
<meta charset="utf-8">
<title>hello.jsp 페이지</title>
</head>

<body>
    안녕하세요<hr>
    <h2>${message}</h2>
    <img src="${contextPath}/image/img.jpg" /><br>
    <input type="button" name="test" value="test" onClick="test();">
</body>
</html>