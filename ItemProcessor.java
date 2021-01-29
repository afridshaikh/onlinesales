package onliesales.pojo;

import java.util.ArrayList;
import java.util.List;

public class ItemProcessor {

    public void addItem(Item rootLevelItem, String valueString) {
        String[] categoriesSplit = valueString.split(">");

        String countString = categoriesSplit[categoriesSplit.length - 1].trim();
        Integer count = Integer.parseInt(countString.substring(1, countString.length() - 1));
        addItemRecursive(rootLevelItem.getSubCategories(), categoriesSplit, 0, count);
    }

    public void addItemRecursive(List<Item> items, String[] subcategories, int currentIndex, Integer count) {
        if(currentIndex == subcategories.length-1)
            return;
        Item item = null;
        for (Item i : items) {
            if (i.getCategoryName().equals(subcategories[currentIndex])) {
                item = i;
                break;
            }
        }

        if (item == null) {
            item = new Item(subcategories[currentIndex], new ArrayList<>(), count);
            items.add(item);
        } else {
            item.setCount(item.getCount() + count);
        }
        currentIndex+=1;
        addItemRecursive(item.getSubCategories(), subcategories, currentIndex, count);
    }

    public void print(List<Item> items, String prevCategories){
        for(Item item: items){
            System.out.println(prevCategories + " > " + item.getCategoryName() + " = " + item.getCount());
            print(item.getSubCategories(), prevCategories + " > " + item.getCategoryName());
        }

    }


}
