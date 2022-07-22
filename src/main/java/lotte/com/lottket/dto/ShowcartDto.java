package lotte.com.lottket.dto;

/**
 * Usage
 * 장바구니 목록 조회시
 * from cart c, product p, user u, productimage pi
 * Table 4개 조인용
 *
 * 작성자 : 정다은
 */
public class ShowcartDto {

    private Long cartid;
    private String imageurl;
    private String producttitle;
    private int amount;

    private long userid;

    private int productprice;

    public ShowcartDto() {

    }

    public ShowcartDto(Long cartid, String imageurl, String producttitle, int amount, long userid, int productprice) {
        this.cartid = cartid;
        this.imageurl = imageurl;
        this.producttitle = producttitle;
        this.amount = amount;
        this.userid = userid;
        this.productprice = productprice;
    }

    public Long getCartid() {
        return cartid;
    }

    public void setCartid(Long cartid) {
        this.cartid = cartid;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public int getProductprice() {
        return productprice;
    }

    public void setProductprice(int productprice) {
        this.productprice = productprice;
    }

    public void setProducttitle(String producttitle) {
        this.producttitle = producttitle;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    @Override
    public String toString() {
        return "ShowcartDto{" +
                "cartid=" + cartid +
                ", imageurl='" + imageurl + '\'' +
                ", producttitle='" + producttitle + '\'' +
                ", amount=" + amount +
                ", userid=" + userid +
                ", productprice=" + productprice +
                '}';
    }
}
