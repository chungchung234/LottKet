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
    $.ready(

    )

    $.ajax({
        type: "GET",
        url: "admin/init",
        data: {
            start_date : ${start_date},
            end_date : ${end_date},
            category : ${category}
        },
        success: success,
        dataType: dataType
    })
</script>