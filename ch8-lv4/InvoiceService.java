public class InvoiceService {

    public void generateInvoice(String customerId, InvoiceItem[] items) {
        // 1. customerId で顧客を検索する
        Customer customer = customerRepository.findById(customerId);

        // 2. 顧客が存在しない場合は例外を投げる（修正後）
        if (customer == null) {
            throw new IllegalArgumentException("顧客が見つかりません：" + customerId);
        }

        // 3. 請求書を生成・出力する
        int total = 0;
        for (InvoiceItem item : items) {
            total += item.calcSubtotal();
        }

        // 4. 税込合計を計算する
        int tax = (int)(total * 0.1);
        int totalWithTax = total + tax;
    }
}