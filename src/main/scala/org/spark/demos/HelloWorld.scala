package org.spark.demos

import org.apache.spark.sql.SparkSession

object HelloWorld {

  def main(args: Array[String]): Unit = {

    val spark: SparkSession = SparkSession.builder()
      .master("local[1]")
      .appName("Hello World")
      .getOrCreate()

    import spark.implicits._

    val df = spark.sparkContext.parallelize(Seq(("Hello", "World"))).toDF()
    println(df.show())

  }
}
