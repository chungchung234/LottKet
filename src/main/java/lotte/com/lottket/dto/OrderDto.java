package lotte.com.lottket.dto;

import java.util.Date;

public class OrderDto {

    private long orderId;
    private int orderAmount;
    private String orderDate;
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

    public OrderDto() {
    }

    public OrderDto(int orderAmount, String orderAddress, String orderDetailAddress, int orderTotalPrice, long userId, String userName, String userPhoneNumber, long productId, String productTitle, int productPrice) {
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

    public OrderDto( int orderAmount, String orderAddress, String orderDetailAddress, int orderTotalPrice, long userId, String userName, String userPhoneNumber, long productId, String productTitle, int productPrice,String orderDate, String payment) {
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
        this.payment=payment;
        this.orderDate=orderDate;
    }

    public OrderDto(long orderId, int orderAmount, String orderDate, String orderAddress, String orderDetailAddress, int orderTotalPrice, String payment, String deliveryRequirement, long userId, String userName, String userPhoneNumber, long productId, String productTitle, int productPrice) {
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

    public String getOrderDate() {
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

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }

    public void setOrderDetailAddress(String orderDetailAddress) {
        this.orderDetailAddress = orderDetailAddress;
    }

    public void setOrderTotalPrice(int orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setDeliveryRequirement(String deliveryRequirement) {
        this.deliveryRequirement = deliveryRequirement;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
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
