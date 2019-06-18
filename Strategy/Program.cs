using System;

namespace Strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            ICMSTax icms = new ICMSTax();
            ISSTax iss = new ISSTax();

            Budget budget = new Budget(500.0);

            TaxCalculator calculator = new TaxCalculator();
            calculator.CalculateTax(budget, icms);
            calculator.CalculateTax(budget, iss);

            Console.ReadLine();
        }
    }
}
