homeDir = System.getProperty('user.home')
f = new File(homeDir)

println f.class.name

dirs = []
f.eachDir { dirs << it }
//println dirs

files = []
f.eachFile { files << it}
//println files

println new File("./categorias.groovy").text
