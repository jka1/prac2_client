<%@page import="server.AccessibilitatLocal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import ="server.Local"%>
<!DOCTYPE html>
<html lang="en">
<title>Afegir Locals</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif;}
.w3-sidebar {
  z-index: 3;
  width: 250px;
  top: 43px;
  bottom: 0;
  height: inherit;
}
</style>

<body>
<!-- Navbar -->
<div class="w3-top">
  <div class="w3-bar w3-theme w3-top w3-left-align w3-large">
    <a class="w3-bar-item w3-button w3-right w3-hide-large w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    <a href="sLlistatLocals" class="w3-bar-item w3-button w3-hide-small w3-hover-white">BUSCAR LOCALS</a>
    <a href="sAltaLocal" class="w3-bar-item w3-button w3-theme-l1">AFEGIR LOCALS</a>
    <a href="sVerificarLocals" class="w3-bar-item w3-button w3-hide-small w3-hover-white">VERIFICAR LOCALS</a>
    <a href="sEliminarLocals" class="w3-bar-item w3-button w3-hide-small w3-hover-white">ELIMINAR LOCALS</a>
  </div>
</div>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
<div class="w3-main" style="margin-left:250px">
	<div class="w3-row w3-padding-64">
		<div class="w3-twothird w3-container">
		<form id="frm" name="frm" method="post" action="sVerificarLocals" >
			<input id="CodiLocalClicat" name="CodiLocalClicat" type="hidden"/>
			<table>
			<%
			    	Local[] locals = (Local []) session.getAttribute("locals");
			
		    %>
				<tr>
					<td>&#160;</td>
					<td>&#160;</td>
					<td style="text-align: center"><h1 class="w3-text-teal"><%=locals[0].getNomLocal()%></h1></td>
				</tr>
				<tr>
					<td>Tipus Local: <td>
					<%
			    		if(locals[0].getCodiTipoLocal().toString().equals("1")){ %>
			    			<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="BARS I RESTAURANTS" readonly=""></td>
			    		<%} else if(locals[0].getCodiTipoLocal().toString().equals("2")){ %>
		    			<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="HOTELS" readonly=""></td>
		    		<%} else if(locals[0].getCodiTipoLocal().toString().equals("3")){ %>
	    				<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="COMERÇOS" readonly=""></td>
	    			<%} else if(locals[0].getCodiTipoLocal().toString().equals("4")){ %>
    					<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="FARMÀCIES" readonly=""></td>
    				<%} else if(locals[0].getCodiTipoLocal().toString().equals("5")){ %>
    					<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="LOCALS PÚBLICS" readonly=""></td>
    				<%}else if(locals[0].getCodiTipoLocal().toString().equals("6")){ %>
    					<td><input id="tipusLocal" name="tipusLocal" type="text" style="width:600px" maxlength="50" value="ENTITATS BANCÀRIES" readonly=""></td>
    				<%}%>
				</tr>
				<tr>
					<td>Nom Carrer: <td>
					<td><input id="nomcarrer" name="nomcarrer" type="text" style="width:600px" maxlength="50" value="<%=locals[0].getNomCarrer()%>" readonly=""></td>
				</tr>
				<tr>
					<td>Nom Via: <td>
					<td><input id="nomvia" name="nomvia" type="text" style="width:600px" maxlength="2" value="<%=locals[0].getNomVia()%>" readonly=""/></td>
				</tr>
				<tr>
					<td>Numero: <td>
					<td><input id="numero" name="numero" type="text" style="width:600px" value="<%=locals[0].getNumero()%>" readonly=""/></td>
				</tr>
				<tr>
					<td style="vertical-align: top">Observacions: <td>
					<td><textarea id="observacions" name="observacions" rows="4" style="width:600px" maxlength="300" value="<%=locals[0].getObservacions()%>" readonly=""></textarea></td>
				</tr>
				<tr>
					<td>&#160;</td>
				</tr>
				<tr>					
					<td style="text-align: left" colspan="3">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="verificarLocal(<%=locals[0].getCodiLocal()%>, '<%=locals[0].getVerificat()%>');">
							VERIFICAR
						</button>
					</td>
				</tr>
			</table>
		</form>
		</div>
		<div class="w3-third w3-container">
			<table>
				<tr>
					<td style="text-align: center" colspan="2"><h1 class="w3-text-teal">Llistat Accesibilitat</h1></td>
				</tr>
				<%
			    	AccessibilitatLocal[] accessibilitats = (AccessibilitatLocal []) session.getAttribute("llistaAccessibilitats");
		    	%>
	            <% 
	            
	            if(accessibilitats != null && accessibilitats.length != 0){	
	            	for(int i = 0; i < accessibilitats.length; i++) {
	            	AccessibilitatLocal accessibilitat = new AccessibilitatLocal();
                	accessibilitat = accessibilitats[i];

	            
            %>

            	<tr>
                <td style="text-align:left"><%=accessibilitat.getNomCaracteristicaCa()%>&#160;&#160;&#160;&#160;</td>
                <td><input type="checkbox" checked="<%=accessibilitat.getValor()%>"/></td>
               </tr>
            <%
            }
	            } else {
            %>
	            <TR>
	                <TD>No s'han trobat accessibilitats</td>
	                <TD> </TD>
	            </TR>
	       <%
            }
            %>
			</table>
	    </div>
	</div>
<!-- END MAIN -->
</div>
<script>

// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}

function verificarLocal(codiLocal, verificat){
	if(verificat == 'S'){
		alert('Aquest local ja ha estat verificat.')
	} else {
		var r = confirm("Segur que vols validar aquest local?");
		if (r == true) {
			document.getElementById('CodiLocalClicat').setAttribute('value', codiLocal);
			document.frm.submit();
		}
	}
}
</script>

</body>
</html>
