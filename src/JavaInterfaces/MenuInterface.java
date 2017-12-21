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
    CircularList<Menu> AddMenu(Menu newMenu , CircularList<Menu> oldMenu);
    CircularList<Menu> RemoveMenu(int index , CircularList<Menu> oldMenu);
    CircularList<Menu> UpdateMenu(int index , Menu updatedetails , CircularList<Menu> oldMenu);
}
