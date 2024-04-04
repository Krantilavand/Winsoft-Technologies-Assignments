import java.util.*;

class MergingArrays {
    
	public static void merge(int x[], int y[]) {
		int i = 0, j = 0, m = x.length, n = y.length;
		int[] temp = new int[m];
		int k = 0;
		
		while (i < m && j < n) {
			if (x[i] == 0) {
				i++;
				continue;
			}
			if (x[i] <= y[j]) {
				temp[k++] = x[i++];
			} else {
				temp[k++] = y[j++];
			}
		}
		
		while (i < m) {
			if (x[i] != 0) {
				temp[k++] = x[i++];
			} else {
				i++;
			}
		}
		
		while (j < n) {
			temp[k++] = y[j++];
		}
		
		for (int a = 0; a < m; a++) {
			x[a] = temp[a];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 1st array:");
		int m = sc.nextInt();
        System.out.println("Enter the size of 2nd array:");
		int n = sc.nextInt();
		int x[] = new int[m];
		int y[] = new int[n];
		System.out.println("Enter the element of 1st array:");
		for (int i = 0; i < m; i++) {
			x[i] = sc.nextInt();
		}
		System.out.println("Enter the element of 2nd array:");
		for (int j = 0; j < n; j++) {
			y[j] = sc.nextInt();
		}
		
		merge(x, y);
		
		for (int i = 0; i < m; i++) {
			System.out.print(x[i] + " ");
		}
	}
}