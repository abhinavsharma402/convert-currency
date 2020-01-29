package com.knoldus;

import java.util.Scanner;

public class ConvertDriver {
    public static void main(String[] args){
        ConvertCurrency cc=new ConvertCurrency();
        System.out.println("press 1 for convert rupee into dollar");
        System.out.println("press 2 for convert rupee into yuro");
        System.out.println("press 3 for convert rupee into poundsterling");
        System.out.println("press 4 for convert rupee into yen");
        System.out.println("press 5 for convert rupee into ringgit");
        System.out.println("press 6 for convert rupee into sgd");
        System.out.println("press 7 for convert rupee into aud");
        System.out.println("press 8 for convert rupee into cad");
        System.out.println("press 9 for convert rupee into kwd");
        System.out.println("press 10 for convert rupee into qar");
        Scanner sc=new Scanner(System.in);
        int currencychoser=sc.nextInt();
        
        switch (currencychoser){
            case 1: System.out.println("how many rupees you want to convert");
                    int amount= sc.nextInt();
                   double dollar= cc.convertRupeesIntoDollar(amount);
                System.out.println(amount +"rupee converted into"+dollar+"dollar");
                    break;
            case 2: System.out.println("how many rupees you want to convert");
                amount = sc.nextInt();
                double euro= cc.convertRupeesIntoEuro(amount);
                System.out.println(amount +"rupee converted into"+euro+"euro");
                break;
            case 3: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double poundSterling=  cc.convertRupeesIntoPoundSterling(amount);
                System.out.println(amount +"rupee converted into5"+poundSterling+"poundsterling");
                break;
            case 4: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double yen=  cc.convertRupeesIntoYen(amount);
                System.out.println(amount +"rupee converted into"+yen+"yen");
                break;
            case 5: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double ringgit=  cc.convertRupeesIntoRinggit(amount);
                System.out.println(amount +"rupee converted into"+ringgit+"ringgit");
                break;
            case 6: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double sgd= cc.convertRupeesIntoSgd(amount);
                System.out.println(amount +"rupee converted into"+sgd+"sgd");
                break;
            case 7: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double aud= cc.convertRupeesIntoAud(amount);
                System.out.println(amount +"rupee converted into"+aud+"aud");
                break;
            case 8: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double cad= cc.convertRupeesIntoCad(amount);
                System.out.println(amount +"rupee converted into"+cad+"cad");
                break;
            case 9: System.out.println("how many rupees you want to convert");
                 amount= sc.nextInt();
                double kwd= cc.convertRupeesIntoKwd(amount);
                System.out.println(amount +"rupee converted into"+kwd+"kwd");
                break;
            case 10: System.out.println("how many rupees you want to convert");
                amount= sc.nextInt();
                double qar= cc.convertRupeesIntoQar(amount);
                System.out.println(amount +"rupee converted into"+qar+"qar");
                break;
             default:System.out.println("invalid");

        }
    }
}
