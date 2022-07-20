<%@ page import="lotte.com.lottket.dto.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
  ProductDto productDto = (ProductDto)request.getAttribute("productDto");
  List<ProductImageDto> productImageDto = (List<ProductImageDto>)request.getAttribute("productImageDto");
  List<ProductDetailDto> productDetailDto = (List<ProductDetailDto>)request.getAttribute("productDetailDto");
  List<ReviewJoinUser> reviewJoinUserDto = (List<ReviewJoinUser>)request.getAttribute("reviewJoinUserDto");
  List<ReviewJoinReply> reviewJoinReplyDto = (List<ReviewJoinReply>)request.getAttribute("reviewJoinReplyDto");
%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>롯켓 온</title>
  <link rel="icon" href="" type="image/x-icon">
  <script src="https://kit.fontawesome.com/a9c109155d.js" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="css/style.css">

  <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
  <link rel="favicon" href="img/logo.png">

  <!-- Demo styles -->
  <style>


  </style>
</head>

<body>
<header id="header">
  <script src="js/header.js"></script>
</header>

<div class="contents">
  <div class="detail_wrap">
    <div class="detail_product_img">
      <ul style="display:flex; flex-direction: column;">
        <li>
          <img
                  src="https://contents.lotteon.com/itemimage/_v123343/LO/18/62/79/11/53/_1/86/27/91/15/4/LO1862791153_1862791154_1.jpg/dims/resizef/67x67">
        </li>
        <li>
          <img
                  src="https://contents.lotteon.com/itemimage/_v123343/LO/18/62/79/11/53/_1/86/27/91/15/4/LO1862791153_1862791154_1.jpg/dims/resizef/67x67">
        </li>
        <li>
          <img
                  src="https://contents.lotteon.com/itemimage/_v123343/LO/18/62/79/11/53/_1/86/27/91/15/4/LO1862791153_1862791154_1.jpg/dims/resizef/67x67">
        </li>
      </ul>
    </div>
    <div class="detail_product_img2">
      <img
              src="https://contents.lotteon.com/itemimage/_v123343/LO/18/62/79/11/53/_1/86/27/91/15/4/LO1862791153_1862791154_1.jpg/dims/resizef/554X554">
    </div>
    <div class="detail_product_img3">
      <h1><%=productDto.getProductTitle()%></h1>
      <h2><span>가격</span><span><%=productDto.getProductPrice()%></span></h2>
      <h2><span>재고</span><span><%=productDto.getProductStock()%>개</span></h2>
      <h2><span>등록일</span><span><%=productDto.getProductRegDate().toString().substring(0,10)%></span></h2>
      <h2><span>평점</span><span><%=productDto.getProductTotalRate()%> / 5.0</span></h2>
      <div style="display:flex; justify-content: space-around;">
        <div class="button_count">
          <button>-</button><button>1</button><button>+</button>
        </div>
        <div class="button_order">
          <button>주문</button>
        </div>
      </div>
    </div>
  </div>


  <br><br>
  <hr>
  <br><br>
  <div style="width:1200px; height:1000px; background-color: antiquewhite;">

    <%
      for (int i=0; i<productDetailDto.size(); i++){
    %>
    <!-- <img src=""> -->
    <%=productDetailDto.get(i).getProductDetailImageUrl()%>
    <%
      }
    %>

  </div>

  <br><br>
  <hr>
  <br><br>
  <div class="detail_review" style="width:1200px; height:1000px; background-color:rgb(255, 255, 255);">
    <div style="width:1000px;">
      <div style="margin-bottom:50px;">
        <ul style="display:flex">
          <li>
            <h1>리뷰</h1>
          </li>
          <li>
            <script>
              function insert_review() {
                document.getElementById("div_insert_review").style.display="";
              }

            </script>
            <h1><a onclick="insert_review()">댓글작성</a></h1>
          </li>
        </ul>
      </div>
      <div id="div_insert_review" style="margin-left:100px; display:none">
        <span>wnsgur753</span>
        <span>☆☆☆☆☆</span>

        <form style="margin-top:10px;">
          <p><textarea cols="50" rows="10" style="width:700px"></textarea></p>
          <p><input type="submit" value="Submit"></p>
        </form>
      </div>
      <br>
      <div class="detail_review_ul">
        <%
          for(int i=0; i<reviewJoinUserDto.size(); i++){
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sDate.format(reviewJoinUserDto.get(i).getReviewDate());
        %>
        <ul>
          <li style="display:flex; align-items: center;">
            <img src="<%=reviewJoinUserDto.get(i).getUserProfileImage()%>"
                 style="border-radius:1.5em; margin-right:10px;">
            <span><%=reviewJoinUserDto.get(i).getUserName()%></span>
            <span>&nbsp;등급 : <%=reviewJoinUserDto.get(i).getUserGrade()%></span>
            <span>&nbsp;등록일 : <%=strDate%></span>
            <button style="margin-left:10px;">답글 작성</button>
          </li>
          <li>평점 : <%=reviewJoinUserDto.get(i).getRating()%></li>
          <li>내용 : <%=reviewJoinUserDto.get(i).getContent()%>
          </li>
        </ul>
        <%
          }
        %>
      </div>

    </div>
  </div>


</div>

<footer id="footer">
  <script src="js/footer.js"></script>
</footer>

</body>

</html>
