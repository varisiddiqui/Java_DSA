import java.util.*;
public class ObjectArray {
    static class Job{
        int deadline;
        int profit;
        int id;

       /*  public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        } */


    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        Job jobs[] = new Job[jobInfo.length];

        for(int i=0;i<jobs.length;i++){
            jobs[i] = new Job();
            jobs[i].id = i;
            jobs[i].deadline = jobInfo[i][0];
            jobs[i].profit = jobInfo[i][1];
        }

        for(int i=0;i<jobs.length;i++){
            System.out.println("id: "+jobs[i].id+" deadline: "+jobs[i].deadline+" profit: "+jobs[i].profit);
        }



    }
    
}
