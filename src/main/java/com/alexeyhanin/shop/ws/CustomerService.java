/**
 * Copyright
 */
package com.alexeyhanin.shop.ws;

import com.alexeyhanin.shop.domain.Customer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CustomerService {

    @WebMethod
    public Customer getCustomerByEmail(String email) {
        throw new UnsupportedOperationException();
    }

}
