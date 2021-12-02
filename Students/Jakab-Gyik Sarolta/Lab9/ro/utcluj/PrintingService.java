package ro.utcluj;

public class PrintingService {
    private double inkAmount;
    private Integer paperAmount;

    public PrintingService(double inkAmount, Integer paperAmount) {
        this.inkAmount = inkAmount;
        this.paperAmount = paperAmount;
    }

    public double getInkAmount() {
        return inkAmount;
    }

    public void setInkAmount(double inkAmount) {
        this.inkAmount = inkAmount;
    }

    public Integer getPaperAmount() {
        return paperAmount;
    }

    public void setPaperAmount(Integer paperAmount) {
        this.paperAmount = paperAmount;
    }

    public void print(Document document) throws OutOfPaperException {
        try{
            double inkNeeded = 0.001 * document.getText().length() * document.getNumberOfPages();
            Integer paperNeeded = document.getNumberOfPages();
            if (inkAmount - inkNeeded <= 0)
                throw new OutOfInkException("The ink is out!!");
            else {
                inkAmount -= inkNeeded;
            }
            if (paperAmount - paperNeeded <= 0){
                throw new IllegalStateException("Problem with paper");
            } else{
                paperAmount -= paperNeeded;
            }
        } catch(IllegalStateException e){
            throw new OutOfPaperException("The paper is out!!");
            //e.printStackTrace();
        }

    }
}
