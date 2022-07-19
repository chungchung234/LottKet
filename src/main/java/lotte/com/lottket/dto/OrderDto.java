package lotte.com.lottket.dto;

import java.util.Date;

public class OrderDto {

    private long orderId;
    private int orderAmount;
    private Date orderDate;
    private String orderAddress;
    private String orderDetailAddress;
    private int orderTotalPrice;
    private String payment;
    private String deliveryRequirement;

    // User
    private long userId;
    private String userName;
    private String userPhoneNumber;

    // Product
    private long productId;
    private String productTitle;
    private int productPrice;

    public OrderDto( int orderAmount, String orderAddress, String orderDetailAddress, int orderTotalPrice, long userId, String userName, String userPhoneNumber, long productId, String productTitle, int productPrice) {
        this.orderAmount = orderAmount;
        this.orderAddress = orderAddress;
        this.orderDetailAddress = orderDetailAddress;
        this.orderTotalPrice = orderTotalPrice;
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
    }



    public OrderDto(long orderId, int orderAmount, Date orderDate, String orderAddress, String orderDetailAddress, int orderTotalPrice, String payment, String deliveryRequirement, long userId, String userName, String userAddress, String userDetailAddress, String userPhoneNumber, long productId, String productTitle, int productPrice) {
        this.orderId = orderId;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
        this.orderDetailAddress = orderDetailAddress;
        this.orderTotalPrice = orderTotalPrice;
        this.payment = payment;
        this.deliveryRequirement = deliveryRequirement;
        this.userId = userId;
        this.userName = userName;
        this.userPhoneNumber = userPhoneNumber;
        this.productId = productId;
        this.productTitle = productTitle;
        this.productPrice = productPrice;
    }

    public long getOrderId() {
        return orderId;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public String getOrderDetailAddress() {
        return orderDetailAddress;
    }

    public int getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public String getPayment() {
        return payment;
    }

    public String getDeliveryRequirement() {
        return deliveryRequirement;
    }

    public long getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public int getProductPrice() {
        return productPrice;
    }



    @Override
    public String toString() {
        return "OrderDto{" +
                "orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", orderDate=" + orderDate +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderDetailAddress='" + orderDetailAddress + '\'' +
                ", orderTotalPrice=" + orderTotalPrice +
                ", payment=" + payment +
                ", deliveryRequirement='" + deliveryRequirement + '\'' +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userPhoneNumber='" + userPhoneNumber + '\'' +
                ", productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
