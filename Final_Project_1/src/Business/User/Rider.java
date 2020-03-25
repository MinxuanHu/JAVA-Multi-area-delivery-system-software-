/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.UserAbstract;
import Business.Order;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author sunyan
 */
public class Rider extends UserAbstract implements Comparable<Rider>{

    private String firstName;
    private String lastName;
    private Image image;
    private String teleNum;
    private int evaluation;
    private List<Order> orderHistory;
    private Date dateCreated; 

    public Rider(String firstName, String lastName, Image image, String teleNum, int evaluation, List<Order> orderHistory, Date dateCreated, String password, String userName, String role, String userID) {
        super(password, userName, role, userID);
        this.firstName = firstName;
        this.lastName = lastName;
        this.image = image;
        this.teleNum = teleNum;
        this.evaluation = evaluation;
        this.orderHistory = new ArrayList<>();
        this.dateCreated = dateCreated;
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getTeleNum() {
        return teleNum;
    }

    public void setTeleNum(String teleNum) {
        this.teleNum = teleNum;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public List<Order> getOrderHistory() {
        return orderHistory;
    }

    public void setOrderHistory(List<Order> orderHistory) {
        this.orderHistory = orderHistory;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    @Override
    public int compareTo(Rider r){
    return getUserName().compareTo(r.getUserName());
    }
    @Override
    public boolean verify(String password)
    {
    if(password.equals(getPassword()))
            return true;
        return false;
    }
}
