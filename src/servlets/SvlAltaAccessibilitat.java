package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import server.Dispatcher;
import server.DispatcherServiceLocator;

/**
 * Servlet implementation class SvlAltaAccessibilitat
 */
@WebServlet("/sAltaAccessibilitat")
public class SvlAltaAccessibilitat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SvlAltaAccessibilitat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
		} catch(Exception e) {
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			DispatcherServiceLocator service = new DispatcherServiceLocator();
			Dispatcher disp = service.getDispatcherPort();
			
			Long codiLocal = Long.valueOf(request.getParameter("codiLocal1"));
			Long codiTipoLocal = Long.valueOf(request.getParameter("codiTipoLocal1"));
			
			if(codiTipoLocal.equals(new Long(1))) {
				if(request.getParameter("1") != null) disp.crearAccessibilitat(codiLocal, new Long(1), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(1), new Long(0), "N");
				
				if(request.getParameter("2") != null) disp.crearAccessibilitat(codiLocal, new Long(2), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(2), new Long(0), "N");
				
				if(request.getParameter("3") != null) disp.crearAccessibilitat(codiLocal, new Long(3), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(3), new Long(0), "N");
				
				if(request.getParameter("4") != null) disp.crearAccessibilitat(codiLocal, new Long(4), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(4), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(5), new Long(request.getParameter("5")), "N");
				
				if(request.getParameter("6") != null) disp.crearAccessibilitat(codiLocal, new Long(6), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(6), new Long(0), "N");
				
				if(request.getParameter("7") != null) disp.crearAccessibilitat(codiLocal, new Long(7), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(7), new Long(0), "N");
				
				if(request.getParameter("8") != null) disp.crearAccessibilitat(codiLocal, new Long(8), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(8), new Long(0), "N");
				
				if(request.getParameter("9") != null) disp.crearAccessibilitat(codiLocal, new Long(9), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(9), new Long(0), "N");
				
				if(request.getParameter("10") != null) disp.crearAccessibilitat(codiLocal, new Long(10), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(10), new Long(0), "N");
				
				if(request.getParameter("11") != null) disp.crearAccessibilitat(codiLocal, new Long(11), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(11), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(13), new Long(request.getParameter("13")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(14), new Long(request.getParameter("14")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(15), new Long(request.getParameter("15")), "N");
				
				if(request.getParameter("16") != null) disp.crearAccessibilitat(codiLocal, new Long(16), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(16), new Long(0), "N");
				
				if(request.getParameter("17") != null) disp.crearAccessibilitat(codiLocal, new Long(17), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(17), new Long(0), "N");
				
				if(request.getParameter("18") != null) disp.crearAccessibilitat(codiLocal, new Long(18), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(18), new Long(0), "N");
				
				if(request.getParameter("19") != null) disp.crearAccessibilitat(codiLocal, new Long(19), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(19), new Long(0), "N");
				
				if(request.getParameter("20") != null) disp.crearAccessibilitat(codiLocal, new Long(20), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(20), new Long(0), "N");
				
			} else if(codiTipoLocal.equals(new Long(2))) {
				if(request.getParameter("1") != null) disp.crearAccessibilitat(codiLocal, new Long(1), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(1), new Long(0), "N");
				
				if(request.getParameter("2") != null) disp.crearAccessibilitat(codiLocal, new Long(2), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(2), new Long(0), "N");
				
				if(request.getParameter("4") != null) disp.crearAccessibilitat(codiLocal, new Long(4), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(4), new Long(0), "N");
				
				if(request.getParameter("10") != null) disp.crearAccessibilitat(codiLocal, new Long(10), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(10), new Long(0), "N");
				
				if(request.getParameter("10") != null) disp.crearAccessibilitat(codiLocal, new Long(10), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(10), new Long(0), "N");
				
				if(request.getParameter("11") != null) disp.crearAccessibilitat(codiLocal, new Long(11), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(11), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(13), new Long(request.getParameter("13")), "N");
				
				if(request.getParameter("17") != null) disp.crearAccessibilitat(codiLocal, new Long(17), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(17), new Long(0), "N");
				
				if(request.getParameter("20") != null) disp.crearAccessibilitat(codiLocal, new Long(20), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(20), new Long(0), "N");
				
				if(request.getParameter("21") != null) disp.crearAccessibilitat(codiLocal, new Long(21), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(21), new Long(0), "N");
				
				if(request.getParameter("22") != null) disp.crearAccessibilitat(codiLocal, new Long(22), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(22), new Long(0), "N");
				
				if(request.getParameter("23") != null) disp.crearAccessibilitat(codiLocal, new Long(23), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(23), new Long(0), "N");
				
				if(request.getParameter("24") != null) disp.crearAccessibilitat(codiLocal, new Long(24), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(24), new Long(0), "N");
				
				if(request.getParameter("25") != null) disp.crearAccessibilitat(codiLocal, new Long(25), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(25), new Long(0), "N");
				
				if(request.getParameter("26") != null) disp.crearAccessibilitat(codiLocal, new Long(26), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(26), new Long(0), "N");
				
				if(request.getParameter("27") != null) disp.crearAccessibilitat(codiLocal, new Long(27), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(27), new Long(0), "N");
				
				if(request.getParameter("28") != null) disp.crearAccessibilitat(codiLocal, new Long(28), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(28), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(29), new Long(request.getParameter("29")), "N");
				
				if(request.getParameter("30") != null) disp.crearAccessibilitat(codiLocal, new Long(30), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(30), new Long(0), "N");
				
				if(request.getParameter("31") != null) disp.crearAccessibilitat(codiLocal, new Long(31), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(31), new Long(0), "N");
				
				if(request.getParameter("32") != null) disp.crearAccessibilitat(codiLocal, new Long(32), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(32), new Long(0), "N");
				
				if(request.getParameter("33") != null) disp.crearAccessibilitat(codiLocal, new Long(33), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(33), new Long(0), "N");
				
				if(request.getParameter("34") != null) disp.crearAccessibilitat(codiLocal, new Long(34), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(34), new Long(0), "N");
				
				if(request.getParameter("35") != null) disp.crearAccessibilitat(codiLocal, new Long(35), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(35), new Long(0), "N");
				
				if(request.getParameter("36") != null) disp.crearAccessibilitat(codiLocal, new Long(36), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(36), new Long(0), "N");
				
				if(request.getParameter("37") != null) disp.crearAccessibilitat(codiLocal, new Long(37), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(37), new Long(0), "N");
				
				if(request.getParameter("38") != null) disp.crearAccessibilitat(codiLocal, new Long(38), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(38), new Long(0), "N");
				
				if(request.getParameter("39") != null) disp.crearAccessibilitat(codiLocal, new Long(39), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(39), new Long(0), "N");
				
				if(request.getParameter("40") != null) disp.crearAccessibilitat(codiLocal, new Long(40), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(40), new Long(0), "N");
				
				if(request.getParameter("41") != null) disp.crearAccessibilitat(codiLocal, new Long(41), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(41), new Long(0), "N");
				
				if(request.getParameter("42") != null) disp.crearAccessibilitat(codiLocal, new Long(42), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(42), new Long(0), "N");
				
				if(request.getParameter("43") != null) disp.crearAccessibilitat(codiLocal, new Long(43), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(43), new Long(0), "N");
				
				if(request.getParameter("44") != null) disp.crearAccessibilitat(codiLocal, new Long(44), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(44), new Long(0), "N");
				
				if(request.getParameter("45") != null) disp.crearAccessibilitat(codiLocal, new Long(45), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(45), new Long(0), "N");
				
				if(request.getParameter("46") != null) disp.crearAccessibilitat(codiLocal, new Long(46), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(46), new Long(0), "N");
				
			} else if(codiTipoLocal.equals(new Long(3))) {
				if(request.getParameter("1") != null) disp.crearAccessibilitat(codiLocal, new Long(1), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(1), new Long(0), "N");
				
				if(request.getParameter("2") != null) disp.crearAccessibilitat(codiLocal, new Long(2), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(2), new Long(0), "N");
				
				if(request.getParameter("10") != null) disp.crearAccessibilitat(codiLocal, new Long(10), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(10), new Long(0), "N");
				
				if(request.getParameter("11") != null) disp.crearAccessibilitat(codiLocal, new Long(11), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(11), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(13), new Long(request.getParameter("13")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(14), new Long(request.getParameter("14")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(15), new Long(request.getParameter("15")), "N");
				
				if(request.getParameter("16") != null) disp.crearAccessibilitat(codiLocal, new Long(16), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(16), new Long(0), "N");
				
				if(request.getParameter("17") != null) disp.crearAccessibilitat(codiLocal, new Long(17), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(17), new Long(0), "N");
				
				if(request.getParameter("18") != null) disp.crearAccessibilitat(codiLocal, new Long(18), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(18), new Long(0), "N");
				
				if(request.getParameter("20") != null) disp.crearAccessibilitat(codiLocal, new Long(20), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(20), new Long(0), "N");
				
				if(request.getParameter("21") != null) disp.crearAccessibilitat(codiLocal, new Long(21), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(21), new Long(0), "N");
				
				if(request.getParameter("22") != null) disp.crearAccessibilitat(codiLocal, new Long(22), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(22), new Long(0), "N");
				
				if(request.getParameter("28") != null) disp.crearAccessibilitat(codiLocal, new Long(28), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(28), new Long(0), "N");
				
				if(request.getParameter("47") != null) disp.crearAccessibilitat(codiLocal, new Long(47), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(47), new Long(0), "N");
				
				if(request.getParameter("48") != null) disp.crearAccessibilitat(codiLocal, new Long(48), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(48), new Long(0), "N");
				
				if(request.getParameter("49") != null) disp.crearAccessibilitat(codiLocal, new Long(49), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(49), new Long(0), "N");
				
				if(request.getParameter("50") != null) disp.crearAccessibilitat(codiLocal, new Long(50), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(50), new Long(0), "N");
				
				if(request.getParameter("51") != null) disp.crearAccessibilitat(codiLocal, new Long(51), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(51), new Long(0), "N");
				
				if(request.getParameter("52") != null) disp.crearAccessibilitat(codiLocal, new Long(52), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(52), new Long(0), "N");
				
				if(request.getParameter("53") != null) disp.crearAccessibilitat(codiLocal, new Long(53), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(53), new Long(0), "N");
				
			} else if(codiTipoLocal.equals(new Long(4))) {
				if(request.getParameter("11") != null) disp.crearAccessibilitat(codiLocal, new Long(11), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(11), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(13), new Long(request.getParameter("13")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(14), new Long(request.getParameter("14")), "N");
				
				if(request.getParameter("27") != null) disp.crearAccessibilitat(codiLocal, new Long(27), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(27), new Long(0), "N");
				
				if(request.getParameter("28") != null) disp.crearAccessibilitat(codiLocal, new Long(28), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(28), new Long(0), "N");
				
				if(request.getParameter("39") != null) disp.crearAccessibilitat(codiLocal, new Long(39), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(39), new Long(0), "N");
				
				if(request.getParameter("40") != null) disp.crearAccessibilitat(codiLocal, new Long(40), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(40), new Long(0), "N");
				
				if(request.getParameter("41") != null) disp.crearAccessibilitat(codiLocal, new Long(41), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(41), new Long(0), "N");
				
				if(request.getParameter("47") != null) disp.crearAccessibilitat(codiLocal, new Long(47), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(47), new Long(0), "N");
				
				if(request.getParameter("48") != null) disp.crearAccessibilitat(codiLocal, new Long(48), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(48), new Long(0), "N");
				
				if(request.getParameter("54") != null) disp.crearAccessibilitat(codiLocal, new Long(54), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(54), new Long(0), "N");
				
				if(request.getParameter("55") != null) disp.crearAccessibilitat(codiLocal, new Long(55), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(55), new Long(0), "N");
				
				if(request.getParameter("56") != null) disp.crearAccessibilitat(codiLocal, new Long(56), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(56), new Long(0), "N");
				
				if(request.getParameter("57") != null) disp.crearAccessibilitat(codiLocal, new Long(57), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(57), new Long(0), "N");
				
				if(request.getParameter("58") != null) disp.crearAccessibilitat(codiLocal, new Long(58), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(58), new Long(0), "N");
				
				if(request.getParameter("59") != null) disp.crearAccessibilitat(codiLocal, new Long(59), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(59), new Long(0), "N");
				
				if(request.getParameter("60") != null) disp.crearAccessibilitat(codiLocal, new Long(60), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(60), new Long(0), "N");
				
				if(request.getParameter("61") != null) disp.crearAccessibilitat(codiLocal, new Long(61), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(61), new Long(0), "N");
			
			} else if(codiTipoLocal.equals(new Long(5))) {
				
				if(request.getParameter("1") != null) disp.crearAccessibilitat(codiLocal, new Long(1), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(1), new Long(0), "N");
				
				if(request.getParameter("2") != null) disp.crearAccessibilitat(codiLocal, new Long(2), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(2), new Long(0), "N");
				
				if(request.getParameter("4") != null) disp.crearAccessibilitat(codiLocal, new Long(4), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(4), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(14), new Long(request.getParameter("14")), "N");
				
				if(request.getParameter("17") != null) disp.crearAccessibilitat(codiLocal, new Long(17), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(17), new Long(0), "N");
				
				if(request.getParameter("18") != null) disp.crearAccessibilitat(codiLocal, new Long(18), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(18), new Long(0), "N");
				
				if(request.getParameter("20") != null) disp.crearAccessibilitat(codiLocal, new Long(20), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(20), new Long(0), "N");
				
				if(request.getParameter("38") != null) disp.crearAccessibilitat(codiLocal, new Long(38), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(38), new Long(0), "N");
				
				if(request.getParameter("47") != null) disp.crearAccessibilitat(codiLocal, new Long(47), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(47), new Long(0), "N");
				
				if(request.getParameter("52") != null) disp.crearAccessibilitat(codiLocal, new Long(52), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(52), new Long(0), "N");
				
				if(request.getParameter("62") != null) disp.crearAccessibilitat(codiLocal, new Long(62), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(62), new Long(0), "N");
				
				if(request.getParameter("63") != null) disp.crearAccessibilitat(codiLocal, new Long(63), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(63), new Long(0), "N");
				
				if(request.getParameter("64") != null) disp.crearAccessibilitat(codiLocal, new Long(64), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(64), new Long(0), "N");
				
			} else if(codiTipoLocal.equals(new Long(6))) {
				if(request.getParameter("1") != null) disp.crearAccessibilitat(codiLocal, new Long(1), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(1), new Long(0), "N");
				
				if(request.getParameter("2") != null) disp.crearAccessibilitat(codiLocal, new Long(2), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(2), new Long(0), "N");
				
				if(request.getParameter("10") != null) disp.crearAccessibilitat(codiLocal, new Long(10), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(10), new Long(0), "N");
				
				if(request.getParameter("11") != null) disp.crearAccessibilitat(codiLocal, new Long(11), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(11), new Long(0), "N");
				
				if(request.getParameter("12") != null) disp.crearAccessibilitat(codiLocal, new Long(12), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(12), new Long(0), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(13), new Long(request.getParameter("13")), "N");
				
				disp.crearAccessibilitat(codiLocal, new Long(14), new Long(request.getParameter("14")), "N");
				
				if(request.getParameter("17") != null) disp.crearAccessibilitat(codiLocal, new Long(17), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(17), new Long(0), "N");
				
				if(request.getParameter("20") != null) disp.crearAccessibilitat(codiLocal, new Long(20), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(20), new Long(0), "N");
				
				if(request.getParameter("21") != null) disp.crearAccessibilitat(codiLocal, new Long(21), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(21), new Long(0), "N");
				
				if(request.getParameter("22") != null) disp.crearAccessibilitat(codiLocal, new Long(22), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(22), new Long(0), "N");
				
				if(request.getParameter("27") != null) disp.crearAccessibilitat(codiLocal, new Long(27), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(27), new Long(0), "N");
				
				if(request.getParameter("28") != null) disp.crearAccessibilitat(codiLocal, new Long(28), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(28), new Long(0), "N");
				
				if(request.getParameter("48") != null) disp.crearAccessibilitat(codiLocal, new Long(48), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(48), new Long(0), "N");
				
				if(request.getParameter("57") != null) disp.crearAccessibilitat(codiLocal, new Long(57), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(57), new Long(0), "N");
				
				if(request.getParameter("65") != null) disp.crearAccessibilitat(codiLocal, new Long(65), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(65), new Long(0), "N");
				
				if(request.getParameter("66") != null) disp.crearAccessibilitat(codiLocal, new Long(66), new Long(1), "N");
				else disp.crearAccessibilitat(codiLocal, new Long(66), new Long(0), "N");
			}
			
			ServletContext context = getServletContext();
			context.getRequestDispatcher("/llistat_locals.jsp").forward(request, response);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
