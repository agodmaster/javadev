package my.util;
import java.util.*;
public class Common{
	public static void reverse(int[] arr){//配列を逆順にするメソッド
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i] =arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void shuffle(int[] arr){//配列をシャッフルするメソッド
		Random rand=new Random();
		for(int i=0;i<arr.length-1;i++){
			int index=rand.nextInt(arr.length-i);
			int temp=arr[index];
			arr[index]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
	public static void sort(int[] arr){//最小値の順にするメソッド
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
	public static void sort(int[] arr,boolean isDesc){//降順にするメソッド
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
	public static void bubbleSort(int[] arr){//sortと同じだがアルゴリズムが違う（処理が早い）
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
	public static void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int index=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[index]>arr[j]){
					index=j;
				}
			}
			if(index != i){
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
			}		
		}
	}		
	public static void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int pick=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>pick){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=pick;
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
	public static int gcd(int a,int b){//最大子約数を求めるメソッド
		int mod=a%b;
		if(mod==0){
			return b;
		}else{
			return gcd(b,mod);
		}
	}
	public static void print(Object msg){
		System.out.println(msg.toString());
	}
	public static void print(Object msg,String delimiter){//何もなければ空白
		System.out.print(msg.toString()+delimiter);
	}
	public static int input(String msg){
		System.out.print(msg);
		int n=new java.util.Scanner(System.in).nextInt();
		return n;
	}

	public static String inputStr(String msg){
		print(msg,"");
		String str=new java.util.Scanner(System.in).next();
		return str;
	}
	public static String inputLine(String msg){
		print(msg,"");
		String str=new java.util.Scanner(System.in).nextLine();
		return str;
	}
	public static int rand(int max){
		Random rand=new Random();
		return rand.nextInt(max);
	}
	public static int rand(int min,int max){//メモ2から8を受け取った場合
		Random rand=new Random();
		/*min=2 max=8*/
		int n=rand.nextInt(max-min+1)+min;//大きい方から小さい方足して更に＋１
		return n;

	}
}
