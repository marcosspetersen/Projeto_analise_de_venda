package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {
	

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			List<Sale> sales = new ArrayList<>();
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				
				int month = Integer.parseInt(fields[0]);
				int year = Integer.parseInt(fields[1]);
				String seller = fields[2];
				int items = Integer.parseInt(fields[3]);
				double total = Double.parseDouble(fields[4]);
				
				sales.add(new Sale(month, year, seller, items, total));
				
				line = br.readLine();
			}
			
			Comparator<Sale> comp = (pm1, pm2) -> pm1.averagePrice().compareTo(pm2.averagePrice());
			
			List<Sale> fiveFirst = sales.stream()
									.filter(s -> s.getYear() == 2016)
									.sorted(comp.reversed())
									.limit(5)
									.collect(Collectors.toList());
			
			Double sum = sales.stream()
						.filter(s -> s.getSeller().equals("Logan"))
						.filter(s -> s.getMonth() == 1 || s.getMonth() == 7)
						.map(s -> s.getTotal())
						.reduce(0.0, (x, y) -> x + y);
			
			System.out.println();
			System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");
			fiveFirst.forEach(System.out::println);
			
			System.out.println();
			System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f\n", sum);
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();
	}

}
