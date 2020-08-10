package io.debmalyamitra.quickpresent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import io.debmalyamitra.quickpresent.util.*;
import io.debmalyamitra.quickpresent.core.*;

public class App implements ActionListener
{
    public static void main( String[] args )
    {
        JFrame f = new JFrame("QuickPresent - Make Business Presentations quickly");

        JButton b = new JButton("Click Me to create a sample presentation");
        b.setBounds(130,100,350,40);
        b.addActionListener(new App());
        f.add(b);
        f.setSize(800,600);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
      Debug.console("Making a presentation");
      Presentation ppt = new Presentation();
      ppt.SaveToFile();
    }
}
