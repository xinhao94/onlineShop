package onlineShop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cartitem")
public class CartItem implements Serializable {

    private static final long serialVersionUID = -2455760938054036364L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int quantity;

    private double price;

    @ManyToOne
    private Product product;

    @ManyToOne
    @JsonIgnore
    private Cart cart;

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
