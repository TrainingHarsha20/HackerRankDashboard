package com.harsha.hackerrank.interview.sort.sort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * HackerLand National Bank has a simple policy for warning clients about possible fraudulent account activity. If the amount spent by a client on a particular day is greater than or equal to  the client's median spending for a trailing number of days, they send the client a notification about potential fraud. The bank doesn't send the client any notifications until they have at least that trailing number of prior days' transaction data.
 * Given the number of trailing days  and a client's total daily expenditures for a period of  days, find and print the number of times the client will receive a notification over all  days.
 *
 * For example,  and . On the first three days, they just collect spending data. At day , we have trailing expenditures of . The median is  and the day's expenditure is . Because , there will be a notice. The next day, our trailing expenditures are  and the expenditures are . This is less than  so no notice will be sent. Over the period, there was one notice sent.
 * Note: The median of a list of numbers can be found by arranging all the numbers from smallest to greatest. If there is an odd number of numbers, the middle one is picked. If there is an even number of numbers, median is then defined to be the average of the two middle values. (Wikipedia)
 *
 * Function Description
 *
 * Complete the function activityNotifications in the editor below. It must return an integer representing the number of client notifications.
 * activityNotifications has the following parameter(s):
 *
 * expenditure: an array of integers representing daily expenditures
 * d: an integer, the lookback days for median spending
 * Input Format
 *
 * The first line contains two space-separated integers  and , the number of days of transaction data, and the number of trailing days' data used to calculate median spending.
 * The second line contains  space-separated non-negative integers where each integer  denotes .
 *
 * Constraints
 *
 * Output Format
 *
 * Print an integer denoting the total number of times the client receives a notification over a period of  days.
 *
 * Sample Input 0
 *
 * 9 5
 * 2 3 4 2 3 6 8 4 5
 * Sample Output 0
 *
 * 2
 * Explanation 0
 *
 * We must determine the total number of  the client receives over a period of  days. For the first five days, the customer receives no notifications because the bank has insufficient transaction data: .
 * On the sixth day, the bank has  days of prior transaction data, , and  dollars. The client spends  dollars, which triggers a notification because : .
 * On the seventh day, the bank has  days of prior transaction data, , and  dollars. The client spends  dollars, which triggers a notification because : .
 * On the eighth day, the bank has  days of prior transaction data, , and  dollars. The client spends  dollars, which does not trigger a notification because : .
 * On the ninth day, the bank has  days of prior transaction data, , and a transaction median of  dollars. The client spends  dollars, which does not trigger a notification because : .
 *
 * Sample Input 1
 *
 * 5 4
 * 1 2 3 4 4
 * Sample Output 1
 *
 * 0
 * There are  days of data required so the first day a notice might go out is day . Our trailing expenditures are  with a median of  The client spends  which is less than  so no notification is sent.
 *
 */
public class FraudulentActivityNotifications {

    static int activityNotifications(int[] expenditure, int d) {
        System.out.println( "even search ::" + 4%2);
        if(4%2 == 0) {
            int n = 4/2;
            System.out.println( n + " :: "+ expenditure[n]);
            float med=(expenditure[n]+expenditure[n-1])/2;
            System.out.println( med);
        }

        int test = IntStream.of(expenditure).toArray()[d / 2];

        System.out.println(test);
        int k =0, notificationCounter =0;
        int median_idx = d%2 == 1 ? d%2 : d/2+(d/2-1);

        while(d-k > 0){
            int median = expenditure[median_idx+k];
            System.out.println( median_idx + " :: "+ median);
            for(int i =0+k; i<d+k; i++){
//                System.out.println("expenditure[i] ::" + i + " --> "+expenditure[i]);
                if(expenditure[i] >= median*2 && !isPartOfNotificationPeriod(expenditure[i], expenditure, d)) notificationCounter++;
            }
            System.out.println("   ");
            k++;
        }
        System.out.println(notificationCounter);
        return notificationCounter;
    }
    /*
    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {


        int notifications =0;
        Arrays.sort(expenditure);
        // Median    --> get middle of the number by Sort Array in ascending
        //get median
        int median_idx = (d%2 == 1) ? (d%2)+1 : d%2;
        int median = expenditure[median_idx];
        int notificationCounter = 0;
        for(int i=d; i<expenditure.length; i++){
            if(expenditure[i] >= median*2 && !isPartOfNotificationPeriod(expenditure[i], expenditure, d)) notificationCounter++;
        }

        System.out.println(notificationCounter);
        return notificationCounter;

    }

    private static int getMedian(int[] values, int d){
        int median = 0;
        // get count of scores
        int totalElements = d;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = values[totalElements / 2] +
                    values[totalElements / 2 - 1];
            // calculate average of middle elements
            median = (sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = values[totalElements / 2];
        }
        return median;
    }
*/
    private static boolean isPartOfNotificationPeriod(int val, int[] expenditure, int d) {
        for(int k=0; k<d; k++){
            if(val == expenditure[k]) return true;
        }
        return false;
    }




    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}


