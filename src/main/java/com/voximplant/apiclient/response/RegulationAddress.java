package com.voximplant.apiclient.response;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.util.MultiArgument;
import com.voximplant.apiclient.util.Error;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;

/**
* The [GetRegulationsAddress] and [GetAvailableRegulations] result.
*/
public class RegulationAddress implements Alignable {

    private Long regulationAddressId;

    /**
    * The regulation address ID
    */
    public Long getRegulationAddressId() {
        return this.regulationAddressId;
    }

    public boolean hasRegulationAddressId() {
        return this.regulationAddressId != null;
    }

    private String externalId;

    /**
    * The external ID
    */
    public String getExternalId() {
        return this.externalId;
    }

    public boolean hasExternalId() {
        return this.externalId != null;
    }

    private String countryCode;

    /**
    * The country code
    */
    public String getCountryCode() {
        return this.countryCode;
    }

    public boolean hasCountryCode() {
        return this.countryCode != null;
    }

    private String phoneCategoryName;

    /**
    * The phone category name
    */
    public String getPhoneCategoryName() {
        return this.phoneCategoryName;
    }

    public boolean hasPhoneCategoryName() {
        return this.phoneCategoryName != null;
    }

    private String salutation;

    /**
    * The salutation. Possible values: MR, MS, COMPANY
    */
    public String getSalutation() {
        return this.salutation;
    }

    public boolean hasSalutation() {
        return this.salutation != null;
    }

    private String company;

    /**
    * The company name
    */
    public String getCompany() {
        return this.company;
    }

    public boolean hasCompany() {
        return this.company != null;
    }

    private String firstName;

    /**
    * The first name
    */
    public String getFirstName() {
        return this.firstName;
    }

    public boolean hasFirstName() {
        return this.firstName != null;
    }

    private String lastName;

    /**
    * The last name
    */
    public String getLastName() {
        return this.lastName;
    }

    public boolean hasLastName() {
        return this.lastName != null;
    }

    private String ownerCountryCode;

    /**
    * The owner country code
    */
    public String getOwnerCountryCode() {
        return this.ownerCountryCode;
    }

    public boolean hasOwnerCountryCode() {
        return this.ownerCountryCode != null;
    }

    private String city;

    /**
    * The city name
    */
    public String getCity() {
        return this.city;
    }

    public boolean hasCity() {
        return this.city != null;
    }

    private String zipCode;

    /**
    * The zip code
    */
    public String getZipCode() {
        return this.zipCode;
    }

    public boolean hasZipCode() {
        return this.zipCode != null;
    }

    private String street;

    /**
    * The zip code
    */
    public String getStreet() {
        return this.street;
    }

    public boolean hasStreet() {
        return this.street != null;
    }

    private String builderNumber;

    /**
    * The builder number
    */
    public String getBuilderNumber() {
        return this.builderNumber;
    }

    public boolean hasBuilderNumber() {
        return this.builderNumber != null;
    }

    private String builderLatter;

    /**
    * The builder latter
    */
    public String getBuilderLatter() {
        return this.builderLatter;
    }

    public boolean hasBuilderLatter() {
        return this.builderLatter != null;
    }

    private String status;

    /**
    * The status verification. Possible values: IN_PROGRESS, VERIFIED,
    * DECLINED
    */
    public String getStatus() {
        return this.status;
    }

    public boolean hasStatus() {
        return this.status != null;
    }

    private String rejectMessage;

    /**
    * The reject message
    */
    public String getRejectMessage() {
        return this.rejectMessage;
    }

    public boolean hasRejectMessage() {
        return this.rejectMessage != null;
    }

    private String phoneRegionCode;

    /**
    * The phone region code
    */
    public String getPhoneRegionCode() {
        return this.phoneRegionCode;
    }

    public boolean hasPhoneRegionCode() {
        return this.phoneRegionCode != null;
    }

    public String toString(int alignment) {
        char[] preAligned = new char[alignment - 1];
        char[] aligned = new char[alignment];
        Arrays.fill(preAligned, '\t');
        Arrays.fill(aligned, '\t');
        StringBuilder sb = new StringBuilder()
            .append(preAligned)
            .append('{')
            .append(System.lineSeparator());
        if (regulationAddressId != null) {
            sb.append(aligned)
                .append("\"regulationAddressId\": \"")
                .append(regulationAddressId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (externalId != null) {
            sb.append(aligned)
                .append("\"externalId\": \"")
                .append(externalId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (countryCode != null) {
            sb.append(aligned)
                .append("\"countryCode\": \"")
                .append(countryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneCategoryName != null) {
            sb.append(aligned)
                .append("\"phoneCategoryName\": \"")
                .append(phoneCategoryName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (salutation != null) {
            sb.append(aligned)
                .append("\"salutation\": \"")
                .append(salutation)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (company != null) {
            sb.append(aligned)
                .append("\"company\": \"")
                .append(company)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (firstName != null) {
            sb.append(aligned)
                .append("\"firstName\": \"")
                .append(firstName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastName != null) {
            sb.append(aligned)
                .append("\"lastName\": \"")
                .append(lastName)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (ownerCountryCode != null) {
            sb.append(aligned)
                .append("\"ownerCountryCode\": \"")
                .append(ownerCountryCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (city != null) {
            sb.append(aligned)
                .append("\"city\": \"")
                .append(city)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (zipCode != null) {
            sb.append(aligned)
                .append("\"zipCode\": \"")
                .append(zipCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (street != null) {
            sb.append(aligned)
                .append("\"street\": \"")
                .append(street)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (builderNumber != null) {
            sb.append(aligned)
                .append("\"builderNumber\": \"")
                .append(builderNumber)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (builderLatter != null) {
            sb.append(aligned)
                .append("\"builderLatter\": \"")
                .append(builderLatter)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (status != null) {
            sb.append(aligned)
                .append("\"status\": \"")
                .append(status)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (rejectMessage != null) {
            sb.append(aligned)
                .append("\"rejectMessage\": \"")
                .append(rejectMessage)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (phoneRegionCode != null) {
            sb.append(aligned)
                .append("\"phoneRegionCode\": \"")
                .append(phoneRegionCode)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        return sb.append(preAligned).append('}').append(',').toString();
    }

    @Override
    public String toString() {
        return toString(1);
    }}