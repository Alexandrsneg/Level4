package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        ArrayList<String> app = new ArrayList<String>();

        // разбивка строки на отдельные слова, заполнение ими списка
        for (String retval: s.split(" ")){
            app.add(retval);
        }
        //сортировка и вывод списка app построчно на экран
        Collections.sort(app);

        //клонирование значений списка app в переменную appClone
        for (int i = 0; i < app.size(); i++) {
            String appClone = app.get(i);
            //System.out.println(appClone);

            if (!map.containsKey(appClone)) {
                map.put(appClone, 1);
            } else {
                map.put(appClone, map.get(appClone) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

