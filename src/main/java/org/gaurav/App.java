package org.gaurav;

import org.gaurav.model.Rainfall;
import org.gaurav.utils.CSVUtils;
import org.gaurav.config.Constants;

import java.io.IOException;
import java.util.List;

public class App {

    public static void main( String[] args ){

        CSVUtils csvUtils = new CSVUtils();

        try {
            List<String> jsonLines = csvUtils.csvToJsonLineList(Constants.csvFilePath,Constants.csvSeparator);
            csvUtils.writeJSONLinesToFile(jsonLines,Constants.jsonFilePath);

            List<Rainfall> rainfalls = csvUtils.populateCSVData(Constants.csvFilePath,Constants.csvSeparator);

            Double averageRainfall = csvUtils.getAverageRainfallOfSpecificSubdivision(rainfalls,Constants.COASTAL_KARNATAKA);
            System.out.println(Constants.NEW_LINE + "Average Rainfall of " + Constants.COASTAL_KARNATAKA + " : " + averageRainfall + Constants.NEW_LINE);

            csvUtils.printAverageRainfallOfSubdivisions(rainfalls,Constants.KARNATAKA);

            csvUtils.printTopRainFallMonthsOfSubdivision(rainfalls,Constants.KERALA);

            csvUtils.printLowestRainFallMonthsOfAllSubdivisions(rainfalls);
        } catch (IOException e) {
            System.err.println("Exception : " + e.fillInStackTrace().toString());
        }

    }

}
