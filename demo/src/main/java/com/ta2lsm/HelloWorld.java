//--- BOLUM 1.3 (16.04.2022 / Semih SENOL) ---
package com.ta2lsm;

import java.util.*;
//import java.awt.*;
import java.text.*;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
  
/**
 * JAVA uygulamasına ait ana class
 */
public final class HelloWorld {
    /**
     * Uygulamaya özgü dışarıdan erişilemeyecek kodlar
     */
    private HelloWorld() {
        //...
    }

    /**
     * Buraya yazılanlar ilgili metodun açıklamaları olarak gözükecektir.
     * @param args The arguments of the program.
     */
     public static void main(String[] args) {  
 
        //--- KARSILASTIRMA OPERATORLERI -----------------------
        // int x = 2;
        // int y = 1;

        //System.out.println(x == y);    // x = 1 ve y = 1 ise true basılır
        // x > y, x < y, x >= y, x >= y şeklinde varyasyonlar aynı C'deki gibi burada da aynı
    
        // if(x != y)  System.out.println("x != y");
        // else    System.out.println("x = y");
        //------------------------------------------------------

        //--- LOJİK OPERATORLER --------------------------------
        // int x = 2;
        // int y = 1;
        // int z = 3;
        // int w;
    
        // w = y | 0xF0;   // w = 241
        // w &= 0x0F;      // w = 1
        
        // w = z | 0xAA;   // w = 171
        // w &= ~0x0F;     // w = 160
        // System.out.println( ( (x > y) && (x < z) ) || (y > x) );
        // System.out.println(w);
        //------------------------------------------------------

        //--- IF IFADESI ---------------------------------------
        // final byte TEMP_HOT = 30;
        // final byte TEMP_COLD = 20;

        // Scanner keyInput = new Scanner(System.in);
        // System.out.print("Sicakligi giriniz: ");
        // float temperature = keyInput.nextFloat();
        // keyInput.close();

        // if(temperature > TEMP_HOT)
        //     System.out.printf("It's a hot day%nDrint plenty of water.");
        // else if(temperature > TEMP_COLD)
        //     System.out.println("It's a nice day!");
        // else
        //     System.out.println("It's cold...");

        // Aşağıdaki kod sadece gösterme amaçlıdır...
        // Aynı C++'daki gibi değişkenler sadece { ... } kod bloğu içinde tanımlanabilir.
        // int x = 34;
        // if ( x > 10 )
        // {
        //     boolean isBig = true;
        //     System.out.println(isBig);
        // }
        // else
        // {
        //     boolean isBig = false;
        //     System.out.println(isBig);
        // }   
        // //System.out.println(isBig);
        // // burada isBig'e erişilemez. Çünkü {} arasında tanımlama yapıldı ve kod işleyişi 
        // // oradan çıkınca artık isBig tanımsız olacaktır. isBig 

        // int x = 34;
        // // boolean isBig = (x > 10)? true: false; // aşağıdaki d eyeterli olacaktır
        // boolean isBig = (x > 10);
        // System.out.println(isBig);
        //------------------------------------------------------

        //--- TERNARY OPERATORU -------------------------------- 
        // int income = 120_000;
        // String className;

        // className = (income >= 100_000)? "First": "Economy";
        // System.out.println(className);   
        //------------------------------------------------------

        //--- SWITCH IFADESI -----------------------------------
        // String role = "who?";

        // // role, parantez içinde yazılmalı !!!
        // switch (role) {
        //     case "admin": {
        //         System.out.println("You're an admin");
        //         break;
        //     }
        //     case "moderator": {
        //         System.out.println("You're a moderator");
        //         break;               
        //     }
        //     case "guest": {
        //         System.out.println("You're a guest");
        //         break; 
        //     }
        //     default: {
        //         System.out.println("You're an unidentified user!");
        //         //break; 
        //     }
        // }
        //------------------------------------------------------

        //--- 1.3. EXERCISE: FIZZBUZZ --------------------------
        // Scanner keyInput = new Scanner(System.in);
        // System.out.printf("5'e bolunen sayilarda \"Fizz\",%n3'e bolunen sayilarda \"Buzz\", %nikisine de bolunen sayilarda \"FizzBuzz\" yazdirilacaktir...%n");
        // System.out.print("Tam sayi giriniz: ");
        // int number = keyInput.nextInt();
        // keyInput.close();        
        
        // String result;

        // // flat şekilde yazılmış. Daha rahat okunur ve anlaşılır. 
        // // if( (number % 5) == 0 && (number % 3) == 0 )
        // //     result = "FizzBuzz";
        // // else if( (number % 5) == 0 )
        // //     result = "Fizz";
        // // else if( (number % 3) == 0 )
        // //     result = "Buzz";
        // // else 
        // //     result = "None of them! (" + number + ")";

        // // nested şekilde yazılmış. Tekrar eden öbekler yok ama iç içe geçmeler var.
        // if( (number % 5) == 0 )
        // {
        //     if( (number % 3) == 0 )
        //         result = "FizzBuzz";
        //     else
        //         result = "Fizz";
        // }
        // else if( (number % 3) == 0 )
        //     result = "Buzz";
        // else 
        //     result = "None of them! (" + number + ")";

        // System.out.printf("Sonuc: %s", result);
        //------------------------------------------------------

        //--- FOR / WHLIE DONGULERI ----------------------------
        // for(byte i = 0; i < 5; ++i)
        //     System.out.println("Hello World! " + i);

        // byte i = 10;
        // while( i > 0 )
        // {
        //     if( i == 5)
        //         System.out.println("Oh yeah!");
        //     else
        //         System.out.println("Hello World! " + i);

        //     if(--i == 1)    
        //         break;
        // }
        
        // String input = "";
        // Scanner keyInput = new Scanner(System.in);
        // System.out.printf("Cikmak icin \"quit\" yaziniz...%n");
        // // Önce koşula bakılır buna göre çalıştırılıp çalıştırılmayacağına karar verilir.
        // while( !input.equals("quit") )
        // {
        //     System.out.print("Input: ");
        //     input = keyInput.nextLine().toLowerCase().replace("ı", "i");
        //     // QUIT yazılsa bile > quıt > quit olacak...
        // }
        // keyInput.close();
        
        // Mutlaka 1 kere çalıştırılır sonra koşula bakılır. C'deki gibi.
        // Koşul uymasa da aşağıdaki kod 1 kere eçalışacaktır.
        // byte i = 1;
        // do {
        //     System.out.println("Hello World! " + i);
        //     ++i;
        // }while (i < 1);
        //------------------------------------------------------

        //--- BREAK ve CONTINUE --------------------------------
        // String input = "";
        // Scanner keyInput = new Scanner(System.in);
        // System.out.printf("Cikmak icin \"quit\" yaziniz. Tekrar denemek icim \"pass\" yazınız...%n");
        // while( true )   // aşağıdaki eklemelerden sonra artık sonsuz döngü kullanılabilir
        // {
        //     System.out.print("Input: ");
        //     input = keyInput.nextLine().toLowerCase().replace("ı", "i");
        //     // QUIT yazılsa bile > quıt > quit olacak...
            
        //     if( input.equals("pass") )
        //     {
        //         System.out.println("Yeniden deneyiniz...");
        //         continue;
        //     }

        //     if( input.equals("quit") )
        //         break;      // bir dış döngüyü kırar. C'deki gibi.
            
        //     System.out.println(input);
        // }
        // keyInput.close();
        //------------------------------------------------------

        //--- FOR EACH DONGUSU ---------------------------------
        // String[] fruits = { "Apple", "Mango", "Orange"};

        // // foreach'e göre daha esnek işlemler yapılabilir. (i'nin başlama ve artma durumuna göre)
        // // Örneğin, burada i değişkenini tersten başlattık ama alttaki kodla aynı sonucu aldık
        // for(int i = fruits.length; i > 0 ; i--) // byte i kabul edilmiyor. int olması lazım
        //     System.out.println(fruits[fruits.length - i]);

        // // Koleksiyon ve diziler için kullanılır. (foreach olarak seçilirse otomatik olarak kalıbı geliyor)
        // for (String member : fruits) {
        //     System.out.println(member);
        // }
        // // String tipinden "member" elemanına "fruits" dizisinin her elemanı tek tek alınır ve bu değişken 
        // // üzerinden işlem yapılabilir. Her zaman baştan başlar ve ileri doğru çalışır.
        //------------------------------------------------------

        //--- 1.2. BOLUM PROJESI (DEĞİŞİKLİK) ------------------ (hatalı veri girişlerini tespit eden kod)

        //--- Semih SENOL'un çözümü --- (tek while döngüsü ile. Kursta 3 while döngüsü kullanılmış)
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT_DIVIDER = 100;
        final int MIN_PRINCIPAL = 1_000;
        final int MAX_PRINCIPAL = 1_000_000;
        final float MIN_ANNUAL_RATE = 0F;
        final float MAX_ANNUAL_RATE = 30F;
        final byte MIN_YEAR = 1;
        final byte MAX_YEAR = 30;

        int principal = 0;
        float rate = 0;
        int months = 0;
        byte errorLevel = 0;

        Scanner keyboardInput = new Scanner(System.in);
        while( true )
        {
            if( errorLevel == 0 )
            {
                System.out.print("Principal ($1K - $1M): ");     // yıllık kazanç (100000)
                principal = keyboardInput.nextInt();
                
                if( principal < MIN_PRINCIPAL || principal > MAX_PRINCIPAL )
                {
                    System.out.println("Enter a number between 1.000 and 1.000.000");
                    continue;
                }
                else
                    errorLevel = 1;
            }
            else if( errorLevel == 1 )
            {
                System.out.print("Annual Interest Rate: ");     // kredi faizi (3.92)
                rate = keyboardInput.nextFloat();
                // Kursta bu kısmı aşağıdaki gibi yazmış:
                // float rate = keyboardInput.nextFloat() / PERCENT_DIVIDER / MONTHS_IN_YEAR;

                if( rate > MIN_ANNUAL_RATE && rate <= MAX_ANNUAL_RATE )
                {
                    rate /= ((float)MONTHS_IN_YEAR * (float)PERCENT_DIVIDER);  // monthly interest
                    errorLevel = 2;
                }
                else
                {
                    System.out.println("Enter a value greater than 0 and less than or equal to 30");
                    continue;
                }
            }
            else if( errorLevel == 2 )
            {
                System.out.print("Period (Years): ");           // kredi geri ödeme süresi (30 yıl ama ay olarak kullanılacak)
                int year = keyboardInput.nextInt();

                if( year > MIN_YEAR && year <= MAX_YEAR )
                {
                    months = year * MONTHS_IN_YEAR;
                    errorLevel = 3;
                }
                else
                {
                    System.out.println("Enter a value greater or equal to 1 and less than or equal to 30");
                    continue;
                }
            }
            else if( errorLevel > 2 )
                break;
        }
        keyboardInput.close();

        /** MORTGAGE HESABI
         * mortgage = principal * ( (rate x (1 + rate)^n) /  (1 + rate)^n - 1)
         * months: number of payments (Period * 12)
         * rate: Annual Interest Rate / (12 * 100)
         */

        // kursta aşağıdaki gibi yazıldı:
        // double mortgage = principal 
        //             * ( rate * (Math.pow((1 + rate), months)) )
        //             / ( Math.pow((1 + rate), months) - 1.0F );
              
        // aylık ödemelerin hesaplanması (mortgage)
        double mortgage = rate * (Math.pow((1 + rate), months));
        mortgage /= ( Math.pow((1 + rate), months) - 1.0F );
        mortgage *= principal;

        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.printf("Mortgage: %s", currency.format(mortgage));
        //------------------------------------------------------        
    }

    //...
}
