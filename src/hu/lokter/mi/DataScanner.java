package hu.lokter.mi;

import model.Item;
import model.Koffer;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Created by Balint on 2017. 10. 08..
 */
public class DataScanner {
    private Koffer koffer;
    private final String DATA_SCANNER = "DataScanner";

    public void scanData()
    {
        //TODO DataScanner
        ArrayList<Item> itemList = new ArrayList<>();
        int kofferHeight;
        int kofferWidht;
        int itemNum;
        String line;
        Scanner sc = new Scanner(System.in);
        kofferHeight = sc.nextInt();
        kofferWidht = sc.nextInt();

        itemNum = sc.nextInt();
        for (int i = 0;i< itemNum;i++)
        {
            itemList.add(new Item(sc.nextInt(),sc.nextInt(),i+1));
        }
        koffer = new Koffer(itemList,kofferHeight,kofferWidht);



    }
    public Koffer getKoffer()
    {

        return koffer;
    }
}
