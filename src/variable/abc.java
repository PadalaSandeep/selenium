 

 

<%@page import="com.src.pack.Interact"%>

 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

       pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="Website">

<head>

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet"

       href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script

       src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script

       src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 

<title>TD Tracking Checker</title>

 

<script src="http://code.angularjs.org/angular-1.0.0rc6.min.js"></script>

<script type="text/javascript" src="js/website.js"></script>

<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" href="css/website.css">

 

<style>

#copyrights {

       position: absolute;

       right: 0px;

       bottom: 0px;

}

</style>

 

</head>

 

<body ng-controller="Mainctrl">

 

       <img class="img-responsive" alt="Revenue TD Tracking Detector"

              src="Images/final.jpg" width="1366" height="50">

 

       <div class="container">

              <h2>Welcome to Tracking Detector</h2>

              <ul class="nav nav-tabs">

                     <li class="active"><a data-toggle="tab" href="#home">Express</a></li>

                     <li><a data-toggle="tab" href="#menu1">Ground</a></li>

                     <li><a data-toggle="tab" href="#menu2">Smartpost</a></li>

              </ul>

 

              <div class="tab-content">

                     <div id="home" class="tab-pane fade in active">

                     <h3></h3>

                           <form action="Myservelete" id="Express-form" method="get">

                                  <div class="form-inline">

                                         <label>Please enter your tracking number:</label> <input

                                                id="Trackingnumber-Express" type="text" name="TEPEXP" width="500"

                                                class="form-control" />

                                  </div>

 

                                  <br> <label>Select your level:</label> <select

                                         class="btn btn-info" name="SP-Level">

                                         <option id="Express" value="L2">L2</option>

                                         <option id="Express" value="L3">L3</option>

                                  </select> <br> <br> <input type="submit" value="Submit"

                                         class="btn btn-success" />

                           </form>

                     </div>

 

                     <div id="menu1" class="tab-pane fade">

                     <h3></h3>

                           <form action="Myservelete" id="Ground-form" method="get">

                                  <div class="form-inline">

                                         <label>Please enter your tracking number:</label> <input

                                                id="Trackingnumber-Ground" type="text" name="TEPGRD" width="500"

                                                class="form-control" />

                                  </div>

 

                                  <br> <label>Select your level:</label> <select

                                         class="btn btn-info" name="SP-Level">

                                         <option id="Ground" value="L2">L2</option>

                                         <option id="Ground" value="L3">L3</option>

                                  </select> <br> <br> <input type="submit" value="Submit"

                                         class="btn btn-success" />

                           </form>

                     </div>

 

 

                     <div id="menu2" class="tab-pane fade">

                     <h3></h3>

                           <form action="Myservelete" id="SP-form">

                                  <div class="form-inline">

                                         <label>Please enter your tracking number:</label> <input

                                                id="Trackingnumber-SP" type="text" name="TEPSP" width="500"

                                                class="form-control" />

                                  </div>

 

                                  <br> <label>Select your level:</label> <select

                                         class="btn btn-info" name="SP-Level">

                                         <option id="SP" value="L2">L2</option>

                                         <option id="SP" value="L3">L3</option>

                                  </select> <br> <br> <input type="submit" value="Submit"

                                         class="btn btn-success" />

                           </form>

                     </div>

              </div>

 

              <h3>

                     <label id="copyrights">©Revenue Test Design</label>

              </h3>

 

       </div>

</body>

</html>

 

 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="com.src.pack.Interact"%>

<%@page import="com.src.pack.IdeaSelenium"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

 

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<title>Ground Tracking check</title>

<script type="text/javascript">

 

$(window).bind("load", function() {

      

 

 

       var Tracking= document.getElementById("Trackingid");

       Tracking.innerHTML = '<%= Interact.getTrkng()%>';

       var date = document.getElementById("Date")

       date.innerHTML = Date();

 

       var C1= document.getElementById("Circle1");

       var C2= document.getElementById("Circle2");

       var C3 = document.getElementById("Circle3");

       var C4= document.getElementById("Circle4");

       var C5= document.getElementById("Circle5");

 

 

       var idea= '<%= Interact.getInvoicedcolor()%>';

 

       if (idea=="Green"){

             

 

 

              setTimeout(function() {

                     C1.style.background = "limegreen";

              setTimeout(function() {

                     C2.style.background = "limegreen";

              setTimeout(function() {

                     C3.style.background = "limegreen";

              setTimeout(function() {

                     C4.style.background = "limegreen";

              setTimeout(function() {

                     C5.style.background = "limegreen";

                                                       }, 1500);

 

                                                       }, 1500);

 

                                                       }, 1500);

                                                      

                                                       }, 1500);

                                                      

                                                       }, 1500);

                    

                                 

 

                     }

                    

       else {

              C1.style.background = "limegreen";

              C2.style.background = "Red";

       }

 

});

 

 

