package com.kaveesh.testApp.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kaveesh.testApp.exception.InvalidArgumentException;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class JSONObjectConverter implements AttributeConverter<JsonNode, String> {

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public String convertToDatabaseColumn(JsonNode jsonData) {
        if(jsonData == null){
           return null;
        }
        return jsonData.toString();
    }

    @Override
    public JsonNode convertToEntityAttribute(String jsonDataAsJson) {
        JsonNode jsonData;
        try {
            if(jsonDataAsJson == null){
               return null;
            }
            jsonData = objectMapper.readTree(jsonDataAsJson);
        } catch (JsonProcessingException e) {
            throw new InvalidArgumentException("Error occurred while converting to AccountCreationDataDTO");
        }
        return jsonData;
    }
}
