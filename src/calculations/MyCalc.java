/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author adels
 */
public class MyCalc {
    double firstNumber;
    public double secondNumber;
    public  char Operation;
    double Result;
    MyCalc(double firstNumber,double secondNumber,char Operation)
    {
        this.firstNumber=firstNumber;
        this.secondNumber=secondNumber;
        this.Operation=Operation;
    }
   public MyCalc(double firstNumber , char Operation)
    {
        this.firstNumber=firstNumber;
        this.Operation=Operation;
    }
     public double Add()
    {
        Result = firstNumber + secondNumber;
        return Result;
    }
    double Subtract()
    {
        Result = firstNumber - secondNumber;
        return Result;
    }
    double Multiply ()
    {
        Result= Result = firstNumber * secondNumber;
        return Result;
    }
    double Division()
    {
        Result =  Result = firstNumber / secondNumber;
        return Result;
    }
    double Power()
    {
         Result=1;
       while (secondNumber!=0)
       {
           Result = Result * firstNumber;
           secondNumber--;
       }
        return Result;
    }
    double Factorial()
    {
         while(firstNumber!=0)
         {
            Result = Result * firstNumber;
             firstNumber--;
         }
         return Result;
    }
}
