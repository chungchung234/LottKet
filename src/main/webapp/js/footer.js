let footerContents = '';
footerContents += 
`

    <div class="inner">
      <div class="upper">
        <h1></h1>
        <ul>
          <li><a href="admin.do">Admin</a></li>
          <li><a href="https://github.com/LottKet/LottKet">Git</a></li>
          <li><a href="https://www.notion.so/LottKet-2b9af26a3df1422a8aa93f33197d23ab">Notion</a></li>
        </ul>
      </div>

      <div class="lower">
        <address>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Quas, facere.<br>
          TEL : 010-9336-0473 C.P : 010-9336-0473
        </address>
        <p>
          &copy; copyright all right reserved.
        </p>
      </div>
    </div>
`
document.getElementById('footer').innerHTML = footerContents;