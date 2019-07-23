package my.util;
import java.util.*;
public class Common{
	public static void reverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i] =arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void shuffle(int[] arr){
		Random rand=new Random();
		for(int i=0;i<arr.length-1;i++){
			int index=rand.nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void sort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void sort(int[] arr,boolean isDesc){
		if(!isDesc){
			sort(arr);
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[i]<arr[j]){
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
	}
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=arr.length-1;j>i;j--){
				if(arr[j]<arr[j-1]){
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public static int maxOf(int[] arr){//配列の最大値を求めるメソッド
		int max=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		return max;
	}
	public static int minOf(int[] arr){//配列の最小値を求めるメソッド
		int min=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	public int gcd(int a,int b){//最大子約数を求めるメソッド
		int mod=a%b;
		if(mod==0){
			return b;
		}else{
			return gcd(b,mod);
		}
	}
}
