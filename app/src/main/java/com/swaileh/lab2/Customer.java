package com.swaileh.lab2;

import java.util.ArrayList;

public class Customer {

    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    private long mCustomerID;
    private String mName;
    private String mphone;
    private String mGender;

    public Customer() {
    }

    public Customer(long mCustomerID, String mName, String mphone, String mGender) {
        this.mCustomerID = mCustomerID;
        this.mName = mName;
        this.mphone = mphone;
        this.mGender = mGender;
    }

    public long getmCustomerID() {
        return mCustomerID;
    }

    public void setmCustomerID(long mCustomerID) {
        this.mCustomerID = mCustomerID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getMphone() {
        return mphone;
    }

    public void setMphone(String mphone) {
        this.mphone = mphone;
    }

    public String getmGender() {
        return mGender;
    }

    public void setmGender(String mGender) {
        this.mGender = mGender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "\nmCustomerID='" + mCustomerID +
                "'\nmName='" + mName +
                "'\nmphone='" + mphone +
                "'\nmGender='" + mGender +
                "'}";

    }
}
