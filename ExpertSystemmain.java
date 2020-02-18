package com.javacodegeeks.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import java.util.Scanner;

public class ExpertSystemmain {
	
	public static void main(String[]  args) {
		try {
			 // load up the knowledge base
            KieServices ks = KieServices.Factory.get(); //Knowledge Services
            KieContainer kContainer = ks.getKieClasspathContainer(); //Knowledge container
            KieSession kSession = kContainer.newKieSession("ksession-rules"); //whole rule engine is embedded into kSession
            
            Stockprice stockprice = getStockpriceValues();
            kSession.insert(stockprice);
            kSession.fireAllRules();
		}catch(Throwable t){
			t.printStackTrace();
		}
	}
	
	public static Stockprice getStockpriceValues() {
		float div;
		int glbl;
		float rev;
		int cli;
		float rd;
		int tax;
		int np;
		
		Stockprice stockprice = new Stockprice();
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter Dividend announced to the shareholders: ");
		div = myObj.nextFloat();
		stockprice.setDividend(div);
		
		System.out.println("Rate the Global cues on a scale of 5, 5 being Extremely good for business to 1 being very poor: ");
		glbl = myObj.nextInt();
		stockprice.setGlobalcues(glbl);
		
		System.out.println("Enter net revenue growth(YOY) in percentage: ");
		//YOY denotes comparison of revenues of a particular quarter in the present year with the same quarter previous year 
		rev = myObj.nextFloat();
		stockprice.setRevenuegrowth(rev);
		
		System.out.println("Enter the net number of clients change in integers: ");
		cli = myObj.nextInt();
		stockprice.setNetclientschange(cli);
		
		System.out.println("Enter the percentage of revenue alloted to Research and Development: ");
		rd = myObj.nextFloat();
		stockprice.setRandd(rd);
		
		System.out.println("Rate the expected Tax benefits from the government on a scale of 5, 5 being Extremely good to 1 being very poor: ");
		tax = myObj.nextInt();
		stockprice.setTaxbenefits(tax);
		
		System.out.println("Rate the sucess of new products released on a scale of 5, 5 being Extremely good to 1 being very poor: ");
		np = myObj.nextInt();
		stockprice.setNewproducts(np);
		
		return stockprice;
		
	}

}
