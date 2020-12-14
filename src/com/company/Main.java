package com.company;

import java.util.*;

public class Main {
//    (Дэдлайн 14.12.2020 23:59)
//    a)  В задании нельзя использовать циклы for и for each. Только while и Iterator
//    b)  Написать приложение которое бы считывало сначала 5 строк которые вводит юзер и сохраняла бы их в Список А.
//    c)  Затем программа должна отобразить этот список
//    d)  Потом программа считывает еще 5 строк, которые вводит юзер и помещает их в Список Б. После также отображает его в консоли
//    e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
//    f)  После объединения отобразить в консоли список С
//    g)   В конце отсортировать элементы списка С по длине слова, сначала идут String-и с наименьшим количеством символов,
//    и распечатать отсортированный список С.
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ArrayList <String> a = new ArrayList<>();
                System.out.println(" Введите 1 строчку для списка А");
                a.add(scanner.nextLine());
                System.out.println(" Введите 2 строчку для списка А");
                a.add(scanner.nextLine());
                System.out.println(" Введите 3 строчку для списка А");
                a.add(scanner.nextLine());
                System.out.println(" Введите 4 строчку для списка А");
                a.add(scanner.nextLine());
                System.out.println(" Введите 5 строчку для списка А");
                a.add(scanner.nextLine());
                Iterator<String> interA = a.iterator();
                while (interA.hasNext()) {
                    String s = (String) interA.next();
                    System.out.println(s);
                }
                ArrayList <String> b = new ArrayList<>();
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
                Iterator<String> interB = b.iterator();
                while (interB.hasNext()) {
                    String v = (String) interB.next();
                    System.out.println(v);
                }
                System.out.println("________________________");


                ArrayList<String> c = new ArrayList<>();
                interA = a.iterator();
                interB = b.iterator();
                Collections.reverse(b);

                while (interA.hasNext()) {
                    String s = interA.next();

                    String v = interB.next();
                    c.add(s);
                    c.add(v);
                    System.out.println(s);
                    System.out.println(v);
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


