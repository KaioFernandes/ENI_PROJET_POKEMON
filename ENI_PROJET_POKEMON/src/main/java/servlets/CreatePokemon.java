package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Capacity;
import beans.Pokemon;
import dao.PokemonDAO;
import dao.PokemonDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.CapacityService;
import services.CapacityServiceImpl;
import services.PokemonService;
import services.PokemonServiceImpl;

/**
 * Servlet implementation class CreatePokemon
 */
@WebServlet("/create-pokemon")
public class CreatePokemon extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CreatePokemon() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/create-pokemon.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PokemonService pokemonService = new PokemonServiceImpl();
		Pokemon pokemon = new Pokemon();
		
		pokemon.setName(request.getParameter("name"));
		pokemon.setLifePoints(Integer.parseInt(request.getParameter("life_points")));
		pokemon.setAttackStrength(Integer.parseInt(request.getParameter("attack_strength")));
		pokemon.setDefenceStrength(Integer.parseInt(request.getParameter("defence_strength")));
		pokemon.setSpeed(Integer.parseInt(request.getParameter("speed")));
		pokemon.setType(request.getParameter("type"));
		
		
		
		CapacityService capacityService = new CapacityServiceImpl();
		List<Capacity> capacityList = capacityService.findAll();
		List<Capacity> filteredList = new ArrayList<Capacity>();
		for (Capacity capacity : capacityList) {
			if(capacity.getType().equalsIgnoreCase(pokemon.getType())) {
				filteredList.add(capacity);
			}
				
		}
		System.out.println(filteredList);
		
		request.setAttribute("capacityList", filteredList);
		request.setAttribute("done", request.getParameter("done"));
		
		if(request.getParameter("finished") != null && request.getParameter("finished").equals(true)) {
			pokemon.setType(request.getParameter("type"));
			pokemonService.create(pokemon);
			
		}
		
		System.out.println("pokemon crée");
		doGet(request, response);
		
	}

}
