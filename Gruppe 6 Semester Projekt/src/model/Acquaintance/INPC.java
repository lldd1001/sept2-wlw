/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Acquaintance;

/**
 * there are more methods that is not included in the interface yet if they shuld be necessary
 */
public interface INPC {
     String getName();
     String getDescription();
     boolean getHostility();
     void setHostility(boolean hostile);
     boolean getMovability();
      void setDamage(int dmg);
      int getDamage();
      void addItem(IItem item);
      IItem getItem();
      int getHealth();
     boolean getDefeated();
}
