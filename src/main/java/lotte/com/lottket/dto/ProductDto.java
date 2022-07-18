package lotte.com.lottket.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private int productId;
    private String productTitle;
    private String category;
    private int productPrice;
    private int productStock;
    private LocalDateTime productRegdate;
    private double productTotal;



    public ProductDto(String productTitle, String category, int productPrice, int productStock, LocalDateTime productRegdate, double productTotal) {
        this.productTitle = productTitle;
        this.category = category;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegdate = productRegdate;
        this.productTotal = productTotal;
    }

    public ProductDto(int productId, String productTitle, String category, int productPrice, int productStock, LocalDateTime productRegdate, double productTotal) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.category = category;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegdate = productRegdate;
        this.productTotal = productTotal;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getCategory() {
        return category;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public LocalDateTime getProductRegdate() {
        return productRegdate;
    }

    public double getProductTotal() {
        return productTotal;
    }
}
