# Apache Spark Demos

## Teaching resource to help people learn Apache Spark

### Set up basic Spark env to run a Hello World program
1) Install Docker
2) Pull Bitnami Docker image
`docker pull bitnami/spark:3.3.1`
3) Build application
```shell
cd /path/to/project/
mvn clean package
```
4) Run the Hello World application

```shell
docker run -it -v /home/john/IdeaProjects/personal/ApacheSparkDemos/target:/opt/bitnami/spark/app bitnami/spark:3.3.1 \
  spark-submit --name 'HelloWorld' \
  --class org.spark.demos.HelloWorld \
  app/ApacheSparkDemos-1.0-SNAPSHOT.jar
```
