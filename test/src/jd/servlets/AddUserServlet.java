package jd.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jd.entities.Constantes;
import jd.entities.Utilisateur;
import jd.services.AquariumService;


@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AquariumService service = (AquariumService) getServletContext().getAttribute(Constantes.AQUARIUM_SERVICE);
		String page =""; 
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		int age =Integer.parseInt(request.getParameter("age"));
		String user = request.getParameter("user");
		String password = request.getParameter("password");
			
		if(age<=0 || nom.isEmpty()||nom==null || prenom.isEmpty() || prenom==null ) page="/index.jsp";

		else {	Utilisateur utilisateur = new Utilisateur( nom, prenom, age, user, password);
		service.create(utilisateur);
		page ="/show-contacts.jsp";}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
