package org.example;

public class ArrayContainsElementorNot {
    //find an element present in the array or not

    int [] array = {1,2,3,4,5,3,8,3};
    int numberToFind = 3;

    boolean found = false;

    public static void main(String[] args) {
        ArrayContainsElementorNot arrayCountFound= new ArrayContainsElementorNot();
        arrayCountFound.elementPresentOrNot();
    }

    public void elementPresentOrNot(){
//        for (int i = 0; i<array.length;i++){
//            if(array[i] == numberToFind){
//                found=true;
//                break;
//            }
//        }
        //recommend foreach loop
        for(int item :array){
            if(item == numberToFind){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("element is present");
        }else{
            System.out.println("element is not present");
        }
    }
}
