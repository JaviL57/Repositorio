package Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Ejercicio");
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Opciones");
    JMenuItem menuItem1 = new JMenuItem("Opcion 1");
    JMenuItem menuItem2 = new JMenuItem("Opcion 2");
    JMenuItem menuItem3 = new JMenuItem("Opcion 3");
    JMenuItem menuItem4 = new JMenuItem("Opcion 4");

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

