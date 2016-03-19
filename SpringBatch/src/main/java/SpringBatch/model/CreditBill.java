package SpringBatch.model;

/**
 * Created by liuyong on 2016/3/19.
 */

//定义领域对象
public class CreditBill {
    private String accountID = ""; // 银行卡账户
    private String name; //持卡人签名
    private double amount = 0;//消费金额
    private String date;//消费日期
    private String address;// 消费场所

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "CreditBill{" +
                "accountID='" + accountID + '\'' +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                ", date='" + date + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
