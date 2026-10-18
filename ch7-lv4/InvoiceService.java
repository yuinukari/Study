public class InvoiceService {

    public void generateInvoice(String customerId, InvoiceItem[] items) {
        // 顧客情報を取得し、明細・合計・消費税を含む請求書を発行する
        // 合計金額 = 各明細の（数量 × 単価）の合計
        // 消費税（10%）= 合計金額 × 0.1
        // 税込合計 = 合計金額 + 消費税
    }
}