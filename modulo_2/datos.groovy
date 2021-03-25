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
  date_created date
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

def params = ["Nuevo ISSUE importante, urge para ayer", 10, java.time.LocalDate.now() - 20]
def insertSql = "insert into issue(description, priority, date_created) values(?,?,?);"
sql.execute insertSql, params

sql.eachRow("select * from issue") { row ->
  println row
}

dataset = sql.dataSet('issue')

filterIssues = dataset.findAll {
  it.id >= 3 && it.id <= 6
}

println "*"*100
filterIssues.each {
  println it
}
println filterIssues.sql

dataset.add(
  description: "Queremos un aumento",
  priority: 2,
  date_created: java.time.LocalDate.now() - 40
)

println "Conteo de registros ${sql.rows('select * from issue').size()}"
println "Conteo de registros ${sql.rows('select count(*) as c from issue')["c"]}"

sql.withTransaction { t -> println t.properties }
