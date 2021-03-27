import static groovyx.gpars.GParsPool.withPool

withPool {
  def urls = ['https://grails.org', 'https://groovy-lang.org', 'https://www.makingdevs.com']
  Closure download = {url ->
    println "Descargando $url"
    url.toURL().text.toUpperCase()
  }

  Closure cachingDownload = download.gmemoize() // Evita confusiones con memoize de Groovy

  println 'Groovy hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('GROOVY')}
  println 'Grails hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('GRAILS')}
  println 'Griffon hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('GRIFFON')}
  println 'Gradle hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('GRADLE')}
  println 'Concurrency hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('CONCURRENCY')}
  println 'GPars hoy: ' + urls.findAllParallel {url -> cachingDownload(url).contains('GPARS')}
}

withPool {
  def urls = ['https://grails.org', 'https://groovy-lang.org', 'https://www.makingdevs.com']
  println 'Número de ocurrencias de GROOVY en todos los sitios: ' + urls.parallel
  .map {it.toURL().text.toUpperCase()}
  .filter {it.contains('GROOVY')}
  .map{it.split()}
  .map{it.findAll{word -> word.contains 'GROOVY'}.size()}
  .sum()
}
