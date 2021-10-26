package com.homeparactice;

public class Arrays {
	
	private int [] arr ;
	private final int  DEFAULT_SIZE = 10;
	private int position = 0;
	
	public Arrays() {
		
		arr = new int [DEFAULT_SIZE];
	}
	
	public Arrays(int size) {
		arr = new int [size];
	}
	
	public boolean add(int element) {
		
		if(position < arr.length) {
			arr[position++] = element;
		} else {
			int newsize = arr.length + (arr.length / 2);
			int arr2[] = new int [newsize];
			System.arraycopy(arr, 0, arr2, 0, arr.length);
			System.arraycopy(src, srcPos, dest, destPos, length);
			arr=arr2;
			arr[position++] = element;
		} 
		
		return true;	
	}
	public int size() {
		return arr.length;
		
	}
	@Override
	public String toString() {

		String data ="[";
		for (int i = 0; i < position-1 ; i++) {
			data +=arr[i]+", ";
		} j
		data += arr[position-1]+" ]";
		
		return data;
	}

}
