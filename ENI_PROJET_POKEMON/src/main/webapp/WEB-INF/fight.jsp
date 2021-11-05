<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title><fmt:message key="msg.fight.title"></fmt:message></title>
</head>
<body>
	<c:import url="header.jsp"></c:import>
		
	<h2>
		<fmt:message key="msg.fight.headline"></fmt:message>
	</h2>
	
	<form>
		<c:forEach items="${sessionScope.pokemonList}" var="pokemon">
		
		<label for="${pokemon.id }">
			<span class="pok-name">
				<c:out value="${pokemon.name }"></c:out>
			</span>
			<span class="pok-info">
			
			</span>
			
		</label>
		<input type="checkbox" name="pokemons" id="${pokemon.id }"/>	
		
		</c:forEach>
	
	</form>
</body>
</html>