CREATE TABLE IF NOT EXISTS web_returns (
    wr_returned_date_sk bigint,
    wr_returned_time_sk bigint,
    wr_item_sk bigint,
    wr_refunded_customer_sk bigint,
    wr_refunded_cdemo_sk bigint,
    wr_refunded_hdemo_sk bigint,
    wr_refunded_addr_sk bigint,
    wr_returning_customer_sk bigint,
    wr_returning_cdemo_sk bigint,
    wr_returning_hdemo_sk bigint,
    wr_returning_addr_sk bigint,
    wr_web_page_sk bigint,
    wr_reason_sk bigint,
    wr_order_number bigint,
    wr_return_quantity integer,
    wr_return_amt decimalv3(7,2),
    wr_return_tax decimalv3(7,2),
    wr_return_amt_inc_tax decimalv3(7,2),
    wr_fee decimalv3(7,2),
    wr_return_ship_cost decimalv3(7,2),
    wr_refunded_cash decimalv3(7,2),
    wr_reversed_charge decimalv3(7,2),
    wr_account_credit decimalv3(7,2),
    wr_net_loss decimalv3(7,2)
)
DUPLICATE KEY(wr_returned_date_sk, wr_returned_time_sk, wr_item_sk, wr_refunded_customer_sk)
DISTRIBUTED BY HASH(wr_refunded_customer_sk) BUCKETS 3
PROPERTIES (
  "replication_num" = "1"
)
