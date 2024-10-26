package LinkedList1;

import java.util.Arrays;

public class Nmeetings {
    public static void main(String[] args) {

    }

    public static int countMeeting(int[] start, int[] end){
        if(start.length == 0) return 0;

        Meeting[] meetings = new Meeting[start.length];
        for(int i=0;i<start.length;i++){
            meetings[i] = new Meeting(start[i],end[i]);
        }

        Arrays.sort(meetings , (a,b) -> Integer.compare(a.end,b.end));

        int prevLastItem = meetings[0].end;
        int count = 0;

        for(int i=0;i<meetings.length;i++){
            if(meetings[i].start < prevLastItem){
                count++;
                prevLastItem = meetings[i].end;
            }
        }

        return count;
    }

    static class Meeting{
        int start;
        int end;

        Meeting(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
}
