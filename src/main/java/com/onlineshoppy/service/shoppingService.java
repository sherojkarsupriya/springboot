package com.onlineshoppy.service;

import java.util.*;
import java.util.List;
import com.onlineshoppy.model.*;
import org.springframework.stereotype.Service;

@Service
public class shoppingService {

	public List<laptop> laptoplist= new ArrayList<>(Arrays.asList(
			new laptop(101,"Asus Tuf Gaming","i5",56000),
			new laptop(102,"Lenovo ideapad 330","i5",42000),
			new laptop(103,"Acer Predator","i7",72000),
			new laptop(104,"MST gaming duo","i5",52000)
			));
	
	public List<laptop> getAllLaptops() {
		return laptoplist;
	}
	
	public laptop getLaptop(int id) {
		return laptoplist.stream().filter(lap-> lap.getLaptopId()==id).findFirst().get();
	}
	
	public String addLaptop(laptop l1) {
		laptoplist.add(l1);
		return "successfully added";
	}

	public void updateLaptop(int id, laptop l2) {
		int i=0;
		for(i=0;i<laptoplist.size();i++) {
			laptop lap=laptoplist.get(i);
			
			if(lap.getLaptopId()==id) {
				laptoplist.set(i, l2);
			
			}
			
		}		
		
	}

	public void deleteLaptop(int id) {
		laptoplist.removeIf(lap->lap.getLaptopId()==id);
	
	}
	
}
