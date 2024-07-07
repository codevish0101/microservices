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

    /**
     *
     * @param loansDto - LoansDTO object
     * @return boolean indicating if the update of the loan details is successful or not
     */
    boolean updateLoan(LoansDto loansDto);

    /**
     *
     * @param mobileNumber - Input mobile Number
     * @return boolean indicating if the delete of the loan details is successful or not
     */
    boolean deleteLoan(String mobileNumber);
}
