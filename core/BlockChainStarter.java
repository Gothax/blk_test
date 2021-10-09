package core;

import util.Util;

public class BlockChainStarter {
    public static void main(String[] args){
        int nonce=0;
        while(true){
            if(Util.getHash(nonce+"").substring(0,6).equals("000000")){  
                System.out.println("complete: "+nonce);
                System.out.println("해시값: "+Util.getHash(nonce+""));
                break;
            }
            nonce++;
        }
    }
}