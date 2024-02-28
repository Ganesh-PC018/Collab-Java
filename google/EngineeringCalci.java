package google;

/*
 *  Factorial : 
 *  Inverse   :
 *  logarithm : 
 *  x^2
 *  
 */



 class EngineeringCalci
 {

    public long add(long num1,long num2)
    {
        return num1+num2;
    }

    public long sub(long num1,long num2)
    {
        return num1-num2;
    }

    public long mul(long num1,long num2)
    {
        return num1*num2;
    }

    public double div(double num1,double num2)
    {
        if(num2 == 0)
        {
            return -1d;
        }
        return num1/num2;
    }

    public long factorial(long num)
    {
        if(num ==0 || num == 1)
        {
            return 1l;
        }        
        return num*factorial(num-1);
    }

    public double permulation(long n,long r)
    {
        return factorial(n)/factorial(n-r);
    }

    public long combination(long n,long r)
    {
        return factorial(n)/factorial(r);
    }

    public long square(long num)
    {
        return num*num;
    }

    public long cube(long num)
    {
        return num*num*num;
    }


    public static void main(String[] args) {
        
    }
 }
