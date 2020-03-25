/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.xml.stream.events.Comment;

/**
 *
 * @author sunyan
 */
public class Product {
    List<Comment> comments;
    private Image image;
    private String productId;
    private String productName;
    private float price;
    private int likesNum;
    private float evaluationAverage;
    private String allergy;
     public Product(Image image,String productId,String productName,float Price,int likesNum,float evaluationAverage,String allergy) {
        this.price=price;
        this.allergy=allergy;
        this.evaluationAverage=evaluationAverage;
        this.image=image;
        this.likesNum=likesNum;
        this.productId=productId;
        this.productName=productName;
        this.comments = new ArrayList<>();
    }


    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float Price) {
        this.price = Price;
    }

    public int getLikesNum() {
        return likesNum;
    }

    public void setLikesNum(int likesNum) {
        this.likesNum = likesNum;
    }

    public float getEvaluationAverage() {
        return evaluationAverage;
    }

    public void setEvaluationAverage(float evaluationAverage) {
        this.evaluationAverage = evaluationAverage;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
    
}
