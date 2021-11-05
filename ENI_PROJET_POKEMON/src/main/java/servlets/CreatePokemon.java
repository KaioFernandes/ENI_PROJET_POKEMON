package servlets;

import java.io.IOException;

import beans.Pokemon;
import beans.TypesEnum;
import dao.PokemonDAO;
import dao.PokemonDAOImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/create-pokemon.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PokemonService pokemonService = new PokemonServiceImpl();
		
		pokemonService.create(new Pokemon("toto", 10, 100, 50, 20, TypesEnum.FIRE,1));
		
		System.out.println("pokemon crée");
		doGet(request, response);
		
	}

}
