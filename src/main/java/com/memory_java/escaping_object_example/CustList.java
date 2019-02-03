package com.memory_java.escaping_object_example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CustList {
	Map<Integer, ReadOnlyCustomer> customerList = new HashMap<>();
	static int counter = 0;

	public Map<Integer, ReadOnlyCustomer> getCustomerList() {
		return Collections.unmodifiableMap(customerList);
	}

	public void setCustomerList(String name) {
		customerList.put(++counter,new Customer(name));
	}

	public ReadOnlyCustomer getCustomerNameById(int id){
		return customerList.get(id);
	}

}