function help(){

      

       alert("Email issue to below mail id's:\n\nSandeep_Padala@syntelinc.com\nPandramish_SaiKrishna@syntelinc.com")

}

</script>

 

<style>

#image1{

position: absolute;

       left: 40px;

       top: 340px;

}


#Arrow1 {

position: absolute;

       left: 140px;

       top: 365px;

}


#File1{

position: absolute;

       left: 175px;

       top: 350px;

}


#Arrow2 {

position: absolute;

       left: 260px;

       top: 365px;

}


#image2{

position: absolute;

       left: 300px;

       top: 325px;

}


#Arrow3 {

position: absolute;

       left: 460px;

       top: 365px;

}


#File2{

position: absolute;

       left: 510px;

       top: 350px;

}


#Arrow4 {

position: absolute;

       left: 630px;

       top: 365px;

}


#Database1 {

position: absolute;

       left: 680px;

       top: 350px;

}


#Arrow5 {

position: absolute;

       left: 780px;

       top: 365px;

}


#Database2{

position: absolute;

       left: 830px;

       top: 350px;

}


#label1{

position: absolute;

       left: 40px;

       top: 450px;

}

#label2{

position: absolute;

       left: 170px;

       top: 450px;

}

 

#label3{

position: absolute;

       left: 380px;

       top: 480px;

}

 

#label4{

position: absolute;

       left: 695px;

       top: 450px;

}

 

#label5{

position: absolute;

       left: 833px;

       top: 450px;

}

 

#label6{

position: absolute;

       left: 10px;

       top: 100px;

}

 

#label7{

position: absolute;

       left: 10px;

       top: 135px;

}

 

#Trackingid {

              position: absolute;

              left: 215px;

              top: 120px;

              color: limegreen;

}

 

#Date {

              position: absolute;

              left: 85px;

              top: 160px;

              color: blue;

}

 

#Circle1 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 63px;

       top: 270px;

}

 

#Circle2 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 180px;

       top: 270px;

}

 

#Circle3 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 380px;

       top: 270px;

}

 

#Circle4 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 687px;

       top: 270px;

}

 

#Circle5 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 833px;

       top: 270px;

}

 

#Circle6 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 50px;

       top: 600px;

}

 

#Circle7 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: Red;

       position: absolute;

       left: 50px;

       top: 650px;

}

 

#Circle8 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: limegreen;

       position: absolute;

       left: 50px;

       top: 700px;

}

 

#progress {

       position: absolute;

       left: 100px;

       top: 605px;

}

 

#stuck {

       position: absolute;

       left: 100px;

       top: 655px;

}

 

#passed {

       position: absolute;

       left: 100px;

       top: 705px;

}

 

#home{

position: absolute;

       left: 10px;

       top: 23px;

}

 

#Help{

position: absolute;

       left: 76px;

       top: 23px;

}


</style>


</head>

<center><h1 style="background-color:LightGray;">Checking Ground tracking number</h1></center>

<br>

<br>

<body>

<h3 id="label6">Tracking Number :</h3>

<h3 id="label7">Date :</h3>

<h5><label id="label1" style=text-align:center;>Online/Offline <br> Client</label></h5>

<h5><label id="label2" style=text-align:center;>Not in final <br> file</label></h5>

<h4><label id="label3" style=text-align:center;> Ground</label></h4>

<h5><label id="label4" style=text-align:center;>DLRS</label></h5>

<h5><label id="label5" style=text-align:center;> IDEA <br> Database</label></h5>

<i class="material-icons" style="font-size:90px" id="image1">&#xe30a;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow1">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow2">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow3">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow4">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow5">&#xf178;</i>

<i class="fa fa-database" style="font-size:75px" id="Database1"></i>

<i class="fa fa-database" style="font-size:75px" id="Database2"></i>

<i style="font-size:75px" class="fa" id="File1">&#xf15c;</i>

<i style="font-size:75px" class="fa" id="File2">&#xf15c;</i>

<img src="Images/truck.png" id="image2">

<label id="Circle1"></label>

<label id="Circle2"></label>

<label id="Circle3"></label>

<label id="Circle4"></label>

<label id="Circle5"></label>

<label id="Circle6"></label>

<label id="Circle7"></label>

<label id="Circle8"></label>

<label id="progress">In Progress</label>

<label id="stuck">Stuck</label>

<label id="passed">Passed</label>

 

