package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import server.AccessibilitatLocal;
import server.Dispatcher;
import server.DispatcherServiceLocator;
import server.Local;

/**
 * Servlet implementation class SvlVerificarLocals
 */
@WebServlet("/sVerificarLocals")
public class SvlVerificarLocals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlVerificarLocals() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		try {
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/verificar_locals.html").forward(request, response);
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
			Local local = port.verificarLocal(Long.valueOf(codiLocal));
			AccessibilitatLocal [] llistaAccessibilitats = port.getListAccessibilitatLocal(0L, Long.valueOf(codiLocal), 0L, "");
			HttpSession session = request.getSession(true);
			session.setAttribute("locals", local); 
			session.setAttribute("llistaAccessibilitats", llistaAccessibilitats); 
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/sDetallLocal").forward(request, response);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
