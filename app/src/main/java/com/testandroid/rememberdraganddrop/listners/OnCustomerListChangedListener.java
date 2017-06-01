package com.testandroid.rememberdraganddrop.listners;

import com.testandroid.rememberdraganddrop.Model.Customer;

import java.util.List;

/**
 * Created by Sameer on 5/31/2017.
 */

public interface OnCustomerListChangedListener {
    void onNoteListChanged(List<Customer> customers);
}