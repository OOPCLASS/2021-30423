package com.company.currency;

import com.company.currency.CurrencyModel;
import com.company.currency.CurrencyView;

import java.awt.event.*;

public class CurrencyController {

    private CurrencyModel m_model;
    private CurrencyView m_view;
    private String to, from;


    public CurrencyController(CurrencyModel model, CurrencyView view) {
        this.m_model = model;
        this.m_view = view;

        view.addConvertListener(new ConvertListener());
        view.addSelListener(new SelectionListener(), new SelectionListener());
    }

    class ConvertListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String sum = "";
            String from = "";
            String to = "";
            try {
                sum = m_view.getUserInput();
                from = m_view.getSel1();
                to = m_view.getSel2();
                m_model.convertSum(sum, from, to);
                m_view.setResult(m_model.getResultingSum());
            } catch (NumberFormatException nex) {
                m_view.showError("Bad input: '" + sum + "'");
            }
        }
    }

    class SelectionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String from, to;
            from = m_view.getSel1();
            to = m_view.getSel2();
            if (from.equals("RON") && to.equals("RON"))
                m_view.setInfo("1 RON = 1 RON");
            if (from.equals("RON") && to.equals("EUR"))
                m_view.setInfo("1 RON = 0.2 EUR");
            if (from.equals("RON") && to.equals("USD"))
                m_view.setInfo("1 RON = 0.23 USD");
            if (from.equals("EUR") && to.equals("RON"))
                m_view.setInfo("1 EUR = 4.95 RON");
            if (from.equals("EUR") && to.equals("EUR"))
                m_view.setInfo("1 EUR = 1 EUR");
            if (from.equals("EUR") && to.equals("USD"))
                m_view.setInfo("1 EUR = 1.13 USD");
            if (from.equals("USD") && to.equals("RON"))
                m_view.setInfo("1 USD = 4.4 RON");
            if (from.equals("USD") && to.equals("EUR"))
                m_view.setInfo("1 USD = 0.89 EUR");
            if (from.equals("USD") && to.equals("USD"))
                m_view.setInfo("1 USD = 1 USD");
        }
    }

}
