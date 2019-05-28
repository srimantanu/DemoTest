package com.test.springboot.util;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class JsonDateSerializer extends StdDeserializer<Date> {

	private static final long serialVersionUID = 1L;

	public JsonDateSerializer() {
		this(null);
	}
	public JsonDateSerializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Date deserialize(JsonParser jsonparser, DeserializationContext arg1) throws IOException, JsonProcessingException {
		String date = jsonparser.getText().trim();
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			return sdf.parse(date); 
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
	}

}
