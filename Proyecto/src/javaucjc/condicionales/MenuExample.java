package javaucjc.condicionales;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Menu Example");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Options");
    JMenuItem menuItem1 = new JMenuItem("Option 1");
    JMenuItem menuItem2 = new JMenuItem("Option 2");
    JMenuItem menuItem3 = new JMenuItem("Option 3");
    JMenuItem menuItem4 = new JMenuItem("Option 4");

    menu.add(menuItem1);
    menu.add(menuItem2);
    menu.add(menuItem3);
    menu.add(menuItem4);
    menuBar.add(menu);

    frame.setJMenuBar(menuBar);
    frame.setSize(400, 400);
    frame.setLayout(new FlowLayout());
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
