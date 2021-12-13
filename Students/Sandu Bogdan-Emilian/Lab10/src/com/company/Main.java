package com.company;

import com.company.currency.CurrencyController;
import com.company.currency.CurrencyModel;
import com.company.currency.CurrencyView;

public class Main {

    public static void main(String[] args) {

        CurrencyModel model = new CurrencyModel();
        CurrencyView view = new CurrencyView(model);
        CurrencyController controller = new CurrencyController(model, view);

        view.setVisible(true);
    }
}
