# Store

## Local MySQL

Start MySQL from the project root:

```sh
podman compose up -d mysql
podman compose ps
```

You can also use `docker compose` in place of `podman compose`.
The service uses the [official MySQL 8.4 image](https://hub.docker.com/_/mysql).

Default connection details for IntelliJ, DataGrip, or a locally running application:

| Setting | Value |
| --- | --- |
| Host | `127.0.0.1` |
| Port | `3306` |
| Database | `store` |
| Username | `store` |
| Password | `store_local_password` |
| JDBC URL | `jdbc:mysql://127.0.0.1:3306/store` |

The root password defaults to `root_local_password`. These passwords are for local development.
Override the `MYSQL_DATABASE`, `MYSQL_USER`, `MYSQL_PASSWORD`, `MYSQL_ROOT_PASSWORD`, or `MYSQL_PORT` environment variables before starting if needed. For example, if port 3306 is already in use:

```sh
MYSQL_PORT=3307 podman compose up -d mysql
```

Open a SQL shell (enter the configured user password when prompted):

```sh
podman compose exec mysql sh -c 'mysql -u "$MYSQL_USER" -p "$MYSQL_DATABASE"'
```

Stop the container:

```sh
podman compose down
```

Data persists in the `mysql_data` volume across container recreation. `podman compose down -v` deletes that data.
Database and credential environment variables initialize a new volume; changing them does not update an existing database.

The Java application currently uses `InMemoryUserRepository`. Starting this container provides a database; connecting the application requires a MySQL driver and a database-backed repository.
