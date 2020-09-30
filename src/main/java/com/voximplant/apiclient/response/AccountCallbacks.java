package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* The HTTP account callbacks body. See <a
* href='/docs/howtos/integration/httpapi/callbacks'>this article</a>
* for details.
*/
public class AccountCallbacks {

    private AccountCallback[] callbacks;

    /**
    * The account callback array.
    */
    public AccountCallback[] getCallbacks() {
        return this.callbacks;
    }

    public boolean hasCallbacks() {
        return this.callbacks != null;
    }

}