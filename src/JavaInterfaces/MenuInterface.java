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
    LinkList<Menu> RemoveMenu(int index , LinkList<Menu> oldMenu);
    LinkList<Menu> UpdateMenu(int index , Menu updatedetails , LinkList<Menu> oldMenu);
}
