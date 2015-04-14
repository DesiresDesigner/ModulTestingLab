import com.desiresdesigner.BucketSort;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Natalia on 26.03.2015.
 */
public class BucketSortTest {

    @Test
    public void sortDirectTest() {
        int[] array = {1, 2, 3, 4, 5};
        int[] sortedArray = {1, 2, 3, 4, 5};
        BucketSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++)
            assertEquals(array[i], sortedArray[i]);
    }

    @Test
    public void sortReverseTest() {
        int[] array = {5, 4, 3, 2, 1};
        int[] sortedArray = {1, 2, 3, 4, 5};
        BucketSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++)
            assertEquals(array[i], sortedArray[i]);
    }

    @Test
    public void sortMixedTest() {
        int[] array = {3, 1, 2, 5, 4};
        int[] sortedArray = {1, 2, 3, 4, 5};
        BucketSort.sort(array);

        for (int i = 0; i < sortedArray.length; i++)
            assertEquals(array[i], sortedArray[i]);
    }
}
