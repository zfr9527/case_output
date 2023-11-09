CREATE TABLE IF NOT EXISTS orders  (
  O_ORDERKEY       INTEGER NOT NULL,
  O_CUSTKEY        INTEGER NOT NULL,
  O_ORDERSTATUS    CHAR(1) NOT NULL,
  O_TOTALPRICE     DECIMALV3(15,2) NOT NULL,
  O_ORDERDATE      DATEV2 NOT NULL,
  O_ORDERPRIORITY  CHAR(15) NOT NULL,  
  O_CLERK          CHAR(15) NOT NULL, 
  O_SHIPPRIORITY   INTEGER NOT NULL,
  O_COMMENT        VARCHAR(79) NOT NULL
)
UNIQUE KEY(O_ORDERKEY)
DISTRIBUTED BY HASH(O_ORDERKEY) BUCKETS 1
PROPERTIES (
  "replication_num" = "1"
)

