package org.gaurav.utils;

import org.gaurav.config.Constants;
import org.gaurav.model.Rainfall;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class CSVUtils {

    public void printLowestRainFallMonthsOfAllSubdivisions(List<Rainfall> rainfalls){

        Map<String,Double> rainfallMap = new HashMap<String, Double>(){{
            put(Constants.JANUARY,0.0);
            put(Constants.FEBRUARY,0.0);
            put(Constants.MARCH,0.0);
            put(Constants.APRIL,0.0);
            put(Constants.MAY,0.0);
            put(Constants.JUNE,0.0);
            put(Constants.JULY,0.0);
            put(Constants.AUGUST,0.0);
            put(Constants.SEPTEMBER,0.0);
            put(Constants.OCTOBER,0.0);
            put(Constants.NOVEMBER,0.0);
            put(Constants.DECEMBER,0.0);
        }};

        for(Rainfall rainfall : rainfalls){
            rainfallMap.put(Constants.JANUARY,rainfallMap.get(Constants.JANUARY) + rainfall.getJanuary());
            rainfallMap.put(Constants.FEBRUARY,rainfallMap.get(Constants.FEBRUARY) + rainfall.getFebruary());
            rainfallMap.put(Constants.MARCH,rainfallMap.get(Constants.MARCH) + rainfall.getMarch());
            rainfallMap.put(Constants.APRIL,rainfallMap.get(Constants.APRIL) + rainfall.getApril());
            rainfallMap.put(Constants.MAY,rainfallMap.get(Constants.MAY) + rainfall.getMay());
            rainfallMap.put(Constants.JUNE,rainfallMap.get(Constants.JUNE) + rainfall.getJune());
            rainfallMap.put(Constants.JULY,rainfallMap.get(Constants.JULY) + rainfall.getJuly());
            rainfallMap.put(Constants.AUGUST,rainfallMap.get(Constants.AUGUST) + rainfall.getAugust());
            rainfallMap.put(Constants.SEPTEMBER,rainfallMap.get(Constants.SEPTEMBER) + rainfall.getSeptember());
            rainfallMap.put(Constants.OCTOBER,rainfallMap.get(Constants.OCTOBER) + rainfall.getOctober());
            rainfallMap.put(Constants.NOVEMBER,rainfallMap.get(Constants.NOVEMBER) + rainfall.getNovember());
            rainfallMap.put(Constants.DECEMBER,rainfallMap.get(Constants.JANUARY) + rainfall.getJanuary());
        }

        TreeSet<Map.Entry<String, Double>> averageValues = new TreeSet<Map.Entry<String, Double>>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> e1,
                                       Map.Entry<String, Double> e2) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                });

        averageValues.addAll(rainfallMap.entrySet());

        Iterator<Map.Entry<String, Double>> iterator = averageValues.iterator();

        System.out.println(Constants.NEW_LINE + "Top 4 Months on Which Most of The Sub Divisions see the lowest rainfall Starts" + Constants.NEW_LINE);

        int i = 0;

        while (iterator.hasNext()){
            Map.Entry<String, Double> average = iterator.next();

            if (i == 0){
                System.out.println("1st Month : " + average.getKey().toUpperCase());
            }

            if (i == 1){
                System.out.println("2nd Month : " + average.getKey().toUpperCase());
            }

            if (i == 3){
                System.out.println("3rd Month : " + average.getKey().toUpperCase());
            }

            if (i == 4){
                System.out.println("4th Month : " + average.getKey().toUpperCase());
                break;
            }

            i++;
        }

        System.out.println(Constants.NEW_LINE + "Top 4 Months on Which Most of The Sub Divisions see the lowest rainfall Ends" + Constants.NEW_LINE);
    }

    public void printTopRainFallMonthsOfSubdivision(List<Rainfall> rainfalls, final String subdivision){
        List<Rainfall> requiredData = rainfalls.parallelStream().filter(rainfall -> rainfall.getSubdivision().equals(subdivision))
                .collect(Collectors.toList());

        Map<String,Double> rainfallMap = new HashMap<String, Double>(){{
            put(Constants.JANUARY,0.0);
            put(Constants.FEBRUARY,0.0);
            put(Constants.MARCH,0.0);
            put(Constants.APRIL,0.0);
            put(Constants.MAY,0.0);
            put(Constants.JUNE,0.0);
            put(Constants.JULY,0.0);
            put(Constants.AUGUST,0.0);
            put(Constants.SEPTEMBER,0.0);
            put(Constants.OCTOBER,0.0);
            put(Constants.NOVEMBER,0.0);
            put(Constants.DECEMBER,0.0);
        }};

        for(Rainfall rainfall : requiredData){
            rainfallMap.put(Constants.JANUARY,rainfallMap.get(Constants.JANUARY) + rainfall.getJanuary());
            rainfallMap.put(Constants.FEBRUARY,rainfallMap.get(Constants.FEBRUARY) + rainfall.getFebruary());
            rainfallMap.put(Constants.MARCH,rainfallMap.get(Constants.MARCH) + rainfall.getMarch());
            rainfallMap.put(Constants.APRIL,rainfallMap.get(Constants.APRIL) + rainfall.getApril());
            rainfallMap.put(Constants.MAY,rainfallMap.get(Constants.MAY) + rainfall.getMay());
            rainfallMap.put(Constants.JUNE,rainfallMap.get(Constants.JUNE) + rainfall.getJune());
            rainfallMap.put(Constants.JULY,rainfallMap.get(Constants.JULY) + rainfall.getJuly());
            rainfallMap.put(Constants.AUGUST,rainfallMap.get(Constants.AUGUST) + rainfall.getAugust());
            rainfallMap.put(Constants.SEPTEMBER,rainfallMap.get(Constants.SEPTEMBER) + rainfall.getSeptember());
            rainfallMap.put(Constants.OCTOBER,rainfallMap.get(Constants.OCTOBER) + rainfall.getOctober());
            rainfallMap.put(Constants.NOVEMBER,rainfallMap.get(Constants.NOVEMBER) + rainfall.getNovember());
            rainfallMap.put(Constants.DECEMBER,rainfallMap.get(Constants.JANUARY) + rainfall.getJanuary());
        }

        TreeSet<Map.Entry<String, Double>> averageValues = new TreeSet<Map.Entry<String, Double>>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> e1,
                                       Map.Entry<String, Double> e2) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                });

        averageValues.addAll(rainfallMap.entrySet());

        Iterator<Map.Entry<String, Double>> iterator = averageValues.descendingIterator();

        System.out.println(Constants.NEW_LINE + "Top 3 Months on Which Kerala gets Higher Rainfall Starts" + Constants.NEW_LINE);

        int i = 0;

        while (iterator.hasNext()){
            Map.Entry<String, Double> average = iterator.next();

            if (i == 0){
                System.out.println("1st Month : " + average.getKey().toUpperCase());
            }

            if (i == 1){
                System.out.println("2nd Month : " + average.getKey().toUpperCase());
            }

            if (i == 3){
                System.out.println("3rd Month : " + average.getKey().toUpperCase());
                break;
            }

            i++;
        }

        System.out.println(Constants.NEW_LINE + "Top 3 Months on Which Kerala gets Higher Rainfall Ends" + Constants.NEW_LINE);
    }

    public void printAverageRainfallOfSubdivisions(List<Rainfall> rainfalls, final String subdivision){
        Set<String> uniqueSubDivisions = new HashSet<String>();

        List<Rainfall> requiredData = rainfalls.parallelStream().filter(rainfall -> rainfall.getSubdivision().contains(subdivision))
                .collect(Collectors.toList());

        requiredData.forEach(rainfall -> {
            //System.out.println(rainfall.getSubdivision());
            uniqueSubDivisions.add(rainfall.getSubdivision());
        });

        Double averageValue;
        int count;

        Map<String,Double> tmpMap = new HashMap<String, Double>();

        for (String subDivision : uniqueSubDivisions){
            averageValue = 0.0;
            count = 0;
            for (Rainfall rainfall : requiredData){
                if (rainfall.getSubdivision().equals(subDivision)){
                    averageValue += rainfall.getAnnual();
                    count++;
                }
            }
            tmpMap.put(subDivision,averageValue/count);
        }

        TreeSet<Map.Entry<String, Double>> averageValues = new TreeSet<Map.Entry<String, Double>>(
                new Comparator<Map.Entry<String, Double>>() {
                    @Override
                    public int compare(Map.Entry<String, Double> e1,
                                       Map.Entry<String, Double> e2) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                });

        averageValues.addAll(tmpMap.entrySet());

        Iterator<Map.Entry<String, Double>> iterator = averageValues.descendingIterator();

        System.out.println(Constants.NEW_LINE + "Average Rainfall of Subdivisions in Desending Order Starts" + Constants.NEW_LINE);

        while (iterator.hasNext()){
            Map.Entry<String, Double> average = iterator.next();
            System.out.println("Average Rainfall of subdivision " + average.getKey() + " : " + average.getValue());
        }

        System.out.println(Constants.NEW_LINE + "Average Rainfall of Subdivisions in Desending Order Ends" + Constants.NEW_LINE);
    }

    public Double getAverageRainfallOfSpecificSubdivision(List<Rainfall> rainfalls, final String subdivision){
        List<Rainfall> requiredData = rainfalls.parallelStream().filter(rainfall -> rainfall.getSubdivision().equals(subdivision))
                .collect(Collectors.toList());

        Double averageValue = 0.0;

        for(Rainfall rainfall : requiredData){
            averageValue += rainfall.getAnnual();
        }

        return averageValue / requiredData.size();
    }

    public List<Rainfall> populateCSVData(String file, String separator) throws IOException {

        String line;
        boolean first = true;

        List<Rainfall> rainfalls = new ArrayList<Rainfall>();

        file = getResource(file);

        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line = br.readLine()) != null){
            String[] data = line.split(separator);

            if (first){
                first = false;
            }else {
                Rainfall rainfall = new Rainfall();
                rainfall.setSubdivision(data[0]);
                rainfall.setYear(Integer.parseInt(data[1]));

                if (data[2].equals("NA")){
                    rainfall.setJanuary(0.0);
                }else {
                    rainfall.setJanuary(Double.parseDouble(data[2]));
                }

                if (data[3].equals("NA")){
                    rainfall.setFebruary(0.0);
                }else {
                    rainfall.setFebruary(Double.parseDouble(data[3]));
                }

                if (data[4].equals("NA")){
                    rainfall.setMarch(0.0);
                }else {
                    rainfall.setMarch(Double.parseDouble(data[4]));
                }

                if (data[5].equals("NA")){
                    rainfall.setApril(0.0);
                }else {
                    rainfall.setApril(Double.parseDouble(data[5]));
                }

                if (data[6].equals("NA")){
                    rainfall.setMay(0.0);
                }else {
                    rainfall.setMay(Double.parseDouble(data[6]));
                }

                if (data[7].equals("NA")){
                    rainfall.setJune(0.0);
                }else {
                    rainfall.setJune(Double.parseDouble(data[7]));
                }

                if (data[8].equals("NA")){
                    rainfall.setJuly(0.0);
                }else {
                    rainfall.setJuly(Double.parseDouble(data[8]));
                }

                if (data[9].equals("NA")){
                    rainfall.setAugust(0.0);
                }else {
                    rainfall.setAugust(Double.parseDouble(data[9]));
                }

                if (data[10].equals("NA")){
                    rainfall.setSeptember(0.0);
                }else {
                    rainfall.setSeptember(Double.parseDouble(data[10]));
                }

                if (data[11].equals("NA")){
                    rainfall.setOctober(0.0);
                }else {
                    rainfall.setOctober(Double.parseDouble(data[11]));
                }

                if (data[12].equals("NA")){
                    rainfall.setNovember(0.0);
                }else {
                    rainfall.setNovember(Double.parseDouble(data[12]));
                }

                if (data[13].equals("NA")){
                    rainfall.setDecember(0.0);
                }else {
                    rainfall.setDecember(Double.parseDouble(data[13]));
                }

                if (data[14].equals("NA")){
                    rainfall.setAnnual(0.0);
                }else {
                    rainfall.setAnnual(Double.parseDouble(data[14]));
                }
                rainfalls.add(rainfall);
                //System.out.println(rainfall.toString());
            }

        }
        br.close();
        return rainfalls;
    }

    public List<String> csvToJsonLineList(String file, String separator) throws IOException {

        String line;
        boolean first = true;

        file = getResource(file);

        List<String> headers = new ArrayList<String>();
        List<String> jsonLines = new ArrayList<String>();

        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line = br.readLine()) != null){
            String[] data = line.split(separator);

            if (first){
                for(String header : data){
                    headers.add(header.replace("\\s","_").toLowerCase());
                }
                //System.out.println("Headers : " + headers.toString());
                first = false;
            }else {
                String header;
                StringBuilder jsonLine = new StringBuilder();
                for (int i = 0; i < headers.size(); i++){
                    header = headers.get(i);

                    if(i == 0){
                        jsonLine.append("{" + "\"" + header + "\"" + ":" + "\"" + data[i] + "\"" + ", ");
                    }else if (i == headers.size() - 1){
                        jsonLine.append("\"" + header + "\"" + ":" + "\"" + data[i] + "\"" + "}");
                    }else {
                        jsonLine.append("\"" + header + "\"" + ":" + "\"" + data[i] + "\"" + ", ");
                    }
                }
                jsonLines.add(jsonLine.toString());
                //System.out.println("CSV line : " + Arrays.toString(data));
                //System.out.println("JSON line : " + jsonLine.toString());
            }

        }
        br.close();
        return jsonLines;
    }

    public void writeJSONLinesToFile(List<String> jsonLines,String fileName) throws IOException {
        fileName = getResource(fileName);
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        for (String jsonLine : jsonLines){
            printWriter.println(jsonLine);
        }
        printWriter.close();
    }

    public String getResource(String resourceName) {
        URL location = CSVUtils.class.getProtectionDomain().getCodeSource().getLocation();
        return location.getPath().replace("/target/classes/","/src/main/resources/" + resourceName);
    }

}
