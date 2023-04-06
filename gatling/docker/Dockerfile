FROM eclipse-temurin:17.0.6_10-jdk

RUN apt update -y \
    && apt upgrade -y \
    && apt install -y wget zip

WORKDIR /workspace

RUN wget -q https://repo1.maven.org/maven2/io/gatling/highcharts/gatling-charts-highcharts-bundle/3.9.3/gatling-charts-highcharts-bundle-3.9.3-bundle.zip \
    && unzip gatling-charts-highcharts-bundle-3.9.3-bundle.zip

ENV GATLING_HOME=/workspace/gatling-charts-highcharts-bundle-3.9.3
RUN ln -s /workspace/gatling-charts-highcharts-bundle-3.9.3/bin/gatling.sh /usr/local/bin/gatling