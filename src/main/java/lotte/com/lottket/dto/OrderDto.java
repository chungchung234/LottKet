package lotte.com.lottket.dto;

import java.util.Date;

public class OrderDto
{
    private int orderId;
    private int userid;
    private int productid;
    private int orderamount;
    private Date orderdate;
    private String orderaddress;
    private String orderdetailaddress;
    private int ordertotalprice;
    private String payment;
    private boolean valid;
    private String deliveryrequirement;

    public OrderDto() {
    }

    public OrderDto(int userid, int productid, int orderamount, Date orderdate, String orderaddress, String orderdetailaddress, int ordertotalprice, String payment, boolean valid, String deliveryrequirement) {
        this.userid = userid;
        this.productid = productid;
        this.orderamount = orderamount;
        this.orderdate = orderdate;
        this.orderaddress = orderaddress;
        this.orderdetailaddress = orderdetailaddress;
        this.ordertotalprice = ordertotalprice;
        this.payment = payment;
        this.valid = valid;
        this.deliveryrequirement = deliveryrequirement;
    }

    public OrderDto(int orderId, int userid, int productid, int orderamount, Date orderdate, String orderaddress, String orderdetailaddress, int ordertotalprice, String payment, boolean valid, String deliveryrequirement) {
        this.orderId = orderId;
        this.userid = userid;
        this.productid = productid;
        this.orderamount = orderamount;
        this.orderdate = orderdate;
        this.orderaddress = orderaddress;
        this.orderdetailaddress = orderdetailaddress;
        this.ordertotalprice = ordertotalprice;
        this.payment = payment;
        this.valid = valid;
        this.deliveryrequirement = deliveryrequirement;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserid() {
        return userid;
    }

    public int getProductid() {
        return productid;
    }

    public int getOrderamount() {
        return orderamount;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public String getOrderaddress() {
        return orderaddress;
    }

    public String getOrderdetailaddress() {
        return orderdetailaddress;
    }

    public int getOrdertotalprice() {
        return ordertotalprice;
    }

    public String getPayment() {
        return payment;
    }

    public boolean isValid() {
        return valid;
    }

    public String getDeliveryrequirement() {
        return deliveryrequirement;
    }

    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId=" + orderId +
                ", userid=" + userid +
                ", productid=" + productid +
                ", orderamount=" + orderamount +
                ", orderdate=" + orderdate +
                ", orderaddress='" + orderaddress + '\'' +
                ", orderdetailaddress='" + orderdetailaddress + '\'' +
                ", ordertotalprice=" + ordertotalprice +
                ", payment='" + payment + '\'' +
                ", valid=" + valid +
                ", deliveryrequirement='" + deliveryrequirement + '\'' +
                '}';
    }
}
