public static void bubblesort(int num[]){
        for(int turn=0; turn<num.length-1; turn++){
            for(int j=0; j<num.length-1-turn; j++){
                if(num[j] > num[j+1]){
                   //swap
                    int temp = num[j];
                   num[j] = num[j+1];
                   num[j+1] = temp;
                }
            }
        }   
    }
public static void selectionsort(int num[]){
        for(int i=0; i<num.length-1; i++){
            //for the new array let i be the starting index.
            int minposition = i;
            for(int j=i+1; j<num.length; j++){
                if(num[minposition] > num[j]){
                    minposition = j;
                }
            }
        int temp = num[minposition];
        num[minposition] = num[i];
        num[i] = temp;
        }
    }
