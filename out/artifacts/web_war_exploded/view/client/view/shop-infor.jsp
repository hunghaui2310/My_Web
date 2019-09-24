<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<c:url value="/view/client/static" var="url"></c:url>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shop Real MEN</title>
    <link rel='stylesheet' type='text/css'
          href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600&amp;subset=cyrillic,latin'>

    <!-- CSS Global Compulsory -->
    <link rel="stylesheet"
          href="${url}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${url}/css/shop.style.css">

    <!-- CSS Header and Footer -->
    <link rel="stylesheet" href="${url}/css/headers/header-v5.css">
    <link rel="stylesheet" href="${url}/css/footers/footer-v4.css">

    <!-- CSS Implementing Plugins -->
    <link rel="stylesheet" href="${url}/plugins/animate.css">
    <link rel="stylesheet" href="${url}/plugins/line-icons/line-icons.css">
    <link rel="stylesheet"
          href="${url}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${url}/plugins/scrollbar/css/jquery.mCustomScrollbar.css">
    <link rel="stylesheet"
          href="${url}/plugins/owl-carousel/owl-carousel/owl.carousel.css">
    <link rel="stylesheet"
          href="${url}/plugins/revolution-slider/rs-plugin/css/settings.css">

    <!-- CSS Theme -->
    <link rel="stylesheet" href="${url}/css/theme-colors/default.css"
          id="style_color">

    <!-- CSS Customization -->
    <link rel="stylesheet" href="${url}/css/custom.css">
</head>
<body>
    <div class="header-v5 header-static">
    <!-- Topbar v3 -->
    <jsp:include page="/view/client/view/topbar.jsp"></jsp:include>
    <!-- End Topbar v3 -->

    <!-- Navbar -->
    <jsp:include page="/view/client/view/navbar.jsp"></jsp:include>
    <!-- End Navbar -->
    </div>

    <!-- Code here -->

    Real MEN tự hào là một trong những shop chuyên cung cấp các loại quần áo, vòng phong thủy cho đàn ông.
    <br>
    <h2>Real MEN</h2>
    <br>
    Đẳng cấp <span class="shop-green">TẠO</span> khác biệt

    <div>
        <jsp:include page="/view/client/view/footer.jsp"></jsp:include>
    </div>
    <script src="${url}/plugins/jquery/jquery.min.js"></script>
    <script src="${url}/plugins/jquery/jquery-migrate.min.js"></script>
    <script src="${url}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <!-- JS Implementing Plugins -->
    <script src="${url}/plugins/back-to-top.js"></script>
    <script src="${url}/plugins/smoothScroll.js"></script>
    <script src="${url}/plugins/jquery.parallax.js"></script>
    <script src="${url}/plugins/owl-carousel/owl-carousel/owl.carousel.js"></script>
    <script
            src="${url}/plugins/scrollbar/js/jquery.mCustomScrollbar.concat.min.js"></script>
    <script
            src="${url}/plugins/revolution-slider/rs-plugin/js/jquery.themepunch.tools.min.js"></script>
    <script
            src="${url}/plugins/revolution-slider/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
    <!-- JS Customization -->
    <script src="${url}/js/custom.js"></script>
    <!-- JS Page Level -->
    <script src="${url}/js/shop.app.js"></script>
    <script src="${url}/js/plugins/owl-carousel.js"></script>
    <script src="${url}/js/plugins/revolution-slider.js"></script>
    <script>
        jQuery(document).ready(function() {
            App.init();
            App.initScrollBar();
            App.initParallaxBg();
            OwlCarousel.initOwlCarousel();
            RevolutionSlider.initRSfullWidth();
        });
    </script>
    <!--[if lt IE 9]>
    <script src="${url}/plugins/respond.js"></script>
    <script src="${url}/plugins/html5shiv.js"></script>
    <script src="${url}/js/plugins/placeholder-IE-fixes.js"></script>
    <![endif]-->
</body>
</html>
