package lotte.com.lottket.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private Long productId;
    private String productTitle;
    private String productCategory;
    private int productPrice;
    private int productStock;
    private String productRegDate;
    private Double productTotalRate;

    public ProductDto(Long productId, String productTitle, String productCategory, int productPrice, int productStock, String productRegDate, Double productTotalRate) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", productTitle='" + productTitle + '\'' +
                ", productCategory='" + productCategory + '\'' +
                ", productPrice=" + productPrice +
                ", productStock=" + productStock +
                ", productRegDate='" + productRegDate + '\'' +
                ", productTotalRate=" + productTotalRate +
                '}';
    }


    public ProductDto(String productTitle, String category, int productPrice, int productStock, String productRegdate, String productTotalRate) {
        this.productTitle = productTitle;
        this.productCategory = category;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductRegDate() {
        return productRegDate;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public Double getProductTotalRate() {
        return productTotalRate;
    }

    public void setProductTotalRate(Double productTotalRate) {
        this.productTotalRate = productTotalRate;
    }
}
