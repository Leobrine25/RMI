# RMI
Uso do RMI para fazer uma simples calculadora de distancia euclidiana entre 2 computadores.
A use of RMI to make a simple euclidean distance calculator between 2 computer(Everything in the code is portuguese)

# How to/pt-br

### Servidor

Para execução do Servidor, primeiramente entre em Server.java e Troque \*Servidor Local da Maquina* para seu ip.Para achar facilmente, use o prompt de comando e faça "ipconfig" e procure por ipv4

*Local que você deve trocar é* "System.setProperty("java.rmi.server.hostname", "\*Servidor Local da Maquina*")"

*Como deve ficar:*"System.setProperty("java.rmi.server.hostname", "198.192.x.x")

Abrindo a pasta no prompt de comando, faça "Javac server.java" e "java server.java", 
Para parar o servidor, utilize um ctrl+c e utilize "java ClearRegistry.java" para limpar o registro do nome, para ser possivel executar o servidor sem problemas

### Cliente

Para a execução do Cliente, Abra cliente.java e dentro do try, troque \*IP LOCAL* pelo ipv4 colocado anteriormente(o da maquina do Server)

*Local que você deve trocar é* "Calculo calc = (Calculo) Naming.lookup("rmi://\*IP LOCAL*:1099/CalcService")";

*Como deve ficar* "Calculo calc = (Calculo) Naming.lookup("rmi://\192.168.x.x:1099/CalcService")";

e execute "javac cliente.java" e "java cliente.java" para fazer ele funcionar em si.


PS: É possivel substituir o IPV4 por um ip na rede, pórem nesse exemplo é um servidor Local simples;
