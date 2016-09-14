package edu.orangecoastcollege.cs273.grantbyers.tipcalculator;

/**
 * @author Grant Byers
 * 9/13/2016
 */

/**
 * ResturantBill encapsulates needed data for app
 * all memebers are decimal/doubles
 */
public class ResturantBill {
    private double mTipAmount;
    private double mAmount;
    private double mTotalAmount;
    private double mTipPercent;
    /**
     * Constructor sets all member variables to zero
     */
    public ResturantBill(){
        mTipAmount=0.0;
        mAmount=0.0;
        mTotalAmount=0.0;
        mTipPercent=0.0;
    }

    /**
     * @return mTipAmount
     * returns tip amount
     */
    public double getTipAmount() {
        return mTipAmount;
    }


    /**
     * @return mAmount
     * returns regular textView amount
     */
    public double getAmount() {
        return mAmount;
    }

    /**
     * @return mTotalAmount
     * returns total of tip and regular amount
     */
    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
        recalculateAmount();
    }


    public double getTipPercent() {
        return mTipPercent;
    }

    /**
     * @param tipPercent
     * sets tip percent and then recalculates variables
     */
    public void setTipPercent(double tipPercent) {
        mTipPercent = tipPercent;
        recalculateAmount();
    }

    /**
     * Calculates tip amount and total with given member variables
     */
    private void recalculateAmount()
    {
        mTipAmount = mAmount * mTipPercent;
        mTotalAmount = mAmount+mTipAmount;
    }
}
