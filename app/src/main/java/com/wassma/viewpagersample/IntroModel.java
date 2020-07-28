package com.wassma.viewpagersample;

public class IntroModel {
    String description;
    int screenImage;

    public IntroModel(String description, int screenImage) {
        this.description = description;
        this.screenImage = screenImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScreenImage() {
        return screenImage;
    }

    public void setScreenImage(int screenImage) {
        this.screenImage = screenImage;
    }
}
