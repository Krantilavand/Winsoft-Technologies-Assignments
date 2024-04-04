import java.util.Scanner;
class MaximumSumPath 
{
    public static int Maxsum(int[] A, int[] B) 
    {
        int m = A.length;
        int n = B.length;
        int i = 0, j = 0;
        int suma = 0, sumb = 0, result = 0;

        while (i < m && j < n) 
        {
            if (A[i] < B[j]) 
            {
                suma += A[i++];
            } 
            else if (A[i] > B[j]) 
            {
                sumb += B[j++];
            } 
            else 
            {
                result += Math.max(suma, sumb);
                result += A[i];
                suma = 0;
                sumb = 0;
                i++;
                j++;
            }
        }

        while (i < m) 
        {
            suma += A[i++];
        }

        while (j < n) 
        {
            sumb += B[j++];
        }

        result += Math.max(suma, sumb);
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array:");
        int m = sc.nextInt();
        int[] A = new int[m];
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < m; i++) 
        {
            A[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the second array:");
        int n = sc.nextInt();
        int[] B = new int[n];
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n; i++) 
        {
            B[i] = sc.nextInt();
        }
        System.out.println("Maximum sum path: " + Maxsum(A, B));
    }
}
