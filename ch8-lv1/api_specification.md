# 顧客注文履歴システム REST API仕様書

## 1. APIエンドポイント一覧

| # | 操作 | エンドポイント | HTTPメソッド | 説明 |
| :-: | :--- | :--- | :---: | :--- |
| 1 | 顧客登録 | /api/customers | POST | 新規顧客（Customer）をシステムに登録する。 |
| 2 | 顧客取得（ID指定） | /api/customers/{id} | GET | 指定された顧客IDに一致する顧客情報を取得する。 |
| 3 | 注文登録 | /api/orders | POST | 新しい注文レコード（OrderRecord）を登録する。 |
| 4 | 注文履歴取得（顧客ID指定） | /api/customers/{id}/orders | GET | 特定の顧客IDに紐づく過去の注文履歴一覧を取得する。 |
| 5 | 合計金額取得（顧客ID指定） | /api/customers/{id}/orders/total | GET | 特定の顧客がこれまでにおこなった注文の合計金額を取得する。 |

---

## 2. 各エンドポイントの詳細仕様

### 1. 顧客登録
* **エンドポイント：** `/api/customers`
* **HTTPメソッド：** `POST`
* **説明：** 新規顧客を登録します。

#### リクエストボディ（JSON）
```json
{
  "customerId": "C001",
  "customerName": "山田 太郎",
  "email": "yamada@example.com"
}
```

#### レスポンスボディ（JSON）
* 登録成功時、登録された顧客オブジェクトをそのまま返却します。
```json
{
  "customerId": "C001",
  "customerName": "山田 太郎",
  "email": "yamada@example.com"
}
```

#### HTTPステータスコード
* `201 Created`: 登録成功
* `400 Bad Request`: 入力値不正（必須項目の漏れ、重複など）
* `500 Internal Server Error`: サーバー内部エラー

---

### 2. 顧客取得（ID指定）
* **エンドポイント：** `/api/customers/{id}`
* **HTTPメソッド：** `GET`
* **説明：** 指定された顧客IDに一致する顧客情報を取得します。

#### リクエストパラメータ
* **パスパラメータ：** `id` (String、必須) - 検索対象の顧客ID

#### レスポンスボディ（JSON）
```json
{
  "customerId": "C001",
  "customerName": "山田 太郎",
  "email": "yamada@example.com"
}
```

#### HTTPステータスコード
* `200 OK`: 取得成功
* `404 Not Found`: 対象の顧客IDが存在しない
* `500 Internal Server Error`: サーバー内部エラー

---

### 3. 注文登録
* **エンドポイント：** `/api/orders`
* **HTTPメソッド：** `POST`
* **説明：** 新しい注文レコードを登録します。

#### リクエストボディ（JSON）
```json
{
  "orderId": "ORD-001",
  "customerId": "C001",
  "productName": "ノートPC",
  "amount": 120000
}
```

#### レスポンスボディ（JSON）
* 登録成功時、登録された注文オブジェクトをそのまま返却します。
```json
{
  "orderId": "ORD-001",
  "customerId": "C001",
  "productName": "ノートPC",
  "amount": 120000
}
```

#### HTTPステータスコード
* `201 Created`: 登録成功
* `400 Bad Request`: 入力値不正（金額がマイナス、または必須項目の漏れ）
* `404 Not Found`: 紐づく顧客ID（customerId）が顧客マスタに存在しない
* `500 Internal Server Error`: サーバー内部エラー

---

### 4. 注文履歴取得（顧客ID指定）
* **エンドポイント：** `/api/customers/{id}/orders`
* **HTTPメソッド：** `GET`
* **説明：** 特定の顧客IDに紐づく過去の注文履歴一覧を取得します。

#### リクエストパラメータ
* **パスパラメータ：** `id` (String、必須) - 履歴を確認したい顧客ID

#### レスポンスボディ（JSON）
```json
[
  {
    "orderId": "ORD-001",
    "customerId": "C001",
    "productName": "ノートPC",
    "amount": 120000
  },
  {
    "orderId": "ORD-002",
    "customerId": "C001",
    "productName": "マウス",
    "amount": 3500
  }
]
```

#### HTTPステータスコード
* `200 OK`: 取得成功（履歴が0件の場合も空の配列 `[]` を伴い 200 を返却）
* `404 Not Found`: 顧客ID自体がシステムに存在しない
* `500 Internal Server Error`: サーバー内部エラー

---

### 5. 合計金額取得（顧客ID指定）
* **エンドポイント：** `/api/customers/{id}/orders/total`
* **HTTPメソッド：** `GET`
* **説明：** 特定の顧客IDがこれまでにおこなった注文の合計金額を取得します。

#### リクエストパラメータ
* **パスパラメータ：** `id` (String、必須) - 集計対象の顧客ID

#### レスポンスボディ（JSON）
```json
{
  "customerId": "C001",
  "totalAmount": 123500
}
```

#### HTTPステータスコード
* `200 OK`: 集計成功
* `404 Not Found`: 顧客ID自体がシステムに存在しない
* `500 Internal Server Error`: サーバー内部エラー
