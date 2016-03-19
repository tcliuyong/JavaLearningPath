package SpringBatch.processor;

import SpringBatch.model.CreditBill;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by liuyong on 2016/3/19.
 */
public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill>{
    public CreditBill process(CreditBill creditBill) throws Exception {
        System.out.println(creditBill.toString());
        return creditBill;
    }
}

