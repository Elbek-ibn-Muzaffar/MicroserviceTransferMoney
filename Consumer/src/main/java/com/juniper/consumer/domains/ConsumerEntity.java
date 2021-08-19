package com.juniper.consumer.domains;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class ConsumerEntity {

    @Id
    private long id;

    private BigDecimal amount;

    private String cause;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    private Date createdDate;
}
