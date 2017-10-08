package algorithm;

import model.Item;
import model.Koffer;

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
        for (Item item:koffer.getItems()){
            if(putLeftDown(item))
               succesItems++;
        }
        return succesItems;
    }
    private Item getHeightest()
    {
        Item max = koffer.getItems().get(0);
        for (Item item:koffer.getItems()) {
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
        for(int i = 0;i<koffer.getWidth();i++ )
            for(int j = koffer.getHeight()-1;j >=0;j--) {
                if(koffer.enoughSpace(item,i,j)) {
                    koffer.putItemToMatrix(item,i,j);
                    return true;
                }
            }
        return false;
    }

}
