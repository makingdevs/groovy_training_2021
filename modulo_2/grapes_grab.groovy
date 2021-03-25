@Grapes([
  @Grab(group='org.apache.camel', module='camel-core', version='3.8.0'),
  @Grab(group='org.apache.camel', module='camel-file', version='3.8.0')
  //@Grab(group='com.proveedor', module='super.biblioteca', version='2.33')
  //@Grab('org.apache.camel:camel-core:3.8.0')
])

import org.apache.camel.impl.DefaultCamelContext
import org.apache.camel.builder.RouteBuilder

def camelContext = new DefaultCamelContext()

camelContext.addRoutes(new RouteBuilder() {
  def void configure(){
    from("file://inputdir/?delete=true").to("file://outputdir")
  }
})

camelContext.start()
println "Camel started"

addShutdownHook { camelContext.stop() }
synchronized(this) { this.wait() }
