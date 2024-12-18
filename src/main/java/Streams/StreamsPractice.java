package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsPractice {
	
	public static void filtercollection(String[] input)
	{
		List<String> data = Arrays.asList(input);
		
		//data.stream().filter(name->name.charAt(0)=='S').collect(Collectors.toList());
		
		data.stream().filter(name->name.charAt(0)=='S').forEach(System.out::println);
		
	}
	
	public static void mapcollection(String[] input)
	{
		
		
		List<String> data = Arrays.asList(input);
		
		//data.stream().filter(name->name.charAt(0)=='S').collect(Collectors.toList());
		
		data.stream().distinct().forEach(System.out::println);;
		List<String> output  = data.stream().map(name->name.toUpperCase()).filter(name->name.contains("S")).distinct().collect(Collectors.toList());
		output.forEach(System.out::println);
		
	}
	public static void arrayconversion(String[] input)
	{
		
		
		List<String> list = Arrays.asList(input);		
		
		Map<String,Long> output  = list.stream().collect(Collectors.groupingBy(data->data ,Collectors.counting()));
		//String[] output1 = list.stream().distinct().toArray(String[]::new);
		output.forEach((word,count)->System.out.println(word+"..."+count ));
		
	}
	

	public static void main(String[] args) {
		
		String input[] = {"Shiva","Kumar","Gowtham","Shambu","Shiva","Kumar"};
		//filtercollection(input);
		//mapcollection(input);
		
		arrayconversion(input);

	}

}
