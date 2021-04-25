public class CountVariants {

    int myNum = 0;
    int countVariants(int stearsCount){
        if(stearsCount<= 1){
            return stearsCount;
        }
        if(stearsCount == 2){
            return 2;
        }
        return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
    }
}
