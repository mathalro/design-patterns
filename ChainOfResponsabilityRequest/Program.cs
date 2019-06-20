using System;

namespace ChainOfResponsabilityRequest
{
    class Program
    {
        static void Main(string[] args)
        {
            GetAccountData proccess = new GetAccountData();

            Account account = new Account("teste");
            Request request = new Request(Format.OTHER);

            proccess.Process(request, account);
        }
    }
}
