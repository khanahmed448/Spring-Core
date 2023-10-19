package com.springcore.standalone.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friend;
	private Map<String, Integer> feestructure;
	private Properties properties;

	/**
	 * @return the properties
	 */
	public Properties getProperties() {
		return properties;
	}

	/**
	 * @param properties the properties to set
	 */
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	/**
	 * @return the feestructure
	 */
	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	/**
	 * @param feestructure the feestructure to set
	 */
	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	/**
	 * @return the friend
	 */
	public List getFriend() {
		return friend;
	}

	/**
	 * @param friend the friend to set
	 */
	public void setFriend(List friend) {
		this.friend = friend;
	}

	@Override
	public String toString() {
		return "Person [friend=" + friend + ", feestructure=" + feestructure + ", properties=" + properties + "]";
	}

	

}
