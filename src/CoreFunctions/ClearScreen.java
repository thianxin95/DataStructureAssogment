/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoreFunctions;

/**
 *
 * @author Daniel
 */
public class ClearScreen {

  public ClearScreen() {
  }

  public void clearScreen() {
    for (int i = 0; i < 10; i++) {
      System.out.println();
    }
  }
}
