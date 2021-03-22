package com.example.soap.ws.services;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.springframework.stereotype.Service;

import com.sample.soap.service.UserRequest;
import com.sample.soap.service.UserResponse;

@Service
public class AddUserService {

	public UserResponse addUser(UserRequest req) {
		UserResponse resp = new UserResponse();
		 GregorianCalendar gregorianCalendar = new GregorianCalendar();
        DatatypeFactory datatypeFactory;
		try {
			datatypeFactory = DatatypeFactory.newInstance();
			XMLGregorianCalendar now = 
		            datatypeFactory.newXMLGregorianCalendar(gregorianCalendar);
			resp.setCreated(now);
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
		resp.setId(req.getId());
		resp.setName(req.getName());
		
		resp.setGender("Male");
		return resp;
	}
}
