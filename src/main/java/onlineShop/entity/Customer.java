package onlineShop.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = 2652327633296064143L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;
    private String customerPhone;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private ShippingAddress shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private BillingAddress billingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(unique = true)
    private Cart cart;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public User getUser() {
        return user;
    }

    public Cart getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
