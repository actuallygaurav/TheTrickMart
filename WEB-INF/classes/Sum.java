import javax.servlet.*;
import java.io.IOException;

public class Sum extends GenericServlet {

	int i = 0;

	public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html");

		java.io.PrintWriter out = res.getWriter();

		i+=10;

		try {

			int n1 = Integer.parseInt(req.getParameter("n1"));

			int n2 = Integer.parseInt(req.getParameter("n2"));

			int total = n1 + n2;

			// out.println("<head><body>");
			// out.println("");
			// out.println("");
			// out.println("");

			out.println("<h1><center style='color:blue; font-size: 20px' >Sum is: "+ total +"</centrt></h1>");

		} catch(Exception e) {
			out.println("<h1><center style='color:red; font-size: "+i+"px' >Wrong Input</centrt></h1>");
		} finally {

			//i=0;

		}
	}
}