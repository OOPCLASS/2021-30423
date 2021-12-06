package com.company.models;


public class PrintingService {
    private Double inkAmount;
    private Integer paperAmount;

    public PrintingService(Double inkAmount, Integer paperAmount) {
        this.inkAmount = inkAmount;
        this.paperAmount = paperAmount;
    }

    void validate() throws OutOfPaperException, OutOfInkException {
        if (this.paperAmount <= 0)
            throw new OutOfPaperException("Out of paper");
        if(this.inkAmount <= 0)
            throw new OutOfInkException("Out of ink");
    }

    public void print(Document document) throws OutOfPaperException {
            this.paperAmount -= document.getNumberOfPages();
            this.inkAmount -= 0.001 * document.getText().length() * document.getNumberOfPages();
            System.out.println(this.paperAmount + " " + this.inkAmount);
            validate();
    }
}
//        try {
//                this.paperAmount -= document.getNumberOfPages();
//                this.inkAmount -= 0.001 * document.getText().length() * document.getNumberOfPages();
//                System.out.println(this.paperAmount + " " + this.inkAmount);
//                validate();
//                } catch (OutOfPaperException e) {
//                System.out.println("oh no!");
//                }