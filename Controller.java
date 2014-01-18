package com.bioyinyang.nthroot;

import javax.swing.*;
import java.awt.event.*;

public class Controller implements ActionListener
 { private NthRootFrame view;
   //private static final int POWER = 3;

   public Controller(NthRootFrame v)
    { view = v;
      view.connectControllerToButton(this);
    }
  
   public void actionPerformed(ActionEvent evt)
     { String answer = "  ";
       try {
           
           String d = view.getDegree().trim();
           int degree = Integer.parseInt(d);
           

           String s = view.getInput().trim();
           double number = new Double(s).doubleValue();
           
           NthRootComputer cal = new NthRootComputer();
           double root = cal.computeRoot(degree, number);
           
           answer = degree + "th root of " + s + " is " + root;
           }
       catch(RuntimeException e)
          { answer = "Bad input error: " + e.getMessage(); }
       view.setOutput(answer);
      }
   }
