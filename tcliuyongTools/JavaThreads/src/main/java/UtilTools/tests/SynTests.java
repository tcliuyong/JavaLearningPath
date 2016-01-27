package UtilTools.tests;

import UtilTools.beans.Account;
import UtilTools.services.SynBank;
import UtilTools.services.SynCompany;

/**
 * Created by liuyong on 16-1-27.
 */
public class SynTests {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);
        SynCompany synCompany = new SynCompany(account);
        Thread cmyThread = new Thread(synCompany);
        SynBank synBank = new SynBank(account);
        Thread bnkThread = new Thread(synBank);
        System.out.printf("Account : Initial Balance :%f\n",account.getBalance());
        cmyThread.start();
        bnkThread.start();
        //使用join 等待二个线程完成
        try{
            cmyThread.join();
            bnkThread.join();
            System.out.printf("Account: Final Balance:%f\n",account.getBalance());
        }catch (InterruptedException e){
            e.printStackTrace();
        }


    }
}
