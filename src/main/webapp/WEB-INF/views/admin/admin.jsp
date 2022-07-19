<%--
  Created by IntelliJ IDEA.
  User: chung
  Date: 2022/07/19
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<script>
    $(document).ready(function () {
        init();
    });

    function init() {
        selectDateTotal();
        selectPopulalityProduct();
        selectGenderStastistics();
        selectGenderStastistics();
    }

    function selectAgeStastistics() {
        $.ajax({
            type: "GET",
            url: "admin/selectAgeStastistics",
            data: {
                start_date: ${start_date},
                end_date: ${end_date},
                category: ${category}
            },
            success: success,
        })
    }

    function selectDateTotal() {
        $.ajax({
            type: "GET",
            url: "admin/selectDateTotal",
            data: {
                start_date: ${start_date},
                end_date: ${end_date},
                category: ${category}
            },
            success: success,
        })
    }

    function selectGenderStastistics() {
        $.ajax({
            type: "GET",
            url: "admin/selectGenderStastistics",
            data: {
                start_date: ${start_date},
                end_date: ${end_date},
                category: ${category}
            },
            success: success,
        })
    }


    function selectPopulalityProduct() {
        $.ajax({
            type: "GET",
            url: "admin/selectPopulalityProduct",
            data: {
                start_date: ${start_date},
                end_date: ${end_date},
                category: ${category}
            },
            success: success,
        })
    }


</script>