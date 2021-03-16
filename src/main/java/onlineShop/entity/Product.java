package onlineShop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    private static final long serialVersionUID = 5186013952828648626L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "category")
    private String productCategory;

    @Column(name = "description")
    private String productDescription;

    @Column(name = "manufacturer")
    private String productManufacturer;

    @Column(name = "name")
    private String productName;

    @Column(name = "price")
    private double productPrice;

    @Column(name = "unit")
    private String unitStock;

    public int getId() {
        return id;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getUnitStock() {
        return unitStock;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setUnitStock(String unitStock) {
        this.unitStock = unitStock;
    }
}
