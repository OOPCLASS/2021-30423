package ro.utcluj;

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

    public void print(Document document) throws OutOfPaperException {
        if (paperAmount - document.getNumberOfPages() >= 0 && inkAmount - 0.001 * document.getText().length() * document.getNumberOfPages() >= 0) {
            inkAmount -= 0.001 * document.getText().length() * document.getNumberOfPages();
            paperAmount -= document.getNumberOfPages();
        } else if (paperAmount - document.getNumberOfPages() <= 0) {
            throw new OutOfPaperException("Out of paper");
        } else {
            throw new OutOfInkException("Out of ink");
        }

    }
}
