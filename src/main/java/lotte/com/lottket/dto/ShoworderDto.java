package lotte.com.lottket.dto;


/**
 * Usage
 * 마이페이지  주문 목록 조회시
 * from cart c, product p, user u, productimage pi
 * Table 4개 조인용
 *
 * 작성자 : 정다은
 */
public class ShoworderDto {

    private Long orderid;
    private String orderdate;
    private String producttitle;
    private String productimageurl; // 대표 사진
    private int productprice;
    private int orderamount;
    private String orderaddress;
    private String orderdetailaddress;
    private Long userid;
    private String username;

    public ShoworderDto() {
    }

    public ShoworderDto(Long orderid, String orderdate, String producttitle, String productimageurl, int productprice, int orderamount, String orderaddress, String orderdetailaddress, Long userid, String username) {
        this.orderid = orderid;
        this.orderdate = orderdate;
        this.producttitle = producttitle;
        this.productimageurl = productimageurl;
        this.productprice = productprice;
        this.orderamount = orderamount;
        this.orderaddress = orderaddress;
        this.orderdetailaddress = orderdetailaddress;
        this.userid = userid;
        this.username = username;
    }

    public Long getOrderid() {
        return orderid;
    }

    public String getOrderdate() {
        return orderdate;
    }

    public String getProducttitle() {
        return producttitle;
    }

    public String getProductimageurl() {
        return productimageurl;
    }

    public int getProductprice() {
        return productprice;
    }

    public int getOrderamount() {
        return orderamount;
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public String getOrderdetailaddress() {
        return orderdetailaddress;
    }

    @Override
    public String toString() {
        return "ShoworderDto{" +
                "orderid=" + orderid +
                ", orderdate='" + orderdate + '\'' +
                ", producttitle='" + producttitle + '\'' +
                ", productimageurl='" + productimageurl + '\'' +
                ", productprice=" + productprice +
                ", orderamount=" + orderamount +
                ", orderaddress='" + orderaddress + '\'' +
                ", orderdetailaddress='" + orderdetailaddress + '\'' +
                '}';
    }
}
