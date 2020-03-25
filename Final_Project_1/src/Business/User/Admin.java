/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.User;

import Business.Abstract.UserAbstract;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sunyan
 */
public class Admin extends UserAbstract implements Comparable<Admin>{

    private List<Rider> riderDirectory;
    private List<Shop> shopDirectory;
    

    public Admin(List<Rider> riderDirectory, List<Shop> shopDirectory, String password, String userName, String role, String userID) {
        super(password, userName, role, userID);
        this.riderDirectory = new ArrayList<>();
        this.shopDirectory = new ArrayList<>();
    }

    public List<Rider> getRiderDirectory() {
        return riderDirectory;
    }

    public void setRiderDirectory(List<Rider> riderDirectory) {
        this.riderDirectory = riderDirectory;
    }

    public List<Shop> getShopDirectory() {
        return shopDirectory;
    }

    public void setShopDirectory(List<Shop> shopDirectory) {
        this.shopDirectory = shopDirectory;
    }
    
    @Override
    public int compareTo(Admin a){
    return getUserName().compareTo(a.getUserName());
    }
    @Override
    public boolean verify(String password)
    {
    if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
