package com.voximplant.apiclient.response;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
* Detailing job telephone calls
*/
public class CallListDetailType {

    private Long listId;

    /**
    * The list ID.
    */
    public long getListId() {
        return this.listId.longValue();
    }

    public boolean hasListId() {
        return this.listId != null;
    }

    private String customData;

    /**
    * Data for transmission to the script
    */
    public String getCustomData() {
        return this.customData;
    }

    public boolean hasCustomData() {
        return this.customData != null;
    }

    private String startExecutionTime;

    /**
    * Time with which to start the job in 24-h format: HH:mm:ss
    */
    public String getStartExecutionTime() {
        return this.startExecutionTime;
    }

    public boolean hasStartExecutionTime() {
        return this.startExecutionTime != null;
    }

    private String finishExecutionTime;

    /**
    * Time after which the task cannot be performed in 24-h format: HH:mm:ss
    */
    public String getFinishExecutionTime() {
        return this.finishExecutionTime;
    }

    public boolean hasFinishExecutionTime() {
        return this.finishExecutionTime != null;
    }

    private String resultData;

    /**
    * Results of the task, if it was granted, or information about the
    * runtime error.
    */
    public String getResultData() {
        return this.resultData;
    }

    public boolean hasResultData() {
        return this.resultData != null;
    }

    private String lastAttempt;

    /**
    * Date and time of the last attempt to perform a task.
    */
    public String getLastAttempt() {
        return this.lastAttempt;
    }

    public boolean hasLastAttempt() {
        return this.lastAttempt != null;
    }

    private Long attemptsLeft;

    /**
    * Number of remaining attempts.
    */
    public long getAttemptsLeft() {
        return this.attemptsLeft.longValue();
    }

    public boolean hasAttemptsLeft() {
        return this.attemptsLeft != null;
    }

    private Long statusId;

    /**
    * The status ID. The possible values are: __0__ (status = New), __1__
    * (status = In progress), __2__ (status = Processed), __3__ (status =
    * Error), __4__ (status = Cancelled).
    */
    public long getStatusId() {
        return this.statusId.longValue();
    }

    public boolean hasStatusId() {
        return this.statusId != null;
    }

    private String status;

    /**
    * The status name. The possible values are: __New__ (status_id = 0),
    * __In progress__ (status_id = 1), __Processed__ (status_id = 2),
    * __Error__ (status_id = 3), __Cancelled__ (status_id = 4).
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

}