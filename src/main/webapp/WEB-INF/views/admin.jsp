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
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
<div id="chart_main"></div>
<div id="category" style="width: 900px; height: 500px;"></div>
<div id="chart_age"></div>
<div id="chart_gender"></div>

</html>
<script type="text/javascript">
    google.charts.load('current', {packages: ['corechart', 'line']});
    google.charts.setOnLoadCallback(drawLogScales);

    function drawLogScales() {
        var d=[[1,2],[2,3],[3,0],[4,1],[5,6]];
        var data = new google.visualization.DataTable();
        data.addColumn('number', 'Time');
        data.addColumn('number', 'Price');

        d.forEach(element => data.addRow(element));


        var options = {
            animation : {
                startup : true,
                duration : 1000,
                easing : 'out'
            },
            hAxis: {
                title: 'Time',
                logScale: true
            },
            vAxis: {
                title: 'Popularity',
                logScale: false
            },
            colors: ['#a52714']
        };

        var chart = new google.visualization.LineChart(document.getElementById('chart_main'));
        chart.draw(data, options);
    }
</script>
<script type="text/javascript">
    google.charts.load('current', {'packages':['corechart']});
    google.charts.setOnLoadCallback(drawChart);

    function drawChart() {

        var data = google.visualization.arrayToDataTable([
            ['Task', 'Hours per Day'],
            ['Work',     11],
            ['Eat',      2],
            ['Commute',  2],
            ['Watch TV', 2],
            ['Sleep',    7]
        ]);

        var options = {
            title: 'category',
            pieSliceText: 'label',
        };

        var chart = new google.visualization.PieChart(document.getElementById('category'));

        chart.draw(data, options);
    }
</script>
<script>
    google.charts.load('current', {packages: ['corechart', 'bar']});
    google.charts.setOnLoadCallback(drawBasic);

    function drawBasic() {

        var data = google.visualization.arrayToDataTable([
            ['10대', '판매량',],
            ['20대', 8175000],
            ['30대', 3792000],
            ['40대', 2695000],
            ['50대', 2099000],
            ['60대', 1526000]
        ]);

        var options = {
            title: '연령대별 판매량',
            chartArea: {width: '50%'},
            animation : {
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

    function drawTopX() {
        var data = new google.visualization.DataTable();
        data.addColumn('string', '성별');
        data.addColumn('number', '판매량');

        data.addRows([
            ['남자', 110],
            ['여자', 100]
        ]);
        var view = new google.visualization.DataView(data);
        view.setColumns([0, 1,
            {
                sourceColumn: 1,
                type: "string",
                role: "annotation" }]);

        var options = {

            chart: {
                title: '성별 판매량'
            },
            axes: {
                x: {
                    0: {side: 'top'}
                }
            },
            hAxis: {
                title: '성별',
            },
            vAxis: {
                title: '판매량'
            },
            colors: ['#0000ff','#ff0000']
        };

        var materialChart = new google.charts.Bar(document.getElementById('chart_gender'));
        materialChart.draw(view, options);
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

