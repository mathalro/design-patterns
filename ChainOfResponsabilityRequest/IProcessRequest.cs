namespace ChainOfResponsabilityRequest
{
    internal interface IProcessRequest
    {
        IProcessRequest Next { get; set; }
        void ProcessRequest(Request request, Account account);
    }
}