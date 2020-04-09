package com.example.blogtest;

public class Model {

    public static final int IMAGE_TYPE =0;
    public String title, subtitle, Image;
    public int type;


    public Model ( int mtype, String mtitle, String msubtitle, String image  ){

        this.title = mtitle;
        this.subtitle = msubtitle;
        this.type = mtype;
        this.Image = image;
    }
}
