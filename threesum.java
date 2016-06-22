/**
 * Created by Dan Lv on 3/1/2016.
 */

import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class threesum {
    public static void main(String[] args) {

        //input length n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a integer: ");
        int n = sc.nextInt();

        //input array a[n];
        int[] a = new int[n];
        int i;
        int head, end;
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        //sort array a
        Arrays.sort(a);

        //threesum
        for (i = 0; i < n - 2; i++) {
            if(i>0)
                if(a[i]==a[i-1])
                continue;
            head = i + 1;
            end = n - 1;
            //twosum
            while (head < end) {
                if(head>i+1)
                if(a[head]==a[head-1]){
                    head++;
                    continue;
                }
                if(end<n-1)
                if(a[end]==a[end+1]){
                    end--;
                    continue;
                }
                int sum = a[i] + a[head] + a[end];
                if (sum == 0) {
                    //save i head end
                    System.out.printf("(%d %d %d)\n",a[i],a[head],a[end]);
                    head++;
                    end--;
                    continue;
                } else if (sum < 0) {
                    head++;
                    continue;
                } else
                    end--;
            }
        }


        //int i;
        //for(i=0;i<n-2;i++){
        //    do sum2;
        //}

    }
}
