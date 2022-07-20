<%@ page import="java.util.List" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="lotte.com.lottket.dto.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  ProductDto productDto = (ProductDto)request.getAttribute("productDto");
  List<ProductImageDto> productImageDto = (List<ProductImageDto>)request.getAttribute("productImageDto");
  List<ProductDetailDto> productDetailDto = (List<ProductDetailDto>)request.getAttribute("productDetailDto");
  List<ReviewJoinUser> reviewJoinUserDto = (List<ReviewJoinUser>)request.getAttribute("reviewJoinUserDto");
  List<ReviewJoinReply> reviewJoinReplyDto = (List<ReviewJoinReply>)request.getAttribute("reviewJoinReplyDto");
%>

<%

%>
<%--
<%=productDto.toString()%>
--%>
<%--
    for(int i=0;i<productImageDto.size();i++){
%>
    <h2><%=productImageDto.get(i).toString()%><h2>
<%
    }
--%>
<%--
    for(int i=0;i<productDetailDto.size();i++){
%>
    <h2><%=productDetailDto.get(i).toString()%><h2>
<%
    }
--%>
<%--
    for(int i=0;i<reviewJoinUserDto.size();i++){
%>
    <h2><%=reviewJoinUserDto.get(i).toString()%><h2>
<%
    }
--%>
<%
    for(int i=0;i<reviewJoinReplyDto.size();i++){
%>
    <h2><%=reviewJoinReplyDto.get(i).toString()%><h2>
<%
    }
%>
<script>
    alert('hi');
</script>
