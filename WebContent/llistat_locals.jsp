<!DOCTYPE html>
<html lang="en">
<title>Llistat Locals</title>
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
    <a href="sLlistatLocals" class="w3-bar-item w3-button w3-theme-l1">BUSCAR LOCALS</a>
    <a href="sAltaLocal" class="w3-bar-item w3-button w3-hide-small w3-hover-white">AFEGIR LOCALS</a>
    <a href="sVerificarLocals" class="w3-bar-item w3-button w3-hide-small w3-hover-white">VERIFICAR LOCALS</a>
    <a href="sEliminarLocals" class="w3-bar-item w3-button w3-hide-small w3-hover-white">ELIMINAR LOCALS</a>
  </div>
</div>

<!-- Sidebar -->
<nav class="w3-sidebar w3-bar-block w3-collapse w3-large w3-theme-l5 w3-animate-left" id="mySidebar">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="Close Menu">
    <i class="fa fa-remove"></i>
  </a>
  <form id="frm" name="frm" method="post" action="sLlistatLocals" >
	  <h4 class="w3-bar-item"><b>Filtre</b></h4>
	  <a class="w3-bar-item">Nom Local</a>
	  <input class="w3-hover-black" id="nomLocal" name="nomLocal" type="text" style="width:200px;margin-left:20px;"/>
	  <a class="w3-bar-item">Tipus Local</a>
		<select id="coditipolocal" name="coditipolocal" style="width:200px;height:33px;margin-left:20px;">
			<option>-	-	-</option>
			<option id="1">BARS I RESTAURANTS</option>
			<option id="2">HOTELS</option>
			<option id="3">COMERÇOS</option>
			<option id="4">FARMÀCIES</option>
			<option id="5">LOCALS PÚBLICS</option>
			<option id="6">ENTITATS BANCÀRIES</option>
		</select>
	  <a class="w3-bar-item">Codi Carrer</a>
	  <input class="w3-hover-black" id="codicarrer" name="codicarrer" type="text" style="width:200px;margin-left:20px;"/>
	  <a class="w3-bar-item">Nom Carrer</a>
	  <input class="w3-hover-black" id="nomcarrer" name="nomcarrer" type="text" style="width:200px;margin-left:20px;"/>
	  <a class="w3-bar-item">Número</a>
	  <input class="w3-hover-black" id="numero" name="numero" type="text" style="width:200px;margin-left:20px;"/>
	  <a class="w3-bar-item">Nom Característica</a>
		<select id="coditipolocal" name="coditipolocal" style="width:200px;height:33px;margin-left:20px;">
			<option>-	-	-</option>
			<option id="1">BARS I RESTAURANTS</option>
			<option id="2">HOTELS</option>
			<option id="3">COMERÇOS</option>
			<option id="4">FARMÀCIES</option>
			<option id="5">LOCALS PÚBLICS</option>
			<option id="6">ENTITATS BANCÀRIES</option>
		</select>
	  <a class="w3-bar-item"></a>
	  <a onClick="document.frm.submit();" style="margin-left:150px;padding-top:50px;"><img border="0" alt="Buscar" src="https://w7.pngwing.com/pngs/608/913/png-transparent-computer-icons-google-search-symbol-mobile-search-search-for-miscellaneous-logo-mobile-phones.png" width="90" height="50"></a>  
</form>
	</nav>
	
	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>
	
	<!-- Main content: shift it to the right by 250 pixels when the sidebar is visible -->
	<div class="w3-main" style="margin-left:250px">
	  <div class="w3-row w3-padding-64">
	    <div class="w3-container">
	      <h1 class="w3-text-teal">Llistat locals</h1>
	          <TABLE style="width:100%;">
	            <TR>
	                <TH>Nom Local</TH>
	                <TH>Tipus</TH>
	                <TH>City</TH>
	                <TH>State</TH>
	                <TH>Country</TH>
	            </TR>
	            <TR>
	                <TD> </td>
	                <TD> </TD>
	                <TD> </TD>
	                <TD> </TD>
	                <TD> ></TD>
	            </TR>
	        </TABLE>
  		</div>
  <!-- Pagination -->
  <div class="w3-center w3-padding-32">
    <div class="w3-bar">
      <a class="w3-button w3-black" href="#">1</a>
      <a class="w3-button w3-hover-black" href="#">2</a>
      <a class="w3-button w3-hover-black" href="#">3</a>
      <a class="w3-button w3-hover-black" href="#">4</a>
      <a class="w3-button w3-hover-black" href="#">5</a>
      <a class="w3-button w3-hover-black" href="#">»</a>
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
</script>

</body>
</html>
