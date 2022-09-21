/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21stringeditor;

import java.util.Scanner;

/**
 *
 * @author Anatoli
 */
public class SPTV21StringEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your text: ");

        String str = scanner.nextLine();
        do{
            System.out.println("Функции программы");
            System.out.println("0 Выйти из программы");
            System.out.println("1 Посчитать количество символов в строке");
            System.out.println("2 Посчитать количество слов в строке");
            System.out.println("3 Найти подстроку в строке");
            System.out.println("4 Заменить указанную подстроку новой строкой");
            System.out.println("5 Показать текст");
            System.out.println("Выберите номер функции: ");
            int numFunc = scanner.nextInt();
            scanner.nextLine();
            if(numFunc == 0){
                break;
            }else if(numFunc == 1){
                System.out.println("Вы выбрали пункт "+numFunc);
                int countCharInStr=0;
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if(chars[i] != ' '){
                        countCharInStr++;
                    }
                }
                System.out.println("В строке "+countCharInStr+" символов");
            }else if(numFunc == 2){
                System.out.println("Вы выбрали пункт "+numFunc);
                int wordsCount = "1215     544      965".split(" +").length;
                System.out.println("В строке "+wordsCount+" слов");
            }else if(numFunc == 3){
                System.out.println("Вы выбрали пункт "+numFunc);
                System.out.println("Введите искомую строку :");
                String findStr = scanner.nextLine();
                int index = str.indexOf(findStr);
                if(index<0){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    index++;
                System.out.println("Искомая строка находится на "+index+" позиция");
                }
            }else if(numFunc == 4){
                System.out.println("Вы выбрали пункт "+numFunc);
                System.out.println("Введите заменяемную строку: ");
                String removeString = scanner.nextLine();
                String newStr;
                int index = 0;
                if(index < 0){
                    System.out.println("Такой строки в тексте нет");
                }else{
                    System.out.println("На какую строку заменить: ");
                    newStr = scanner.nextLine();
                    System.out.println("Измененная строка выглядит так: ");
                    System.out.println(str.replace(removeString, newStr));
                }
            }else if(numFunc == 5){
                System.out.println("My text: "+str); 
            } 
                    
            System.out.println("+++++++++++++++++++++++++");
        }while(true);
        
    }
    
}