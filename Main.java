package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args)  throws IOException{
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int in=Integer.parseInt(bf.readLine());
    	int result = 0, cycle_cnt =0, sum =-1;
    	int dev = 0, dev2;
    	int result1 =0, result2=0;
    	
    	if( in < 10)
			result = in+in;
    	else {
    		dev =in%10; // 6
    		result = (in/10)+dev; // 2 + 6
    		result = result+(in%10)*10;
    		dev = 5;
    	}
    		

    	bw.write(in+"in, result "+ result);
    	bw.newLine();
    	
    	while(in != result) {
    		bw.write("result : "+ result/10 +" + "+dev +" : "+result); bw.newLine();
    		
    		result2 = result;
				result = (result/10)+dev;
				
				result = result%10+(result2%10)*10;
				bw.write(dev+ " dev before, after");
    			dev = result%10;
    			bw.write("  // dev2"+dev); bw.newLine();
    			cycle_cnt++;
    			
    			bw.write(result+ "result");
    			bw.newLine();
    		}

    
		bw.write(cycle_cnt+"");
		bw.newLine();
    	bw.flush();
    	bw.close();
    }
}




