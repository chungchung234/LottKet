<%@ page import="lotte.com.lottket.dto.ProductDto" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    ProductDto dto = (ProductDto) request.getAttribute("dto");
%>
<html>

<h1>기본 main</h1>
${dto.toString()}
<%= dto.toString() %>
<script type="text/javascript">

</script>

</html>