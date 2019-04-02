package com.elasticsearch.demo.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * @Author: gang.liu
 * @Date: 2019-04-02 09:29
 */
@Document(indexName = "merchant", type = "store", shards = 1, replicas = 0, refreshInterval = "-1")
public class MerchantStore {

    @Id
    private String id;

    @Field
    private String merchantCode;

    @Field
    private String storeType;

    @Field
    private String storeName;

    @Field
    private String storeShortName;

    @Field
    private String storeNo;

    @Field
    private String storeAddress;

    @Field
    private String businessTime;

    @Field
    private String storeProvinceName;

    @Field
    private String storeProvinceCode;

    @Field
    private String storeCityName;

    @Field
    private String storeCityCode;

    @Field
    private String storeAreaName;

    @Field
    private String storeAreaCode;

    @Field
    private String contactName;

    @Field
    private String contactMobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreShortName() {
        return storeShortName;
    }

    public void setStoreShortName(String storeShortName) {
        this.storeShortName = storeShortName;
    }

    public String getStoreNo() {
        return storeNo;
    }

    public void setStoreNo(String storeNo) {
        this.storeNo = storeNo;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public String getStoreProvinceName() {
        return storeProvinceName;
    }

    public void setStoreProvinceName(String storeProvinceName) {
        this.storeProvinceName = storeProvinceName;
    }

    public String getStoreProvinceCode() {
        return storeProvinceCode;
    }

    public void setStoreProvinceCode(String storeProvinceCode) {
        this.storeProvinceCode = storeProvinceCode;
    }

    public String getStoreCityName() {
        return storeCityName;
    }

    public void setStoreCityName(String storeCityName) {
        this.storeCityName = storeCityName;
    }

    public String getStoreCityCode() {
        return storeCityCode;
    }

    public void setStoreCityCode(String storeCityCode) {
        this.storeCityCode = storeCityCode;
    }

    public String getStoreAreaName() {
        return storeAreaName;
    }

    public void setStoreAreaName(String storeAreaName) {
        this.storeAreaName = storeAreaName;
    }

    public String getStoreAreaCode() {
        return storeAreaCode;
    }

    public void setStoreAreaCode(String storeAreaCode) {
        this.storeAreaCode = storeAreaCode;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }
}
