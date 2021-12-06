package com.company;

public class PrintingService {
    private Double inkAmount;
    private Integer paperAmount;


    public PrintingService(Double inkAmount, Integer paperAmount) {
        this.inkAmount = inkAmount;
        this.paperAmount = paperAmount;
    }

    public Double getInkAmount() {
        return inkAmount;
    }

    public void setInkAmount(Double inkAmount) {
        this.inkAmount = inkAmount;
    }

    public Integer getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(Integer paperAmount) {
        this.paperAmount = paperAmount;
    }

    public void print(Document document)  throws OutOfPaperException, OutOfInkException {
        if (this.inkAmount <= 0)
            throw new OutOfInkException("Out of ink");
        else if (this.paperAmount <= 0)
            throw new OutOfPaperException("Out of paper");
        else if (this.inkAmount -0.001 * document.getText().length() * document.getNrOfPages() <= 0)
            throw new OutOfInkException("Not enough ink to print");
        else if (this.paperAmount -document.getNrOfPages() <= 0) {
            throw new OutOfPaperException("Not enough pages to print");
        }
        else {
            this.paperAmount -= document.getNrOfPages();
            this.inkAmount -= 0.001 * document.getText().length() * document.getNrOfPages();
            System.out.println(this.paperAmount + " " +  this.inkAmount);
        }
    }
}
