package com.example.financier.payload.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class ConsumerDtos {

    private BigDecimal amount;

    private String cause;

    private Date createdDate;
}
