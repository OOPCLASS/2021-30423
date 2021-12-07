package ro.utcluj;

public class Main {
    public static void main(String[] args) throws OutOfPaperException {
        PrintingService myPrintingService = new PrintingService(10.0,17);
        Document myDocument = new Document("Hello! How are you today?", 7);
        //myPrintingService.print(myDocument);    // alright

        myPrintingService.setInkAmount(0.0);
        //myPrintingService.print(myDocument);    // Exception in thread ... Out of ink

        myPrintingService.setInkAmount(10.0);
        myPrintingService.setPaperAmount(0);
        myPrintingService.print(myDocument);    // Exception in thread ... Out of paper

    }
}
