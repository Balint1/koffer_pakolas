package hu.lokter.mi.model;

/**
 * Created by Balint on 2017. 10. 08..
 */
public class Item {
    private int id;
    private int height;
    private int width;
    boolean selected = false;

    public Item(int height, int width,int id) {
        this.height = height;
        this.width = width;
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public int getId() {
        return id;
    }
}
