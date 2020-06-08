/*
*   Foundations of Computer Science
*   2020, Semester 01
*   Practical-Exam-04
*
*   student (id): a1785086
*   student (name): Julian Cabezas
*
* Note: in order to finish your exam you need to make changes in this class.
* Note that you have to implemented lines from 57 - 67
*
*/
public class Insertion extends Sort{

	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return index;
	}

	@Override
	public int [] sortInt(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] > key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return arr;
	}

	// Sorts String alphabetically, it returns the indexes of the original array sorted
	@Override
	public int [] sortStringByIndex(String [] arr){

		// Get the array of indexes from 1 to array length
		int [] index = this.getIndex(arr.length);

		// Go though each element of the array
		for(int i = 1; i < arr.length; i++){
			String key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;

			// I used the native compareTo Method for string
			// Make space for the key element in case it goest first (alphabetically)
			while( j >= 0 && arr[j].compareTo(key)>0){
				if(arr[j].compareTo(key)>0){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}

		// Returns the index mapping
		return index;
	}

	// Sorts String alphabetically, resunts the sorted string array
	@Override
	public String [] sortString(String [] arr){
		int [] index = this.getIndex(arr.length);

				// Go though each element of the array
		for(int i = 1; i < arr.length; i++){
			String key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;

			// I used the native compareTo Method for string
			// Make space for the key element in case it goest first (alphabetically)
			while( j >= 0 && arr[j].compareTo(key)>0){
				if(arr[j].compareTo(key)>0){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return arr;
	
	}
}