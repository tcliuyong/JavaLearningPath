package UtilTools.services;

import UtilTools.beans.Account;

/**
 * Created by liuyong on 16-1-27.
 */
public class SynCompany  implements Runnable{
    private Account account;

    public SynCompany(Account account) {
        this.account = account;
    }

    public void run() {
        for(int i = 0; i < 100; i++){
            account.addAccount(1000);
        }
    }
}
