<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="ko">

<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>롯켓 온</title>
    <link rel="icon" href="" type="image/x-icon">
    <script src="https://kit.fontawesome.com/a9c109155d.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://unpkg.com/swiper/swiper-bundle.min.css"/>
    <link rel="favicon" href="img/logo.png">
    <script src="//code.jquery.com/jquery-3.5.1.min.js"></script>
    <script>
        var role = sessionStorage.getItem('role');
        if(role != 'admin'){
            alert("잘못된 접근입니다!")
            location.href = "main.do"
        }
    </script>

    <!-- Demo styles -->
    <style>
        .cls_admin body {
            margin: 0;
        }

        .cls_admin ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 10%;
            /* position: fixed; */
            overflow: auto;
        }

        .cls_admin li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;
        }

        .cls_admin li a.active {
            background-color: #04AA6D;
            color: white;
        }

        .cls_admin li a:hover:not(.active) {
            background-color: #555;
            color: white;
        }

        <!--
        table

        -->
        #totalorder {
            font-family: Arial, Helvetica, sans-serif;
            border-collapse: collapse;
            width: 100%;
            vertical-align: center;
            text-align: center;
            overflow: auto;
        }

        #totalorder td, #totalorder th {

            border: 1px solid #ddd;
            padding: 8px;
        }

        #totalorder tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        #totalorder tr:hover {
            background-color: #ddd;
        }

        #totalorder th {
            padding-top: 12px;
            padding-bottom: 12px;
            text-align: left;
            background-color: #04AA6D;
            color: white;
        }
    </style>
</head>

<body>
<header id="header">
    <script>
        function getContextPath(){
            var hostIndex = location.href.indexOf(location.host) + location.host.length;
            var contextPath = location.href.substring(hostIndex, location.href.indexOf('/',hostIndex+1));
            return contextPath;
        }

        let headerContents = '';
        headerContents +=
            `
    <div class="inner" style="background:#04AA6D">
      <div class="headerWrapper">
        <div class="util innerContent">
          <ul class>
            <li id ="welcom"><p style="color: black"> 안녕하세요 관리자님</p><li>
            <li id="login_li"><a href="login.do" style="color: black">로그인</a></li>
            <li id="logout_li" style="display:none"> <a href="logout.do">로그아웃</a></li> <!--<a href="logout.do"> onclick="kakaoLogout()"-->
          </ul>
        </div>

        <div class="main innerContent">
          <div class="div_logo">
            <h1>
              <a href="main.do" style="display: flex; align-items: center;">
                <img src="./img/logo.png" style="width:15%;">
                <span style="margin-left:3%; font-size:XX-LARGE;">롯켓마트</span>
              </a>
            </h1>

          </div>
        </div>
      </div>
    </div>

`
        document.getElementById('header').innerHTML = headerContents;
        if (sessionStorage.getItem("id") != null) {
            document.getElementById("logout_li").style.display = "";
            document.getElementById("login_li").style.display = "none";
        }

        if (sessionStorage.getItem("id") == null) {
            document.getElementById("logout_li").style.display = "none";
            document.getElementById("login_li").style.display = "";
        }


        document.getElementById("recentImg1").src = recentProduct1.recentProductImg;
        document.getElementById("recentImg2").src = recentProduct2.recentProductImg;
        document.getElementById("recentImg3").src = recentProduct3.recentProductImg;
        document.getElementById("recentImg4").src = recentProduct4.recentProductImg;
        document.getElementById("recentImg5").src = recentProduct5.recentProductImg;
    </script>
</header>

