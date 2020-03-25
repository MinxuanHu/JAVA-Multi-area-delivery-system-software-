/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Abstract;

/**
 *
 * @author sunyan
 */

    public abstract class UserAbstract {
    private String password;
    private String userName;
    private String role;
    private String userID;
    private static int count = 0;

    public UserAbstract(String password, String userName, String role,String userID) 
    {
        count++;
        String s=String.valueOf(count);
        char r =  role.charAt(0);
        this.password = password;
        this.userName = userName;
        this.role = role;
        this.userID=r+s;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    abstract public boolean verify(String password);

    public String getRole() {
        return role;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return getUserID();
    }
}
