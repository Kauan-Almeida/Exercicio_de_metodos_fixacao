package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i +" data: ");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double health = sc.nextDouble();
				list.add(new Individual(name, anual, health));	
			}
			else {
				System.out.print("Numberof employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, anual, employees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer payer : list) {
			 System.out.println(payer.getName() + ":" +  " $ " + (String.format("%.2f" , payer.Tax())));
		}
		double totalValue = 0;
		for (TaxPayer payer : list) {
			  totalValue += payer.Tax();
			}
			
		System.out.println();
		System.out.println("TOTAL TAXE: $ " + String.format("%.2f", totalValue));
		
		
		sc.close();
	}
}