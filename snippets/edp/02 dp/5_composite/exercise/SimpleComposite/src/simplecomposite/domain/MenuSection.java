/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecomposite.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author null
 */
public class MenuSection implements MenuComponent {

    private final List<MenuComponent> components = new ArrayList<>();

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void show() {
        for (MenuComponent component : components) {
            component.show();
        }
    }
}
