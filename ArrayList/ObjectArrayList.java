import java.util.*;
public class ObjectArrayList {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }


    }

    public static void main(String[] args) {
        int jobInfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};

        ArrayList<Job> jobs = new ArrayList<>();

        for(int i=0;i<jobs.size();i++){
            jobs.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        for(int i=0;i<jobs.size();i++){
           /*  System.out.println("id: "+jobs.get(i).id+" deadline: "+jobs.get(i).deadline+" profit: "+jobs.get(i).profit); */
           System.out.println(jobs.get(i));
        }



    }
    
}
