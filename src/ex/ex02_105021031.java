﻿package ex;

/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021031 孟京澤
 */
import java.util.*;

public class ex02_105021031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			String q="Y";
			
			while(true){
				if(q.equals("Y"))
				{
					int n=src.nextInt();
					int m=src.nextInt();
					for(int i=1;i<=n;i++)
					{
						for(int j=1;j<=m;j++)
						{
							System.out.print(i+"X"+j+"="+i*j);
							System.out.print(" ");
						}
						System.out.println();
					}
					
				}
				else
				{
					break;
				}	
				System.out.print("是否繼續: ");
				
				q=src.next();
				
				
			}
			
			
			
	}

}
