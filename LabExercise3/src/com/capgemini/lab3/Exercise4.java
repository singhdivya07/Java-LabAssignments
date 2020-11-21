package com.capgemini.lab3;
import java.lang.Math.*;
import java.util.Scanner;
public class Exercise4 {
			public static void main(String[] args) {
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter a number: ");
				int n = sc.nextInt();
				Exercise4 obj =new Exercise4();
				System.out.println(obj.modifyNumber(n));

			}
			public int modifyNumber(int num)
			{
				int a,b;
				int c=0;
				int res=0;
				StringBuffer sbr = new StringBuffer();
				String s = Integer.toString(num);
				for(int i =0; i < s.length()-1;i++)
				{
					a =s.charAt(i);
					b =s.charAt(i+1);
					c =Math.abs(Integer.parseInt(String.valueOf(a))- 
							Integer.parseInt(String.valueOf(b)));
					
					sbr.append(c);
				}

				sbr.append(s.charAt(s.length()-1));
				int ans=Integer.parseInt(sbr.toString());
				return ans;
			}

		}