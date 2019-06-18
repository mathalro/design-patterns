namespace Strategy
{
    public class ISSTax : ITax
    {
        public double Calculate(Budget budget)
        {
            return budget.Value * 0.06;
        }
    }
}