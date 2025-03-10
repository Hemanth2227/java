public class WeatherAnalysis {
    public static void main(String[] args) {
        double[][][] weatherData = {
            {
                {25.5, 65.0, 2.5},
                {28.0, 68.0, 3.0}, 
                {32.5, 70.0, 4.5}   
            },
            {
                {28.5, 60.0, 1.5}, 
                {30.0, 62.0, 1.8},  
                {32.0, 65.0, 2.0}   
            },
            {
                {20.5, 58.0, 2.0}, 
                {22.0, 60.0, 2.5}, 
                {26.5, 63.0, 3.5} 
            }
        };

        String[] cities = {"New York", "Los Angeles", "Chicago"};
        String[] months = {"January", "February", "March"};

        //Average Temperatures
        for (int city = 0; city < weatherData.length; city++) {
            double totalTemp = 0;
            for (int month = 0; month < weatherData[city].length; month++) {
                totalTemp += weatherData[city][month][0];
            }
            double avgTemp = totalTemp / weatherData[city].length;
            System.out.println("\nAverage Temperatures in :");
            System.out.println(cities[city] + ": " + avgTemp + "°C");
        }

        //Maximum Rainfall
        double maxRainfall = 0;
        int maxCityIndex = 0, maxMonthIndex = 0;
        for (int city = 0; city < weatherData.length; city++) {
            for (int month = 0; month < weatherData[city].length; month++) {
                if (weatherData[city][month][2] > maxRainfall) {
                    maxRainfall = weatherData[city][month][2];
                    maxCityIndex = city;
                    maxMonthIndex = month;
                }
            }
        }

        System.out.println("\nMaximum Rainfall: " + maxRainfall + " inches in " +
                cities[maxCityIndex] + " (" + months[maxMonthIndex] + ")");
    }
}