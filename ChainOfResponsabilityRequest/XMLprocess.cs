using System;

namespace ChainOfResponsabilityRequest
{
    internal class XMLProcess : IProcessRequest
    {
        public IProcessRequest Next { get; set; }

        public XMLProcess(IProcessRequest next)
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
            
            if (request.Format == Format.XML)
            {
                Console.WriteLine("Treat XML"); 
                return;
            }

            Next.ProcessRequest(request, account);
        }
    }
}