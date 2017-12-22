/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;
import entity.*;
import JavaInterfaces.*;
/**
 *
 * @author Tarc
 * 
 * 
 */
public class MenuADT<T> implements MenuInterface{

    @Override
    public LinkList<Menu> AddMenu(Menu newMenu, LinkList<Menu> oldMenu) {
        oldMenu.add(newMenu);
        return oldMenu;
    }

    @Override
    public LinkList<Menu> RemoveMenu(Menu removeItem , LinkList<Menu> oldMenu) {
        oldMenu.remove(removeItem);
        return oldMenu;
    }

    @Override
    public LinkList<Menu> UpdateMenu(Menu remove, Menu details , LinkList<Menu> oldMenu) {
        oldMenu.remove(remove);
        oldMenu.add(details);
        return oldMenu;
    }
    
}
