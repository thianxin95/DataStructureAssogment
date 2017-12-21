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
    public CircularList<Menu> AddMenu(Menu newMenu, CircularList<Menu> oldMenu) {
        oldMenu.add(newMenu);
        return oldMenu;
    }

    @Override
    public CircularList<Menu> RemoveMenu(int index, CircularList<Menu> oldMenu) {
        oldMenu.remove(index);
        return oldMenu;
    }

    @Override
    public CircularList<Menu> UpdateMenu(int index, Menu details , CircularList<Menu> oldMenu) {
//        oldMenu.replace(index,details);
        return oldMenu;
    }
    
}
