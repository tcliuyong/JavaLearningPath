package UtilTools.services;

import UtilTools.beans.Account;

/**
 * Created by liuyong on 16-1-27.
 */
public class SynBank  implements  Runnable{

    public Account account;

    public SynBank(Account account) {
        this.account = account;
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            account.subAccount(1000);
        }
    }
}
