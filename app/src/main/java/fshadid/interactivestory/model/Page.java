package fshadid.interactivestory.model;

import android.media.Image;

/**
 * Created by farahshadid on 6/5/17.
 */

public class Page {

    private int imageId;
    private int textId;
    private Choice choice;
    private Choice choice1;
    private boolean isFinalPage = false;


    public Page(int imageId, int textId) {
        this.imageId = imageId;
        this.textId = textId;
        isFinalPage = true;
    }

    public Page(int imageId, int textId, Choice choice, Choice choice1) {
        this.imageId = imageId;
        this.textId = textId;
        this.choice = choice;
        this.choice1 = choice1;
    }

    public int getImageId() {
        return imageId;
    }

    public int getTextId() {
        return textId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }


    public Choice getChoice() {
        return choice;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice(Choice choice) {
        this.choice = choice;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }
}
