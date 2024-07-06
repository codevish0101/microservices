package com.codevish.loans.service;

import com.codevish.loans.dto.LoansDto;

public interface ILoansService {
    /**
     *
     * @param mobileNumber - Mobile number of the Customer
     */
    void createLoan(String mobileNumber);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return Loan Details based on a given mobileNumber
     */
    LoansDto fetchLoan(String mobileNumber);
}
