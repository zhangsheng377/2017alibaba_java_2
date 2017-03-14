/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

/**
 * @author 43587
 *
 */
class MYLIST{
	int A[],B[],sum=0;
	List<Integer> r=new Vector<>();
	public MYLIST(int b[]) {
		// TODO 自动生成的构造函数存根
		A=b.clone();
		B=new int[b.length];
	}
	void print(){
		for (int i : r) {
			System.out.print(i);System.out.print(" ");
		}
		System.out.println("");
	}
	boolean next(){
		r.clear();
		sum=0;
		B[B.length-1]++;
		for(int i=B.length-1;i>0;i--){
			if(B[i]>=2){
				B[i]=0;B[i-1]++;
			}
		}
		if(B[0]>=2){
			return false;
		}
		
		for (int i=0;i<B.length;i++) {
			if(B[i]==1){
				r.add(A[i]);sum+=A[i];
			}
		}
		return true;
	}
}

public class test {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] A={8,11,10,1,2,3,4,5,9};
		int m=10;
		
		Arrays.sort(A);
		
		int index=0;
		for (index=0;index<A.length;index++) {
			if(A[index]>m){
				break;
			}
		}
		int[] AA=Arrays.copyOf(A, index);
		
		MYLIST mylist=new MYLIST(AA);
		while(mylist.next()){
			if(mylist.sum==m){
				mylist.print();
			}
		}
		
		
	}

	
	

}
