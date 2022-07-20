let footerContents = '';
footerContents += 
`

    <div class="inner">
      <div class="upper">
        <h1></h1>
        <ul>
          <li><a href="#">Policy</a></li>
          <li><a href="#">Terms</a></li>
          <li><a href="#">Family Site</a></li>
          <li><a href="#">Sitemap</a></li>
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