public class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clockWise=0;
        int counterClockWise=0;

        if(start < destination){
            for(int i=start; i<destination; i++){
                clockWise += distance[i];
                distance[i] = 0;
            }

            for(int i=0; i<distance.length; i++){
                counterClockWise += distance[i];
            }
        }
        else{
            for(int i=destination; i<start; i++){
                counterClockWise += distance[i];
                distance[i] = 0;
            }

            for(int i=0; i<distance.length; i++){
                clockWise += distance[i];
            }
        }


        if(clockWise < counterClockWise) return clockWise;
        return counterClockWise;
    }
}
