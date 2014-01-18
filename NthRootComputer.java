package com.bioyinyang.nthroot;

public class NthRootComputer
 { public NthRootComputer(){}
   

   public double computeRoot(int d, double input)
    { double answer;
      int degree = d;
      double num = input;
      
      if (num >= 0)
         answer = Math.pow(num, 1.0/d);
      else
         { System.out.println("Now degree: " + d + "  input is: " + num);
           System.out.println("d/2 is: " + d/2);

           if (d%2==0)
              {throw new RuntimeException("Even root " + d + " for negative number: " + num); }
            else
               { answer = - Math.pow(-num, 1.0/d);}
          }
        return answer;
      }
  }
     
