package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import server.Dispatcher;
import server.DispatcherServiceLocator;
import server.Local;

/**
 * Servlet implementation class SvlLlistatLocals
 */
@WebServlet("/sLlistatLocals")
public class SvlLlistatLocals extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlLlistatLocals() {
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
			context.getRequestDispatcher("/llistat_locals.jsp").forward(request, response);
		} catch(Exception e) {
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DispatcherServiceLocator service = new DispatcherServiceLocator();
		try {
			Dispatcher port = service.getDispatcherPort();
			
			Local[] locals = port.getListLocal(Long.valueOf(request.getParameter("codiLocal")), Long.valueOf(request.getParameter("coditipolocal")), Long.valueOf(request.getParameter("codiCarrer")), request.getParameter("nomcarrer"), request.getParameter("nomVia"), Long.valueOf(request.getParameter("numero")), request.getParameter("nomLocal"), request.getParameter("obsrvacions"), request.getParameter("verificat"), Long.valueOf(request.getParameter("codicaracteristica")));
			HttpSession session = request.getSession(true);
			session.setAttribute("locals", locals); 
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/llistat_locals.jsp").forward(request, response);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
