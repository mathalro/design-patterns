namespace StrategyInveting
{
    public class Conservative : IInvestingStrategy
    {
        public double calculateTaxResult(double value)
        {
            return value * 0.008 * 0.75;
        }
    }
}