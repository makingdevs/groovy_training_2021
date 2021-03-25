import groovy.json.*

payload = new URL("https://api.github.com/repos/makingdevs/MyBarista/issues").text

jsonSlurper = new JsonSlurper()

document = jsonSlurper.parseText(payload)

document.each { issue ->
  println "*"*100
  println """
  ID: ${issue.id.trim()}
  TITLE: ${issue.title.trim()}
  BODY: ${issue.body.trim()}
  LABELS:
  """
  issue.labels.each { label ->
    println """
    - ${label.name.trim()}
    """
  }
}
