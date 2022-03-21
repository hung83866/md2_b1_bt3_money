package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 là đổi sang usd, 2 đổi sang vnd");
        int a = scanner.nextInt();
        switch (a){
            case 1:
                System.out.println("nhập số tiền cần đổi");
                double money = scanner.nextDouble();
                double usd = money/23000;
                System.out.println("USD ="+usd);
                break;
            case 2:
                System.out.println("nhập số tiền cần đổi");
                double money1 = scanner.nextDouble();
                double vnd = money1*23000;;
                System.out.println("VND = "+vnd);
                break;
            default:
                System.out.println("lựa chọn khác đi bro 1 hoặc 2 thôi");
                break;
        }
    }
}
