import java.util.*;

/**
 * Stock Span Problem
 * -------------------
 * The Stock Span Problem is a financial problem where we have a series of 
 * daily stock prices for N days, and we need to calculate the "span" of 
 * each day’s price.
 *
 * Span: The span of a stock’s price on a given day is defined as the maximum 
 * number of consecutive days just before the given day, for which the stock 
 * price on the current day is less than or equal to its price on those days.
 *
 * Example:
 * --------
 * Input:
 * Prices = [100, 80, 60, 70, 60, 75, 85]
 *
 * Output (Span):
 * [1, 1, 1, 2, 1, 4, 6]
 *
 * Explanation:
 * Day 1: Price = 100 → No previous higher → Span = 1
 * Day 2: Price = 80  → Previous higher was day 1 → Span = 1
 * Day 3: Price = 60  → No previous higher → Span = 1
 * Day 4: Price = 70  → Previous higher was day 2 → Span = 2
 * Day 5: Price = 60  → No previous higher → Span = 1
 * Day 6: Price = 75  → Previous higher was day 4 → Span = 4
 * Day 7: Price = 85  → Previous higher was day 1 → Span = 6
 *
 * This is a typical problem solved using Stack.
 */

public class StockSpanProblem {

    // Function to calculate stock spans
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n]; // Stores the span result
        Stack<Integer> stack = new Stack<>(); // Stores indices of days

        // First day span is always 1
        span[0] = 1;
        stack.push(0);

        // Process each day
        for (int i = 1; i < n; i++) {
            // Pop all days with smaller or equal price
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }

            // If stack is empty → no greater price before → span = i+1
            // Else span = difference of indices
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current day index into stack
            stack.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking dynamic input
        System.out.print("Enter number of days: ");
        int n = sc.nextInt();
        int[] prices = new int[n];

        System.out.println("Enter stock prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // Calculate stock spans
        int[] span = calculateSpan(prices);

        // Printing output
        System.out.println("Stock Prices: " + Arrays.toString(prices));
        System.out.println("Stock Spans : " + Arrays.toString(span));
    }
}

/**
 * --------------------
 * Sample Input/Output:
 * --------------------
 *
 * Input:
 * Enter number of days: 7
 * Enter stock prices:
 * 100 80 60 70 60 75 85
 *
 * Output:
 * Stock Prices: [100, 80, 60, 70, 60, 75, 85]
 * Stock Spans : [1, 1, 1, 2, 1, 4, 6]
 *
 * Explanation:
 * - Day 1 → 100 → span = 1 (no previous higher price)
 * - Day 2 → 80  → span = 1 (previous higher was 100)
 * - Day 3 → 60  → span = 1 (previous higher was 80)
 * - Day 4 → 70  → span = 2 (covers day 3 and itself)
 * - Day 5 → 60  → span = 1
 * - Day 6 → 75  → span = 4 (covers days 3,4,5,6)
 * - Day 7 → 85  → span = 6 (covers days 2 to 7)
 */
