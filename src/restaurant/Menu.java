package restaurant;

import java.util.Date;
import java.util.HashMap;

public class Menu {
    protected Date lastUpdated;

    private HashMap<String, MenuItem> menuItems;

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public HashMap<String, MenuItem> getMenuItems() {
        if(menuItems == null) {
            menuItems = new HashMap<String, MenuItem>();
        }
        return menuItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "lastUpdated=" + lastUpdated +
                ", menuItems=" + menuItems +
                '}';
    }

    public void addMenuItem(String name, Double price, String description, String category, Boolean isNew) {
        menuItems.put(name, new MenuItem(name, price, description, category, isNew));
    }

    public void removeMenuItem(String name) {
        menuItems.remove(name);
    }
}
