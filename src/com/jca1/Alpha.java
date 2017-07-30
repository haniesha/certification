package com.jca1;

public class Alpha {
	public String[] main = new String[2];
	Alpha(String[] main){
		int ii;
		for( ii = 0;ii<main.length;ii++);{
			this.main = main[ii] +5;
		}	
	}

	public void main() {
		System.out.println(main[0]+main[1]);
		// TODO Auto-generated method stub
}
	

}



