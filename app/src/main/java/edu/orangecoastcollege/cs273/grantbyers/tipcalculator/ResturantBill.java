package edu.orangecoastcollege.cs273.grantbyers.tipcalculator;

/**
 * Created by gbyers on 9/8/2016.
 */
public class ResturantBill {
    private double mTipAmount;
    private double mAmount;
    private double mTotalAmount;
    private double mTipPercent;

    public double getTipAmount() {
        return mTipAmount;
    }



    public double getAmount() {
        return mAmount;
    }


    public double getTotalAmount() {
        return mTotalAmount;
    }

    public void setAmount(double amount) {
        mAmount = amount;
    }
    public void setTotalAmount(double totalAmount) {
        mTotalAmount = totalAmount;
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public void setTipPercent(double tipPercent) {
        mTipPercent = tipPercent;
    }

    private void recalculateAmount()
    {
        mTipAmount = mAmount * mTipPercent;
        mTotalAmount = mAmount+mTipAmount;
    }
}
