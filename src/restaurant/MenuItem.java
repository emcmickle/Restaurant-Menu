package restaurant;

import java.util.Objects;

public class MenuItem {

    private String name;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;

    public MenuItem(String name, Double price, String description, String category, Boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Please enter a valid name.");
        } else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) &&
                Objects.equals(price, menuItem.price) &&
                Objects.equals(description, menuItem.description) &&
                Objects.equals(category, menuItem.category) &&
                Objects.equals(isNew, menuItem.isNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, category, isNew);
    }

    public void setPrice(Double price) {
        if (price <= 0) {
            System.out.println("Please enter a valid price.");
        } else {
            this.price = price;
        }
    }
    public void setDescription(String description) {
            this.description = description;
        }
    public void setCategory(String category) {
        if (category != "appetizer" || category != "main course" || category != "dessert") {
            System.out.println("Please enter a valid category.");
        } else {
            this.category = category;
        }
    }
    public void setIsNew(Boolean isNew) {
        this.isNew = isNew;
    }
    public String getName() {
        return name;
    }
    public Double getPrice() {
        return price;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public Boolean getIsNew() {
        return isNew;
    }
}
