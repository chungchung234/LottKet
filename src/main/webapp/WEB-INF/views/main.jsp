<%@ page import="lotte.com.lottket.dto.ProductImageDto" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: BTC-N24
  Date: 2022-07-19
  Time: 오후 5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<ProductImageDto> bestProduct = (List<ProductImageDto>)request.getAttribute("bestProduct");
    List<ProductImageDto> weeklyBestProduct = (List<ProductImageDto>)request.getAttribute("weeklyBestProduct");
    List<ProductImageDto> newProduct = (List<ProductImageDto>)request.getAttribute("newProduct");
%>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>롯켓 온</title>
    <link rel="icon" href="" type="image/x-icon">
    <script src="https://kit.fontawesome.com/a9c109155d.js" crossorigin="anonymous"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <link rel="stylesheet" href="css/style.css">

    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
    <%--파비콘 이러면 됨--%>
    <link rel="icon" type="image/ico" href="img/logo.png">

    <!-- Demo styles -->
    <style>
        html,
        body {
            position: relative;
            height: 100%;
        }

        body {
            background: #eee;
            font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
            font-size: 14px;
            color: #000;
            margin: 0;
            padding: 0;
        }

        .swiper {
            /*width: 100%;*/
            /*height: 100%;*/
            width: 70%;
            height: 60%;
        }

        .swiper-slide {
            text-align: center;
            font-size: 18px;
            background: #fff;

            /* Center slide text vertically */
            display: -webkit-box;
            display: -ms-flexbox;
            display: -webkit-flex;
            display: flex;
            -webkit-box-pack: center;
            -ms-flex-pack: center;
            -webkit-justify-content: center;
            justify-content: center;
            -webkit-box-align: center;
            -ms-flex-align: center;
            -webkit-align-items: center;
            align-items: center;
        }

        .swiper-slide img {
            display: block;
            width: 100%;
            height: 1000px;
            object-fit: cover;
        }

        .div_best li {
            float: left;
            margin : 1%;
        }

        .div_best ul>li>img {
            width: 100%;
        }

    </style>
</head>

<body>
<header id="header">
    <script src="js/header.js"></script>
</header>

<div style="height:1000px;">
    <!-- Swiper -->
    <div class="swiper mySwiper">
        <div class="swiper-wrapper">
            <div class="swiper-slide"><img src="https://contents.lotteon.com/display/dshoplnk/12905/2/M000009/258797/P15C8271F99E0BF4D45EABF434B908A83BF875DEFA442061EB58053F9660FAC7F/file/dims/optimize" /></div>
            <div class="swiper-slide"><img src="https://contents.lotteon.com/display/dshoplnk/12905/2/M000009/258763/PA5DC27C11C1B7E0B4504AE24437440095694024F418959A4D8573446CC5625FE/file/dims/optimize" /></div>
            <div class="swiper-slide"><img src="https://contents.lotteon.com/display/dshoplnk/20670/208/C001232/258835/P04FC563D89CB8B903058621490AB96E87E6A14BE1930C1AA6B955B738F2C9CC1/file" /></div>
            <div class="swiper-slide"><img src="https://contents.lotteon.com/display/planspdp/1738/PC0BEDAC5C8A1703FF9A0A5744F1434A48F3B1AF911220437A2EE8B3B214FBD95/file" /></div>
            <div class="swiper-slide"><img src="https://contents.lotteon.com/display/planspdp/22490/P2D632BF18CA68F6752B0AF7F1FDE595293152BFD17B55B79C5AEBBFF117CA19E/file" /></div>
<%--            <div class="swiper-slide"><img src="//app-storage-edge-008.cafe24.com/bannermanage2/mall66/2022/07/13/9452648c8af0b9826259462db2138d36.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://ftp.jason006.img1.kr/2021_banner/flash/220713good1.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://ftp.jason006.img1.kr/2021_banner/flash/220711good5.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://byyjweb.jpg3.kr/main_b/220705_vivid_main.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="//app-storage-edge-008.cafe24.com/bannermanage2/mall66/2022/07/13/eb2b1e817011a841158f8cf6b6801908.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="//app-storage-edge-008.cafe24.com/bannermanage2/mall66/2022/05/18/3df6c94132e3fdfa07458b4bb0a43783.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://ftp.jason006.img1.kr/2021_banner/flash/220713good1.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://ftp.jason006.img1.kr/2021_banner/flash/220711good5.jpg" /></div>--%>
<%--            <div class="swiper-slide"><img src="http://byyjweb.jpg3.kr/main_b/220705_vivid_main.jpg" /></div>--%>
        </div>
        <div class="swiper-button-next"></div>
        <div class="swiper-button-prev"></div>
        <div class="swiper-pagination"></div>
    </div>

    <!-- Swiper JS -->
    <script src="https://unpkg.com/swiper/swiper-bundle.min.js"></script>

    <!-- Initialize Swiper -->
    <script>
        var swiper = new Swiper(".mySwiper", {
            spaceBetween: 30,
            centeredSlides: true,
            autoplay: {
                delay: 2500,
                disableOnInteraction: false,
            },
            pagination: {
                el: ".swiper-pagination",
                clickable: true,
            },
            navigation: {
                nextEl: ".swiper-button-next",
                prevEl: ".swiper-button-prev",
            },
        });

    </script>

</div>

<div style="height:600px;margin-top: 50px; margin-left:3%">

    <div class="div_best" style="height:170px; overflow: hidden;">
        <h2 style="margin-left: 43%;">베스트</h2>
        <ul>
            <%
                for(ProductImageDto productImageDto : bestProduct) {
            %>
                    <li>
                          <img src=<%=productImageDto.getProductImageUrl()%> id=<%=productImageDto.getProductId()%> onclick="moveDetail(<%=productImageDto.getProductId()%>)">
                    </li>
            <%
                }
            %>
        </ul>
    </div>

    <div class="div_best" style="height:170px; overflow: hidden;">
        <h2 style="margin-left: 43%;">주간 베스트</h2>
        <ul>
            <%
                for(ProductImageDto productImageDto : weeklyBestProduct) {
            %>
            <li>
                <img src=<%=productImageDto.getProductImageUrl()%> id=<%=productImageDto.getProductId()%>>
            </li>
            <%
                }
            %>
        </ul>
    </div>

    <div class="div_best" style="height:170px; overflow: hidden;">
        <h2 style="margin-left: 43%;">신상품</h2>
        <ul>
            <%
                for(ProductImageDto productImageDto : newProduct) {
            %>
            <li>
                <img src=<%=productImageDto.getProductImageUrl()%> id=<%=productImageDto.getProductId()%>>
            </li>
            <%
                }
            %>
        </ul>
    </div>
</div>
<footer id="footer">
    <script src="js/footer.js"></script>
</footer>

<script>
    function moveDetail(id) {
        location.href="<%=request.getContextPath() %>/detail?productid=" + id;
    }
</script>
</body>
</html>
