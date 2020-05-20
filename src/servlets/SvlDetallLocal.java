package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import server.Dispatcher;
import server.DispatcherServiceLocator;
import server.Local;

/**
 * Servlet implementation class SvlDetallLocal
 */
@WebServlet("/sDetallLocal")
public class SvlDetallLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlDetallLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/detallLocal.jsp").forward(request, response);
		} catch(Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codiLocal = request.getParameter("CodiLocalClicat");
		DispatcherServiceLocator service = new DispatcherServiceLocator();
		try {
			Dispatcher port = service.getDispatcherPort();
			
			Local[] locals = port.getListLocal(Long.valueOf(codiLocal), 0L, 0L, "", "", 0L, "", "", "", 0L);
			HttpSession session = request.getSession(true);
			session.setAttribute("locals", locals); 
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/detallLocal.jsp").forward(request, response);
		} catch(Exception e) {
			
		}
	}

}
