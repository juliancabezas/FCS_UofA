// This file is the demo for practical-02

class Demo{
	public static int[] swapArray(int[] array){
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		return array;
	}

	public static int[] sumCol(int[][] array){
		int nCol = array[0].length;
		int nRow = array.length;
		int[] ans = new int [nCol];
		for(int i=0; i<nCol; i++){
			for(int j=0; j<nRow; j++){
				ans[i] += array[j][i];
			}
		}
		return ans;
	}


	public static void main(String[] args){
		/* Swap array */
		int[] array = {3,5};
		int[] swappedArray = swapArray(array);
		for(int i=0; i<swappedArray.length; i++){
			System.out.println(swappedArray[i]);
		}

		/* sumCol */
		// int[][] array1 = {{1,2,3},
		// 				    {4,5,6}};
		// int[] ans = sumCol(array1);
		// for(int i=0; i<ans.length; i++){
		// 	System.out.println(ans[i]);	
		// }	
	}
}