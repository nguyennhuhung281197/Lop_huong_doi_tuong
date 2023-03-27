import java.util.Arrays;

public class StopWatch {
    long startTime;
    static long endTime;

    public StopWatch() {

    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
      startTime =  System.currentTimeMillis();
    }
    public static void stop(){
      endTime =  System.currentTimeMillis();
    }
    public long  getElapsedTime(){
       return endTime - startTime;
    }

    public static void main(String[] args) {
        int [] arr = new int[100000];
        for (int i = 0 ; i < arr.length ; i++ ){
            arr[i] = (int) (Math.random()* 100000);
        }

        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        Arrays.sort(arr);
        StopWatch.stop();
        System.out.println( stopWatch.getElapsedTime() + " miliseconds ");

    }

}
