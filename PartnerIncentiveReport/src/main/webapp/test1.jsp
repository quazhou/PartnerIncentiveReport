<%@ page language="java" contentType="text/html; charset=GB18030"
    pageEncoding="GB18030"%>
<%String path = request.getContextPath(); %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
<form action="<%=path %>/report/partner_incentive_form" method="post">
	quarter:<input type="text" name="quarter"></input>
	year:<input type="text" name="year"></input>
	<input type="submit"/>
</form>
</body>
</html>