package lotte.com.lottket.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private long productId;
    private String productTitle;
    private String productCategory;
    private int productPrice;
    private int productStock;
    private String productRegDate;
    private double productTotalRate;

    private String productImageUrl;

    public ProductDto() {
    }

    public ProductDto(long productId, String productTitle, String productCategory, int productPrice, int productStock, String productRegDate, double productTotalRate, String productImageUrl) {
        this.productId = productId;
        this.productTitle = productTitle;
        this.productCategory = productCategory;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
        this.productImageUrl = productImageUrl;
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
                ", productImageUrl='" + productImageUrl + '\'' +
                '}';
    }

    public ProductDto(String productTitle, String category, int productPrice, int productStock, String productRegDate, double productTotalRate) {
        this.productTitle = productTitle;
        this.productCategory = category;
        this.productPrice = productPrice;
        this.productStock = productStock;
        this.productRegDate = productRegDate;
        this.productTotalRate = productTotalRate;
    }


    public String getProductRegDate() {
        return productRegDate;
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

    public double getProductTotalRate() {
        return productTotalRate;
    }

    public void setProductId(Long id) {
        this.productId = id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }
}
