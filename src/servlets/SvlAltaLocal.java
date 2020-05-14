package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SvlAltaLocal
 */
@WebServlet("/sAltaLocal")
public class SvlAltaLocal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAltaLocal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/alta_local.html").forward(request, response);
		} catch(Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("nomlocal"));
		System.out.println(request.getParameter("coditipolocal"));
		System.out.println(request.getParameter("codicarrer"));
		System.out.println(request.getParameter("nomcarrer"));
		System.out.println(request.getParameter("nomvia"));
		System.out.println(request.getParameter("numero"));
		System.out.println(request.getParameter("observacions"));
		doGet(request, response);
	}

}
