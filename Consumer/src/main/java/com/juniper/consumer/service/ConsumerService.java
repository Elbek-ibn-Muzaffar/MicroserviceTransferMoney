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


    // Financier app dan List da Barcha transferlarni olib keladi
    public List<FromFinancier> getAllMoney()
    {
        ResponseEntity<FromFinancier[]> response =
                restTemplate.getForEntity(
                        "http://financier-app/api/v1/sendMoney/getAllTransfer",
                        FromFinancier[].class);
        FromFinancier[] fromFinanciers = response.getBody();
        return Arrays.asList(fromFinanciers);
    }
}
