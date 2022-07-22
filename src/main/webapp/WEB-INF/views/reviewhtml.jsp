<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

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

<c:forEach var="reviewJoinUser" items="${reviewJoinUserDto}">
    <div class="reviewList" style="border:3px solid black; padding:20px; border-radius:30px">
        <div class="uswersAndMoremenu">
            <div class="users">
                    <%--            <img src="<%=reviewJoinUserDto.get(i).getUserProfileImage()%>"--%>
                    <%--                                  style="border-radius:1.5em; margin-right:10px;">--%>
                <div class="identities">
                    <div class="userNameWrap">
                        <img src="${reviewJoinUser.userProfileImage}"
                             style="border-radius:1.5em; margin-right:10px;">
                            <%--                    <script>console.log(typeof new Date(document.getElementById("regdate").innerText).getMonth())</script>--%>
                        <script>
                            <%--let date_reply = (new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getFullYear()+"-"+--%>
                            <%--    (new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getMonth()+1)+"-"+--%>
                            <%--    new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getDate());--%>
                            // Fri Jul 22 02:34:15 GMT+09:00 2022
                            // console.log(date_reply)
                        </script>
                        <strong class="userName">&nbsp;&nbsp;<c:out value="${reviewJoinUser.userName}"/>&nbsp;&nbsp;</strong><span class="info">
                      <br><br> <c:out value="${reviewJoinUser.userGrade}"/>등급 &nbsp;&nbsp;&nbsp;등록일 : <span id="date${reviewJoinUser.reviewId}"><c:out value="${reviewJoinUser.reviewDate}"/></span>
                        <script>document.getElementById("date${reviewJoinUser.reviewId}").innerText = (new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getFullYear()+"-"+
                            (new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getMonth()+1)+"-"+
                            new Date(document.getElementById("date${reviewJoinUser.reviewId}").innerText).getDate())</script>
                    </span></div>
                    <div class="badges"></div>
                </div>
            </div>
        </div>
        <br>
        <span class="reviewList_avg" id="rev${reviewJoinUser.reviewId}" style="display:none;">${reviewJoinUser.rating}</span>
        <div id="${reviewJoinUser.reviewId}"><img style="width:20px;" src="<%=request.getContextPath()%>/img/fullStar.png"></div>
        <script>
            document.getElementById("${reviewJoinUser.reviewId}").innerHTML = ``;
            for (let i = 1; i <= Math.floor(document.getElementById("rev${reviewJoinUser.reviewId}").innerText); i++) {
                document.getElementById("${reviewJoinUser.reviewId}").innerHTML += `
                <img style="width:20px;" src="<%=request.getContextPath()%>/img/fullStar.png">
              `
            }
        </script>
        <br><br>

        <span class="reviewList_text"><c:out value="${reviewJoinUser.content}"/></span>
        <br><br><br><br>

        <c:forEach var="reviewJoinReply" items="${reviewJoinReplyDto}">
            <c:if test="${reviewJoinUser.reviewId eq reviewJoinReply.reviewId}">
                <p style="margin-left:50px;">[ 관리자 ]</p>
                <br>
                <p><div style="border:1px solid black; width:700px; height:200px; padding:10px; margin-left:50px; margin-bottom:20px;"><c:out value="${reviewJoinReply.content}"/></div></p>
            </c:if>
        </c:forEach>

        <button type="button" onclick='admin_reply("${reviewJoinUser.reviewId}")'>답글 작성</button>



        <div id="replydiv${reviewJoinUser.reviewId}" style="margin-top:20px; display:none;" >
            <span>[ 관리자 ]</span>
            <form style="margin-top:10px;" action="javascript:insertReply('${reviewJoinUser.reviewId}')">
                <p><textarea id="replyContent${reviewJoinUser.reviewId}" cols="50" rows="5" style="width:700px; padding:10px;"></textarea></p>
                <p style="padding-bottom: 15px;
                 padding-top: 10px"><input type="submit" value="Submit"></p>
            </form>
        </div>
    </div>

    <br><br>

    </div>
</c:forEach>