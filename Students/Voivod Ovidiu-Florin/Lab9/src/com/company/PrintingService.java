package com.company;

import java.lang.Exception;

public class PrintingService {
    private Double inkAmount;
    private int paperAmount;

    public Double getInkAmount() {
        return inkAmount;
    }

    public void setInkAmount(Double inkAmount) {
        this.inkAmount = inkAmount;
    }

    public int getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(int paperAmount) {
        this.paperAmount = paperAmount;
    }

    public void print(Document document) throws OutOfPaperException, OutOfInkException{
        if(this.paperAmount<=0){
            throw new OutOfPaperException("Out of paper!!");
        }
        else if(this.inkAmount<=0){
            throw new OutOfInkException("Out of Ink");
        }
        else if(inkAmount - 0.001 * document.getNumberOfPages() * document.getText().length()<=0){
            throw new OutOfInkException("Out of Ink");
        }
        else if(paperAmount - document.getNumberOfPages()<=0){
            throw new OutOfPaperException("Out of paper!!");
        }
        else{
            inkAmount = inkAmount - 0.001 * document.getNumberOfPages() * document.getText().length();
            paperAmount = paperAmount - document.getNumberOfPages();
        }



    }


}
