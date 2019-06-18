using System;

namespace StrategyInveting
{
    class Program
    {
        static void Main(string[] args)
        {
            Account matheus = new Account(1000);

            Conservative conservative = new Conservative(); 
            Moderate moderate = new Moderate();
            Bold bold = new Bold();

            Investing inverting = new Investing();

            inverting.InvestingValue(matheus, conservative, 1000);
            inverting.InvestingValue(matheus, moderate, 100);
            inverting.InvestingValue(matheus, bold, 100);

            Console.ReadLine();
        }
    }
}
