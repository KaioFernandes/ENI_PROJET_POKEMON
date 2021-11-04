<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="msg.capacity.title"></fmt:message></title>
</head>
<body>
	<c:import url="header.jsp"></c:import>
	
	<h2>
		<fmt:message key="msg.capacity.headline"></fmt:message>
	</h2>
	<form action="POST">
		<label for="name">
			<fmt:message key="msg.capacity.form.name"></fmt:message>
		</label>
		<input type="text" name="name" id="name"/>
		
		<label for="power">
			<fmt:message key="msg.capacity.form.power"></fmt:message>
		</label>
		<input type="text" name="power" id="power"/>
		
		
	</form>
</body>
</html>