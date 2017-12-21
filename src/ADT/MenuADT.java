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
 */
public class MenuADT<T> implements MenuInterface{

    @Override
    public ArrayListADT<Menu> AddMenu(Menu newMenu, ArrayListADT<Menu> oldMenu) {
        oldMenu.add(newMenu);
        return oldMenu;
    }

    @Override
    public ArrayListADT<Menu> RemoveMenu(int index, ArrayListADT<Menu> oldMenu) {
        oldMenu.remove(index);
        return oldMenu;
    }

    @Override
    public ArrayListADT<Menu> UpdateMenu(int index, Menu details , ArrayListADT<Menu> oldMenu) {
        oldMenu.replace(index,details);
        return oldMenu;
    }
    
}
