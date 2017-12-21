/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaInterfaces;

import ADT.*;
import entity.*;
/**
 *
 * @author Tarc
 */
public interface MenuInterface {
    ArrayListADT<Menu> AddMenu(Menu newMenu , ArrayListADT<Menu> oldMenu);
    ArrayListADT<Menu> RemoveMenu(int index , ArrayListADT<Menu> oldMenu);
    ArrayListADT<Menu> UpdateMenu(int index , Menu updatedetails , ArrayListADT<Menu> oldMenu);
}
