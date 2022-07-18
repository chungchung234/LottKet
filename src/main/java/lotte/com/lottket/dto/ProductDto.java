package lotte.com.lottket.dto;

public class ProductDto {
    private int productId;
    private String productTitle;
    private String productCategory;
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

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public String getProductRegDate() {
        return productRegDate;
    }

    public void setProductRegDate(String productRegDate) {
        this.productRegDate = productRegDate;
    }

    public int getProductTotalRate() {
        return productTotalRate;
    }

    public void setProductTotalRate(int productTotalRate) {
        this.productTotalRate = productTotalRate;
    }
}
