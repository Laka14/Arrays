public static void insertionsort(int num[]){
        //find the correct position to insert
        for(int i=1; i<num.length; i++){
            int curr = num[i];
            int prev = i-1;
            while(prev >= 0 && curr < num[prev]){
                num[prev+1] = num[prev];
                prev--;
            }
            num[prev+1] = curr;
        }
        
    }
