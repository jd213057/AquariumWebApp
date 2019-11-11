package jd.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jd.entities.Aquarium;
import jd.entities.Constantes;
import jd.services.AquariumService;


@WebServlet("/AllSavingsServlets")
public class AllSavingsServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public AllSavingsServlets() {
        super();
   
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AquariumService service = (AquariumService) getServletContext().getAttribute(Constantes.AQUARIUM_SERVICE);
		String page =""; 
			List<Aquarium> aquarium = service.getAllAquariumRecords();
			request.setAttribute("aquarium", aquarium);
			page ="/show-records.jsp";
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
