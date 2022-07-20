<%--
  Created by IntelliJ IDEA.
  User: chung
  Date: 2022/07/19
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<html>
<h2>
    Hello Worlds
</h2>
<input type="text" id="startdate" value="2022-07-08">
<input type="text" id="enddate" value="2022-07-22">
<input type="text" id="productcategory" value="과일">
<button type="button" id="btn">btn</button>
<div id="curve_chart" style="width: 900px; height: 500px"></div>


</html>
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<script type="text/javascript">
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {
        var data = google.visualization.arrayToDataTable([
            ['Year', 'Sales', 'Expenses'],
            ['2004',  1000,      400],
            ['2005',  1170,      460],
            ['2006',  660,       1120],
            ['2007',  1030,      540]
        ]);

        var options = {
            title: 'Company Performance',
            curveType: 'function',
            legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
    }
</script>
</head>
<body>
<div id="curve_chart" style="width: 900px; height: 500px"></div>
</body>
<script>

    $(document).ready(function () {
        init();
    });



    function getJson() {
        let json = {
            "startdate": $("#startdate").val(),
            "enddate": $("#enddate").val(),
            "productcategory": $("#productcategory").val(),
            "date": "week"

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

    function selectAgeStatistics() {

        $.ajax({
            type: "POST",
            url: "selectAgeStatistics.do",
            data: JSON.stringify(getJson()),
            contentType: 'application/json',
            success: function (data) {
                console.log(data);
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
                $.each(data, function () {
                    console.log(this);
                })
            },
            error: function () {
                console.log("error");
            }
        })
    }

    function selectGenderStatistics() {
        $.ajax({
            type: "POST",
            url: "selectGenderStatistics.do",
            data: JSON.stringify(getJson()),
            contentType: 'application/json',
            success: function (data) {
                console.log(data);

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
                $.each(data, function () {
                    console.log(this);
                })
            },
            error: function () {
                console.log("error");
            }
        })
    }



    function selectTotalOrders() {
        $.ajax({
            type: "POST",
            url: "selectTotalOrders.do",
            data: JSON.stringify(getJson()),
            contentType: 'application/json',
            success: function (data) {
                $.each(data, function () {
                    console.log(this);
                })
            },
            error: function () {
                console.log("error");
            }
        })
    }

</script>

