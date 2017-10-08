package model;

import java.util.ArrayList;

/**
 * Created by Balint on 2017. 10. 08..
 */
public class Koffer {
   private ArrayList<Item> items ;
   private int height;
   private int width;
    private int[][] matrix;

    public Koffer(ArrayList<Item> items, int height, int width) {
        this.items = items;
        this.height = height;
        this.width = width;
        initialize();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void initialize(){
        matrix = new int[width][height];
        for(int i = 0;i<width;i++)
            for(int j = 0;j<height;j++)
                matrix[i][j] = 0;
    }
    @Override
    public String toString()
    {
        String resault = "";
        for(int j = 0;j<height;j++) {
            for (int i = 0; i < width; i++) {
                resault += matrix[i][j] + ( i == width-1 ? "" : " ");
            }
            resault+="\n";
        }
        return resault;
    }
}
