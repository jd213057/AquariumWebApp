package jd.servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jd.entities.Aquarium;
import jd.entities.Constantes;
import jd.services.AquariumService;


@WebServlet("/AddRecordServlet")
public class AddRecordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddRecordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AquariumService service = (AquariumService) getServletContext().getAttribute(Constantes.UNIT_NAME);
		String page =""; 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate derniereMaintenance = LocalDate.parse(request.getParameter("derniereMaintenance"), formatter);
		LocalDate prochaineMaintenance = LocalDate.parse(request.getParameter("prochaineMaintenance"), formatter);
		String nameRecord = request.getParameter("nameRecord");
		boolean nourriture = request.getParameter("nourriture") != null;
		boolean changementEauBac = request.getParameter("changementEauBac") != null;
		boolean filtres = request.getParameter("filtres") != null;
		boolean revisionPompe = request.getParameter("revisionPompe") != null;
		boolean prefiltre = request.getParameter("prefiltre") != null;
		int nitrates = Integer.parseInt(request.getParameter("nitrates"));
		int nitrites = Integer.parseInt(request.getParameter("nitrites"));
		int co2 = Integer.parseInt(request.getParameter("co2"));
		int cl = Integer.parseInt(request.getParameter("cl"));
		int gH = Integer.parseInt(request.getParameter("gH"));
		int kH = Integer.parseInt(request.getParameter("kH"));
		double pH = Double.parseDouble(request.getParameter("pH"));
		String compositionRepas = request.getParameter("compositionRepas");
		String commentaire = request.getParameter("commentaire");
		if(nameRecord==null ||nameRecord.isEmpty()|| derniereMaintenance==null || compositionRepas.isEmpty() || compositionRepas==null ) page="/index.jsp";

		else {	Aquarium aquarium = new Aquarium(derniereMaintenance, prochaineMaintenance, nameRecord,
				nourriture, changementEauBac, filtres, revisionPompe, prefiltre,
				nitrates, nitrites, co2, pH, cl, gH, kH, compositionRepas,
				commentaire);
		service.create(aquarium);
		page ="/show-records.jsp";}
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher(page);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
