using System;

namespace StrategyInveting
{
    public class Investing
    {
        public void InvestingValue(Account account, IInvestingStrategy strategy, double value) 
        {
            account.Value += strategy.calculateTaxResult(value);
            Console.WriteLine(account.Value);
        }
    }
}