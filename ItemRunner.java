package onliesales.pojo;

import java.util.ArrayList;

public class ItemRunner {

    public static void main(String[] args) {


        ItemProcessor itemProcessor = new ItemProcessor();
        Item rootItem = new Item("root", new ArrayList<>(), 0);
        for (String input : getInput())
            itemProcessor.addItem(rootItem, input);

        itemProcessor.print(rootItem.getSubCategories(), "");

    }

    public static String[] getInput() {
        String[] input = new String[]{"Electronics > Arcade Equipment > Basketball Arcade Games > (105)",
                "Electronics > Arcade Equipment > Pinball Machine Accessories > (15)",
                "Electronics > Arcade Equipment > Pinball Machines > (30)",
                "Electronics > Arcade Equipment > Skee-Ball Machines > (80)",
                "Electronics > Arcade Equipment > Video Game Arcade Cabinet Accessories > (10)",
                "Electronics > Arcade Equipment > Video Game Arcade Cabinets > (4)",
                "Electronics > Audio > Audio Accessories > Audio & Video Receiver Accessories > (5)",
                "Electronics > Audio > Audio Accessories > Headphone & Headset Accessories  > (10)",
                "Electronics > Audio > Audio Accessories > Headphone & Headset Accessories > Headphone Cushions > (10)",
                "Electronics > Audio > Audio Accessories > Karaoke System Accessories > (20)",
                "Electronics > TV > (100)",
                "Electronics > Mobiles > IOS > (50)",
                "Electronics > Mobiles > Android OS > (40)",
                "Automobiles >  4 wheeler > (5)",
                "Automobiles >  2 wheeler > (14)"};
        return input;
    }


}
