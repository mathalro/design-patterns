namespace ChainOfResponsabilityRequest
{
    public class GetAccountData
    {
        public void Process(Request request, Account account)
        {
            IProcessRequest p1 = new XMLProcess(new CSVProcess(new PercentProcess(null)));
            p1.ProcessRequest(request, account);
        }
    }
}