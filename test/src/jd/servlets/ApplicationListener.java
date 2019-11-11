package jd.servlets;

import java.util.logging.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import jd.entities.Constantes;
import jd.services.AquariumService;


@WebListener
public class ApplicationListener implements ServletContextListener {
	private static final Logger LOG = Logger.getLogger("aquarium");
  
    public void contextDestroyed(ServletContextEvent sce)  { 
    	LOG.info(">>> application démarée");
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("aquarium");
    	LOG.info(">>> EMF : "+emf);
    	ServletContext application = sce.getServletContext();
    	application.setAttribute(Constantes.EMF,  emf);
    	AquariumService service = new AquariumService(emf);
    	LOG.info(">>> service : "+service);
    	application.setAttribute(Constantes.AQUARIUM_SERVICE,  service);    
    }

	
    public void contextInitialized(ServletContextEvent sce)  { 
    	EntityManagerFactory emf = (EntityManagerFactory) sce.getServletContext().getAttribute(Constantes.EMF);
    	emf.close();
    	LOG.info(">>> application retirée");
    	LOG.info(">>> EMF closed ");
    }
	
}
