/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derickhambly.iceclimbertech;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Derick
 */
public class StatusColumnCellRenderer extends DefaultTableCellRenderer {
  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {

    //Cells are by default rendered as a JLabel.
    JLabel l = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);

    //Get the status for the current row.
    if (row == 0){
        l.setHorizontalAlignment(JLabel.CENTER);
        if (col == 0) {
          l.setBackground(Color.MAGENTA);
        } else if (col == 1 || col == 2) {
          l.setBackground(Color.RED);
        } else if (col == 3){
            l.setBackground(Color.GREEN);
        } else {
            l.setBackground(Color.YELLOW);
        }
    } 
    
  //Return the JLabel which renders the cell.
  return l;
  }
}
