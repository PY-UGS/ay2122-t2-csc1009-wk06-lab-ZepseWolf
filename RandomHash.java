package week6;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class RandomHash {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        generateRandom(500 ,hashMap );
        HashMap hashMap2 = new HashMap();
        generateRandom(1 ,hashMap2 );
        boolean found = false;
        for(int i =0 ; i <500 ; i++){
            if( hashMap2.containsValue(hashMap.get(i))){
                found = true;
                System.out.println(i);
                break;
            }
        }

        if(!found){
            System.out.println(-1);
        }

    }
    public static void generateRandom (int num, HashMap hashMap){
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
                            hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))));
                        }else{
                            if(x.charAt(2) == '0' && x.charAt(3) == '0' ){
                                hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))+String.valueOf(x.charAt(7))));
                            }else{
                                hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(2))+String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))));
                            }
                        }

                    }else {
                        if(x.charAt(2) == '0' ){
                            hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(2))+String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))));

                        }else{
                            if(x.charAt(2) == '0' && x.charAt(3) == '0' ){
                                hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(3))+String.valueOf(x.charAt(4))+String.valueOf(x.charAt(5))+String.valueOf(x.charAt(6))));
                            }else{
                                hashMap.put((i-1)/2, Integer.valueOf(String.valueOf(x.charAt(1)) + String.valueOf(x.charAt(2)) + String.valueOf(x.charAt(3)) + String.valueOf(x.charAt(4))));
                            }
                        }
                    }
                }else{
                    hashMap.put((i-1)/2, 1000);
                }
            }
        }
    }
}
