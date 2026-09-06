class SeatingGrid {
    private static double rowAverage(int[] row) {
        int sum = 0;
        for (int val : row) sum += val;
        return (double) sum / row.length;
    }

    static String classifyRows(int[][] seatingScores, int threshold) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);
            if (avg >= threshold) {
                result.append("Row ").append(i).append(": Buzzing Zone | ");
            } else {
                result.append("Row ").append(i).append(": Quiet Zone | ");
            }
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        int[][] seating = {
            {40, 50, 45},
            {85, 90, 95},
            {30, 20, 25}
        };
        System.out.println(classifyRows(seating, 60));
    }
}
