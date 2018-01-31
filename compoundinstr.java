

import java.util.Scanner;

public class compoundinstr {



    public static void main(String args[])
    {

        double amount=90,principle=100,rate=90,time=7,ci;

        System.out.println("principle= "+principle);

        System.out.println("rate="+rate);

        System.out.println("time="+time);

        amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100)*(1+rate/100));

        System.out.println("amount="+amount);

        ci=amount-principle;

        System.out.println("compound interest="+ci);

    }
}
