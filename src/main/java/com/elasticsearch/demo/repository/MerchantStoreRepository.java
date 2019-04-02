package com.elasticsearch.demo.repository;

import com.elasticsearch.demo.entity.MerchantStore;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;


/**
 * @Author: gang.liu
 * @Date: 2019-04-02 09:48
 */
@Component
public interface MerchantStoreRepository extends ElasticsearchRepository<MerchantStore,String> {

}
