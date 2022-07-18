package lotte.com.lottket.dto;

import java.time.LocalDateTime;

public class ProductDto {
    private int productId;
    private String productTitle;
    private String category;
    private int productPrice;
    private int productStock;
    private String productRegDate;
    private int productTotalRate;

    public ProductDto(int productId, String productTitle, String productCategory, int productPrice, int productStock, String productRegDate, int productTotalRate) {
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


    public int getProductTotalRate() {
        return productTotalRate;
    }

    public void setProductTotalRate(int productTotalRate) {
        this.productTotalRate = productTotalRate;
    }
}
