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
* The [GetCustomRecordStorages] function result.
*/
public class CustomRecordStorageInfoType implements Alignable {

    private Long customRecordStorageId;

    /**
    * Unique identifier of the custom record storage configuration.
    */
    public Long getCustomRecordStorageId() {
        return this.customRecordStorageId;
    }

    public boolean hasCustomRecordStorageId() {
        return this.customRecordStorageId != null;
    }

    private String host;

    /**
    * Host endpoint for the custom storage service.
    */
    public String getHost() {
        return this.host;
    }

    public boolean hasHost() {
        return this.host != null;
    }

    private String accessKeyId;

    /**
    * Access key ID used to authenticate requests.
    */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public boolean hasAccessKeyId() {
        return this.accessKeyId != null;
    }

    private String bucket;

    /**
    * Name of the storage bucket.
    */
    public String getBucket() {
        return this.bucket;
    }

    public boolean hasBucket() {
        return this.bucket != null;
    }

    private String region;

    /**
    * Geographic region where the bucket is located.
    */
    public String getRegion() {
        return this.region;
    }

    public boolean hasRegion() {
        return this.region != null;
    }

    private String signatureVersion;

    /**
    * Signature version used for signing requests.
    */
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public boolean hasSignatureVersion() {
        return this.signatureVersion != null;
    }

    private Boolean bucketIsDomain;

    /**
    * Whether the bucket name is treated as a domain.
    */
    public Boolean getBucketIsDomain() {
        return this.bucketIsDomain;
    }

    public boolean hasBucketIsDomain() {
        return this.bucketIsDomain != null;
    }

    private String storageClass;

    /**
    * Storage class assigned to uploaded objects.
    */
    public String getStorageClass() {
        return this.storageClass;
    }

    public boolean hasStorageClass() {
        return this.storageClass != null;
    }

    private String acl;

    /**
    * Access Control List rule applied to objects.
    */
    public String getAcl() {
        return this.acl;
    }

    public boolean hasAcl() {
        return this.acl != null;
    }

    private String cors;

    /**
    * Cross-Origin Resource Sharing configuration.
    */
    public String getCors() {
        return this.cors;
    }

    public boolean hasCors() {
        return this.cors != null;
    }

    private Boolean multipartUpload;

    /**
    * Whether large file multipart uploading is enabled.
    */
    public Boolean getMultipartUpload() {
        return this.multipartUpload;
    }

    public boolean hasMultipartUpload() {
        return this.multipartUpload != null;
    }

    private String lastTestStatus;

    /**
    * Status result of the most recent connection or storage test.
    */
    public String getLastTestStatus() {
        return this.lastTestStatus;
    }

    public boolean hasLastTestStatus() {
        return this.lastTestStatus != null;
    }

    private Map<String, Object> lastOperationShortInfo;

    /**
    * Summary details of the last executed operation on this storage.
    */
    public Map<String, Object> getLastOperationShortInfo() {
        return this.lastOperationShortInfo;
    }

    public boolean hasLastOperationShortInfo() {
        return this.lastOperationShortInfo != null;
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
        if (customRecordStorageId != null) {
            sb.append(aligned)
                .append("\"customRecordStorageId\": \"")
                .append(customRecordStorageId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (host != null) {
            sb.append(aligned)
                .append("\"host\": \"")
                .append(host)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (accessKeyId != null) {
            sb.append(aligned)
                .append("\"accessKeyId\": \"")
                .append(accessKeyId)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bucket != null) {
            sb.append(aligned)
                .append("\"bucket\": \"")
                .append(bucket)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (region != null) {
            sb.append(aligned)
                .append("\"region\": \"")
                .append(region)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (signatureVersion != null) {
            sb.append(aligned)
                .append("\"signatureVersion\": \"")
                .append(signatureVersion)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (bucketIsDomain != null) {
            sb.append(aligned)
                .append("\"bucketIsDomain\": \"")
                .append(bucketIsDomain)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (storageClass != null) {
            sb.append(aligned)
                .append("\"storageClass\": \"")
                .append(storageClass)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (acl != null) {
            sb.append(aligned)
                .append("\"acl\": \"")
                .append(acl)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (cors != null) {
            sb.append(aligned)
                .append("\"cors\": \"")
                .append(cors)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (multipartUpload != null) {
            sb.append(aligned)
                .append("\"multipartUpload\": \"")
                .append(multipartUpload)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastTestStatus != null) {
            sb.append(aligned)
                .append("\"lastTestStatus\": \"")
                .append(lastTestStatus)
                .append('"')
                .append(',')
                .append(System.lineSeparator());
        }
        if (lastOperationShortInfo != null) {
            sb.append(aligned)
                .append("\"lastOperationShortInfo\": \"")
                .append(lastOperationShortInfo)
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