package lotte.com.lottket.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private int productId;
    private String productTitle;
    private String productCategory;
    private int productPrice;
    private int productStock;
    private String productRegDate;
    private double productTotalRate;

    public ProductDto(int productId, String productTitle, String productCategory, int productPrice, int productStock, String productRegDate, double productTotalRate) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
    }

    public ProductDto(String productTitle, String productCategory, int productPrice, int productStock, String productRegDate, double productTotalRate) {
        this.productTitle = productTitle;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public String getProductRegDate() {
        return productRegDate;
    }

    public double getProductTotalRate() {
        return productTotalRate;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                ", productId='" + productId + '\'' +
                ", productTitle='" + productTitle + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productRegDate='" + productRegDate + '\'' +
                ", productTotalRate=" + productTotalRate +
                '}';
    }
}
