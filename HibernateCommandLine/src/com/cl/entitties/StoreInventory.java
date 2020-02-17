package com.cl.entitties;

import java.io.Serializable;

public class StoreInventory implements Serializable{
	protected int storeId;
	protected String storeName;
	protected String storeAddressLine1;
	protected String storeCity;
	protected String storeState;
	protected int zip;
	public int getStoreId() {
		return storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAddressLine1() {
		return storeAddressLine1;
	}
	public void setStoreAddressLine1(String storeAddressLine1) {
		this.storeAddressLine1 = storeAddressLine1;
	}
	public String getStoreCity() {
		return storeCity;
	}
	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}
	public String getStoreState() {
		return storeState;
	}
	public void setStoreState(String storeState) {
		this.storeState = storeState;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "StoreInventory [storeId=" + storeId + ", storeName=" + storeName + ", storeAddressLine1="
				+ storeAddressLine1 + ", storeCity=" + storeCity + ", storeState=" + storeState + ", zip=" + zip + "]";
	}
	
	
}