<div class="cls_admin">
    <div>
        <ul>
            <li><a href="#statistics" onclick="tab1()">매출 통계</a></li>
            <li><a href="#orders" onclick="tab2()">주문 목록 조회</a></li>
        </ul>
    </div>
    <script type="text/javascript">

        function tab1(){
            $('.tab-statistics').show();
            $('.tab-order').hide();
        }
        function tab2(){
            $('.tab-statistics').hide();
            $('.tab-order').show();
        }
    </script>


    <div class="tabs" style="width:100%;   margin-left: 10%; margin-top: -80px">
        <div class="select_option">
            <%
                Date date = new Date();
                SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy-MM-dd");
                String strdate = simpleDate.format(date);
                date.setYear(date.getYear() - 1);
                String lastdate = simpleDate.format(date);
            %>
            <br>

            <input id="startdate" type="date" value=<%=lastdate%>>
            <input id="enddate" type="date" value=<%=strdate%>>
            <label for="productcategory">카테고리</label>
            <select id="productcategory" size="1">
                <option value="null">전체조회</option>
                <option value="과일">과일</option>
                <option value="채소">채소</option>
                <option value="잡곡견과">잡곡견과</option>
                <option value="수산">수산</option>
                <option value="정육계란">정육계란</option>
                <option value="유제품">유제품</option>
                <option value="냉장냉동">냉장냉동</option>
            </select>
            <button type="button" id="btn">조회</button>

        </div>
        <div class="tab-statistics" style="width: 75%; height: 500px; display:block;">
            <select id="date" size="1" style="margin-left: 90%">
                <option value="day">일별</option>
                <option value="week">주간</option>
                <option value="month">월별</option>
            </select>
            <!-- 구글 차트 호출 -->
            <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

            <!-- 차트 그리기 -->
            <div id="chart_main" style="height: 50%;"></div>
            <div id="category" style="width: 33.3%; float:left"></div>
            <div id="chart_age" style="width: 33.4%; float:left"></div>
            <div id="chart_gender" style="width: 33.3%; float:left"></div>

            <script type="text/javascript">

                google.charts.load('current', {packages: ['corechart', 'line']});
                google.charts.setOnLoadCallback(drawLogScales);

                function drawLogScales(newdata) {

                    var d;
                    if (newdata == null) {
                        d = [[1, 2], [2, 3], [3, 0], [4, 1], [5, 6]];
                    } else {
                        d = newdata;
                    }


                    var data = new google.visualization.DataTable();
                    data.addColumn('string', '시간');
                    data.addColumn('number', '매출');

                    d.forEach(element => data.addRow([element.date, element.total]));

                    var options = {
                        animation: {
                            startup: true,
                            duration: 1000,
                            easing: 'out'
                        },
                        hAxis: {
                            title: '시간',
                            logScale: true,
                            showTextEvery : 2
                        },
                        vAxis: {
                            title: '매출',
                            logScale: false
                        },
                        colors: ['#a52714']
                    };

                    var chart = new google.visualization.LineChart(document.getElementById('chart_main'));
                    chart.draw(data, options);
                }
            </script>
            <script type="text/javascript">
                google.charts.load('current', {'packages': ['corechart']});
                google.charts.setOnLoadCallback(drawChart);

                function drawChart(newdata) {
                    var d;
                    if (newdata == null) {
                        d = [
                            ['야채', 11],
                            ['과일', 2],
                            ['유제품', 2],
                            ['가공품', 2],
                            ['수산', 7]
                        ]
                    } else {
                        d = newdata;
                    }
                    var data = new google.visualization.DataTable();
                    data.addColumn('string', '품목');
                    data.addColumn('number', '판매량');

                    d.forEach(element => data.addRow([element.title, element.orderamount]));

                    var options = {
                        title: '품목',
                        pieSliceText: 'label',
                    };

                    var chart = new google.visualization.PieChart(document.getElementById('category'));

                    chart.draw(data, options);
                }
            </script>
            <script>
                google.charts.load('current', {packages: ['corechart', 'bar']});
                google.charts.setOnLoadCallback(drawBasic);

                function drawBasic(newdata) {
                    var d;
                    if (newdata == null) {
                        d = [
                            ['10대', 333000],
                            ['20대', 8175000],
                            ['30대', 3792000],
                            ['40대', 2695000],
                            ['50대', 2099000],
                            ['60대', 1526000]
                        ]
                    } else {
                        d = [
                            ['10대', newdata.ten],
                            ['20대', newdata.twen],
                            ['30대', newdata.thir],
                            ['40대', newdata.four],
                            ['50대', newdata.fifth],
                            ['60대', newdata.sixth]
                        ];
                    }
                    var data = new google.visualization.DataTable();
                    data.addColumn('string', '나이대');
                    data.addColumn('number', '판매량');

                    data.addRows(d);
                    var options = {
                        title: '연령대별 판매량',
                        chartArea: {width: '50%'},
                        animation: {
                            startup: true,
                            duration: 1000,
                            easing: 'out'
                        },
                        hAxis: {
                            title: '판매량',
                            minValue: 0
                        },
                        vAxis: {
                            title: '연령대'
                        }
                    };

                    var chart = new google.visualization.BarChart(document.getElementById('chart_age'));

                    chart.draw(data, options);
                }
            </script>
            <script>
                google.charts.load('current', {packages: ['corechart', 'bar']});
                google.charts.setOnLoadCallback(drawTopX);

                function drawTopX(newdata) {
                    var d;
                    if (newdata == null) {
                        d = [
                            ['남자', 110, '남자'],
                            ['여자', 100, '여자']
                        ]
                    } else {
                        d = [['남자', newdata.male], ['여자', newdata.female]];
                    }
                    var data = new google.visualization.DataTable();


                    data.addColumn('string', '성별 주문량');
                    data.addColumn('number', '판매량');
                    data.addRows(d);


                    var options = {
                        title: "",
                        chartArea: {width: '50%'},
                        animation: {
                            startup: true,
                            duration: 1000,
                            easing: 'out'
                        },
                        axes: {
                            x: {
                                0: {side: 'top'}
                            }
                        },


                        legend: {position: 'none'},
                        bar: {groupWidth: "10%"}
                    };

                    var materialChart = new google.charts.Bar(document.getElementById('chart_gender'));
                    materialChart.draw(data, options);
                }
            </script>
            <script>

                $(document).ready(function () {
                    init();
                    tab1();
                });


                function getJson() {
                    let json = {
                        "startdate": $("#startdate").val(),
                        "enddate": $("#enddate").val(),
                        "productcategory": $("#productcategory").val(),
                        "date": $("#date").val()
                    }
                    return json;
                }

                function init() {
                    selectPopulalityProduct();
                    selectDateTotal();
                    selectGenderStatistics();
                    selectAgeStatistics();
                    selectTotalOrders();
                }

                $('#btn').click(function () {
                    init();
                })

                $('#date').change(function () {
                    selectDateTotal();
                })

                function selectAgeStatistics() {

                    $.ajax({
                        type: "POST",
                        url: "selectAgeStatistics.do",
                        data: JSON.stringify(getJson()),
                        contentType: 'application/json',
                        success: function (data) {
                            drawBasic(data);
                        },
                        error: function () {
                            console.log("error");
                        }
                    })
                }

                function selectDateTotal() {

                    $.ajax({
                        type: "POST",
                        url: "selectDateTotal.do",
                        data: JSON.stringify(getJson()),
                        contentType: 'application/json',
                        success: function (data) {
                            drawLogScales(data);
                        },
                        error: function () {
                            console.log("error");
                        }
                    })
                }

                function selectGenderStatistics() {1
                    $.ajax({
                        type: "POST",
                        url: "selectGenderStatistics.do",
                        data: JSON.stringify(getJson()),
                        contentType: 'application/json',
                        success: function (data) {
                            drawTopX(data);
                        },
                        error: function () {
                            console.log("error");
                        }
                    })
                }


                function selectPopulalityProduct() {
                    $.ajax({
                        type: "POST",
                        url: "selectPopulalityProduct.do",
                        data: JSON.stringify(getJson()),
                        contentType: 'application/json',
                        success: function (data) {

                            drawChart(data);
                        },
                        error: function () {
                            console.log("error");
                        }
                    })
                }


            </script>

        </div>
        <div class="tab-order" style="overflow: auto; display: block">
            <script>
                function selectTotalOrders() {
                    $.ajax({
                        type: "POST",
                        url: "selectTotalOrders.do",
                        data: JSON.stringify(getJson()),
                        contentType: 'application/json',
                        success: function (data) {
                            $('#totalorder > tbody').empty();
                            var tr = "";
                            $.each(data, function () {
                                tr += '<tbody><tr><td>' + this.orderId +
                                    '</td><td>' + this.userId +
                                    '</td><td>' + this.productId +
                                    '</td><td>' + this.orderAmount +
                                    '</td><td>' + this.orderDate +
                                    '</td><td>' + this.orderAddress +
                                    '</td><td>' + this.orderDetailAddress +
                                    '</td><td>' + this.orderTotalPrice +
                                    '</td><td>' + this.payment +
                                    '</td><td>' + this.valid +
                                    '</td><td>' + this.deliveryRequirement +
                                    '</td></tr></tbody>';
                            });
                            $("#totalorder").append(tr);	// 테이블에 추가
                        },
                        error: function () {
                            console.log("error");
                        }
                    })
                }
            </script>
            <table id="totalorder" style="width: 90%; height : 800;">
                <colgroup><col width="5%">
                    <col width="5%">
                    <col width="5%">
                    <col width="5%">
                    <col width="10%">
                    <col width="15%">
                    <col width="15%">
                    <col width="10%">
                    <col width="5%">
                    <col width="5%">
                    <col width="10%">
                </colgroup><thead>
            <tr>
                <th>
                    주문ID
                </th>
                <th>
                    유저ID
                </th>
                <th>
                    상품ID
                </th>
                <th>
                    주문량
                </th>
                <th>
                    주문일자
                </th>
                <th>
                    주소
                </th>
                <th>
                    상세주소
                </th>
                <th>
                    총액
                </th>
                <th>
                    결제방법
                </th>
                <th>
                    유효성
                </th>
                <th>
                    배송방법
                </th>
            </tr>
            </thead>
                <tbody><tr><td>1073</td><td>8</td><td>13</td><td>9</td><td>2022-04-20 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>79900</td><td>비씨카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1072</td><td>6</td><td>1</td><td>10</td><td>2022-04-20 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>69900</td><td>NH농협카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1071</td><td>5</td><td>36</td><td>20</td><td>2022-04-20 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>100000</td><td>NH농협카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1070</td><td>5</td><td>32</td><td>14</td><td>2022-04-17 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>45000</td><td>하나카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1069</td><td>5</td><td>34</td><td>14</td><td>2022-04-15 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>45</td><td>현대카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1068</td><td>7</td><td>45</td><td>15</td><td>2022-04-08 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>134000</td><td>현대카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1067</td><td>6</td><td>37</td><td>10</td><td>2022-04-04 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>118000</td><td>현대카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1066</td><td>5</td><td>40</td><td>10</td><td>2022-04-03 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>94900</td><td>카카오페이</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1065</td><td>1</td><td>48</td><td>30</td><td>2022-04-01 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>2103000</td><td>카카오페이</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1062</td><td>7</td><td>10</td><td>11</td><td>2022-03-16 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>14900</td><td>카카오페이</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1061</td><td>6</td><td>9</td><td>10</td><td>2022-03-16 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>77800</td><td>롯데카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1054</td><td>1</td><td>20</td><td>5</td><td>2022-03-14 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>25000</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1055</td><td>6</td><td>12</td><td>5</td><td>2022-03-14 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>35000</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1060</td><td>5</td><td>14</td><td>10</td><td>2022-03-13 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>17800</td><td>롯데카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1059</td><td>5</td><td>15</td><td>5</td><td>2022-03-10 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>78800</td><td>롯데카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1058</td><td>6</td><td>16</td><td>2</td><td>2022-03-10 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>13990</td><td>하나카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1057</td><td>0</td><td>16</td><td>10</td><td>2022-03-05 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>139990</td><td>하나카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1056</td><td>1</td><td>11</td><td>10</td><td>2022-03-03 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>69990</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1064</td><td>1</td><td>15</td><td>11</td><td>2022-02-28 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>149000</td><td>카카오페이</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1052</td><td>4</td><td>20</td><td>5</td><td>2022-02-22 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>19800</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1051</td><td>1</td><td>47</td><td>10</td><td>2022-02-22 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>19800</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1063</td><td>7</td><td>10</td><td>11</td><td>2022-02-16 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>14900</td><td>카카오페이</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1053</td><td>6</td><td>20</td><td>5</td><td>2022-02-12 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>30000</td><td>씨티카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1050</td><td>6</td><td>46</td><td>10</td><td>2022-01-22 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>210900</td><td>신한카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1049</td><td>5</td><td>35</td><td>5</td><td>2022-01-22 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>200900</td><td>신한카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1047</td><td>1</td><td>27</td><td>15</td><td>2022-01-15 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>50000</td><td>KB카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1046</td><td>0</td><td>5</td><td>6</td><td>2022-01-15 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>30000</td><td>삼성카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1048</td><td>2</td><td>30</td><td>10</td><td>2022-01-10 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>29900</td><td>신한카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody><tbody><tr><td>1045</td><td>0</td><td>8</td><td>10</td><td>2022-01-03 10:54:47</td><td>강남구 신사로</td><td>비트빌라 203호</td><td>100000</td><td>삼성카드</td><td>undefined</td><td>문앞에놔주세요</td></tr></tbody></table>
        </div>
    </div>
</div>

<footer id="footer">
    <script src="js/footer.js"></script>
</footer>

</body>

</html>
