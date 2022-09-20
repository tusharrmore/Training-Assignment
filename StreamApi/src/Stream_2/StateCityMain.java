package Stream_2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StateCityMain {
	
	public static void main(String[] args) {
		
		List<City> cs=Arrays.asList(
                new City(1, "mumbai", new State(101, "maharashtra"), 7.5f, 900000, 517),
                new City(2, "jalgaon", new State(101, "maharashtra"), 8.7f, 300000, 613),
                new City(3, "surat", new State(102, "gujrat"), 6.8f, 700000, 380),
                new City(4, "valsad", new State(102, "gujrat"), 5f, 450000, 300),
                new City(5, "indor", new State(103, "madhya pradesh"), 8f, 650000, 700),
                new City(6, "agra", new State(103, "utter pradesh"), 7.6f, 800000, 470));
        
        System.out.println("find city with less area and highest population");
        List<City> value=cs.stream().sorted(Comparator.comparing(City::getPopulation).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
        System.out.println(value);
        
        System.out.println("find city with high population index and high city area");
        List<City> value1=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city).reversed()).limit(1).collect(Collectors.toList());
        System.out.println(value1);
        
        System.out.println("print city with less population index first");
        List<City> value2=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex)).collect(Collectors.toList());
        System.out.println(value2);
        
        System.out.println("print city with lowest population index and lowest area");
        List<City> value3=cs.stream().sorted(Comparator.comparing(City::getPollutionIndex).thenComparing(City::getArea_of_city)).limit(1).collect(Collectors.toList());
        System.out.println(value3);
        
        System.out.println("count how many city in state");
        long count=cs.stream().map(City::getCityname).count();
        System.out.println(count);
        
        System.out.println("total area of each state");
        long sum=cs.stream().collect(Collectors.summingLong(City::getArea_of_city));
        System.out.println(sum);
        
    }

}
