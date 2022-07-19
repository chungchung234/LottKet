<%@ page import="lotte.com.lottket.dto.ProductDto" %>
<%@ page import="lotte.com.lottket.dto.ProductImageDto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  ProductDto productDto = (ProductDto)request.getAttribute("productDto");
  List<ProductImageDto> productImageDto = (List<ProductImageDto>)request.getAttribute("productImageDto");
%>

<%--<%=productDto.toString()%>--%>
<%
    for(int i=0;i<productImageDto.size();i++){
%>
    <h2><%=productImageDto.get(i).toString()%><h2>
<%
    }
%>
<script>
    alert('hi');
</script>
