<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login" > 
	用户名:<input type="text" name="username" id="username" value="${username}"/><br/>
	用户名:<input type="password" name="password"  id="password" value="${password}"/>
	<br/>
	<input type="submit" value="提交">&nbsp;&nbsp;
	<input type="reset" value="重填">
	
</form>
</body>
</html>