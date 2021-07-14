<%-- 
    Document   : detail
    Created on : Jul 10, 2021, 10:06:24 AM
    Author     : TrungLT 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homestay Booking</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Resort Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <!-- pop-up -->
        <link rel="stylesheet" href="css/lightbox.css">
        <!-- //pop-up -->
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />

        <link rel="stylesheet" type="text/css" href="css/zoomslider.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <link href="css/font-awesome.css" rel="stylesheet">
        <script type="text/javascript" src="js/modernizr-2.6.2.min.js"></script>
        <!--/web-fonts-->
        <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i" rel="stylesheet">
        <!--//web-fonts-->
        <style>
            #ab{
                background-color: #f5f5f5;
                padding-top: 60px;
            }

            #ab p span{
                font-weight: bold;
                color: #ff401b;
            }

            input[type=number]{
                background: rgba(0, 0, 0, 0);
                border: solid 2px #ffffff;
                width: 293px;
                height: 35px;
                color: white;
            }

            input[type=text]::placeholder{
                color: white;
            }
        </style>
    </head>
    <body>
        <!--menu-->
        <jsp:include page="menu.jsp" flush="true"/>
        <!--menu-->

        <!-- details -->
        <c:set value="${homestay}" var="h"/>
        <div class="about-bottom" id="ab">
            <div class="col-md-6 w3l_about_bottom_right two">
                <h3 class="tittle why">${h.name}</h3>
                <p>${h.type.name} - ${h.type.acreage}m2</p>
                <p><span>Address:</span> ${h.address}</p>
                <p><span>Facilities:</span> ${h.type.rooms} ${h.type.rooms==1 ? "room" : "rooms"} - ${h.type.beds} ${h.type.beds==1 ? "bed" : "beds"} - ${h.type.bathrooms} ${h.type.rooms==1 ? "bathroom" : "bathrooms"} (max ${h.type.capacity} guests)</p>
                <p><span>Description:</span> ${h.description}</p>
            </div>

            <div class="col-md-6 w3l_about_bottom_left">    
                <img src="${h.image}" alt="homestay-img" class="img-responsive" />
                <div class="w3l_about_bottom_left_video book-text">
                    <!--<h4>${h.type.price}$/night</h4>-->
                    <div class="book-form">
                        <h4>${h.type.price}$<span style="font-size:15px">/night</span></h4>
                        <form action="book" method="post" name="book" onsubmit="return checkDate(this)">
                            <input type="hidden" value="${h.id}" name="id">
                            <div class="col-md-6 form-date-w3-agileits">
                                <label><i class="fa fa-calendar" aria-hidden="true"></i>Arrival Date :</label>
                                <input name="datefrom" type="date" required="" style="color: white;">
                            </div>
                            <div class="col-md-6 form-date-w3-agileits">
                                <label><i class="fa fa-calendar" aria-hidden="true"></i>Departure Date :</label>
                                <input name="dateto" type="date" required="" style="color: white;">
                            </div>
                            <div class="col-md-6 form-date-w3-agileits">
                                <label><i class="fa fa-users" aria-hidden="true"></i> No.of People :</label>
                                <input name="people" type="number" min="1" max="${h.type.capacity}" value="1" required="">
                            </div>
                            <div class="clearfix"> </div>
                            <div class="make wow shake" data-wow-duration="1s" data-wow-delay=".5s">
                                <input type="submit" value="Book Now">
                            </div>
                        </form>
                    </div>
                </div>
            </div>
            <div class="clearfix"> </div>
        </div>
        <!-- //details -->

        <!--footer-->
        <jsp:include page="footer.jsp" flush="true"/>
        <!--//footer-->

        <script language="JavaScript" type="text/javascript">
            function checkDate(book) {
                var currDate = new Date();
                var arrDate = new Date(book.datefrom.value);
                var depDate = new Date(book.dateto.value);

                if (arrDate.getTime() < currDate.getTime() || depDate.getTime() < currDate.getTime()) {
                    alert("The date should be after the current date!");
                    return false;
                }

                if (depDate.getTime() <= arrDate.getTime()) {
                    alert("The arrival date should be after the departure date!");
                    return false;
                }

                return true;
            }
        </script>
    </body>
</html>
