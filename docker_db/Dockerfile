FROM mysql:8.0

COPY userlogin.sql /docker-entrypoint-initdb.d
ENV MYSQL_ROOT_PASSWORD=1005
ENV MYSQL_DATABASE=shop
ENV MYSQL_HOST=%
