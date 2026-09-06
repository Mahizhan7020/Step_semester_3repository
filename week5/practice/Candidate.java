import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5; // threshold for direct CGPA
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 7.0 && codingScore >= 50; // combined threshold
    }

    double compositeScore() {
        return cgpa * 10 + codingScore; // weighted composite
    }

    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore(), this.compositeScore());
    }

    static String shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = Arrays.stream(candidates)
            .filter(c -> isEligible(c.cgpa) || isEligible(c.cgpa, c.codingScore))
            .toArray(Candidate[]::new);

        Arrays.sort(shortlisted);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shortlisted.length; i++) {
            sb.append((i + 1)).append(". ")
              .append(shortlisted[i].name)
              .append(" (").append(shortlisted[i].compositeScore()).append(") | ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Candidate[] list = {
            new Candidate("Aisha", 8.2, 40),
            new Candidate("Rohit", 6.8, 65),
            new Candidate("Meena", 6.0, 90),
            new Candidate("Karan", 7.5, 20)
        };
        System.out.println(shortlistAndRank(list));
    }
}
