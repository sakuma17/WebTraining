package listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;

import model.Vegetable;

@WebListener
public class InitListener implements ServletContextListener {


    public void contextDestroyed(ServletContextEvent sce)  {
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	HttpSession session=request.getSession();
    	List<Vegetable> list=new ArrayList<>();
    	session.setAttribute("list", list);
    }

}
