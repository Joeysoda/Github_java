/**
 * Description:
 * Date: 2024-03-18
 * Time: 0:11
 */
import java.io.*;
import java.util.*;

public class cw1_sample_from_claude {
    public static void main(String[] args) {
        try {
            // Read input file name from console
            Scanner consoleScanner = new Scanner(System.in);
            System.out.print("Enter the input file name: ");
            String inputFileName = consoleScanner.nextLine();

            // Read input from file
            File inputFile = new File(inputFileName);
            Scanner fileScanner = new Scanner(inputFile);

            Map<String, int[]> algorithmMetrics = new LinkedHashMap<>();

            int iteration = -1;
            int phase = -1;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                if (line.startsWith("Iteration")) {
                    iteration = Integer.parseInt(line.split(" ")[1]);
                } else if (line.startsWith("Phase")) {
                    phase = Integer.parseInt(line.split(" ")[1].replace(":", ""));
                } else if (line.startsWith("-")) {
                    String[] parts = line.split(" ");
                    String algorithmName = parts[1];

                    if (line.contains("Starts")) {
                        if (!algorithmMetrics.containsKey(algorithmName)) {
                            algorithmMetrics.put(algorithmName, new int[3]);
                        }
                    } else if (line.contains("Ends")) {
                        String[] metricParts = line.split("Elapsed Time \\(ms\\): | Evaluations: | Improvements: ");
                        int elapsedTime = 0;
                        int evaluations = 0;
                        int improvements = 0;

                        if (metricParts.length > 1) {
                            elapsedTime = Integer.parseInt(metricParts[1].trim());
                        }
                        if (metricParts.length > 2) {
                            evaluations = Integer.parseInt(metricParts[2].trim());
                        }
                        if (metricParts.length > 3) {
                            improvements = Integer.parseInt(metricParts[3].trim());
                        }

                        int[] metrics = algorithmMetrics.get(algorithmName);
                        metrics[0] += elapsedTime;
                        metrics[1] += evaluations;
                        metrics[2] += improvements;
                    }
                }
            }

            fileScanner.close();

            // Write output to standard output
            PrintWriter console = new PrintWriter(System.out);

            String header = "Iteration,Phase,Algorithm,Elapsed Time (ms),Evaluations,Improvements";
            console.println(header);

            int totalElapsedTime = 0;
            int totalEvaluations = 0;
            int totalImprovements = 0;

            for (Map.Entry<String, int[]> entry : algorithmMetrics.entrySet()) {
                String algorithmName = entry.getKey();
                int[] metrics = entry.getValue();

                String row = iteration + "," + phase + "," + algorithmName + "," +
                        metrics[0] + "," + metrics[1] + "," + metrics[2];
                console.println(row);

                totalElapsedTime += metrics[0];
                totalEvaluations += metrics[1];
                totalImprovements += metrics[2];
            }

            String totalRow = "-1,-1,All," + totalElapsedTime + "," + totalEvaluations + "," + totalImprovements;
            console.println(totalRow);

            console.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}