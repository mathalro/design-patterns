using System;

namespace Strategy
{
    public class TaxCalculator
    {
        public void CalculateTax(Budget budget, ITax tax) 
        {
            double taxValue = tax.Calculate(budget);
            Console.WriteLine(taxValue);
        }
    }
}