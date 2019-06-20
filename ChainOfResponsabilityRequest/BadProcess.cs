using System;

namespace ChainOfResponsabilityRequest
{
    internal class BadProcess : IProcessRequest
    {
        public IProcessRequest Next { get; set; }

        public void ProcessRequest(Request request, Account account)
        {
            Console.WriteLine("Bad Request");
        }
    }
}