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
    LinkList<Menu> AddMenu(Menu newMenu , LinkList<Menu> oldMenu);
    LinkList<Menu> RemoveMenu(Menu removeItem , LinkList<Menu> oldMenu);
    LinkList<Menu> UpdateMenu(Menu removeItem , Menu updatedetails , LinkList<Menu> oldMenu);
}
