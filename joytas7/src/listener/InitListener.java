package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import model.Product;

@WebListener
public class InitListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent sce)  {
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	ServletContext application=sce.getServletContext();
    	List<Product> list=new ArrayList<>();
    	application.setAttribute("list", list);
    }

}
