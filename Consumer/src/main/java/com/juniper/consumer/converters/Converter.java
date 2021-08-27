package com.juniper.consumer.converters;

import com.juniper.consumer.domains.ConsumerEntity;
import com.juniper.consumer.payload.request.ConsumerDto;
import org.modelmapper.ModelMapper;

import java.util.List;

public class Converter {

    ModelMapper modelMapper=new ModelMapper();

    public ConsumerEntity dtoToConsumerEntity(ConsumerDto consumerDto)
    {
        ConsumerEntity consumerEntity=modelMapper.map(consumerDto,ConsumerEntity.class);
        return consumerEntity;
    }

    public ConsumerDto entityToConsumerDto(ConsumerEntity consumerEntity)
    {
        ConsumerDto consumerDto=modelMapper.map(consumerEntity,ConsumerDto.class);
        return consumerDto;
    }

    public List<ConsumerDto> entityToDtoConsumer(List<ConsumerEntity> consumerEntities)
    {
        List<ConsumerDto> consumerDtos= (List<ConsumerDto>) modelMapper.map(consumerEntities,ConsumerDto.class);
        return consumerDtos;
    }
}
