/**
 * Created by zibing on 3/26/15.
 */
public class RemoveElement {

    public static void main(String[] args) {

        RemoveElement s = new RemoveElement();

        int A[] = new int[] {1,2,3,4,5};
        int elem = 3;
        int newArray = s.removeElement(A, elem);

        System.out.print("New element array is: " + newArray + "\n");
    }


    public int removeElement(int[] A, int elem) {
        int indexA = 0;
        for(int indexB = 0; indexB < A.length; indexB++) {
            if ( A[indexB] != elem) {
                A[indexA] = A[indexB];
                indexA++;
            }
        }
        return indexA;
    }

}
