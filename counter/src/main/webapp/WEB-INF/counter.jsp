<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Current visit count</title>
</head>
<body>
      <h2>You have visited <a href="/">http://localhost:8080/</a>
      <c:out value="${count}"/> time(s).</h2>
     <h2><a href ="/">Test another visit?</a></h2>
     <h2><a href="reset">Reset Visits</a></h2>
     <h2><a href="/counter2">It will increment the counter by 2</a></h2>
</body>
</html>