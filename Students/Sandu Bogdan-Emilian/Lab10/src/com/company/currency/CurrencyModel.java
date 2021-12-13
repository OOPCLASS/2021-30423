package com.company.currency;

import java.math.BigDecimal;
import java.math.BigInteger;

public class CurrencyModel {

    private static final String INITIAL_VALUE = "0";
    private static final Float RON_EUR = 0.2F;
    private static final Float RON_USD = 0.23F;
    private static final Float EUR_RON = 4.95F;
    private static final Float EUR_USD = 1.13F;
    private static final Float USD_RON = 4.4F;
    private static final Float USD_EUR = 0.89F;

    private Float resultingSum;

    public CurrencyModel() {
        reset();
    }

    public void reset() {
        this.resultingSum = Float.parseFloat(INITIAL_VALUE);
    }

    public void convertSum(String sum, String from, String to) {
        Float sumF;
        sumF = Float.parseFloat(sum);
        if (from.equals(to)) {
            this.resultingSum = sumF;
        }
        if (from.equals("RON") && to.equals("EUR")) {
            this.resultingSum = sumF * RON_EUR;
        }
        if (from.equals("RON") && to.equals("USD")) {
            this.resultingSum = sumF * RON_USD;
        }
        if (from.equals("EUR") && to.equals("RON")) {
            this.resultingSum = sumF * EUR_RON;
        }
        if (from.equals("EUR") && to.equals("USD")) {
            this.resultingSum = sumF * EUR_USD;
        }
        if (from.equals("USD") && to.equals("RON")) {
            this.resultingSum = sumF * USD_RON;
        }
        if (from.equals("USD") && to.equals("EUR")) {
            this.resultingSum = sumF * USD_EUR;
        }
    }

    public void setResultingSum(String resultingSum) {
        this.resultingSum = Float.parseFloat(resultingSum);
    }

    public String getResultingSum() {
        return resultingSum.toString();
    }
}
