package com.codevish.loans.service.impl;

import com.codevish.loans.constants.LoansConstants;
import com.codevish.loans.dto.LoansDto;
import com.codevish.loans.entity.Loans;
import com.codevish.loans.exception.LoanAlreadyExistsException;
import com.codevish.loans.exception.ResourceNotFoundException;
import com.codevish.loans.mapper.LoansMapper;
import com.codevish.loans.repository.LoansRepository;
import com.codevish.loans.service.ILoansService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
@AllArgsConstructor
public class LoansServiceImpl implements ILoansService {

    private LoansRepository loansRepository;

    /**
     * @param mobileNumber - Mobile number of the Customer
     */
    @Override
    public void createLoan(String mobileNumber) {
        Optional<Loans> optionalLoans = loansRepository.findByMobileNumber(mobileNumber);
        if (optionalLoans.isPresent()) {
            throw new LoanAlreadyExistsException("Loan already registered with given mobileNumber "+mobileNumber);
        }
        loansRepository.save(createNewLoan(mobileNumber));
    }

    private Loans createNewLoan(String mobileNumber) {
        Loans newLoan = new Loans();
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        newLoan.setLoanNumber(String.valueOf(randomLoanNumber));
        newLoan.setMobileNumber(mobileNumber);
        newLoan.setLoanType(LoansConstants.HOME_LOAN);
        newLoan.setTotalLoan(LoansConstants.NEW_LOAN_LIMIT);
        newLoan.setAmountPaid(0);
        newLoan.setOutstandingAmount(0);
        return newLoan;
    }

    /**
     * @param mobileNumber - Input mobile Number
     * @return Loan Details based on a given mobileNumber
     */
    @Override
    public LoansDto fetchLoan(String mobileNumber) {
        Loans loan = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber));
        return LoansMapper.mapToLoansDto(loan, new LoansDto());
    }

    /**
     * @param loansDto - LoansDTO object
     * @return boolean indicating if the update of the loan details is successful or not
     */
    @Override
    public boolean updateLoan(LoansDto loansDto) {
        Loans loans = loansRepository.findByLoanNumber(loansDto.getLoanNumber()).orElseThrow(() -> new ResourceNotFoundException("Loan", "LoanNumber", loansDto.getLoanNumber()));
        LoansMapper.mapToLoans(loansDto, loans);
        loansRepository.save(loans);
        return true;
    }

    /**
     * @param mobileNumber - Input mobile Number
     * @return boolean indicating if the delete of the loan details is successful or not
     */
    @Override
    public boolean deleteLoan(String mobileNumber) {
        Loans loans = loansRepository.findByMobileNumber(mobileNumber).orElseThrow(() -> new ResourceNotFoundException("Loan", "mobileNumber", mobileNumber));
        loansRepository.deleteById(loans.getLoanId());
        return true;
    }


}
