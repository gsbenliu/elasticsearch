package com.elasticsearch.demo.controller;

import com.elasticsearch.demo.entity.MerchantStore;
import com.elasticsearch.demo.repository.MerchantStoreRepository;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @Author: gang.liu
 * @Date: 2019-04-02 09:50
 */
@RestController
@RequestMapping("merchantstore_es")
public class MerchantStoreController {

    @Autowired
    private MerchantStoreRepository merchantStoreRepository;

    @RequestMapping("add")
    public String add() {
        MerchantStore merchantStore = new MerchantStore();
        merchantStore.setId(String.valueOf(System.currentTimeMillis()));
        merchantStore.setMerchantCode("0102030405060708");
        merchantStore.setStoreType("DIRECT");
        merchantStore.setStoreName("门店名称" + String.valueOf(System.currentTimeMillis()));
        merchantStore.setStoreShortName("分店名称" + String.valueOf(System.currentTimeMillis()));
        merchantStore.setStoreNo("010203");
        merchantStore.setStoreAddress("上海市虹口区塘沽路463号");
        merchantStore.setBusinessTime("08:00~23:00");
        merchantStore.setStoreProvinceName("上海");
        merchantStore.setStoreProvinceCode("100100");
        merchantStore.setStoreCityName("上海市");
        merchantStore.setStoreCityCode("100110");
        merchantStore.setStoreAreaName("虹口区");
        merchantStore.setStoreAreaCode("100111");
        merchantStore.setContactName("小翼");
        merchantStore.setContactMobile("15900778442");
        merchantStoreRepository.save(merchantStore);
        return "SUCCESS";
    }

    @RequestMapping("update")
    public String update(MerchantStore merchantStore) {
        Optional<MerchantStore> merchant_store = merchantStoreRepository.findById(merchantStore.getId());
        merchantStoreRepository.save(merchant_store.get());
        return "SUCCESS";
    }

    @RequestMapping("delete")
    public String delete(MerchantStore merchantStore) {
        merchantStoreRepository.deleteById(merchantStore.getId());
        return "SUCCESS";
    }

    @RequestMapping("findById")
    public MerchantStore findById(String id) {
        return merchantStoreRepository.findById(id).get();
    }

    @RequestMapping("pagePuery")
    public Page<MerchantStore> pagePuery(Integer pageNo, Integer pageSize, String keyWords) {
        if (null ==pageNo || pageNo <= 0) {
            pageNo = 0;
        }
        if (null == pageSize || pageSize <= 0) {
            pageSize = 10;
        }
        if (null== pageSize || StringUtils.isEmpty(keyWords)) {
            keyWords = "门店名称";
        }
        SearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(QueryBuilders.matchPhraseQuery("storeName", keyWords))
                .withPageable(PageRequest.of(pageNo, pageSize))
                .build();
        return merchantStoreRepository.search(searchQuery);
    }
}
