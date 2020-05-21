<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<title>Full accessibilitat local</title>
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
<script>
	function init() {
		var tipoLocal = document.getElementById("codiTipoLocal").value;
		if(tipoLocal == "1") {
			document.getElementById("frm1").style.display = "";
		} else if(tipoLocal == "2") {
			document.getElementById("frm2").style.display = "";
		} else if(tipoLocal == "3") {
			document.getElementById("frm3").style.display = "";
		} else if(tipoLocal == "4") {
			document.getElementById("frm4").style.display = "";
		} else if(tipoLocal == "5") {
			document.getElementById("frm5").style.display = "";
		} else if(tipoLocal == "6") {
			document.getElementById("frm6").style.display = "";
		}			
	}

	function altaAccessibilitat() {
		var tipoLocal = document.getElementById("codiTipoLocal").value;
		if(tipoLocal == "1") {
			document.frm1.submit();
		} else if(tipoLocal == "2") {
			document.frm2.submit();
		} else if(tipoLocal == "3") {
			document.frm3.submit();
		} else if(tipoLocal == "4") {
			document.frm4.submit();
		} else if(tipoLocal == "5") {
			document.frm5.submit();
		} else if(tipoLocal == "6") {
			document.frm6.submit();
		}	
	}
</script>
<body onload="init();">
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
		
		<input type="hidden" id="codiLocal" name="codiLocal" value="<%= request.getAttribute("codiLocal") %>"/>
		<input type="hidden" id="codiTipoLocal" name="codiTipoLocal" value="<%= request.getAttribute("codiTipoLocal") %>"/>
		
		<!-- BARS I RESTAURANTS -->
		<form id="frm1" name="frm1" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>ESCALA O ESGLAÓ D'ENTRADA (MÉS DE 5 CM) <td>
					<td><input id=1 name="1" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LA PORTA PERMET L'ENTRADA DE CADIRA DE RODES <td>
					<td><input id=2 name="2" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PERMET LA VISIBILITAT DE L'ESPAI INTERIOR DES DE L'EXTERIOR <td>
					<td><input id="3" name="3" type="checkbox"/></td>
				</tr>
				<tr>
					<td>RAMPA O ELEMENTS D'ACCESSIBILITAT A L'ENTRADA (PLATAFORMA ELEVADORA) <td>
					<td><input id="4" name="4" type="checkbox"/></td>
				</tr>
				<tr>
					<td>BONA SENYALITZACIÓ DE LES MESURES DE SEGURETAT <td>
					<td><input id="6" name="6" type="checkbox"/></td>
				</tr>
				<tr>
					<td>CARTA BRAILLE, AMPLIACIÓ DE LA LLETRA, RELLEU <td>
					<td><input id="7" name="7" type="checkbox"/></td>
				</tr>
				<tr>
					<td>CARTA EN LLENGUATGE SIMPLE, SIMBOLOGIA, ESCRITA EN DUES LLENGÜES <td>
					<td><input id="8" name="8" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INFORMACIÓ AL CLIENT EN PANELLS, PISSARRES DE FORMA VISIBLE <td>
					<td><input id="9" name="9" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DESNIVELLS O OBSTACLES A LA VIA PÚBLICA <td>
					<td><input id="10" name="10" type="checkbox"/></td>
				</tr>
				<tr>
					<td>OBSTACLES VORERA <td>
					<td><input id="11" name="11" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL MOBILIARI ÉS ESTABLE (ELEMENTS DECORATIUS QUE PODEN SER OBSTACLES) <td>
					<td><input id="16" name="16" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INTERIOR LLIURE D'OBSTACLES (1 M MINIM D'AMPLADA PER PODER CIRCULAR) <td>
					<td><input id="17" name="17" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LAVABOS ACCESSIBLES <td>
					<td><input id="18" name="18" type="checkbox"/></td>
				</tr>
				<tr>
					<td>MOBILIARI QUE PERMET CONTACTE VISUAL DIRECTE (TAULES RODONES, VISUALITZACIÓ DE L'ENTRADA) <td>
					<td><input id="19" name="19" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTÉNCIA DE BARANA A LA RAMPA <td>
					<td><input id="20" name="20" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ATENCIÓ DEL SERVEI A LES TAULES <td>
					<td><select id="5" name="5" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>L'AMPLADA DELS PASSADISSOS PERMET EL PASS DE LA CADIRA DE RODES <td>
					<td><select id="13" name="13" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>BONA IL·LUMINACIÓ DE L'ESTABLIMENT <td>
					<td><select id="14" name="14" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>CAMP DE VISIÓ DE L'ESPAI SENSE OBSTACLES <td>
					<td><select id="15" name="15" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
		<!-- HOTELS -->
		<form id="frm2" name="frm2" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>ESCALA O ESGLAÓ D'ENTRADA (MÉS DE 5 CM) <td>
					<td><input id=1 name="1" type="checkbox" value="1"/></td>
				</tr>
				<tr>
					<td>LA PORTA PERMET L'ENTRADA DE CADIRA DE RODES <td>
					<td><input id=2 name="2" type="checkbox" value="2"/></td>
				</tr>
				<tr>
					<td>RAMPA O ELEMENTS D'ACCESSIBILITAT A L'ENTRADA (PLATAFORMA ELEVADORA) <td>
					<td><input id="4" name="4" type="checkbox" value="4"/></td>
				</tr>
				<tr>
					<td>DESNIVELLS O OBSTACLES A LA VIA PÚBLICA <td>
					<td><input id="10" name="10" type="checkbox"/></td>
				</tr>
				<tr>
					<td>OBSTACLES VORERA <td>
					<td><input id="11" name="11" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INTERIOR LLIURE D'OBSTACLES (1 M MINIM D'AMPLADA PER PODER CIRCULAR) <td>
					<td><input id="17" name="17" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTÉNCIA DE BARANA A LA RAMPA <td>
					<td><input id="20" name="20" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ACCESS A NIVELL O AMB UN ESGLAÓ INFERIOR A 2 CM <td>
					<td><input id="21" name="21" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTA SUFICIENTMENT IL·LUMINADA <td>
					<td><input id="22" name="22" type="checkbox"/></td>
				</tr>
				<tr>
					<td>AJUTS TÈCNICS PER A PERSONES AMB DISCAPACITAT AUDITIVA <td>
					<td><input id="23" name="23" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTEIX PLÀNOL DEL LLOC ON ETS, EN BRAILLE O RELLEU <td>
					<td><input id="24" name="24" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INFORMACIÓ DEL RECINTE PER A PERSONES AMB DISCAPACITAT VISUAL <td>
					<td><input id="25" name="25" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LA IL·LUMINACIÓ NATURAL/ARTIFICIAL GENERAL DEL RECINTE ÉS ADEQUADA<td>
					<td><input id="26" name="26" type="checkbox"/></td>
				</tr>
				<tr>
					<td>TENEN PERSONAL FORMAT PER A L'ATENCIÓ DE PERSONES AMB DISCAPACITAT <td>
					<td><input id="27" name="27" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PARADA DE TRANSPORT PÚBLIC PROPERA <td>
					<td><input id="28" name="28" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ALARMA AL BANY <td>
					<td><input id="30" name="30" type="checkbox"/></td>
				</tr>
				<tr>
					<td>BANY ADAPTAT <td>
					<td><input id="31" name="31" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSEN D'INSTAL·LACIÓ DOMESTICA <td>
					<td><input id="32" name="32" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ESPAI ENTRE MOBLES SUPERIOR O IGUAL A 80 CM <td>
					<td><input id="33" name="33" type="checkbox"/></td>
				</tr>
				<tr>
					<td>HI HA MÉS DE DOS HABITACIONS ADAPTADES <td>
					<td><input id="34" name="34" type="checkbox"/></td>
				</tr>
				<tr>
					<td>L'AMPLADA DE LES PORTES PERMET EL PAS D'UNA CADIRA DE RODES <td>
					<td><input id="35" name="35" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LES DIMENSIONS DEL BANY I LES PORTES SÓN ADEQUADES (AJUDES TÉCNIQUES, BANYERA AMB SUPORT, DUTXA A NIVELL, ALÇADA MIRALL) <td>
					<td><input id="36" name="36" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PERMET FER UN GIR DE 1,5 M <td>
					<td><input id="37" name="37" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ASCENSOR ACCESSIBLE EN DIMENSIONS I ALÇADA DELS POLSADORS <td>
					<td><input id="38" name="38" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSA DE FACILITATS O ADAPTACIONS PER A PERSONES AMB DISCAPACITAT VISUAL (POLSADORS EN BRAILLE, RELLEU O INFORMACIÓ ACÚSTICA, ...) <td>
					<td><input id="39" name="39" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSA DE FACILITATS PER A PERSONES AMB DISCAPACITAT AUDITIVA (INDICADORS LLUMINOSOS, INTERCOMUNICADORS ACCESSIBLES, ...) <td>
					<td><input id="40" name="40" type="checkbox"/></td>
				</tr>
				<tr>
					<td>TAULELL A DUES ALTURES DIFERENTS <td>
					<td><input id="41" name="41" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ALARMA SONORA I LLUMINOSA <td>
					<td><input id="42" name="42" type="checkbox"/></td>
				</tr>
				<tr>
					<td>BANYS ADAPTATS <td>
					<td><input id="43" name="43" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LES PORTES TENEN ELS PARÀMETRES ADEQUATS (AMPLADES, TIRADORS A L'ALÇADA ADEQUADA, PORTES DE VIDRE SENYALITZADES) <td>
					<td><input id="44" name="44" type="checkbox"/></td>
				</tr>
				<tr>
					<td>MESURES D'EVACUACIÓ PER A PERSONES AMB DISCAPACITAT <td>
					<td><input id="45" name="45" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PAVIMENT LLISCANT O AMB MOQUETA <td>
					<td><input id="46" name="46" type="checkbox"/></td>
				</tr>
				<tr>
					<td>L'AMPLADA DELS PASSADISSOS PERMET EL PASS DE LA CADIRA DE RODES <td>
					<td><select id="13" name="13" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>ACCESSIBILITAT DEL LLIT (ALÇADA) <td>
					<td><select id="29" name="29" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
		<!-- COMERÇOS -->
		<form id="frm3" name="frm3" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>ESCALA O ESGLAÓ D'ENTRADA (MÉS DE 5 CM) <td>
					<td><input id=1 name="1" type="checkbox" value="1"/></td>
				</tr>
				<tr>
					<td>LA PORTA PERMET L'ENTRADA DE CADIRA DE RODES <td>
					<td><input id=2 name="2" type="checkbox" value="2"/></td>
				</tr>
				<tr>
					<td>DESNIVELLS O OBSTACLES A LA VIA PÚBLICA <td>
					<td><input id="10" name="10" type="checkbox"/></td>
				</tr>
				<tr>
					<td>OBSTACLES VORERA <td>
					<td><input id="11" name="11" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL MOBILIARI ÉS ESTABLE (ELEMENTS DECORATIUS QUE PODEN SER OBSTACLES) <td>
					<td><input id="16" name="16" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INTERIOR LLIURE D'OBSTACLES (1 M MINIM D'AMPLADA PER PODER CIRCULAR) <td>
					<td><input id="17" name="17" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LAVABOS ACCESSIBLES <td>
					<td><input id="18" name="18" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTÉNCIA DE BARANA A LA RAMPA <td>
					<td><input id="20" name="20" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ACCESS A NIVELL O AMB UN ESGLAÓ INFERIOR A 2 CM <td>
					<td><input id="21" name="21" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTA SUFICIENTMENT IL·LUMINADA <td>
					<td><input id="22" name="22" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PARADA DE TRANSPORT PÚBLIC PROPERA <td>
					<td><input id="28" name="28" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTES AUTOMÀTIQUES <td>
					<td><input id="47" name="47" type="checkbox"/></td>
				</tr>
				<tr>
					<td>RAMPA AMB ELS PARÀMETRES ADEQUATS (AMPLADA, PENDENT, BARANES, REPLANS, INTERMEDIS) <td>
					<td><input id="48" name="48" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ALÇADA PRESTATGE MENYS DE 1,4 METRES <td>
					<td><input id="49" name="49" type="checkbox"/></td>
				</tr>
				<tr>
					<td>CAIXA ACCESSIBLE <td>
					<td><input id="50" name="50" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXPOSITORS MENYS DE 1,4 METRES <td>
					<td><input id="51" name="51" type="checkbox"/></td>
				</tr>
				<tr>
					<td>VESTUARI ACCESSIBLE <td>
					<td><input id="52" name="52" type="checkbox"/></td>
				</tr>
				<tr>
					<td>VESTUARI AMB SEIENT <td>
					<td><input id="53" name="53" type="checkbox"/></td>
				</tr>
				<tr>
					<td>L'AMPLADA DELS PASSADISSOS PERMET EL PASS DE LA CADIRA DE RODES <td>
					<td><select id="13" name="13" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>BONA IL·LUMINACIÓ DE L'ESTABLIMENT <td>
					<td><select id="14" name="14" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>CAMP DE VISIÓ DE L'ESPAI SENSE OBSTACLES <td>
					<td><select id="15" name="15" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
		<!-- FARMÀCIES -->
		<form id="frm4" name="frm4" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>OBSTACLES VORERA <td>
					<td><input id="11" name="11" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>TENEN PERSONAL FORMAT PER A L'ATENCIÓ DE PERSONES AMB DISCAPACITAT <td>
					<td><input id="27" name="27" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PARADA DE TRANSPORT PÚBLIC PROPERA <td>
					<td><input id="28" name="28" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSA DE FACILITATS O ADAPTACIONS PER A PERSONES AMB DISCAPACITAT VISUAL (POLSADORS EN BRAILLE, RELLEU O INFORMACIÓ ACÚSTICA, ...) <td>
					<td><input id="39" name="39" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSA DE FACILITATS PER A PERSONES AMB DISCAPACITAT AUDITIVA (INDICADORS LLUMINOSOS, INTERCOMUNICADORS ACCESSIBLES, ...) <td>
					<td><input id="40" name="40" type="checkbox"/></td>
				</tr>
				<tr>
					<td>TAULELL A DUES ALTURES DIFERENTS <td>
					<td><input id="41" name="41" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTES AUTOMÀTIQUES <td>
					<td><input id="47" name="47" type="checkbox"/></td>
				</tr>
				<tr>
					<td>RAMPA AMB ELS PARÀMETRES ADEQUATS (AMPLADA, PENDENT, BARANES, REPLANS, INTERMEDIS) <td>
					<td><input id="48" name="48" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DISPOSA DE PLATAFORMA ELEVADORA <td>
					<td><input id="54" name="54" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ENTRADA ACCESSIBLE (A NIVELL, RAMPA O ELEVADOR) <td>
					<td><input id="55" name="55" type="checkbox"/></td>
				</tr>
				<tr>
					<td>SENYALITZACIÓ EXTERIOR DE L'EDIFICI COM A FARMÀCIA <td>
					<td><input id="56" name="56" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL TAULELL PERMET L'APROXIMACIÓ DE LA PERSONA EN CADIRA DE RODES <td>
					<td><input id="57" name="57" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTEIX DESNIVELL INTERIOR <td>
					<td><input id="58" name="58" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PAVIMENT DUR I ANTILLISCANT <td>
					<td><input id="59" name="59" type="checkbox"/></td>
				</tr>
				<tr>
					<td>"L'ALÇADA DEL SISTEMA D'ALARMA/FINESTRETA DE LES FARMÀCIES DE GUÀRDIA PERMET A LA PERSONA AMB MOBILITAT REDUÏDA ACCEDIR-HI <td>
					<td><input id="60" name="60" type="checkbox"/></td>
				</tr>
				<tr>
					<td>RETOLACIONS DELS PRODUCTES, PREUS I INFORMACIONS D'HORARIS I FARMÀCIES DE GUÀRDIA AMB CRITERIS D'ACCESSIBILITAT <td>
					<td><input id="61" name="61" type="checkbox"/></td>
				</tr>
				<tr>
					<td>L'AMPLADA DELS PASSADISSOS PERMET EL PASS DE LA CADIRA DE RODES <td>
					<td><select id="13" name="13" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>BONA IL·LUMINACIÓ DE L'ESTABLIMENT <td>
					<td><select id="14" name="14" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
		<!-- LOCAL PÚBLIC -->
		<form id="frm5" name="frm5" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>ESCALA O ESGLAÓ D'ENTRADA (MÉS DE 5 CM) <td>
					<td><input id=1 name="1" type="checkbox" value="1"/></td>
				</tr>
				<tr>
					<td>LA PORTA PERMET L'ENTRADA DE CADIRA DE RODES <td>
					<td><input id=2 name="2" type="checkbox" value="2"/></td>
				</tr>
				<tr>
					<td>RAMPA O ELEMENTS D'ACCESSIBILITAT A L'ENTRADA (PLATAFORMA ELEVADORA) <td>
					<td><input id="4" name="4" type="checkbox" value="4"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INTERIOR LLIURE D'OBSTACLES (1 M MINIM D'AMPLADA PER PODER CIRCULAR) <td>
					<td><input id="17" name="17" type="checkbox"/></td>
				</tr>
				<tr>
					<td>LAVABOS ACCESSIBLES <td>
					<td><input id="18" name="18" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTÉNCIA DE BARANA A LA RAMPA <td>
					<td><input id="20" name="20" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ASCENSOR ACCESSIBLE EN DIMENSIONS I ALÇADA DELS POLSADORS <td>
					<td><input id="38" name="38" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTES AUTOMÀTIQUES <td>
					<td><input id="47" name="47" type="checkbox"/></td>
				</tr>
				<tr>
					<td>VESTUARI ACCESSIBLE <td>
					<td><input id="52" name="52" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ACCÉS A LA GRADERIA <td>
					<td><input id="62" name="62" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ASCENSOR POLSADORS EN BRAILLE <td>
					<td><input id="63" name="63" type="checkbox"/></td>
				</tr>
				<tr>
					<td>DUTXA ACCESSIBLE <td>
					<td><input id="64" name="64" type="checkbox"/></td>
				</tr>
				<tr>
					<td>BONA IL·LUMINACIÓ DE L'ESTABLIMENT <td>
					<td><select id="14" name="14" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
		<!-- ENTITAT BANCÀRIA -->
		<form id="frm6" name="frm6" method="post" action="sAltaAccessibilitat" style="display: none">
			<input type="hidden" id="codiLocal1" name="codiLocal1" value="<%= request.getAttribute("codiLocal") %>"/>
			<input type="hidden" id="codiTipoLocal1" name="codiTipoLocal1" value="<%= request.getAttribute("codiTipoLocal") %>"/>
			<table>
				<tr>
					<td style="text-align: center"><h1 class="w3-text-teal">FULLA ACCESSIBILITAT <%= request.getAttribute("nomLocal") %></h1></td>
				</tr>
				<tr>
					<td>ESCALA O ESGLAÓ D'ENTRADA (MÉS DE 5 CM) <td>
					<td><input id=1 name="1" type="checkbox" value="1"/></td>
				</tr>
				<tr>
					<td>LA PORTA PERMET L'ENTRADA DE CADIRA DE RODES <td>
					<td><input id=2 name="2" type="checkbox" value="2"/></td>
				</tr>
				<tr>
					<td>DESNIVELLS O OBSTACLES A LA VIA PÚBLICA <td>
					<td><input id="10" name="10" type="checkbox"/></td>
				</tr>
				<tr>
					<td>OBSTACLES VORERA <td>
					<td><input id="11" name="11" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ZONA D'APARCAMENT PER A PERSONES AMB MOBILITAT REDUÍDA PRÓXIMA <td>
					<td><input id="12" name="12" type="checkbox"/></td>
				</tr>
				<tr>
					<td>INTERIOR LLIURE D'OBSTACLES (1 M MINIM D'AMPLADA PER PODER CIRCULAR) <td>
					<td><input id="17" name="17" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EXISTÉNCIA DE BARANA A LA RAMPA <td>
					<td><input id="20" name="20" type="checkbox"/></td>
				</tr>
				<tr>
					<td>ACCESS A NIVELL O AMB UN ESGLAÓ INFERIOR A 2 CM <td>
					<td><input id="21" name="21" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PORTA SUFICIENTMENT IL·LUMINADA <td>
					<td><input id="22" name="22" type="checkbox"/></td>
				</tr>
				<tr>
					<td>TENEN PERSONAL FORMAT PER A L'ATENCIÓ DE PERSONES AMB DISCAPACITAT <td>
					<td><input id="27" name="27" type="checkbox"/></td>
				</tr>
				<tr>
					<td>PARADA DE TRANSPORT PÚBLIC PROPERA <td>
					<td><input id="28" name="28" type="checkbox"/></td>
				</tr>
				<tr>
					<td>RAMPA AMB ELS PARÀMETRES ADEQUATS (AMPLADA, PENDENT, BARANES, REPLANS, INTERMEDIS) <td>
					<td><input id="48" name="48" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL TAULELL PERMET L'APROXIMACIÓ DE LA PERSONA EN CADIRA DE RODES <td>
					<td><input id="57" name="57" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL TAULELL PERMET L'APROXIMACIÓ DE LA PERSONA EN CADIRA DE RODES <td>
					<td><input id="65" name="65" type="checkbox"/></td>
				</tr>
				<tr>
					<td>EL TAULELL PERMET L'APROXIMACIÓ DE LA PERSONA EN CADIRA DE RODES <td>
					<td><input id="65" name="65" type="checkbox"/></td>
				</tr>
				<tr>
					<td>L'AMPLADA DELS PASSADISSOS PERMET EL PASS DE LA CADIRA DE RODES <td>
					<td><select id="13" name="13" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr>
					<td>BONA IL·LUMINACIÓ DE L'ESTABLIMENT <td>
					<td><select id="14" name="14" style="width:50px">
							<option value="0">-	- -</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
						</select><td>
				</tr>
				<tr><td>&#160;</td></tr>
				<tr>
					<td style="text-align: center">
						<button type="button" style="width:200px;height: 40px;background-color:#4CAF50;border-top:none;border-botom:none;border-left:none;border-right:none;color:white" onclick="altaAccessibilitat();">
							FINALITZA
						</button>
					</td>
				</tr>
			</table>
		</form>
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
</script>

</body>
</html>
