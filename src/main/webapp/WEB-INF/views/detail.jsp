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

  if(request.getAttribute("dto") != null) {
    UserDto dto = (UserDto) request.getAttribute("dto");
  }
%>
<!DOCTYPE html>
<html lang="ko">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>롯켓 온</title>
  <link rel="icon" href="" type="<%=request.getContextPath()%>/image/x-icon">
  <script src="https://kit.fontawesome.com/a9c109155d.js" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/style.css">
  <link rel="stylesheet" href="<%=request.getContextPath()%>/css/detail.css">
  <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
  <link rel="favicon" href="<%=request.getContextPath()%>/img/logo.png">

  <!-- Demo styles -->
  <style>


  </style>
</head>

<body>
<header id="header">
  <script src="<%=request.getContextPath()%>/js/header.js"></script>
</header>

<div class="contents">
  <div class="detail_wrap">
    <div class="detail_product_img">
      <ul style="display:flex; flex-direction: column;">
        <% for (int i=0; i<productImageDto.size(); i++) { %>
        <li>
          <img onclick="imgClick('<%=productImageDto.get(i).getProductImageUrl()%>')"
               src="<%=productImageDto.get(i).getProductImageUrl()%>">
        </li>
        <%
          }
        %>
      </ul>
    </div>
    <div class="detail_product_img2">
      <img id="imageMain" src="<%=productImageDto.get(0).getProductImageUrl()%>">
      <script>
        <%--var recetnProductImg = String(<%=productImageDto.get(0).getProductImageUrl()%>);--%>
        sessionStorage.setItem("recentProductImg", "<%=productImageDto.get(0).getProductImageUrl()%>" ); // 저장
        sessionStorage.setItem("recentProductUrl", window.location.href ); // 저장

        // if (sessionStorage.getItem("recentProduct") != null) {
        //   alert(sessionStorage.getItem("recentProduct"));
        // }
      </script>

      <script>


        let pathname = window.location.pathname;
        let fit_pathname = pathname.split('/');
        let file_name = fit_pathname[fit_pathname.length -1];

        if(file_name == 'detail.do' & localStorage.getItem("recentProduct") != null) {
          sessionProduct = JSON.parse(localStorage.getItem("recentProduct") || "[]"); //값 가져오기
          sessionProduct.push({
            recentProductImg: "<%=productImageDto.get(0).getProductImageUrl()%>",
            recentProductUrl: window.location.href
          })
          console.log(sessionProduct);
          localStorage.setItem("recentProduct", JSON.stringify(sessionProduct));

        } else {
          var productObj = [{recentProductImg: "<%=productImageDto.get(0).getProductImageUrl()%>", recentProductUrl: window.location.href}];
          localStorage.setItem("recentProduct", JSON.stringify(productObj));
        }

        //
        // sessionProduct = JSON.parse(localStorage.getItem("recentProduct") || "[]"); //값 가져오기
        //
        // console.log(sessionProduct); //출력 확인
      </script>

      <%--      <script> sessionStorage.clear()</script>--%>

    </div>
    <div class="detail_product_img3">

      <div data-v-765eb084="">
        <div data-v-765eb084="" class="priceWrap">
          <div data-v-765eb084="" class="priceInfo">
            <div data-v-765eb084="" class="price"><span data-v-765eb084=""> <%=productDto.getProductTitle()%> </span>
            </div>
          </div>

          <div data-v-765eb084="" class="priceInfo" style="margin-bottom:8%;">
            <div data-v-765eb084="" class="price"><span data-v-765eb084="" class="discountRate"> 가격 : &nbsp;
                </span><span data-v-765eb084=""> <%=productDto.getProductPrice()%> 원 </span><em data-v-765eb084="">

            </em>
            </div>
          </div>

          <div data-v-765eb084="" class="priceInfo" style="margin-bottom:8%;">
            <div data-v-765eb084="" class="price"><span data-v-765eb084="" class="discountRate"> 평점 : &nbsp;
                </span><span data-v-765eb084=""> <%=String.format("%.1f",productDto.getProductTotalRate())%> 점 </span><em data-v-765eb084="">

            </em>
            </div>
          </div>

          <div data-v-765eb084="" class="priceInfo" style="margin-bottom:6%;">
            <div data-v-765eb084="" class="price"><span data-v-765eb084="" class="discountRate"> 재고 : &nbsp;
                </span><span data-v-765eb084=""> <%=productDto.getProductStock()%> 개 </span><em data-v-765eb084="">

            </em>
            </div>
          </div>

        </div>
      </div>

      <div style="display:flex; justify-content: space-around;">
        <div class="button_count">
          <button onclick="minus();">-</button><button id="quantity">1</button><button onclick="plus();">+</button>
        </div>
        <div class="button_order">
          <button data-v-2292bccc="" data-v-3927112e=""
                  data-object="type=add_to_cart&amp;coupon=&amp;value=4800&amp;price=3420&amp;quantity=1&amp;cat_id=BC34050100&amp;tr_grp_cd=SR&amp;tr_no=LD476977&amp;lrtr_no=null"
                  class="strokeRed util sizeLarge alignLeft" data-v-3351bf4b="" onclick="cart()"><span data-v-2292bccc="" class="inner">
                <!----><span data-v-2292bccc="" class="">
                  장바구니 담기
                </span>
            <!----></span></button>
        </div>
        <div class="button_order">
          <button data-v-2292bccc="" data-v-3927112e=""
                  data-object="type=add_to_cart&amp;coupon=&amp;value=4800&amp;price=3420&amp;quantity=1&amp;cat_id=BC34050100&amp;tr_grp_cd=SR&amp;tr_no=LD476977&amp;lrtr_no=null"
                  class="strokeRed util sizeLarge alignLeft" data-v-3351bf4b="" onclick="purchase()"><span data-v-2292bccc=""
                                                                                                           class="inner">
                <!----><span data-v-2292bccc="" class="">
                  바로 구매하기
                </span>
            <!----></span></button>
        </div>
      </div>
    </div>
  </div>


  <br><br>
  <hr>
  <br><br>
  <div style="width:1200px; text-align: center">

    <%
      for (int i=0; i<productDetailDto.size(); i++){
    %>
    <!-- <img src=""> -->
    <img style="width:70%; height:70%;" src="<%=productDetailDto.get(i).getProductDetailImageUrl()%>">
    <%
      }
    %>

  </div>

  <br><br>
  <hr>
  <br><br>
  <div class="detail_review" style="width:1200px; background-color:rgb(255, 255, 255);">
    <div style="width:1000px;">
      <div style="margin-bottom:50px; width:1200px;">
        <ul style="display:flex">
          <li style="margin-left: 0;">
            <h1 style="font-size:xx-large; font-weight: bold">리뷰</h1>
            <br><br>
          </li>

        </ul>
        <hr>
        <script>
          function insert_review() {
            /* if (sessionStorage.getItem("id") == null){
               alert("로그인 후 댓글 작성 가능합니다.");
               return;
             }*/
            document.getElementById("div_insert_review").style.display = "";
          }

        </script>
        <br>
        <h3 style="font-size:xx-large;font-weight: bold"><button onclick="insert_review()" style="background-color: #ff42c9; color:white; border-radius: 0.5em">댓글작성</button></h3>
      </div>
      <div id="div_insert_review" style="margin-left:10px; display:none">
        <span>wnsgur753</span>
        <span id="send_star" style="display:none">0</span>
        <img class="cls_star" id="id_star1" style="width:20px;" src="<%=request.getContextPath()%>/img/emptyStar.png" onmouseover="onmouse_star(this.id)">
        <img class="cls_star" id="id_star2" style="width:20px;" src="<%=request.getContextPath()%>/img/emptyStar.png" onmouseover="onmouse_star(this.id)">
        <img class="cls_star" id="id_star3" style="width:20px;" src="<%=request.getContextPath()%>/img/emptyStar.png" onmouseover="onmouse_star(this.id)">
        <img class="cls_star" id="id_star4" style="width:20px;" src="<%=request.getContextPath()%>/img/emptyStar.png" onmouseover="onmouse_star(this.id)">
        <img class="cls_star" id="id_star5" style="width:20px;" src="<%=request.getContextPath()%>/img/emptyStar.png" onmouseover="onmouse_star(this.id)">

        <form style="margin-top:10px;" action="javascript:insertReview()">
          <p><textarea id="content" cols="50" rows="5" style="width:700px; padding:10px; margin-bottom:10px;"></textarea></p>
          <p><input type="submit" value="Submit"></p>
        </form>
      </div>
      <br><br><br>
      <div id="commentdiv">
        <%
          for(int i=0; i<reviewJoinUserDto.size(); i++){
            SimpleDateFormat sDate = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = sDate.format(reviewJoinUserDto.get(i).getReviewDate());
        %>
        <div class="reviewList" style="border:3px solid black; padding:20px; border-radius:30px">
          <div class="uswersAndMoremenu">
            <div class="users">
              <%--            <img src="<%=reviewJoinUserDto.get(i).getUserProfileImage()%>"--%>
              <%--                                  style="border-radius:1.5em; margin-right:10px;">--%>
              <div class="identities">
                <div class="userNameWrap">
                  <img src="<%=reviewJoinUserDto.get(i).getUserProfileImage()%>"
                       style="border-radius:1.5em; margin-right:10px;">
                  <strong class="userName">&nbsp;&nbsp;<%=reviewJoinUserDto.get(i).getUserName()%>&nbsp;&nbsp;</strong><span class="info">
                      <br><br> <%=reviewJoinUserDto.get(i).getUserGrade()%>등급 &nbsp;&nbsp;&nbsp;등록일 :
                      <%=strDate%></span></div>
                <div class="badges"></div>
              </div>
            </div>
          </div>
          <br>
          <span class="reviewList_avg" id="rev<%=reviewJoinUserDto.get(i).getReviewId()%>" style="display:none;"><%=reviewJoinUserDto.get(i).getRating()%></span>
          <div id="<%=reviewJoinUserDto.get(i).getReviewId()%>"><img style="width:20px;" src="<%=request.getContextPath()%>/img/fullStar.png"></div>
          <script>
            document.getElementById("<%=reviewJoinUserDto.get(i).getReviewId()%>").innerHTML = ``;
            for (let i = 1; i <= Math.floor(document.getElementById("rev<%=reviewJoinUserDto.get(i).getReviewId()%>").innerText); i++) {
              document.getElementById("<%=reviewJoinUserDto.get(i).getReviewId()%>").innerHTML += `
                <img style="width:20px;" src="<%=request.getContextPath()%>/img/fullStar.png">
              `
            }
          </script>

          <br><br>

          <span class="reviewList_text"><%=reviewJoinUserDto.get(i).getContent()%></span>
          <br><br><br><br>

          <% for (int j=0; j<reviewJoinReplyDto.size(); j++){
            if (reviewJoinReplyDto.get(j).getReviewId() == reviewJoinUserDto.get(i).getReviewId()){
          %>
          <p style="margin-left:50px;">[ 관리자 ]</p>
          <br>
          <p><div style="border:1px solid black; width:700px; height:200px; padding:10px; margin-left:50px; margin-bottom:20px;"><%=reviewJoinReplyDto.get(j).getContent()%></div></p>
          <%
              }
            }
          %>

          <button type="button" onclick='admin_reply("<%=reviewJoinUserDto.get(i).getReviewId()%>")'>답글 작성</button>



          <div id="replydiv<%=reviewJoinUserDto.get(i).getReviewId()%>" style="margin-top:20px; display:none;" >
            <span>[ 관리자 ]</span>
            <form style="margin-top:10px;" action="javascript:insertReply('<%=reviewJoinUserDto.get(i).getReviewId()%>')">
              <p><textarea id="replyContent<%=reviewJoinUserDto.get(i).getReviewId()%>" cols="50" rows="5" style="width:700px; padding:10px;"></textarea></p>
              <p style="padding-bottom: 15px;
                 padding-top: 10px"><input type="submit" value="Submit"></p>
            </form>
          </div>
        </div>

        <br><br>


        <%
          }
        %>
      </div>
    </div>
  </div>

