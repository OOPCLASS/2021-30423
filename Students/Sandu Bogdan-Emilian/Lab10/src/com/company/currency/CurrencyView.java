package com.company.currency;

import com.company.currency.CurrencyModel;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;


public class CurrencyView extends JFrame {

    String[] currencies = {"RON", "EUR", "USD"};

    private static final String INITIAL_VALUE = "0";


    //Components
    private JComboBox currencyList1 = new JComboBox(currencies);
    private JComboBox currencyList2 = new JComboBox(currencies);
    private JButton transform = new JButton(">>");
    private JLabel currencyInfo = new JLabel("1 RON = 1 RON");
    private JTextField userInput = new JTextField(10);
    private JTextField result = new JTextField(10);
    private JLabel sumInfo = new JLabel("SUM");
    private JLabel resultInfo = new JLabel("RESULT");
    private JLabel sumInfoRight = new JLabel("RON");
    private JLabel resultInfoRight = new JLabel("RON");

    private CurrencyModel m_model;


    public CurrencyView(CurrencyModel model) {
        //
        this.m_model = model;
        m_model.setResultingSum(INITIAL_VALUE);


        this.transform.setBackground(Color.BLUE);
        this.transform.setSize(80, 40);
        this.transform.setForeground(Color.WHITE);
        this.result.setEditable(false);

        JPanel frame = new JPanel();
        frame.setLayout(new BorderLayout());

        JPanel downPanel = new JPanel();
        JPanel upPanel = new JPanel();
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        JPanel down1 = new JPanel();
        JPanel down2 = new JPanel();
        down1.add(sumInfo);
        down1.add(sumInfoRight);
        down1.add(userInput);
        down2.add(resultInfo);
        down2.add(resultInfoRight);
        down2.add(result);

        downPanel.add(down1);
        downPanel.add(down2);
        upPanel.add(currencyInfo);
        centerPanel.add(transform);
        leftPanel.add(currencyList1);
        rightPanel.add(currencyList2);


        down1.setPreferredSize(new Dimension(120,60));
        down2.setPreferredSize(new Dimension(120,60));
        downPanel.setPreferredSize(new Dimension(100, 100));
        leftPanel.setPreferredSize(new Dimension(100, 100));
        rightPanel.setPreferredSize(new Dimension(100, 100));
        upPanel.setPreferredSize(new Dimension(100, 100));
        centerPanel.setPreferredSize(new Dimension(100, 100));

        frame.add(upPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.EAST);
        frame.add(downPanel, BorderLayout.SOUTH);

        this.setContentPane(frame);
        this.pack();

        this.setTitle("Currency Converter");

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public String getUserInput() {
        return this.userInput.getText();
    }

    public String getSel1() {
        return (String) currencyList1.getSelectedItem();
    }

    public String getSel2() {
        return (String) currencyList2.getSelectedItem();
    }

    public void setResult(String result) {
        this.result.setText(result);
    }

    public void showError(String errMsg) {
        JOptionPane.showMessageDialog(this, errMsg);
    }

    public void addConvertListener(ActionListener cal) {
        this.transform.addActionListener(cal);
    }

    public void addSelListener(ActionListener sel1, ActionListener sel2) {
        this.currencyList1.addActionListener(sel1);
        this.currencyList2.addActionListener(sel2);
    }

    public void setInfo(String msg) {
        this.currencyInfo.setText(msg);
        this.sumInfoRight.setText((String) currencyList1.getSelectedItem());
        this.resultInfoRight.setText((String) currencyList2.getSelectedItem());
    }
}
