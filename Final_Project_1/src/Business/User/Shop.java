/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.UserAbstract;
import Business.Address;
import Business.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunyan
 */
public class Shop extends UserAbstract implements Comparable<Shop>{
    private Address address;
    private int evaluation;
    private int saleNum;
    private List<Product> productCatelog;

    public Shop(Address address, int evaluation, int saleNum, List<Product> productCatelog, String password, String userName, String role, String userID) {
        super(password, userName, role, userID);
        this.address = address;
        this.evaluation = evaluation;
        this.saleNum = saleNum;
        this.productCatelog = new ArrayList<>();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    public List<Product> getProductCatelog() {
        return productCatelog;
    }

    public void setProductCatelog(List<Product> productCatelog) {
        this.productCatelog = productCatelog;
    }
    @Override
    public int compareTo(Shop s){
    return getUserName().compareTo(s.getUserName());
    }
    @Override
    public boolean verify(String password)
    {
    if(password.equals(getPassword()))
            return true;
        return false;
    }
}
