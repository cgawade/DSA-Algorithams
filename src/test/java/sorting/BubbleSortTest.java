package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    public void testSortResult(){
        int arr[] = {2,5,1,2,7,78,2,4};
        BubbleSort.bubbleSort(arr);
    }
}