<h3><p id="Trackingid"></p></h3>

<h4><p id="Date"></p></h4>

 

<h4><a href="Tracking-input.jsp" class="btn btn-success" id="home">Home</a></h4>

<button class="btn btn-success" id="Help" onclick="help();">Help</button>

</body>

</html>


 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@page import="com.src.pack.Interact"%>

<%@page import="com.src.pack.IdeaSelenium"%>

<%@page import="com.src.domesticExp.seleniumdmep"%>

 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<meta name="viewport" content="width=device-width, initial-scale=1">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

<title>DomesticExpress Tracking check</title>

<script type="text/javascript">

 

$(window).bind("load", function(){

               

                var Tracking= document.getElementById("Trackingid");

                Tracking.innerHTML = '<%= Interact.getTrkng()%>';

                var date = document.getElementById("Date")

                date.innerHTML = Date();

               

                var C1= document.getElementById("Circle1");

                var C2= document.getElementById("Circle2");

                var C9= document.getElementById("Circle9");

                var C10= document.getElementById("Circle10");

                var C3 = document.getElementById("Circle3");

                var C4= document.getElementById("Circle4");

                var C5= document.getElementById("Circle5");

               

                var idea= '<%= Interact.getInvoicedcolor()%>';

               

if (idea=="Green"){

                               

 

 

                                setTimeout(function() {

                                                C1.style.background = "limegreen";

                                setTimeout(function() {

                                                C2.style.background = "limegreen";

                                                setTimeout(function() {

                                                                C9.style.background = "limegreen";

                                                                setTimeout(function() {

                                                                                C10.style.background = "limegreen";

                                setTimeout(function() {

                                                C3.style.background = "limegreen";

                                setTimeout(function() {

                                                C4.style.background = "limegreen";

                                setTimeout(function() {

                                                C5.style.background = "limegreen";

                                               

                                                                                                                                }, 1500);

 

                                                                                                                                }, 1500);

 

                                                                                                                                }, 1500);

                                                                }, 1500);

                                                }, 1500);

                                                                                                                                }, 1500);

                                                                                                                               

                                                                                                                                }, 1500);

                                               

                                                                               

 

                                                }

                                               

else {

               

                var dmepbst= '<%= Interact.getDmepbst()%>';

               

                if(dmepbst=="NF"){

                               

                                setTimeout(function() {

                                                C1.style.background = "limegreen";

                                               

                                                setTimeout(function() {

                                                                C2.style.background = "red";

                                                               

                                                }, 1500);               

                                }, 1500);

                                }

               

                else if (dmepbst=="TER"){

                               

                                setTimeout(function() {

                                                C1.style.background = "limegreen";

                                               

                                                setTimeout(function() {

                                                                C10.style.background = "red";

                                                               

                                                }, 1500);               

                                }, 1500);

                               

                }

               

                else if (dmepbst=="ER") {

                                setTimeout(function() {

                                                C1.style.background = "limegreen";

                                               

                                                setTimeout(function() {

                                                                C9.style.background = "red";

                                                               

                                                }, 1500);               

                                }, 1500);

               

                }

               

                else {

                                alert("Something went wrong")}

}

});

 

 

function help(){

               

                alert("Any issues please report to below mail id's:\n\nSandeep_Padala@syntelinc.com\nPandramish_SaiKrishna@syntelinc.com")

}

</script>

 

<style>

#image1{

position: absolute;

       left: 40px;

       top: 340px;

}

#Arrow1 {

position: absolute;

       left: 175px;

       top: 365px;

}

 #iore{

position: absolute;

       left: 265px;

       top: 270px;

}

  #error{

position: absolute;

       left: 265px;

       top: 355px;

}

  #ter{

position: absolute;

       left: 265px;

       top: 435px;

}

#Arrow3 {

position: absolute;

       left: 440px;

       top: 365px;

}

#File2{

position: absolute;

       left: 510px;

       top: 350px;

}

#Arrow4 {

position: absolute;

       left: 610px;

       top: 365px;

}

#Database1 {

position: absolute;

       left: 680px;

       top: 350px;

}

#Arrow5 {

position: absolute;

       left: 780px;

       top: 365px;

}

#Database2{

position: absolute;

       left: 830px;

       top: 350px;

}

#label1{

position: absolute;

       left: 40px;

       top: 450px;

}

#label2{

position: absolute;

       left: 270px;

       top: 314px;

}

 

#label22{

position: absolute;

       left: 235px;

       top: 405px;

}

 

#label23{

position: absolute;

       left: 270px;

       top: 478px;

}

 

#label3{

position: absolute;

       left: 528px;

       top: 450px;

}

 

#label4{

