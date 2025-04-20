package CompositeDesignPattern.MenuExample;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent{
    private String name;
    private List<MenuItem> children = new ArrayList<>();
    public Menu(String name){this.name=name;}
    public void addComponent(MenuItem component){
        children.add(component);
    }
    public void removeComponent(MenuItem component){
        children.remove(component);
    }

    @Override
    public void showDetails() {
        for (MenuItem item : children){
            item.showDetails();
        }
    }
}
