package FindMaximum;

import org.junit.jupiter.api.Assertions;

class FindMaximumTest {

    @org.junit.jupiter.api.Test
    public void testFindMax(){
        String[] stringArray1 = {"Peach","Apple","Banana"};
        String[] stringArray2 = {"Apple","Peach","Banana"};
        String[] stringArray3 = {"Apple","Banana", "Peach"};
        Integer[] intArray1 = {9,8,5};
        Integer[] intArray2 = {23,34,12};
        Integer[] intArray3 = {24,56, 98};
        Double[] doubleArray1 = {9.3,8.2,5.6};
        Double[] doubleArray2 = {23.87,34.21,12.23};
        Double[] doubleArray3 = {34.98,55.87, 98.76};
        Assertions.assertEquals("Peach", FindMaximum.findMax(stringArray1));// returns first position TC1.1
        Assertions.assertEquals("Peach",FindMaximum.findMax(stringArray2));// returns second position TC1.2
        Assertions.assertEquals("Peach",FindMaximum.findMax(stringArray3));// returns third position TC1.3
        Assertions.assertEquals(9, FindMaximum.findMax(intArray1));// returns first position TC1.1
        Assertions.assertEquals(34,FindMaximum.findMax(intArray2));// returns second position TC1.2
        Assertions.assertEquals(98,FindMaximum.findMax(intArray3));// returns third position TC1.3
        Assertions.assertEquals(9.3, FindMaximum.findMax(doubleArray1));// returns first position TC1.1
        Assertions.assertEquals(34.21,FindMaximum.findMax(doubleArray2));// returns second position TC1.2
        Assertions.assertEquals(98.76,FindMaximum.findMax(doubleArray3));// returns third position TC1.3
    }


}