position: absolute;

       left: 695px;

       top: 450px;

}

 

#label5{

position: absolute;

       left: 833px;

       top: 450px;

}

 

#label6{

position: absolute;

       left: 10px;

       top: 100px;

}

 

#label7{

position: absolute;

       left: 10px;

       top: 135px;

}

 

#Trackingid {

                                position: absolute;

                left: 215px;

                top: 120px;

                color: limegreen;

}

 

#Date {

                                position: absolute;

                left: 85px;

                top: 160px;

                color: blue;

}

 

#Circle1 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 63px;

       top: 270px;

}

 

#Circle2 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 330px;

       top: 270px;

}

 

#Circle9 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 330px;

       top: 355px;

}

 

#Circle10 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 330px;

       top: 440px;

}

#Circle3 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 520px;

       top: 270px;

}

 

#Circle4 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 687px;

       top: 270px;

}

 

#Circle5 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 833px;

       top: 270px;

}

 

#Circle6 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: yellow;

       position: absolute;

       left: 50px;

       top: 600px;

}

 

#Circle7 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: Red;

       position: absolute;

       left: 50px;

       top: 650px;

}

 

#Circle8 {

       width: 40px;

       height: 40px;

       -webkit-border-radius: 25px;

       -moz-border-radius: 25px;

       border-radius: 25px;

       background: limegreen;

       position: absolute;

       left: 50px;

       top: 700px;

}

 

#progress {

       position: absolute;

      left: 100px;

       top: 605px;

}

 

#stuck {

       position: absolute;

       left: 100px;

       top: 655px;

}

 

#passed {

       position: absolute;

       left: 100px;

       top: 705px;

}

 

#home{

position: absolute;

       left: 10px;

       top: 23px;

}

 

#Help{

position: absolute;

       left: 76px;

       top: 23px;

}

</style>

</head>

<center><h1 style="background-color:LightGray;">Domestic Express tracking check</h1></center>

<br>

<br>

<body>

<h3 id="label6">Tracking Number :</h3>

<h3 id="label7">Date :</h3>

<h5><label id="label1" style=text-align:center;>Online/Offline <br> Client</label></h5>

<h5><label id="label2" style=text-align:center;>ORE</label></h5>

<h5><label id="label22" style=text-align:center;>Error Correction</label></h5>

<h5><label id="label23" style=text-align:center;>TER</label></h5>

<h5><label id="label3" style=text-align:center;>PFI</label></h5>

<h5><label id="label4" style=text-align:center;>DLRS</label></h5>

<h5><label id="label5" style=text-align:center;> IDEA <br> Database</label></h5>

<i class="material-icons" style="font-size:90px" id="image1">&#xe30a;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow1">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow3">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow4">&#xf178;</i>

<i style="font-size:24px" style="lenght:50px" class="fa" id="Arrow5">&#xf178;</i>

<i class="fa fa-database" style="font-size:75px" id="Database1"></i>

<i class="fa fa-database" style="font-size:75px" id="Database2"></i>

<i style="font-size:75px" class="fa" id="File2">&#xf15c;</i>

<i style="font-size:40px" class="material-icons" id="iore">&#xe30b;</i>

<i style="font-size:40px" class="material-icons" id="error">&#xe30b;</i>

<i style="font-size:40px" class="material-icons" id="ter">&#xe30b;</i>

 

<label id="Circle1"></label>

<label id="Circle2"></label>

<label id="Circle3"></label>

<label id="Circle4"></label>

<label id="Circle5"></label>

<label id="Circle6"></label>

<label id="Circle7"></label>

<label id="Circle8"></label>

<label id="Circle9"></label>

<label id="Circle10"></label>

 

<label id="progress">In Progress</label>

<label id="stuck">Stuck</label>

<label id="passed">Passed</label>

 

<h3><p id="Trackingid"></p></h3>

<h4><p id="Date"></p></h4>

 

<h4><a href="Tracking-input.jsp" class="btn btn-success" id="home">Home</a></h4>

<button class="btn btn-success" id="Help" onclick="help();">Help</button>

</body>

</html>

 

 

Thanks and regards,

Sandeep Padala

Syntel Ltd. – Logistics & Travel

Nortel : 333262 Mobile: +91 9502991141

Description: cid:image001.gif@01CCA920.75850040 | Description: cid:image002.gif@01CCA920.75850040 Description: cid:image003.gif@01CCA920.75850040 Description: cid:image004.gif@01CCA920.75850040 Description: cid:image005.gif@01CCA920.75850040 Description: cid:image006.gif@01CCA920.75850040 Description: cid:image007.gif@01CCA920.75850040

 