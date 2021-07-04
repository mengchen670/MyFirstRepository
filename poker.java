package cn.idcard.day05.sendHb;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        String[] color  = {"黑桃", "红桃", "梅花", "方片"};
        String[] values = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        ArrayList<String> poker = new ArrayList<>();
//        for (int i = 0; i < color.length; i++) {
//            for (int j = 0; j < values.length; j++) {
//                String p = color[i]+values[j];
//                poker.add(p);
//            }
//        }
        for (String s : color) {
            for (String s1 : values) {
                poker.add(s+s1);
            }
        }
        poker.add("大王");
        poker.add("小王");
        System.out.println(poker);
        System.out.println("=================洗牌=================");
        Collections.shuffle(poker);
        System.out.println(poker);
//        三个人玩
        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();
        ArrayList<String> three = new ArrayList<>();
        ArrayList<String> last = new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51){
                last.add(poker.get(i));
            }
            else if(i % 3 == 0){
                one.add(poker.get(i));
            }else if(i % 3 == 1){
                two.add(poker.get(i));
            }else if (i%3 == 2){
                three.add(poker.get(i));
            }
        }
        System.out.println(one);
        System.out.println(one.size());
        System.out.println(two);
        System.out.println(two.size());
        System.out.println(three);
        System.out.println(three.size());
        System.out.println(last);


    }
}
