package com.wipro.java;

class MyClass {
    int num = 5;
 
   

	public MyClass() {
		// TODO Auto-generated constructor stub
	}
	 public void changeValue(int num) {
	        this.num = num;
	    }
	

		    public static void main(String[] args) {
		    	// we Created a new instance (object) of MyClass and assign it to the variable 'obj'.
		        MyClass obj = new MyClass();
		        // we Call the changeValue method on the obj instance, passing 10 as an argument.
		        obj.changeValue(10);
		        
		        // Print the value of 'num' (the instance variable of obj) to the console.
		        // After calling changeValue, 'num' has been updated to 10.
		        System.out.println(obj.num);
		    }


}
