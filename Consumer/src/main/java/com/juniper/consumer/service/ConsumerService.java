package com.juniper.consumer.service;

import com.juniper.consumer.payload.Responce.FromFinancier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ConsumerService {

    @Autowired
    RestTemplate restTemplate;

    public List<FromFinancier> getAllMoney()
    {
        ResponseEntity<FromFinancier[]> response =
                restTemplate.getForEntity(
                        "http://financier-app/getAllTransfer",
                        FromFinancier[].class);
        FromFinancier[] fromFinanciers = response.getBody();
        return Arrays.asList(fromFinanciers);
    }
}
