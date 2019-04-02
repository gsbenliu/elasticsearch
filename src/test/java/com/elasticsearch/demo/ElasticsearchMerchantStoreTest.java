package com.elasticsearch.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: gang.liu
 * @Date: 2019-04-02 14:28
 */
public class ElasticsearchMerchantStoreTest {

    private String add_url = "http://127.0.0.1:8080/merchantstore_es/add";
    private String update_url = "http://127.0.0.1:8080/merchantstore_es/update";
    private String delete_url = "http://127.0.0.1:8080/merchantstore_es/delete";
    private String pagequery_url = "http://127.0.0.1:8080/merchantstore_es/pagePuery";

    public static void main(String[] args) {
        ElasticsearchMerchantStoreTest elasticsearchMerchantStoreTest = new ElasticsearchMerchantStoreTest();
        elasticsearchMerchantStoreTest.pageQuery();
    }

    private void add() {
        System.out.println("**********查询结果************" + HttpClientUtil.doGet(add_url));
    }

    private void update() {
        System.out.println("**********查询结果************" + HttpClientUtil.doGet(update_url));
    }

    private void delete() {
        System.out.println("**********查询结果************" + HttpClientUtil.doGet(delete_url));
    }

    private void pageQuery() {
        Map<String, String> map = new HashMap();
        map.put("pageNo", "0");
        map.put("pageSize", "5");
        map.put("keyWords", "1554184911566");
        System.out.println("**********查询结果************" + HttpClientUtil.doGet(pagequery_url, map));
    }
}
