using System;

namespace StrategyInveting
{
    public class Moderate : IInvestingStrategy
    {
        public double calculateTaxResult(double value)
        {
            bool chosen = new Random().Next(100) >= 50;
            if (chosen) 
            {
                return value * 0.025 * 0.75;
            }
            else 
            {
                return value * 0.007 * 0.75;
            }
        }
    }
}