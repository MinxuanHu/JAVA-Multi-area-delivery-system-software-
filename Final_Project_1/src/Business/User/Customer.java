/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.UserAbstract;
import Business.Address;
import Business.Order;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sunyan
 */
public class Customer extends UserAbstract implements Comparable<Customer>{
    private Date dateCreated;
    private List<String> labels;
    private Image image;
    private List<Address> addressBook;
    private String firstName;
    private String lastName;
    private String gender;
    private boolean member;
    private List<Order> orderHistory;
    private List<Shop> likeShops;
    private List<Shop> browseHistory;

    public Customer(Date dateCreated, List<String> labels, Image image, List<Address> addressBook, String firstName, String lastName, String gender, boolean member, List<Order> orderHistory, List<Shop> likeShops, List<Shop> browseHistory, String password, String userName, String role, String userID) {
        super(password, userName, role, userID);
        this.dateCreated = dateCreated;
        this.labels = labels;
        this.image = image;
        this.addressBook = new ArrayList<>();
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.member = member;
        this.orderHistory = new ArrayList<>();
        this.likeShops = likeShops;
        this.browseHistory = new ArrayList<>();
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Address> getAddressBook() {
        return addressBook;
    }

    public void setAddressBook(List<Address> addressBook) {
        this.addressBook = addressBook;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public List<Shop> getLikeShops() {
        return likeShops;
    }

    public void setLikeShops(List<Shop> likeShops) {
        this.likeShops = likeShops;
    }

    public List<Shop> getBrowseHistory() {
        return browseHistory;
    }

    public void setBrowseHistory(List<Shop> browseHistory) {
        this.browseHistory = browseHistory;
    }
    
    @Override
    public int compareTo(Customer o){
    return getUserName().compareTo(o.getUserName());
    }
    @Override
    public boolean verify(String password)
    {
    if(password.equals(getPassword()))
            return true;
        return false;
    }
}
