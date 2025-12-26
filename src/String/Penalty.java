package String;

public class Penalty {
    public static void main(String[] args) {
        String a = "NNYYN";
        System.out.println(bestClosingTime(a));
    }

    public static int bestClosingTime(String customers) {
        int cHour = 0;
        int penalty = 0;
        int bestHour = Integer.MAX_VALUE;
        int n = 0;
        while (n <= customers.length()) {
            for (int i = 0; i < customers.length(); i++) {
                // when i < n N++ Y--
                if (customers.charAt(i) == 'Y') {
                    if (i >= n) {
                        penalty++;
                    }
                } else {
                    if (i < n) {
                        penalty++;
                    }
                }
            }

            if (penalty < bestHour) {
                bestHour = n;
            }
            penalty = 0;
            n++;
        }
        return bestHour;
    }
}
