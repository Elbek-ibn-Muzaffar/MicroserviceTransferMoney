package com.juniper.consumer.controller;

import com.juniper.consumer.payload.Responce.FromFinancier;
import com.juniper.consumer.service.ConsumerService;
import com.juniper.consumer.service.ConsumerService2;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v2/consumerApp")
public class ConsumerResource {

    @Autowired
    ConsumerService2 consumerService;

    @ApiOperation("barcha o'tkazmalarni olib kelish")
    @GetMapping("/getAllMoneyFinancier")
    public List<FromFinancier> getAllMoney()
    {
        return consumerService.getAllTransfer();
    }

}
