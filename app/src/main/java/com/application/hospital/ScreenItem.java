package com.application.hospital;

public class ScreenItem {
    String mainText, description;
    int screenImg;

    public ScreenItem(String mainText, String description, int screenImg){
        this.mainText = mainText;
        this.description = description;
        this.screenImg = screenImg;

    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public void setScreenImg(int screenImg) {
        this.screenImg = screenImg;
    }

    public int getScreenImg() {
        return screenImg;
    }

    public String getDescription() {
        return description;
    }

    public String getMainText() {
        return mainText;
    }
}
