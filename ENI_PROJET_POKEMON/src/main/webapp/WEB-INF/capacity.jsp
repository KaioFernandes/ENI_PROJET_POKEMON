<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title><fmt:message key="msg.capacity.title"></fmt:message></title>
<style><%@ include file="/ressources/styles/style.css" %></style>
</head>
<body>
	<c:import url="header.jsp"></c:import>
	
	<h2>
		<fmt:message key="msg.capacity.headline"></fmt:message>
	</h2>
	<form method="POST" action="capacity">
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
			
			<label for="fire">
				<fmt:message key="msg.capacity.form.type.fire"></fmt:message>
			</label>
			<input type="radio" name="capacityType" id="fire" value="FIRE"/>
			
			<label for="plant">
				<fmt:message key="msg.capacity.form.type.plant"></fmt:message>
			</label>
			<input type="radio" name="capacityType" id="plant" value="PLANT"/>
			
			<label for="water">
				<fmt:message key="msg.capacity.form.type.water"></fmt:message>
			</label>
			<input type="radio" name="capacityType" id="water" value="WATER"/>
				
		</p>
		<button type="submit">
			<fmt:message key="msg.capacity.form.submit"></fmt:message>
		</button>
	</form>
	
	<c:if test="${sessionScope.capacityList.size() > 0 }">
		<div>
			<ul>
				<c:forEach items="${sessionScope.capacityList }" var="capacity">
					<li>
						<h3>
							<fmt:message key="msg.capacity.name">
							</fmt:message> ${capacity.name }
					
						</h3>
						<p>
							<fmt:message key="msg.capacity.power">
							</fmt:message>
							${capacity.power }
						</p>
						<p>
							<fmt:message key="msg.capacity.type">
							</fmt:message>
							
							<c:choose>
								<c:when test = "${capacity.type == FIRE}">
						            <fmt:message key="msg.capacity.form.type.fire"></fmt:message>
						        </c:when>
						         
						        <c:when test = "${capacity.type == PLANT}">
						            <fmt:message key="msg.capacity.form.type.plant"></fmt:message>
						        </c:when>
						        
						        <c:when test = "${capacity.type == WATER}">
						            <fmt:message key="msg.capacity.form.type.water"></fmt:message>
								</c:when>
							
							</c:choose>
						</p>
					</li>
				
				</c:forEach>
			</ul>
			
		</div>
	</c:if>	
	
</body>
</html>