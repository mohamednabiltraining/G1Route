package com.route.firstapp.Model;

/**
 * Created by Mohamed Nabil Mohamed (Nobel) on 1/11/2019.
 * byte code SA
 * m.nabil.fci2015@gmail.com
 */
public class WhatsAppContact {
    String name;
    String status;
    int Image;

    public WhatsAppContact(String name, String status, int image) {
        this.name = name;
        this.status = status;
        Image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }
}
