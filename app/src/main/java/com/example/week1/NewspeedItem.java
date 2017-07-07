/*
 *  Class Name : NewspeedItem
 *
 *  Version 1.0
 *
 *  Created by 현기 on 2017-07-07.
 *
 *  Description : CardView에 데이터를 담기위한 데이터 객체
 *
 */
package com.example.week1;

public class NewspeedItem {

    private String profil;
    private int pfImg;
    private int image;
    private String date;
    private String contents;
    private String subTitle;
    private String likeNum;
    private String commentNum;
    private String shareNum;

    public String getProfil() {
        return profil;
    }

    public void setProfil(String profil) {
        this.profil = profil;
    }

    public int getPfImg() {
        return pfImg;
    }

    public void setPfImg(int pfImg) {
        this.pfImg = pfImg;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getShareNum() {
        return shareNum;
    }

    public void setShareNum(String shareNum) {
        this.shareNum = shareNum;
    }
}
