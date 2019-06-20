namespace ChainOfResponsabilityRequest
{
    public class Request
    {
        public Format Format { get; set; }
        public Request(Format format)
        {
            this.Format = format; 
        }
    }
}