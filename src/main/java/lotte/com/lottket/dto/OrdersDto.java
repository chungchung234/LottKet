package lotte.com.lottket.dto;

import java.util.Date;

public class OrdersDto {
    private int orderId;
    private int userId;
    private int productId;
    private int orderAmount;
    private Date orderDate;
    private String orderAddress;
    private String orderDetailAddress;
    private int orderTotalPrice;
    private String payment;
    private Boolean valid;
    private String deliveryRequirement;

    public OrdersDto() {

    }

    public OrdersDto(int orderId, int userId, int productId, int orderAmount, Date orderDate, String orderAddress, String orderDetailAddress, int orderTotalPrice, String payment, Boolean valid, String deliveryRequirement) {
        this.orderId = orderId;
        this.userId = userId;
        this.productId = productId;
        this.orderAmount = orderAmount;
        this.orderDate = orderDate;
        this.orderAddress = orderAddress;
        this.orderDetailAddress = orderDetailAddress;
        this.orderTotalPrice = orderTotalPrice;
        this.payment = payment;
        this.valid = valid;
        this.deliveryRequirement = deliveryRequirement;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;
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

    public Boolean getValid() {
        return valid;
    }

    public String getDeliveryRequirement() {
        return deliveryRequirement;
    }

    @Override
    public String toString() {
        return "OrdersDto{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", orderAmount=" + orderAmount +
                ", orderDate=" + orderDate +
                ", orderAddress='" + orderAddress + '\'' +
                ", orderDetailAddress='" + orderDetailAddress + '\'' +
                ", orderTotalPrice=" + orderTotalPrice +
                ", payment='" + payment + '\'' +
                ", valid=" + valid +
                ", deliveryRequirement='" + deliveryRequirement + '\'' +
                '}';
    }
}
