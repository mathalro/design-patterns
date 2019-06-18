using System;
using System.Collections.Generic;

namespace Strategy
{
    class Program
    {
        static void Main(string[] args)
        {
            ICMSTax icms = new ICMSTax();
            ISSTax iss = new ISSTax();
            ICCCTax iccc = new ICCCTax();

            TaxCalculator calculator = new TaxCalculator();

            List<double> list = new List<double>();
            list.Add(100);
            list.Add(1000);
            list.Add(3000);

            foreach (double v in list) {
                Budget budget = new Budget(v);
                calculator.CalculateTax(budget, iccc);
            }

            Console.ReadLine();
        }
    }
}
