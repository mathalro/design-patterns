namespace Strategy
{
    public class ICMSTax : ITax
    {
        public double Calculate(Budget budget)
        {
            return budget.Value * 0.1;
        }
    }
}