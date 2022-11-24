# Playground

Pure functional http apis in scala


## init db

```sh
docker volume create db_doobie-vol
docker run \
  --name db_doobie \
  -e POSTGRES_PASSWORD=mysecretpassword \
  -e POSTGRES_USER=postgres \
  -e PGDATA=/home/postgres/data \
  -p 5432:5432 \
  -d \
  --mount source=db_doobie-vol,target=/home/postgres/data \
  postgis/postgis:15-3.3
```
