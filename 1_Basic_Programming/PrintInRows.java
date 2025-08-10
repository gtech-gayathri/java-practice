// Program to display numbers from 1 to 30 with 5 numbers per row
class NumbersInRows {
    public static void main(String[] args) {
        int count = 1;

        // Loop from 1 to 30
        for (int i = 1; i <= 30; i++) {
            System.out.print(i + "\t"); // print number with tab space

            // After every 5 numbers, go to the next line
            if (count % 5 == 0) {
                System.out.println();
            }
            count++;
        }
    }
}

/*
Sample Output:
1	2	3	4	5	
6	7	8	9	10	
11	12	13	14	15	
16	17	18	19	20	
21	22	23	24	25	
26	27	28	29	30
*/
