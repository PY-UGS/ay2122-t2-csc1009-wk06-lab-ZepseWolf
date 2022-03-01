package week6;

import java.util.Date;
import java.util.LinkedList;

public class Random {
    public static void main(String[] args) {
        LinkedList<Integer> list =  new LinkedList<Integer>();
        generateRandom(500 ,list );
        LinkedList<Integer> list2 =  new LinkedList<Integer>();
        generateRandom(1 ,list2 );
        int count = 0;
        boolean found = false;
        for(int i : list){
            if(i == list2.get(0)){
                found = true;
                System.out.println(count);
                break;
            }
            count++;
        }

        if(!found){
            System.out.println(-1);
        }

    }
    public static void generateRandom (int num, LinkedList<Integer> list){
        Date date = new Date();
        double randomNum = date.getTime();

        randomNum %= 503;
        for(int i =0 ; i<1021;i++){
            if(i%2 == 0 ){
                randomNum = randomNum*(num+533+i);
            }else{
                randomNum = randomNum%(num+533+i);
            }
        }
        //Make number bigger
        randomNum*=507;
        double c = randomNum;
        for (int i =0 ; i<=(num*2);i++){
            if(i%2 == 0 ){
                c = randomNum*(1007+i);
            }else{
                c = randomNum%(1007+i);
                if(c != 0){
                    String x = Double.toString(c*104729);
                    if(x.charAt(1) == '.'){
                        if(x.charAt(2) == '0' ){
                            list.add(Integer.valueOf(String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))));

                        }else{
                            if(x.charAt(2) == '0' && x.charAt(3) == '0' ){
                                list.add(Integer.valueOf(String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))+String.valueOf(x.charAt(7))));
                            }else{
                                list.add(Integer.valueOf(String.valueOf(x.charAt(2))+String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))));
                            }
                        }

                    }else {
                        if(x.charAt(2) == '0' ){
                            list.add(Integer.valueOf(String.valueOf(x.charAt(2))+String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))));

                        }else{
                            if(x.charAt(2) == '0' && x.charAt(3) == '0' ){
                                list.add(Integer.valueOf(String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))));
                            }else{
                                list.add(Integer.valueOf(String.valueOf(x.charAt(1)) + String.valueOf(x.charAt(2)) + String.valueOf(x.charAt(3)) + String.valueOf(x.charAt(4))));
                            }
                        }
                    }
                }else{
                    list.add(1000);
                }
            }
        }
    }
}
