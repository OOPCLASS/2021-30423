package com.company;

public class Main {

    public static void main(String[] args) throws OutOfPaperException,OutOfInkException {
	// write your code here
        PrintingService printingService=new PrintingService();
        printingService.setInkAmount(4.0);
        printingService.setPaperAmount(152);

        Document document=new Document("Ana are multe multe multe mere",100);
        printingService.print(document);
        System.out.println(printingService.getInkAmount()+" "+printingService.getPaperAmount());

        Document document1=new Document("a venit razvan la noi",50);
        printingService.print(document1);
        System.out.println(printingService.getInkAmount()+" "+printingService.getPaperAmount());
    }
}
