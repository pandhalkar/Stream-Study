import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class First {
	
	
	//Count the letters and numbers from the ArrayList.
	//@Test
	public void regular()
	{
		ArrayList<String>name=new ArrayList<String>();
		name.add("Abhijeet");
		name.add("Don");
		name.add("Alekhya");
		name.add("Ram");
		name.add("Lalita");
		
//		int count=0;
//		for(int i=0;i<name.size();i++)
//		{
//			String actualValue=name.get(i);
//			System.out.println(actualValue);
//			
//			if(actualValue.startsWith(actualValue)) 
//			{
//				count++;
//			}
//			System.out.println(count);
//		}
		
		//print all the names which is greater than 4 char
		name.stream().filter(p->p.length()>4).forEach(p->System.out.println(p));
		//length of 4
		//all which comes under p(filtered now with streams)
		
		//***** Show only one result*****
		name.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("***" + s));

	}
	
	
	//@Test
	//Stream is a collection of strings.
	public void streammethod()
	{
		long q=Stream.of("Aashlesha","Adam","Lalita","Anuu").filter
				(a->a.startsWith("a") || (a.startsWith("A"))).count();
		
		
		System.out.println(q);
	}
	
	
//	@Test
	//print names which ends with a and show in upper case
	
	public void uppercase()
	{
		Stream.of("Rama","Laxman","Bharat","Shatrughan","Hanuma")
		.filter(s->s.endsWith("a")|| (s.endsWith("A"))).
		map(s->s.toUpperCase()).forEach(s->System.out.println(s));
				
	
	}

//Print names which have last letter "a" and print in sorted format.
	//@Test
	public void a_Sorted()
	{
		Stream.of("Rama","Laxmana","Bharat","Shatrughan","Hanuma")
		.filter(s->s.endsWith("a")).sorted().map(s->s.toLowerCase())
		.forEach(s->System.out.println(s));
	}
	
	//Concatinating array and sort
	//@Test
	
public void concatStream()
{
		List<String>one=Arrays.asList("xone","ztwo","athree");
		ArrayList<String> two=new ArrayList<String>();
		two.add("Zebra");
		two.add("Lenevo");
		two.add("HPL");
		
		
Stream<String>cont=Stream.concat(one.stream(), two.stream());

cont.sorted().forEach((s->System.out.print(  " "+ s +" ")));
}
	
	
	//If the value is present or not  by usong any match
	
	//@Test
	
	public void case1()
	{
	boolean show=	 Stream.of("Adam","Ram","Shyam").anyMatch(s->s.equalsIgnoreCase("ram"));
		System.out.println(show);
	Assert.assertTrue(show);
		
	}
	
	
	//@Test
	//Convert array to arrayList
	public void arrayintoarraylist()
	{
	int []arr= {1,2,3,4,5};
	List<Integer>arr1=Arrays.asList(1,2,3,3,9,4,4,7,4,5);
	arr1.stream().distinct().sorted().forEach(s->System.out.println(s));
	List<Integer>li=arr1.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println("Value of 2 position is: "+ li.get(2));
	}
	
	
	//Map: modify stream filter results.. filter and modify both cab be use at a time.
	
	
	
	//print names which is last letter as "a" and upper case
	
//	@Test
	public void challenge()
	{
		Stream.of("Ram","Shyam","Laxmana").filter(s->s.endsWith("a")).
		map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}
	
	
	
	//we learnt [array,arraylist, stream, filter, foreach, uppler,loercase, sort, collect, collector
	//sort, map, limit,start with , ends with, distinct, concatinate,count, length]
	
	
	@Test
	public void testing()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Lalita\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();	

	driver.get("https://rahulshettyacademy.com/client");
	driver.findElement(By.xpath("//input[@id='userEmail']"))
	.sendKeys("pandhalkar.leeta1@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='userPassword']"))
	.sendKeys("B1zmat1cs@");
	
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	}
	
}
	
	
	

