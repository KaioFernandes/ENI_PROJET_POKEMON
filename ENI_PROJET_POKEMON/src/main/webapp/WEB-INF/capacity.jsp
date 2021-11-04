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
		<p>
			<label for="name">
				<fmt:message key="msg.capacity.form.name"></fmt:message>
			</label>
			<input type="text" name="name" id="name"/>
		</p>
		<p>
			<label for="power">
				<fmt:message key="msg.capacity.form.power"></fmt:message>
			</label>
			<input type="text" name="power" id="power"/>
		</p>
		<p>
			<label>
				<fmt:message key="msg.capacity.form.type"></fmt:message>
			</label>
		
			<select id="types">
				<option value="${TypesEnum.FIRE }">
					<fmt:message key="msg.capacity.form.type.fire"></fmt:message>
				</option>
				<option value="${TypesEnum.PLANT }">
					<fmt:message key="msg.capacity.form.type.plant"></fmt:message>
				</option>
				<option value="${TypesEnum.WATER }">
					<fmt:message key="msg.capacity.form.type.water"></fmt:message>
				</option>
	
			</select>
		</p>
		<button type="submit"></button>
	</form>
</body>
</html>