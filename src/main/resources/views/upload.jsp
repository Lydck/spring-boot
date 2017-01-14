<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>upload</title>
	</head>
	<body>
		<div class="upload">
			<form action="upload" enctype="multipart/form-data" method="post">
				<input type="file" name="file">
				<input type="submit" value="上传">
			</form>
		</div>
	</body>
</html>
