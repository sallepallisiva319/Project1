package com;

class Output
{
    public static void main(String args[])
    {
        try
        {
            int a=0;
            int b=5;
            int c=b/a;
            System.out.print("Hello");
        }
        catch(ArithmeticException e)
        {
            System.out.print("Word");
        }
    }
}
