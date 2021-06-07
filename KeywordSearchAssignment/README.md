Run the application as a Spark job with “spark-submit”

spark-submit --class com.sample.sparktest.KeywordSearch  --master local[2] /home/cloudera/keyword_search-1.0-SNAPSHOT.jar hdfs://quickstart.cloudera:8020/user/cloudera/my-data Christmas
 