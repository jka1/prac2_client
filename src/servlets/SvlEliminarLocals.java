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
 * Servlet implementation class SvlEliminarLocals
 */
@WebServlet("/sEliminarLocals")
public class SvlEliminarLocals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlEliminarLocals() {
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
			context.getRequestDispatcher("/sLlistatLocals").forward(request, response);
		} catch(Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codiLocal = request.getParameter("CodiLocalClicatEliminar");
		DispatcherServiceLocator service = new DispatcherServiceLocator();
		try {
			Dispatcher port = service.getDispatcherPort();
			port.baixaLocal(Long.valueOf(codiLocal));
			HttpSession session = request.getSession(true);
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/sLlistatLocals").forward(request, response);
		} catch(Exception e) {
			
		}
	}

}
