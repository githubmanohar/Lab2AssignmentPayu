package com.greatlearning.lab2paymoney;

public class TransactionHelper {
		public int achievableTarget(long target,int[] transactionArray) {
		
		long sum=0;
		for (int i=0; i<transactionArray.length; i++) {
			sum += transactionArray[i];
			if(sum >= target)
			{
				return i+1;
				
	}
	}
		return -1;
		
}

}
