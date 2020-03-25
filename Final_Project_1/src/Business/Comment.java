/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.awt.Image;
import java.util.Date;

/**
 *
 * @author huminxuan
 */
public class Comment{
    private String commentId;
    private String commentTxt;
    private Date date;
    private String customerId;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
    private Image image;
    private String productId;

    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentTxt() {
        return commentTxt;
    }

    public void setCommentTxt(String commentTxt) {
        this.commentTxt = commentTxt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
    public Comment(String commentId, String commentTxt, Date date,String customerId,Image image,String productId) {
        this.commentId=commentId;
        this.customerId = customerId;
        this.commentTxt=commentTxt;
        this.date=date;
        this.image=image;
        this.productId=productId;
    }
}
