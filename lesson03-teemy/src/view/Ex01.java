package view;

import java.util.Scanner;

import bean.Vehicle;

/*
 * BÃ i 1: Sá»Ÿ giao thÃ´ng cáº§n theo dÃµi viá»‡c Ä‘Äƒng kÃ½ mua xe cá»§a ngÆ°á»�i dÃ¢n. Dá»±a vÃ o thÃ´ng tin trá»‹ giÃ¡ xe vÃ  dung tÃ­ch xylanh, sá»Ÿ giao thÃ´ng tÃ­nh má»©c thuáº¿ pháº£i Ä‘Ã³ng trÆ°á»›c báº¡ khi mua xe nhÆ° sau: 
- DÆ°á»›i 100cc, 1% trá»‹ giÃ¡ xe. 
- Tá»« 100 Ä‘áº¿n 200cc, 3% trá»‹ giÃ¡ xe. 
- TrÃªn 200cc, 5% trá»‹ giÃ¡ xe. 
HÃ£y thiáº¿t káº¿ vÃ  cÃ i Ä‘áº·t class Vehicle vá»›i cÃ¡c attributes vÃ  methods phÃ¹ há»£p. XÃ¢y dá»±ng class chá»©a hÃ m main. Thá»±c hiá»‡n cÃ¡c cÃ´ng viá»‡c sau Ä‘Ã¢y: 
1. Nháº­p thÃ´ng tin vÃ  táº¡o N Ä‘á»‘i tÆ°á»£ng xe 
2. Xuáº¥t báº£ng kÃª khai tiá»�n thuáº¿ trÆ°á»›c báº¡ cá»§a cÃ¡c xe. 
3. ThoÃ¡t. 

 */
public class Ex01 {   
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n=0;
		Vehicle a[]= null;
        do{
        	System.out.println("1.Nháº­p thÃ´ng tin vÃ  táº¡o N Ä‘á»‘i tÆ°á»£ng xe" );
        	System.out.println("2. Xuáº¥t báº£ng kÃª khai tiá»�n thuáº¿ trÆ°á»›c báº¡ cá»§a cÃ¡c xe.");
            System.out.println("3. ThoÃ¡t. ");
            int cv;
            cv =sc.nextInt();
            switch (cv){
                case 1:
                    System.out.print("Nháº­p n: ");
                    n=sc.nextInt();
                    a= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nháº­p xe thá»© " + (i+1));
                        a[i] = new Vehicle();
                        nhapXe(a[i]);
                    }
                    break;
                case 2:
                	System.out.printf(" %-25s  %-25s  %-25s  %-25s  %-25s\n","Chá»§ xe","Loáº¡i xe","Dung tÃ­ch","Trá»‹ giÃ¡","Thuáº¿");
                    System.out.println("========================================================================================================================");
                    for (int i = 0; i<n; i++) {
                        System.out.printf(" %-25s  %-25s  %-25s  %-25s  %-25s\n",a[i].getOwnerName(),a[i].getBrand(),a[i].getCapacity(),a[i].getValue(),a[i].duty());
                    }
                    break;
                case 3:
                    System.out.println("thoÃ¡t!!!!");
                    return;   
            }
        }while (true);
	}
    static void nhapXe(Vehicle vec){
    	  	sc.nextLine();
            System.out.print("Nháº­p tÃªn chá»§ xe: ");
            vec.setOwnerName(sc.nextLine());
            System.out.print("Loáº¡i xe: ");
            vec.setBrand(sc.nextLine());
            System.out.print("Nháº­p dung tÃ­ch xe: ");
            vec.setCapacity(sc.nextInt());
            System.out.print("Nháº­p trá»‹ giÃ¡ xe: ");
            vec.setValue(sc.nextDouble());
            
        }
}
