package com.bioyinyang.nthroot;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NthRootFrame extends JFrame
{ private final String BLANK = "     "; 
  private JLabel nth_root = new JLabel("Degree of root:",JLabel.CENTER);
  private JTextField input_root = new JTextField("2", 3);
  private JButton compute_button = new JButton("Compute");
  private JLabel  ask_a_number = new JLabel("Type a number", JLabel.CENTER);
  private JLabel  answer = new JLabel(BLANK);
  private JTextField input_text = new JTextField(BLANK, 6);

 public NthRootFrame()
  {
  Container cp = getContentPane();
  cp.setLayout(new GridLayout(4,1));
  
  JPanel p0 = new JPanel(new GridLayout(1,2));
         p0.add(nth_root);
         input_root.setHorizontalAlignment(JTextField.CENTER);
         p0.add(input_root);
  cp.add(p0);
  
  
  JPanel p1 = new JPanel(new GridLayout(1,2));
         p1.add(ask_a_number);
         input_text.setHorizontalAlignment(JTextField.CENTER);
         p1.add(input_text);
  cp.add(p1);

  
  JPanel p3 = new JPanel(new FlowLayout());
         p3.add(answer);
  cp.add(p3);

  JPanel p4 = new JPanel(new FlowLayout());
         p4.add(compute_button);
  cp.add(p4);

  setSize(350,160);
  setTitle("Nth Root Converter");
  setVisible(true);
  setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

public String getDegree()
 { return input_root.getText();}

public String getInput()
 { return input_text.getText();}

public void setOutput(String s)
 { answer.setText(s);
   input_text.setText(BLANK);
 }
  
public void connectControllerToButton(ActionListener con)
 { compute_button.addActionListener(con); } //ActionListener interface, will be used is implemented as Controller

}


