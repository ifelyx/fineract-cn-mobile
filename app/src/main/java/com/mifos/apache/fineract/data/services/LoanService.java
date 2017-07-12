package com.mifos.apache.fineract.data.services;

import com.mifos.apache.fineract.data.models.loan.LoanAccount;
import com.mifos.apache.fineract.data.models.loan.LoanAccountPage;
import com.mifos.apache.fineract.data.remote.EndPoints;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * @author Rajan Maurya
 *         On 07/07/17.
 */
public interface LoanService {

    @GET(EndPoints.API_LOAN_PATH + "/individuallending/customers/{customeridentifier}/cases")
    Observable<LoanAccountPage> fetchCustomerLoanAccounts(
            @Path("customeridentifier") String customerIdentifier,
            @Query("pageIndex") Integer pageIndex,
            @Query("size") Integer size);

    @GET(EndPoints.API_LOAN_PATH + "/products/{productidentifier}/cases/{caseidentifier}")
    Observable<LoanAccount> fetchCustomerLoanDetails(
            @Path("productidentifier") String productIdentifier,
            @Path("caseidentifier") String caseIdentifier);
}