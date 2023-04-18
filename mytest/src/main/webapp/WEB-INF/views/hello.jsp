<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}" />
<%request.setCharacterEncoding("utf-8"); %>

<html>
<head>

<script>
    function test(){
        alert("test Songyeonsu")
    }

</script>
<meta charset="utf-8">
<title>hello.jsp 페이지</title>
</head>

<body>
    안녕하세요<br>
    <h2>${message}</h2>
    <img src="${contextPath}/image/tiger.jpg" /><br>
    <input type="button" name="test" value="테스트" onClick="test();">
</body>
</html>