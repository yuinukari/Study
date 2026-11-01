| ログID | ログレベル | 出力タイミング | ログメッセージ例 | 出力先 | 備考 |
| :---: | :---: | :--- | :--- | :--- | :--- |
| **LOG-001** | DEBUG | 1. 顧客検索開始<br>CustomerRepository.findById 呼び出し時 | [DEBUG] CustomerRepository - 顧客検索開始: customerId={} | アプリケーションログ | 開発・デバッグ時の追跡用ログ。 |
| **LOG-002** | DEBUG | 2. 顧客検索成功<br>顧客レコードがDBから正常に見つかった時 | [DEBUG] CustomerRepository - 顧客検索成功: customerId={}, companyName={} | アプリケーションログ | 取得されたオブジェクトの状態を確認するためのログ。 |
| **LOG-003** | WARN | 3. 顧客検索失敗<br>顧客が見つからずリポジトリが null を返す時 | [WARN] CustomerRepository - 顧客検索失敗: customerId={} に対する顧客データが存在しません | アプリケーションログ | リポジトリ層でのnull返却自体はシステム中断ではないためWARN扱い。 |
| **LOG-004** | INFO | 4. 請求書生成開始<br>InvoiceService.generateInvoice 呼び出し時 | [INFO] InvoiceService - 請求書生成開始: customerId={}, 明細件数={} | アプリケーションログ | 業務イベントの開始を記録するための通常ログ。 |
| **LOG-005** | INFO | 5. 請求書生成完了<br>計算処理および税計算が正常に完了した時 | [INFO] InvoiceService - 請求書生成完了: customerId={}, 税別合計={}円, 税込合計={}円 | アプリケーションログ | 正常終了した金額結果を監査用に記録するログ。 |
| **LOG-006** | ERROR | 6. 例外発生<br>顧客がnullで処理が中断（例外発生）した時 | [ERROR] InvoiceService - 請求書生成エラー: 顧客が見つかりません：{} | エラーログ | IllegalArgumentException 発生により処理が異常終了したことを示すログ。 |
