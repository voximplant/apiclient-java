package com.voximplant.apiclient.request;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;
import java.io.InputStream;
import java.math.BigDecimal;
import com.voximplant.apiclient.response.*;
import com.voximplant.apiclient.util.MultiArgument;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.voximplant.apiclient.util.StringHelper;
import com.voximplant.apiclient.util.Alignable;
import com.voximplant.apiclient.util.DateSerializer;
import com.voximplant.apiclient.util.RequestField;
import com.voximplant.apiclient.util.SerializeUsing;
import com.voximplant.apiclient.util.TimestampSerializer;

public class AddCustomRecordStorageRequest implements Alignable {
    private String host;

    @RequestField(name="host")
    /**
    * Host endpoint for the custom storage.
    */
    public String getHost() {
        return this.host;
    }

    public boolean hasHost() {
        return this.host != null;
    }

    /**
    * Host endpoint for the custom storage.
    */
    public AddCustomRecordStorageRequest setHost(String d) {
        this.host = d;
        return this;
    }

    private String accessKeyId;

    @RequestField(name="access_key_id")
    /**
    * Access key ID used to authenticate requests.
    */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public boolean hasAccessKeyId() {
        return this.accessKeyId != null;
    }

    /**
    * Access key ID used to authenticate requests.
    */
    public AddCustomRecordStorageRequest setAccessKeyId(String d) {
        this.accessKeyId = d;
        return this;
    }

    private String secretAccessKey;

    @RequestField(name="secret_access_key")
    /**
    * Secret access key used to authenticate requests.
    */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public boolean hasSecretAccessKey() {
        return this.secretAccessKey != null;
    }

    /**
    * Secret access key used to authenticate requests.
    */
    public AddCustomRecordStorageRequest setSecretAccessKey(String d) {
        this.secretAccessKey = d;
        return this;
    }

    private String bucket;

    @RequestField(name="bucket")
    /**
    * Name of the storage bucket.
    */
    public String getBucket() {
        return this.bucket;
    }

    public boolean hasBucket() {
        return this.bucket != null;
    }

    /**
    * Name of the storage bucket.
    */
    public AddCustomRecordStorageRequest setBucket(String d) {
        this.bucket = d;
        return this;
    }

    private String region;

    @RequestField(name="region")
    /**
    * Geographic region where the bucket is located.
    */
    public String getRegion() {
        return this.region;
    }

    public boolean hasRegion() {
        return this.region != null;
    }

    /**
    * Geographic region where the bucket is located.
    */
    public AddCustomRecordStorageRequest setRegion(String d) {
        this.region = d;
        return this;
    }

    private String signatureVersion;

    @RequestField(name="signature_version")
    /**
    * Signature version to use for signing requests.
    */
    public String getSignatureVersion() {
        return this.signatureVersion;
    }

    public boolean hasSignatureVersion() {
        return this.signatureVersion != null;
    }

    /**
    * Signature version to use for signing requests.
    */
    public AddCustomRecordStorageRequest setSignatureVersion(String d) {
        this.signatureVersion = d;
        return this;
    }

    private Boolean bucketIsDomain;

    @RequestField(name="bucket_is_domain")
    /**
    * Whether the bucket name should be treated as a domain.
    */
    public Boolean getBucketIsDomain() {
        return this.bucketIsDomain;
    }

    public boolean hasBucketIsDomain() {
        return this.bucketIsDomain != null;
    }

    /**
    * Whether the bucket name should be treated as a domain.
    */
    public AddCustomRecordStorageRequest setBucketIsDomain(boolean d) {
        this.bucketIsDomain = Boolean.valueOf(d);
        return this;
    }

    private String storageClass;

    @RequestField(name="storage_class")
    /**
    * Storage class to assign to newly uploaded objects.
    */
    public String getStorageClass() {
        return this.storageClass;
    }

    public boolean hasStorageClass() {
        return this.storageClass != null;
    }

    /**
    * Storage class to assign to newly uploaded objects.
    */
    public AddCustomRecordStorageRequest setStorageClass(String d) {
        this.storageClass = d;
        return this;
    }

    private String acl;

    @RequestField(name="acl")
    /**
    * Access Control List rule applied to objects.
    */
    public String getAcl() {
        return this.acl;
    }

    public boolean hasAcl() {
        return this.acl != null;
    }

    /**
    * Access Control List rule applied to objects.
    */
    public AddCustomRecordStorageRequest setAcl(String d) {
        this.acl = d;
        return this;
    }

    private String cors;

    @RequestField(name="cors")
    /**
    * Cross-Origin Resource Sharing configuration.
    */
    public String getCors() {
        return this.cors;
    }

    public boolean hasCors() {
        return this.cors != null;
    }

    /**
    * Cross-Origin Resource Sharing configuration.
    */
    public AddCustomRecordStorageRequest setCors(String d) {
        this.cors = d;
        return this;
    }

    private Boolean multipartUpload;

    @RequestField(name="multipart_upload")
    /**
    * Whether to enable large file multipart uploading.
    */
    public Boolean getMultipartUpload() {
        return this.multipartUpload;
    }

    public boolean hasMultipartUpload() {
        return this.multipartUpload != null;
    }

    /**
    * Whether to enable large file multipart uploading.
    */
    public AddCustomRecordStorageRequest setMultipartUpload(boolean d) {
        this.multipartUpload = Boolean.valueOf(d);
        return this;
    }

    private String attachedApplicationId;

    @RequestField(name="attached_application_id")
    /**
    * Set of application IDs attached to this storage configuration.
    */
    public String getAttachedApplicationId() {
        return this.attachedApplicationId;
    }

    public boolean hasAttachedApplicationId() {
        return this.attachedApplicationId != null;
    }

    /**
    * Set of application IDs attached to this storage configuration.
    */
    public AddCustomRecordStorageRequest setAttachedApplicationId(String d) {
        this.attachedApplicationId = d;
        return this;
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
        if (secretAccessKey != null) {
            sb.append(aligned)
                .append("\"secretAccessKey\": \"")
                .append(secretAccessKey)
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
        if (attachedApplicationId != null) {
            sb.append(aligned)
                .append("\"attachedApplicationId\": \"")
                .append(attachedApplicationId)
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