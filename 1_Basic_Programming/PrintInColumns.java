public class PrintInColumns {
    public static void main(String[] args) {
        int num = 30;
        int numbersPerColumn = 5;
        int cols = (num + numbersPerColumn - 1) / numbersPerColumn; // total columns
        int rows = numbersPerColumn;

        for (int i = 0; i < rows; i++) {       // rows = 5 as per question
            for (int j = 0; j < cols; j++) {   // calculated columns
                int val = i + j * rows + 1;
                if (val <= num)
                    System.out.printf("%-5d", val);
            }
            System.out.println();
        }
    }
}

/*
Output:
1    6    11   16   21   26   
2    7    12   17   22   27   
3    8    13   18   23   28   
4    9    14   19   24   29   
5    10   15   20   25   30   
*/
