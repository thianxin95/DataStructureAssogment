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
    public LinkList<Menu> RemoveMenu(int index, LinkList<Menu> oldMenu) {
        //oldMenu.remove(index);
        return oldMenu;
    }

    @Override
    public LinkList<Menu> UpdateMenu(int index, Menu details , LinkList<Menu> oldMenu) {
//        oldMenu.replace(index,details);
        return oldMenu;
    }
    
}
