package SY_3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;

public class sy3_3 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	int [] cloth=new int[10];
	for(int i=0;i<=9;i++){
		System.out.println("第"+(i+1)+"件衣服价格：");
		cloth[i]=input.nextInt();
	}
	Arrays.asList(cloth);
	Collections.reverseOrder();;
	
	for(int x=0;x<cloth.length;x++){
		System.out.println("第"+(x+1)+"件衣服价格："+cloth[x]);
		
	}
	
	input.close();
}
}
