package com.juniper.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepo extends JpaRepository<ConsumerRepo,Long> {

}
