package dynamic;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;

public class SimpleServletContextListner implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Servlet context");
        ServletRegistration.Dynamic registration = sce.getServletContext().addServlet("dynamic", DynamicServlet.class);
        registration.addMapping("/dynamic");
    }
}
