using System;

namespace ChainOfResponsabilityRequest
{
    internal class PercentProcess : IProcessRequest
    {
        public IProcessRequest Next { get; set; }

        public PercentProcess(IProcessRequest next)
        {
            this.Next = next;
        }

        public void ProcessRequest(Request request, Account account)
        {
            if (this.Next == null)
            {
                Console.WriteLine("Bad request");
                return;
            }
            
            if (request.Format == Format.PERCENT)
            {
                Console.WriteLine("Treat Percent");
                return;
            }

            Next.ProcessRequest(request, account);
        }
    }
}