<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="lotte.com.lottket.dto.*" %>
<%
    request.setCharacterEncoding("utf-8");
    List<ProductDto> list=(List<ProductDto>)request.getAttribute("productList");
    String category= (String)request.getAttribute("category");
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

  <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css" />
  <link rel="favicon" href="<%=request.getContextPath()%>/img/logo.png">

  <!-- Demo styles -->
  <style>


  </style>
</head>

<script>
  function get_query() {
    var url = document.location.href;
    var qs = url.substring(url.indexOf('?') + 1).split('&');
    for (var i = 0, result = {}; i < qs.length; i++) {
      qs[i] = qs[i].split('=');
      result[qs[i][0]] = decodeURIComponent(qs[i][1]);
    }
    return result;
  }

</script>


<body>
  <header id="header">
    <script src="<%=request.getContextPath()%>/js/header.js"></script>
  </header>

  <h1 id="list_id_h1"><%= category %></h1>

  <ul class="list_ul_option">
    <li class='productPrice'>낮은 가격순</li>
    <li class='regDate'>최신 상품 순</li>
    <li class='totalRate'>높은 평점순</li>
  </ul>

  <div class="list_wrap" style="height:2000px; ">
    <div style="margin-left:50px; margin-top:50px; display:flex;">
      <div style="display:none; width:300px; height:1700px; background-color: rgb(248, 231, 244);"></div>
      <div id="id_productList" style="width:1200px; height:1700px; background-color: white(231, 248, 237);">
        <%
            for(int i=0;i<list.size();++i){
                ProductDto dto=list.get(i);
                if(i%4==0){
                %>
        <ul style="display:flex">
        <%
            }
        %>
          <li onclick="detail("+<%= dto.getProductId()%>+")">
            <img
              src="https://contents.lotteon.com/itemimage/_v105350/LO/13/61/73/13/53/_1/36/17/31/35/4/LO1361731353_1361731354_1.jpg/dims/optimize/dims/resizemc/360x360">
            <span><%= dto.getProductTitle()%></span>
            <span><%= dto.getProductPrice()%></span>
            <span><img src='<%=request.getContextPath()%>/img/fullStar.png' style="width: 25px;height: 25px;float: left;"> <%= dto.getProductTotalRate() %></span>
          </li>
          <%
            if(i%4==3){
            %>
                </ul>
            <%
            }
            }
          %>

      </div>
    </div>
  </div>

  <footer id="footer">
    <script src="<%=request.getContextPath()%>/js/footer.js"></script>
  </footer>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
 <script type="text/javascript">

    $(".productPrice").on('click',function(){
         let category = $('#list_id_h1').text();

        $.ajax({
              url: "<%=request.getContextPath()%>/category/productPrice.do",
              type: "get",
              data:{"productCategory":category, "search": ""},
              dataType:'json',
              contentType:"application/json;charset=UTF-8",
              success: function (result) {
                console.log(result);
                document.getElementById("id_productList").innerHTML = '';

                let str="";
                for(let i=0;i<result.length;i++){
                    let dto= result[i];
                    console.log(dto.productTitle);

                    if(i%4==0) str+=`<ul style="display:flex">`;

                    str+=
                        "<li onclick='detail()'>"+
                        "<img src="+dto.productImageUrl+">"+
                         "<span>"+dto.productTitle+"</span>"+
                         "<span>"+dto.productPrice+"</span>"+
                         "<span><img src='<%=request.getContextPath()%>/img/fullStar.png' style='width: 25px;height: 25px;float: left;'>"+dto.productTotalRate+"</span>"+
                        "</li>";

                 document.getElementById("id_productList").innerHTML = str;
                }
              }
            });


    });

    $(".regDate").on('click',function(){

            $.ajax({
                  url: "<%=request.getContextPath()%>/category/regDate.do",
                  type: "get",
                  data:{"productCategory":"category", "search": "title"},
                  dataType:'json',
                  contentType:"application/json;charset=UTF-8",
                  success: function (result) {
                    console.log(result);
                    document.getElementById("id_productList").innerHTML = '';

                    let str="";
                    for(let i=0;i<result.length;i++){
                        let dto= result[i];
                        console.log(dto.productTitle);

                        if(i%4==0) str+=`<ul style="display:flex">`;

                        str+=
                            "<li onclick='detail()'>"+
                            "<img src="+dto.productImageUrl+">"+
                             "<span>"+dto.productTitle+"</span>"+
                             "<span>"+dto.productPrice+"</span>"+
                             "<span><img src='<%=request.getContextPath()%>/img/fullStar.png' style='width: 25px;height: 25px;float: left;'>"+dto.productTotalRate+"</span>"+
                            "</li>";

                     document.getElementById("id_productList").innerHTML = str;
                    }
                  }
                });


        });

        $(".totalRate").on('click',function(){

                    $.ajax({
                          url: "<%=request.getContextPath()%>/category/totalRate.do",
                          type: "get",
                          data:{"productCategory":"category", "search": "title"},
                          dataType:'json',
                          contentType:"application/json;charset=UTF-8",
                          success: function (result) {
                            console.log(result);
                            document.getElementById("id_productList").innerHTML = '';

                            let str="";
                            for(let i=0;i<result.length;i++){
                                let dto= result[i];
                                console.log(dto.productTitle);

                                if(i%4==0) str+=`<ul style="display:flex">`;

                                str+=
                                    "<li onclick='detail()'>"+
                                    "<img src="+dto.productImageUrl+">"+
                                     "<span>"+dto.productTitle+"</span>"+
                                     "<span>"+dto.productPrice+"</span>"+
                                     "<span><img src='<%=request.getContextPath()%>/img/fullStar.png' style='width: 25px;height: 25px;float: left;'>"+dto.productTotalRate+"</span>"+
                                    "</li>";

                             document.getElementById("id_productList").innerHTML = str;
                            }
                          }
                        });


                });

    function detail(){
        alert("detail");
    }


  </script>

</body>



</html>
