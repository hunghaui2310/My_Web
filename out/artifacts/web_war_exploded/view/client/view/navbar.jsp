<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
      <c:url value="/view/client/static" var="url"></c:url>
      
 <div class="navbar navbar-default mega-menu" role="navigation">
            <div class="container">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-responsive-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="${pageContext.request.contextPath }">
                        <img id="logo-header" src="${url}/img/logo.jpg" alt="Logo">
                    </a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse navbar-responsive-collapse">
                    <!-- Shopping Cart -->
                   <jsp:include page="/view/client/view/cart.jsp"></jsp:include>
                    <!-- End Shopping Cart -->

                    <!-- Nav Menu -->
                    <ul class="nav navbar-nav">
                        <!-- Pages -->
                        <li class="dropdown active">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Trang chủ
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath }">Trang chủ</a></li>
                                <li><a href="${pageContext.request.contextPath }/product/list">Sản phẩm</a></li>
                                <li><a href="${pageContext.request.contextPath }/member/cart">Giỏ hàng</a></li>
                                <li><a href="${pageContext.request.contextPath }/member/order">Đặt hàng</a></li>
                            </ul>
                        </li>
                        <!-- End Pages -->

                        <!-- Promotion -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Khuyến mại
                            </a>
                            <ul class="dropdown-menu">
                                <li class="dropdown-submenu">
                                    <a href="javascript:void(0);">Quần Jeans</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Skinny Jeans</a></li>
                                        <li><a href="#">Bootcut Jeans</a></li>
                                        <li><a href="#">Baggy Jeans</a></li>
                                    </ul>    
                                </li>
                                <li class="dropdown-submenu">
                                    <a href="javascript:void(0);">Giày</a>
                                    <ul class="dropdown-menu">
                                        <li><a href="#">Sandals</a></li>
                                        <li><a href="#">Heels</a></li>
                                        <li><a href="#">Adidas</a></li>
                                        <li><a href="#">Convert</a></li>
                                    </ul>    
                                </li>
                            </ul>
                        </li>
                        <!-- End Promotion -->

                        <!-- Gifts -->
                        <li class="dropdown mega-menu-fullwidth">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Quà tặng
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="mega-menu-content">
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-md-3 col-sm-12 col-xs-12 md-margin-bottom-30">
                                                    <h3 class="mega-menu-heading">Bạn đã có quà tặng?</h3>
                                                    <p>Đăng kí thành viên để trở thành một trong những khách hàng may mắn nhận được nhiều Voucher của Real MEN...</p>
                                                    <button type="button" class="btn-u btn-u-dark">Xem thêm</button>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4 md-margin-bottom-30">
                                                    <a href="#"><img class="product-offers img-responsive" src="${url}/img/blog/01.jpg" alt=""></a>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4 sm-margin-bottom-30">
                                                    <a href="#"><img class="product-offers img-responsive" src="${url}/img/blog/02.jpg" alt=""></a>
                                                </div>
                                                <div class="col-md-3 col-sm-4 col-xs-4">
                                                    <a href="#"><img class="product-offers img-responsive" src="${url}/img/blog/03.jpg" alt=""></a>
                                                </div>
                                            </div><!--/end row-->
                                        </div><!--/end container-->
                                    </div><!--/end mega menu content-->  
                                </li>
                            </ul><!--/end dropdown-menu-->
                        </li>
                        <!-- End Gifts -->

                        <!-- Books -->
                        <li class="dropdown mega-menu-fullwidth">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown">
                                Books
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <div class="mega-menu-content">
                                        <div class="container">
                                            <div class="row">
                                                <div class="col-md-4 col-sm-4">
                                                    <h3 class="mega-menu-heading">Quần áo</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Áo khoác</a></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Shorts</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Áo phông</a></li>
                                                        <li><a href="#">Áo sơ mi</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Giày</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">Adidas</a></li>
                                                        <li><a href="#">Nike</a></li>
                                                        <li><a href="#">Converse</a></li>
                                                        <li><a href="#">Gucci</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-4 col-sm-4">
                                                    <h3 class="mega-menu-heading">Phụ kiện</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Tất cả phụ kiện</a></li>
                                                        <li><a href="#">Tie</a></li>
                                                        <li><a href="#">Đồng hồ</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Vòng tay</a></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Đồ lót</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Đồ đi bơi</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Đồ phòng tập</a></li>
                                                        <li><a href="#">Đồ lót cao cấp</a> <span class="label label-danger-shop">New</span></li>
                                                    </ul>
                                                    <h3 class="mega-menu-heading">Quần áo ngủ</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Nightwear</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Quần bó</a></li>
                                                    </ul>
                                                </div>

                                                <div class="col-md-4 col-sm-4">
                                                    <h3 class="mega-menu-heading">Mixed</h3>
                                                    <ul class="list-unstyled style-list">
                                                        <li><a href="#">Mới</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Coats &amp; Jackets</a> <span class="label label-danger-shop">New</span></li>
                                                        <li><a href="#">Jeans</a></li>
                                                        <li><a href="#">Shorts</a></li>
                                                        <li><a href="#">Áo sơ mi</a></li>
                                                        <li><a href="#">T-shirts</a></li>
                                                        <li><a href="#">Boots</a></li>
                                                        <li><a href="#">Heels</a></li>
                                                        <li><a href="#">Sandals</a></li>
                                                        <li><a href="#">Sports</a></li>
                                                        <li><a href="#">Socks</a></li>
                                                        <li><a href="#">Tights</a></li>
                                                    </ul>
                                                </div>
                                            </div><!--/end row-->
                                        </div><!--/end container-->
                                    </div><!--/end mega menu content-->  
                                </li>
                            </ul><!--/end dropdown-menu-->
                        </li>
                        <!-- End Books -->

                        <!-- Clothes -->
                        <li class="dropdown">
                            <a href="javascript:void(0);" class="dropdown-toggle" data-hover="dropdown" data-toggle="dropdown" data-delay="1000">
                                Sản phẩm
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="${pageContext.request.contextPath }/product/category?cate_id=1">MEN</a></li>
                                <li><a href="${pageContext.request.contextPath }/product/category?cate_id=2">Trẻ con</a></li>
                            </ul>
                        </li>
                        <!-- End Clothes -->

                        <!-- Main Demo -->
                        <li><a href="${pageContext.request.contextPath }/view/client/view/shop-infor.jsp">Thông tin Shop</a></li>
                        <!-- Main Demo -->
                    </ul>
                    <!-- End Nav Menu -->                    
                </div>
            </div>    
        </div>            
