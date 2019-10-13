package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Main {
//    В задании нельзя использовать циклы for и for each. Только while и Iterator
//    Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//    Затем программа должна отобразить этот список
//    Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//    Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//    После объединения отобразить в консоли список С
//    В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов, и распечатать отсортированный список С.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        System.out.println(" Введите 1 строчку из списка А");
        a.add(scanner.nextLine());
        System.out.println(" Введите 2 строчку из списка А");
        a.add(scanner.nextLine());
        System.out.println(" Введите 3 строчку из списка А");
        a.add(scanner.nextLine());
        System.out.println(" Введите 4 строчку из списка А");
        a.add(scanner.nextLine());
        System.out.println(" Введите 5 строчку из списка А");
        a.add(scanner.nextLine());
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            String s = (String) iterator.next();
            System.out.println(s);
        }
        ArrayList<String> b = new ArrayList<>();
        System.out.println(" Введите 1 строчку из списка Б");
        b.add(scanner.nextLine());
        System.out.println(" Введите 2 строчку из списка Б");
        b.add(scanner.nextLine());
        System.out.println(" Введите 3 строчку из списка Б");
        b.add(scanner.nextLine());
        System.out.println(" Введите 4 строчку из списка Б");
        b.add(scanner.nextLine());
        System.out.println(" Введите 5 строчку из списка Б");
        b.add(scanner.nextLine());
        iterator = b.iterator();
        while (iterator.hasNext()) {
            String v = (String) iterator.next();
            System.out.println(v);
        }
        System.out.println("________________________");
        ArrayList<String> c = new ArrayList<>();
        c.add(a.get(0));
        c.add(b.get(4));
        c.add(a.get(1));
        c.add(b.get(3));
        c.add(a.get(2));
        c.add(b.get(2));
        c.add(a.get(3));
        c.add(b.get(1));
        c.add(a.get(4));
        c.add(b.get(0));
        iterator = c.iterator();
        while (iterator.hasNext()) {
            String g = (String) iterator.next();
            System.out.println(g);
        }
        Collections.sort(c, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                if (s.length() < t1.length())
                    return -1;
                else {
                    return 1;
                }

            }
        });
        System.out.println(c);
    }
}
