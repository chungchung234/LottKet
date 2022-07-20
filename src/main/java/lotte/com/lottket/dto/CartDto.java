package lotte.com.lottket.dto;

public class CartDto {

    private int cartId;
    private int userId;
    private int productId;
    private int amount;

    public CartDto() {

    }

    public CartDto(int userId, int productId, int amount) {
        this.userId = userId;
        this.productId = productId;
        this.amount = amount;
    }

    public CartDto(int cartId, int userId, int productId, int amount) {
        this.cartId = cartId;
        this.userId = userId;
        this.productId = productId;
        this.amount = amount;
    }

    public int getCartId() {
        return cartId;
    }

    public int getUserId() {
        return userId;
    }

    public int getProductId() {
        return productId;}

    public int productId()
    {
        return productId;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "CartDto{" +
                "cartId=" + cartId +
                ", userId=" + userId +
                ", productId=" + productId +
                ", amount=" + amount +
                '}';
    }
}
