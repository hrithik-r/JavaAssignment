package com.nissan.bean;

public class Item {
	// Instance variable
	private int _serialNum;
	private String _productName;
	private float _price;
	
	// Default constructor
	public Item() {}
	
	// Parameterized constructor
	public Item(int _serialNum, String _productName, float _price) {
		super();
		this._serialNum = _serialNum;
		this._productName = _productName;
		this._price = _price;
	}
	
	// Getters and setters
	public int get_serialId() {
		return _serialNum;
	}

	public void set_serialId(int _serialId) {
		this._serialNum = _serialId;
	}

	public String get_productName() {
		return _productName;
	}

	public void set_productName(String _productName) {
		this._productName = _productName;
	}

	public float get_price() {
		return _price;
	}

	public void set_price(float _price) {
		this._price = _price;
	}
	
	// Method
	public void display() {
		System.out.println("Serial: "+_serialNum);
		System.out.println("Name: "+_productName);
		System.out.println("Price: "+_price);
	}

	// toString() override
	@Override
	public String toString() {
		return "Item [_serialNum=" + _serialNum + ", _productName=" + _productName + ", _price=" + _price + "]";
	}
	
}
