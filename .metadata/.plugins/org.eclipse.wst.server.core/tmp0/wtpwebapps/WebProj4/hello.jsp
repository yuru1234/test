<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="./css/style.css">
<title>HelloStruts</title>
</head>
<body>
<h1>HelloStruts2!</h1>
<br>

<table>
	<tbody>
	<tr>
		<th>USERID</th>
		<th>USERNAME</th>
		<th>PASSWORD</th>
		<th>RESULT</th>
	</tr>

	<s:iterator value="helloStrutsDTOList">
	<tr>
		<td><s:property value="userId"/></td>
		<td><s:property value="userName"/></td>
		<td><s:property value="password"/></td>
		<td><s:property value="result"/></td>
	</tr>
	</s:iterator>
	</tbody>
</table>

</body>
</html>