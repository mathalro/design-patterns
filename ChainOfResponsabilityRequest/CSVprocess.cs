using System;

namespace ChainOfResponsabilityRequest
{
    internal class CSVProcess : IProcessRequest
    {
        public IProcessRequest Next { get; set; }

        public CSVProcess(IProcessRequest next)
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
            
            if (request.Format == Format.CSV)
            {
                Console.WriteLine("TreatCSV");
                return;
            }

            Next.ProcessRequest(request, account);
        }
    }
}