package com.jca1;

public class Data {
	
	private int x = 0;
    private String y = "Y";
	public String strVal;
	public int intVal;
    public Data(int k){
        this.x = k; 
    }
    public Data(String k){
        this.y = k; 
    }    
    public void showMe(){
        System.out.println(x+y);
    }

}