</div>

<footer id="footer">
  <script src="<%=request.getContextPath()%>/js/footer.js"></script>
</footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
  function imgClick(index) {
    document.getElementById('imageMain').src = index;
  }

  function minus() {

    if (parseInt($("#quantity").text().toString()) - 1 < 1) {
      alert('수량은 1개 이상입니다.')
    } else {
      document.getElementById('quantity').innerText = parseInt($("#quantity").text().toString()) - 1;
    }
  }

  function plus() {
    document.getElementById('quantity').innerText = parseInt($("#quantity").text().toString()) + 1;
  }

  function admin_reply(index) {
    document.getElementById("replydiv"+index).style.display = "";
  }

  function purchase(){
    let quantity = parseInt($("#quantity").text().toString());
    let productid = <%=productDto.getProductId()%>;
    if (sessionStorage.getItem("id") == null){
      alert("로그인 후 구매 가능합니다.");
      return;
    }
    location.href="orderSheet.do?productId="+productid+"&userId="+sessionStorage.getItem("id")+"&orderAmount="+quantity;
  }

  function cart(){
    let quantity = parseInt($("#quantity").text().toString());
    let productid = <%=productDto.getProductId()%>;
    if (sessionStorage.getItem("id") == null){
      alert("로그인 후 장바구니 이동 가능합니다.");
      return;
    }
    location.href="newcart.do?productId="+productid+"&userId="+sessionStorage.getItem("id")+"&amount="+quantity;
  }

  function insertReview(){
    let rating = parseFloat(document.getElementById("send_star").innerText);
    let content = $("#content").val();
    document.getElementById("div_insert_review").style.display = "none";
    document.getElementById("content").value="";
    $.ajax({
      url:"<%=request.getContextPath()%>/insertReview.do",
      data:{content:content, productId:parseInt("<%=productDto.getProductId()%>"), rating:rating},
      method:"get",
      success:function(data){
        $("#commentdiv").html(data);
      }
    });
  }

  function insertReply(index){
    let replyContent= $("#replyContent"+index).val();
    document.getElementById("replydiv"+index).style.display = "none";
    document.getElementById("replyContent"+index).value="";
    console.log(<%=productDto.getProductId()%>,replyContent, index);

    $.ajax({
      url:"<%=request.getContextPath()%>/insertReply.do",
      data:{reviewId:parseInt(index), content:replyContent, productId:parseInt("<%=productDto.getProductId()%>")},
      method:"get",
      success:function(data){
        $("#commentdiv").html(data);
      }
    });
  }

  function onmouse_star(input) {
    let at_star = input.at(-1);
    for (let i = 1; i <= 5; i++) {
      if(at_star == i) {
        for (let j = 1; j <= i; j++) {
          document.getElementById("id_star"+j).setAttribute('src',"<%=request.getContextPath()%>/img/fullStar.png");
        }
        if( i == 5) {
          break;
        }
        for (let k = i + 1; k <= 5; k++) {
          document.getElementById("id_star"+k).setAttribute('src',"<%=request.getContextPath()%>/img/emptyStar.png");
        }
      }
    }
    document.getElementById("send_star").innerText = at_star;
  }
</script>

</body>

</html>