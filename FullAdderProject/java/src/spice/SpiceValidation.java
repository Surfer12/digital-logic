package spice;

import java.io.*;
import java.util.*;

/**
 * Validation script to compare SPICE simulation outputs with expected results
 */
public class SpiceValidation {

    private String spiceOutputFile;
    private Map<String, String> expectedResults;

    public SpiceValidation(String spiceOutputFile, Map<String, String> expectedResults) {
        this.spiceOutputFile = spiceOutputFile;
        this.expectedResults = expectedResults;
    }

    public boolean validate() {
        try (BufferedReader reader = new BufferedReader(new FileReader(spiceOutputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (Map.Entry<String, String> entry : expectedResults.entrySet()) {
                    if (line.contains(entry.getKey())) {
                        String outputValue = parseOutputValue(line);
                        if (!outputValue.equals(entry.getValue())) {
                            System.out.printf("Validation failed! Expected %s = %s but got %s\n", entry.getKey(), entry.getValue(), outputValue);
                            return false;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        System.out.println("Validation succeeded! All outputs match the expected results.");
        return true;
    }

    private String parseOutputValue(String line) {
        // Assuming simulation output like "SUM=1" or "COUT=0"
        return line.split("=")[1].trim();
    }

    public static void main(String[] args) {
        String spiceOutputPath = "/Users/ryanoates/Desktop/lab2schematixspice/netlist_exports/simulation_output.sp";
        Map<String, String> expected = new HashMap<>();
        expected.put("SUM", "1");
        expected.put("COUT", "0");

        SpiceValidation validator = new SpiceValidation(spiceOutputPath, expected);
        validator.validate();
    }
}