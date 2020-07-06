package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Child  {
	
		
		public static void main(String[] args) throws InterruptedException
		{
//			Akshay a=new Akshay("akshaya",123);
//			
//			Akshay b=new Akshay("akshayoa",123);
//			ArrayList<Akshay> k=new ArrayList<Akshay>();
//			k.add(a);
//			k.add(b);
//			Iterator<Akshay> m=k.iterator();
//			while(m.hasNext()) {
//				
//				Akshay y=m.next();
//				System.out.println(y.empname+" "+y.id);
//			}
			
//		LinkedList<String> l=new LinkedList<String>();
//		l.add("123");
//		l.add("ooo");
//		int n=0;
//		System.out.println(l.size());
//		while(l.size()>n) {
//			System.out.println(l.get(n));
//			n=n+1;
//		}
			WebDriver d=new ChromeDriver();
			d.get("https://magento.com/");
			Thread.sleep(4000);
			WebElement e=d.findElement(By.xpath("//span[text()='Solutions']"));
			Actions a=new Actions(d);
			a.moveToElement(e).build().perform();;
			
		}
		
}
