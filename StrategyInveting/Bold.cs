using System;

namespace StrategyInveting
{
    public class Bold : IInvestingStrategy
    {
        public double calculateTaxResult(double value)
        {
            int random = new Random().Next(100);

            if (random < 20) 
            {
                return value * 0.05 * 0.75;
            }
            else if (random < 50) 
            {
                return value * 0.03 * 0.75;
            }
            else
            {
                return value * 0.006 * 0.75;
            }
        }
    }
}