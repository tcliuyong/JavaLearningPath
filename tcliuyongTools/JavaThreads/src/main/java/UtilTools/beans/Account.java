package UtilTools.beans;

import UtilTools.services.ThreadGroupTask;

/**
 * Created by liuyong on 16-1-27.
 */
public class Account {
    private double balance;

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(balance);
        return (int) (temp ^ (temp >>> 32));
    }

    public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public synchronized void addAccount(double balance){
        double tmp = balance;
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        tmp += balance;
        balance = tmp;
    }

    public synchronized void subAccount(double balance){
        double tmp = balance;
        try{
            Thread.sleep(10);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        tmp -= balance;
        balance = tmp;
    }
}
