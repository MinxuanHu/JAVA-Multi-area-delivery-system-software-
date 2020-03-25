/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
package Business;

import java.util.Date;

/**
 *
 * @author sunyan
 */
public class Order {
    private String orderId;
    private static int count = 0;
    private String shopId;
    private String riderId;
    private float totalPrice;
    private String customerTele;
    private String shopTele;
    private String riderTele;
    private Date oderTime;
    private Date preferTime;
    private Date arriveTime;
    private String Status;

    public Order(String orderId, String shopId, String riderId, float totalPrice, String customerTele, String shopTele, String riderTele, Date oderTime, Date preferTime, Date arriveTime, String Status) {
        count++;
        String s=String.valueOf(count);
        this.orderId = "O"+s;
        this.shopId = shopId;
        this.riderId = riderId;
        this.totalPrice = totalPrice;
        this.customerTele = customerTele;
        this.shopTele = shopTele;
        this.riderTele = riderTele;
        this.oderTime = oderTime;
        this.preferTime = preferTime;
        this.arriveTime = arriveTime;
        this.Status = Status;
    }
    
    

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getRiderId() {
        return riderId;
    }

    public void setRiderId(String riderId) {
        this.riderId = riderId;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getCustomerTele() {
        return customerTele;
    }

    public void setCustomerTele(String customerTele) {
        this.customerTele = customerTele;
    }

    public String getShopTele() {
        return shopTele;
    }

    public void setShopTele(String shopTele) {
        this.shopTele = shopTele;
    }

    public String getRiderTele() {
        return riderTele;
    }

    public void setRiderTele(String riderTele) {
        this.riderTele = riderTele;
    }

    public Date getOderTime() {
        return oderTime;
    }

    public void setOderTime(Date oderTime) {
        this.oderTime = oderTime;
    }

    public Date getPreferTime() {
        return preferTime;
    }

    public void setPreferTime(Date preferTime) {
        this.preferTime = preferTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
}
