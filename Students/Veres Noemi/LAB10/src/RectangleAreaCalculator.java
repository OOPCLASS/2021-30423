import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RectangleAreaCalculator extends JFrame{    // we create the frame
    private JLabel lengthLabel, widthLabel, areaLabel;
    private JTextField lengthText, widthText, areaText;     // we are using these 3 components:
    private JButton calculateButton, exitButton;            // JLabel, JTextField, JButton

    private static final int HEIGHT = 400;
    private static final int WIDTH = 700;

    private CalculateButtonHandler calculateButtonHandler;
    private ExitButtonHandler exitButtonHandler;

    public RectangleAreaCalculator(){
        lengthLabel = new JLabel("Please enter the rectangle's length: ");
        widthLabel = new JLabel("Please enter the rectangle's width: ");
        areaLabel = new JLabel("The Area is: ", SwingConstants.RIGHT);

        lengthText = new JTextField(12);
        widthText = new JTextField(12);
        areaText = new JTextField(12);

        calculateButton = new JButton("What's the Area?");
        calculateButtonHandler = new CalculateButtonHandler();
        calculateButton.addActionListener(calculateButtonHandler);
        exitButton = new JButton("Close");
        exitButtonHandler = new ExitButtonHandler();
        exitButton.addActionListener(exitButtonHandler);

        setTitle("Rectangle Area Calculator");  // title
        Container pane = getContentPane();  // create content pane - Container has 2 methods: setLayout + add
        pane.setLayout(new GridLayout(4,2));

        // add components to content pane
        pane.add(lengthLabel);
        pane.add(lengthText);
        pane.add(widthLabel);
        pane.add(widthText);
        pane.add(areaLabel);
        pane.add(areaText);
        pane.add(calculateButton);
        pane.add(exitButton);

        setSize(WIDTH, HEIGHT); // dimension
        setVisible(true);   // for the frame to be visible on the computer
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public class CalculateButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {    // abstract method (= focuses on functionality)
            double width, length, area;

            length = Double.parseDouble(lengthText.getText());
            width = Double.parseDouble(widthText.getText());
            area = length * width;

            areaText.setText("" + area);
        }
    }

    public class ExitButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent e){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        RectangleAreaCalculator rectObj = new RectangleAreaCalculator();
    }

}
