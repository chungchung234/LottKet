let headerContents = '';
headerContents +=
    `
    <div class="inner" style="background:#eee">
      <div class="headerWrapper">
        <div class="util innerContent">
          <ul class>
            <li id="login_li"><a href="login.do">로그인</a></li>
            <li id="logout_li" style="display:none"> <a href="logout.do">로그아웃</a></li> <!--<a href="logout.do"> onclick="kakaoLogout()"-->
            <li><a href="admin.html">Admin</a></li>
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

          <div>
            <ul id="gnb">
              <li><a href="mypage.html">My Page</a></li>
              <li><a href="#">장바구니</a></li>
            </ul>
          </div>    

          <div class="searchArea on IMG">
            <i class="fa-solid fa-magnifying-glass"></i>
          </div>
        </div>
      </div>
    </div>
    <div class="nav_category">
          <a href='category.do?productCategory=과일'>과일</a>
          <a href="category.do?productCategory=채소">채소</a>
          <a href="category.do?productCategory=잡곡견과">잡곡·견과</a>
          <a href="category.do?productCategory=정육">정육<a/>
          <a href="category.do?productCategory=수산">수산<a/>
          <a href="category.do?productCategory=냉동">냉동<a/>
          <hr>
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


// function kakaoLogout() {
//   sessionStorage.clear();
//   if (Kakao.Auth.getAccessToken()) {
//     Kakao.API.request({
//       url: '/v1/user/unlink',
//       success: function (response) {
//         console.log(response)
//       },
//       fail: function (error) {
//         console.log(error)
//       },
//     })
//     Kakao.Auth.setAccessToken(undefined)
//   }
//   window.location = "main.do";
// }