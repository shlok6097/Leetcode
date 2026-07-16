class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {

        int[] sTime = Arrays.stream(startTime.split(":")).mapToInt(Integer::parseInt).toArray();

        int[] eTime = Arrays.stream(endTime.split(":")).mapToInt(Integer::parseInt).toArray();
    
        int s=sTime[0]*3600+sTime[1]*60+sTime[2];
        int e=eTime[0]*3600+eTime[1]*60+eTime[2];

    

        return e-s;

            

        

    }
}