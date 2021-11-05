
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style><%@ include file="/ressources/styles/style.css" %></style>
</head>
<body>
	<c:import url="header.jsp"></c:import>
	<h2>
		<fmt:message key="msg.pokemon.title"></fmt:message>
	</h2>
	

	<div class="create-flex">
		<div>
			<img alt="image-dracaufeu" src="https://o.remove.bg/downloads/64456514-4dfb-4c37-8a4a-583f188c950e/image-removebg-preview.png">
			<img alt="image-dracolosse" src="https://o.remove.bg/downloads/f3801b6a-896e-4e0b-9012-42a217bd897c/image-removebg-preview.png">
			<img alt="image-picachu" src="https://o.remove.bg/downloads/a200bc01-9f78-4ccd-a55f-1746fae13f3a/image-removebg-preview.png">
		</div>

	<form method="post" action="create-pokemon?done=true">

			<div class="formulaire-div">
				<label for="name">Nom : </label>
		    	<input type="text" id="name" name="name" value="name" required />
	    	</div>
	    	<div class="formulaire-div">
		    	<label for="life_points">Points de vie :</label>
		    	<input type="text" id="life_points" name="life_points" value="life_points" required />
	    	</div>
	    	<div class="formulaire-div">
				<label for="attack_strength">Force d'attaque : </label>
	    		<input type="text" id="attack_strength" name="attack_strength" value="attack_strength" required />
	    	</div>
	    	<div class="formulaire-div">
				<label for="defence_strength">Force de defense : </label>
	    		<input type="text" id="defence_strength" name="defence_strength" value="defence_strength" required />
	    	</div>
	    	<div class="formulaire-div">
				<label for="speed">Vitesse : </label>
	    		<input type="text" id="speed" name="speed" value="speed" required />
	    	</div>
	    	<div class="formulaire-div">
		    	<label for="type">Type de pokemon :</label>
				<select name="type" id="type">
				    <option value="">--Please choose an option--</option>
				    <option value="FIRE">FEU</option>
				    <option value="WATER">EAU</option>
				    <option value="PLANT">HERBE</option>
				</select>
			</div>
    	<button type="submit" >Creer le pokemon</button>
    </form>
    
    <c:if test="${done == true }">
	    <div>
		${capacityList }
			<form method="POST" action="create-pokemon?finished=true">
				<label for="capacity">Capacité : </label>
				<select>
		    		<c:forEach items="${capacityList }" var="capacity">
		    				<option value="${capacity.id}">
		    					<c:out value="${capacity.name }"></c:out>
		    					<c:out value="${capacity.power }"></c:out>
		    					<c:out value="${capacity.type }"></c:out>
		    				</option>
		    		</c:forEach>
		    	</select>
	    		<button type="submit"><fmt:message key="msg.pokemon.add.capacity"></fmt:message></button>
	    	</form>
		</div>
	</c:if>
    <div>
		<img alt="image-dracaufeu" src="https://o.remove.bg/downloads/64456514-4dfb-4c37-8a4a-583f188c950e/image-removebg-preview.png">
		<img alt="image-dracolosse" src="https://o.remove.bg/downloads/f3801b6a-896e-4e0b-9012-42a217bd897c/image-removebg-preview.png">
		<img alt="image-picachu" src="https://o.remove.bg/downloads/a200bc01-9f78-4ccd-a55f-1746fae13f3a/image-removebg-preview.png">
	</div>
</div>
	
</body>
</html>