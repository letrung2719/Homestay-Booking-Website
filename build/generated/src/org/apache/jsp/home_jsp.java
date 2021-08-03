package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title>Homestay Booking</title>\n");
      out.write("        <!-- for-mobile-apps -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Resort Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- //for-mobile-apps -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!-- pop-up -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/lightbox.css\">\n");
      out.write("        <!-- //pop-up -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/zoomslider.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\">\n");
      out.write("        <script type=\"text/javascript\" src=\"js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!--/web-fonts-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("        <!--//web-fonts-->\n");
      out.write("        <style>\n");
      out.write("            figcaption p span{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .effect-apollo img{\n");
      out.write("                width: 350px;\n");
      out.write("                height: 388px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <!--/main-header-->\n");
      out.write("        <!--/banner-section-->        \n");
      out.write("        <div id=\"demo-1\">\n");
      out.write("            <div class=\"demo-inner-content\">\n");
      out.write("                <!--/header-w3l-->\n");
      out.write("                <div class=\"header-w3-agileits\" id=\"home\">\n");
      out.write("                    <div class=\"inner-header-agile\">\n");
      out.write("                        <nav class=\"navbar navbar-default\">\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <h1><a href=\"home.jsp\"><span>H</span>omestay <p class=\"s-log\">Booking</p></a></h1>\n");
      out.write("                            </div>\n");
      out.write("                            <!-- navbar-header -->\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li class=\"active\"><a href=\"home.jsp\">Home</a></li>\n");
      out.write("                                    <li><a href=\"discovery\">Discovery</a></li>\n");
      out.write("                                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"clearfix\"> </div>\n");
      out.write("                        </nav>\n");
      out.write("\n");
      out.write("                        <div class=\"w3ls_search\">\n");
      out.write("                            <div class=\"cd-main-header\">\n");
      out.write("                                <ul class=\"cd-header-buttons\">\n");
      out.write("                                    <li><a class=\"cd-search-trigger\" href=\"#cd-search\"> <span></span></a></li>\n");
      out.write("                                </ul> <!-- cd-header-buttons -->\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"cd-search\" class=\"cd-search\">\n");
      out.write("                                <form action=\"discovery\" method=\"get\">\n");
      out.write("                                    <input name=\"address\" type=\"search\" placeholder=\"Search...\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--//header-w3l-->\n");
      out.write("                    <!--/banner-info-->\n");
      out.write("                    <div class=\"baner-info\">\n");
      out.write("                        <h3><span>Welcome </span>To <span>Homestay </span> Booking");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("</h3>\n");
      out.write("                            <h4>Book Your Dream Homestay Destinations</h4>\n");
      out.write("                            <p>Enjoy Your Stay In</p>\n");
      out.write("                        </div>\n");
      out.write("                        <!--/banner-ingo-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--/banner-section-->\n");
      out.write("\n");
      out.write("            <!--//introduction-->\n");
      out.write("            <div class=\"special featured\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"ab-w3l-spa\">\n");
      out.write("                        <p>Book homes, homestay, car rental, experience and more on Homestay Booking. Meaningful travel experiences begin with us. Browse destination reviews and upgrade your trips by booking homes, apartments & rooms for rent on our great online platform.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--//introduction-->\n");
      out.write("\n");
      out.write("            <!--/content-inner-section-->\n");
      out.write("            <div class=\"w3_content_agilleinfo_inner\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"inner-agile-w3l-part-head\">\n");
      out.write("                        <h2 class=\"w3l-inner-h-title\">Recommended Destination</h2>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"gallery-grids\">\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"discovery\">\n");
      out.write("                                        <img src=\"images/city/hanoi.png\" alt=\"Địa điểm\"/>\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Ha Noi</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"\">\n");
      out.write("                                        <img src=\"images/city/hochiminh.png\" alt=\"Địa điểm\" />\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Ho Chi Minh</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"\">\n");
      out.write("                                        <img src=\"images/city/danang.png\" alt=\"Địa điểm\" />\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Da Nang</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"\">\n");
      out.write("                                        <img src=\"images/city/vungtau.png\" alt=\"Địa điểm\" />\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Vung Tau</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"\">\n");
      out.write("                                        <img src=\"images/city/dalat.png\" alt=\"Địa điểm\" />\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Da Lat</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 gallery-grid\">\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <figure class=\"effect-apollo\">\n");
      out.write("                                    <a class=\"example-image-link\" href=\"\">\n");
      out.write("                                        <img src=\"images/city/nhatrang.png\" alt=\"Địa điểm\" />\n");
      out.write("                                    </a>\n");
      out.write("                                    <figcaption>\n");
      out.write("                                        <p><span>Nha Trang</span></p>\n");
      out.write("                                    </figcaption>\n");
      out.write("                                </figure>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!--//content-inner-section-->\n");
      out.write("\n");
      out.write("            <!--services-->\n");
      out.write("            <div class=\"special featured\">\n");
      out.write("                <div class=\"inner-agile-w3l-part-head\">\n");
      out.write("                    <h2 class=\"w3l-inner-h-title\">Homestay Services</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"w3_agileits_services_grids\">\n");
      out.write("                        <div class=\"col-md-3 w3_agileits_services_grid hvr-overline-from-center\">\n");
      out.write("                            <div class=\"w3_agileits_services_grid_agile\">\n");
      out.write("                                <div class=\"w3_agileits_services_grid_1\">\n");
      out.write("                                    <img src=\"images/service/restaurant.jpg\" alt=\"service-img\">\n");
      out.write("                                </div>\n");
      out.write("                                <h3>Restaurant</h3>\n");
      out.write("                                <p>Providing food and drink services to guests in homestays and restaurants, showing attentiveness, and understanding of their needs and expectations.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 w3_agileits_services_grid hvr-overline-from-center\">\n");
      out.write("                            <div class=\"w3_agileits_services_grid_agile\">\n");
      out.write("                                <div class=\"w3_agileits_services_grid_1\">\n");
      out.write("                                    <img src=\"images/service/bar.jpg\" alt=\"service-img\">\n");
      out.write("                                </div>\n");
      out.write("                                <h3>Lounge Bar</h3>\n");
      out.write("                                <p>Bar is an important part of the food and beverage department. It includes professional bartenders providing alcoholic and non-alcoholic beverage to the customers.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 w3_agileits_services_grid hvr-overline-from-center\">\n");
      out.write("                            <div class=\"w3_agileits_services_grid_agile\">\n");
      out.write("                                <div class=\"w3_agileits_services_grid_1\">\n");
      out.write("                                    <img src=\"images/service/pool.jpg\" alt=\"service-img\">\n");
      out.write("                                </div>\n");
      out.write("                                <h3>Swimming Pool</h3>\n");
      out.write("                                <p>The outdoor swimming pool is exclusively for guests. It has a perfect ventilation system, strict water quality control, and natural lighting that ensures a relaxing atmosphere.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 w3_agileits_services_grid hvr-overline-from-center\">\n");
      out.write("                            <div class=\"w3_agileits_services_grid_agile\">\n");
      out.write("                                <div class=\"w3_agileits_services_grid_1\">\n");
      out.write("                                    <img src=\"images/service/spa.jpg\" alt=\"service-img\">\n");
      out.write("                                </div>\n");
      out.write("                                <h3>Spa Care</h3>\n");
      out.write("                                <p>Spa services including massage, beauty and nails one or all come to you. Escape completely to relax, re-balance and restore a sense of wellbeing with one of our indulgent spa rituals.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"clearfix\"> </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- //services -->\n");
      out.write("\n");
      out.write("            <!--footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, true);
      out.write("\n");
      out.write("        <!--//footer-->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\n");
      out.write("        <!-- Dropdown-Menu-JavaScript -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".dropdown\").hover(\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideDown(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        },\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideUp(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //Dropdown-Menu-JavaScript -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.zoomslider.min.js\"></script>\n");
      out.write("        <!-- search-jQuery -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <!--/script-->\n");
      out.write("        <script src=\"js/lightbox-plus-jquery.min.js\"></script>\n");
      out.write("        <!--/script-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            jQuery(document).ready(function ($) {\n");
      out.write("                $(\".scroll\").click(function (event) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                    $('html,body').animate({scrollTop: $(this.hash).offset().top}, 900);\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                /*\n");
      out.write("                 var defaults = {\n");
      out.write("                 containerID: 'toTop', // fading element id\n");
      out.write("                 containerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("                 scrollSpeed: 1200,\n");
      out.write("                 easingType: 'linear' \n");
      out.write("                 };\n");
      out.write("                 */\n");
      out.write("\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!--end-smooth-scrolling-->\n");
      out.write("        <!--js for bootstrap working-->\n");
      out.write("        <script src=\"js/bootstrap.js\"></script>\n");
      out.write("        <!-- //for bootstrap working -->\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li><a href=\"login\">Sign in</a></li>\n");
        out.write("                                            <li><a href=\"register\">Sign up</a></li>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <li class=\"dropdown-toggle\">\n");
        out.write("                                                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\">Welcome ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" <b class=\"caret\"></b></a>\n");
        out.write("                                                <ul class=\"dropdown-menu\">\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    <li><a href=\"profile.jsp\">My Profile</a></li>\n");
        out.write("                                                    <li><a href=\"logout\">Log out</a></li>\n");
        out.write("                                                </ul>\n");
        out.write("                                            </li>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.type == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <li><a href=\"management\">My Management</a></li>\n");
        out.write("                                                        <li><a href=\"history\">My Booking</a></li>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.type == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("   \n");
        out.write("                                                        <li><a href=\"history\">My Booking</a></li>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(",<span> ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${account.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("!</span>");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }
}
