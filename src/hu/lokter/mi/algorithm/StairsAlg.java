package hu.lokter.mi.algorithm;

import hu.lokter.mi.model.Item;
import hu.lokter.mi.model.Koffer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Balint on 2017. 10. 08..
 */
public class StairsAlg extends KofferAlgorithm {
    public StairsAlg(Koffer koffer) {
        super(koffer);
    }
    @Override
    public int order() {
        //TODO order
        int succesItems = 0;
        while (!koffer.getUnselectedItems().isEmpty()) {
            if (putLeftDown(getHeightest()))
                succesItems++;
        }

        return succesItems;
    }
    private Item getHeightest()
    {
        ArrayList<Item> unselected = koffer.getUnselectedItems();
        Item max = unselected.get(0);
        for (Item item:unselected) {
            if (max.getHeight() < item.getHeight())
                max = item;
            if(max.getHeight() == item.getHeight())
            {
                if(max.getWidth() < item.getWidth())
                    max = item;
            }
        }
        return max;
    }
    private Item getWidest()
    {
        Item max = koffer.getItems().get(0);
        for (Item item:koffer.getItems()) {
            if (max.getWidth() < item.getWidth())
                max = item;
            if(max.getWidth() == item.getWidth())
            {
                if(max.getHeight() < item.getHeight())
                    max = item;
            }
        }
        return max;
    }
    private boolean putLeftDown(Item item)
    {
        item.setSelected(true);
        for(int j = 0;j < koffer.getHeight();j++)
            for(int i = 0;i<koffer.getWidth();i++ ) {
                if(koffer.enoughSpace(item,i,j)) {
                    koffer.putItemToMatrix(item,i,j);
                    return true;
                }
            }
        return false;
    }

}
