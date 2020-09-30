package com.voximplant.apiclient.request;

import java.util.Date;
import java.util.Map;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AddSubUserRequest {
    private String newSubuserName;

    @RequestField(name="new_subuser_name")
    /**
    * Login of a new subuser for <a
    * href='/docs/howtos/integration/httpapi/auth'>authentication</a>,
    * should be unique within the Voximplant account. The login specified
    * is always converted to lowercase.
    */
    public String getNewSubuserName() {
        return this.newSubuserName;
    }

    public boolean hasNewSubuserName() {
        return this.newSubuserName != null;
    }

    /**
    * Login of a new subuser for <a
    * href='/docs/howtos/integration/httpapi/auth'>authentication</a>,
    * should be unique within the Voximplant account. The login specified
    * is always converted to lowercase.
    */
    public AddSubUserRequest setNewSubuserName(String d) {
        this.newSubuserName = d;
        return this;
    }

    private String newSubuserPassword;

    @RequestField(name="new_subuser_password")
    /**
    * Password of a new subuser, plain text.
    */
    public String getNewSubuserPassword() {
        return this.newSubuserPassword;
    }

    public boolean hasNewSubuserPassword() {
        return this.newSubuserPassword != null;
    }

    /**
    * Password of a new subuser, plain text.
    */
    public AddSubUserRequest setNewSubuserPassword(String d) {
        this.newSubuserPassword = d;
        return this;
    }

    private MultiArgument<Long> roleId;

    @RequestField(name="role_id")
    /**
    * The role id list separated by the ';' symbol.
    */
    public MultiArgument<Long> getRoleId() {
        return this.roleId;
    }

    public boolean hasRoleId() {
        return this.roleId != null;
    }

    /**
    * The role id list separated by the ';' symbol.
    */
    public AddSubUserRequest setRoleId(MultiArgument<Long> d) {
        this.roleId = d;
        return this;
    }

    private MultiArgument<String> roleName;

    @RequestField(name="role_name")
    /**
    * The role name list separated by the ';' symbol.
    */
    public MultiArgument<String> getRoleName() {
        return this.roleName;
    }

    public boolean hasRoleName() {
        return this.roleName != null;
    }

    /**
    * The role name list separated by the ';' symbol.
    */
    public AddSubUserRequest setRoleName(MultiArgument<String> d) {
        this.roleName = d;
        return this;
    }

    private String description;

    @RequestField(name="description")
    /**
    * Description of a new subuser.
    */
    public String getDescription() {
        return this.description;
    }

    public boolean hasDescription() {
        return this.description != null;
    }

    /**
    * Description of a new subuser.
    */
    public AddSubUserRequest setDescription(String d) {
        this.description = d;
        return this;
    }

}