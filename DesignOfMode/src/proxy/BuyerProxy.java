package proxy;

/**
 * Created by lyong.liu on 2015/11/22.
 */
public class BuyerProxy implements ITV{
    private Buyer buyer;
    public BuyerProxy(Buyer buyer){
        this.buyer = buyer;
    }
    public void buyTV() {
        perProcess();
        buyer.buyTV();
        postProcess();
    }

    private void perProcess() {
        System.out.println("send TV to home");
    }

    private void postProcess() {
        //ѯ�ʼ۸�
        System.out.println("ask for price");
    }
}
