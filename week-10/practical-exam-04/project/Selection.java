/*
*   Foundations of Computer Science
*   2020, Semester 01
*   Practical-Exam-04
*
*   student (id): a1785086
*   student (name): Julian Cabezas
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){

		int [] index = this.getIndex(arr.length);

		// Move thorugh each element in the array
		for (int i = 0; i < arr.length-1; i++) { 
			
			// Find the minimum, first we are going to start from i
			int minIndex = i; 

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
				minIndex = j; 
				}

			}
			// Put the minimum element into the first position and swap the element that previowsly was there with the minimum element
			int temporal = arr[minIndex]; 
			arr[minIndex] = arr[i]; 
			arr[i] = temporal; 

			// So the same with the index array
			int temporalIndex = index[minIndex]; 
			index[minIndex] = index[i]; 
			index[i] = temporalIndex; 
		}

		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		int [] index = this.getIndex(arr.length);

		// Move thorugh each element in the array
		for (int i = 0; i < arr.length-1; i++) { 
			
			// Find the minimum, first we are going to start from i
			int minIndex = i; 

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
				minIndex = j; 
				}

			}
			// Put the minimum element into the first position and swap the element that previowsly was there with the minimum element
			int temporal = arr[minIndex]; 
			arr[minIndex] = arr[i]; 
			arr[i] = temporal; 

			// Do the same with the index array
			int temporalIndex = index[minIndex]; 
			index[minIndex] = index[i]; 
			index[i] = temporalIndex; 
		}

		return arr;
	}


	@Override
	public int [] sortStringByIndex(String [] arr){

		int [] index = this.getIndex(arr.length);

		// Move thorugh each element in the array
		for (int i = 0; i < arr.length-1; i++) { 
			
			// Find the minimum, first we are going to start from i
			int minIndex = i; 

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j].compareTo(arr[minIndex]) < 0) {
				minIndex = j; 
				}

			}
			// Put the minimum element into the first position and swap the element that previowsly was there with the minimum element
			String temporal = arr[minIndex]; 
			arr[minIndex] = arr[i]; 
			arr[i] = temporal; 

			// So the same with the index array
			int temporalIndex = index[minIndex]; 
			index[minIndex] = index[i]; 
			index[i] = temporalIndex; 
		}

		return index;
	}

	@Override
	public String [] sortString(String [] arr){
		int [] index = this.getIndex(arr.length);

		// Move thorugh each element in the array
		for (int i = 0; i < arr.length-1; i++) { 
			
			// Find the minimum, first we are going to start from i
			int minIndex = i; 

			for (int j = i+1; j < arr.length; j++) {

				if (arr[j].compareTo(arr[minIndex]) < 0) {
				minIndex = j; 
				}

			}
			// Put the minimum element into the first position and swap the element that previowsly was there with the minimum element
			String temporal = arr[minIndex]; 
			arr[minIndex] = arr[i]; 
			arr[i] = temporal; 

			// So the same with the index array
			int temporalIndex = index[minIndex]; 
			index[minIndex] = index[i]; 
			index[i] = temporalIndex; 
		}

		return arr;
	}
}
