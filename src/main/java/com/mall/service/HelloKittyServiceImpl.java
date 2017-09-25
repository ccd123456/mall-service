package com.mall.service;

import org.springframework.stereotype.Service;

import com.mall.facade.service.HelloKittyService;

@Service("helloKittyService")
public class HelloKittyServiceImpl implements HelloKittyService {

	@Override
	public String getKittyName() {
		return "I'm red kitty";
	}

}
