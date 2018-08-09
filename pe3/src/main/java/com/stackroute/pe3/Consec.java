package com.stackroute.pe3;

public class Consec {
public boolean method(String s)
{
	String[] a=s.split(",");
	int l=a.length;
	int k=1;
	int[] m=new int[l];
	for(int i=0;i<l;i++)
	{
		m[i]=Integer.parseInt(a[i]);
	}
	for(int i=0;i<m.length-1;i++)
	{
		if(m[i]==m[i+1]-1)
		{
			k++;
		}
	}
	if(k==m.length)
		return true;
	else
		return false;
	}
}