namespace Strategy
{
    public class ICCCTax : ITax
    {
        public double Calculate(Budget budget)
        {
            double value = budget.Value;
            
            if (value < 1000.0) 
            {
                return value * 0.05;           
            }
            else if (value < 3000) 
            {
                return value * 0.07; 
            }
            else
            {
                return value * 0.08 + 30;
            }
        }
    }
}