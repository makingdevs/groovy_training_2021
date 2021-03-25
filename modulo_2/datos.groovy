@GrabConfig(systemClassLoader=true)
@Grapes(
  @Grab(group='org.postgresql', module='postgresql', version='42.2.19')
)

import groovy.sql.Sql

def sql = Sql.newInstance(user: "postgres", password: "postgres", url: "jdbc:postgresql://localhost/groovy_db")

sql.execute "drop table if exists issue;"
sql.execute """
create table if not exists issue(
  id serial primary key,
  description varchar(100),
  priority integer,
  date_created timestamp
)
"""

sql.execute """
insert into issue(description, priority, date_created) values
  ('No funciona el Login',1,now()),
  ('No hay estilo CSS',2,now()),
  ('No se puede crear el cliente',3,now()),
  ('Faltan validaciones',4,now()),
  ('No se puede acceder al menu',1,now()),
  ('No se crean facturas',2,now()),
  ('No se puede capturar emisor',3,now()),
  ('No se puede capturar receptor',4,now()),
  ('No se puede acceder al sistema',1,now());
"""
