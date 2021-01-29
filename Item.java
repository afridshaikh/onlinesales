package onliesales.pojo;

import java.util.ArrayList;
import java.util.List;

public class Item {

    private String categoryName;
    private List<Item> subCategories = new ArrayList<>();
    private Integer count;

    public Item() {
    }

    public Item(String categoryName, List<Item> subCategories, Integer count) {
        this.categoryName = categoryName;
        this.subCategories = subCategories;
        this.count = count;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Item> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Item> subCategories) {
        this.subCategories = subCategories;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
