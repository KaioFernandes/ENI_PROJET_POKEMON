package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import beans.Capacity;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import services.CapacityService;
import services.CapacityServiceImpl;

/**
 * Servlet implementation class CapacityServlet
 */
@WebServlet("/capacity")
public class CapacityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CapacityServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if( request.getAttribute("capacityList") == null) {
			List<Capacity> capacityList = new ArrayList<Capacity>();
			session.setAttribute("capacityList", capacityList);
		}
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/capacity.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Capacity capacity = new Capacity();
		HttpSession session = request.getSession();
		List<Capacity> capacityList = (List<Capacity>) session.getAttribute("capacityList");
		CapacityService capacityService = new CapacityServiceImpl();
		
		capacity.setName(request.getParameter("name"));
		capacity.setPower(Integer.valueOf(request.getParameter("power")));
		System.out.println("capacityType de la requette : " + request.getParameter("capacityType"));
		
		capacity.setType(request.getParameter("capacityType"));
	
		
		//System.out.println(capacity);
		capacityService.create(capacity);
		System.out.println(capacity);
		
		
		capacityList.add(capacity);
		
		request.setAttribute("capacityList", capacityList);
		
		//TODO: condition pour désactiver le lien de création de pokémon avant d'avoir 5? capacités minimum ?
		
		doGet(request, response);
	}

}
