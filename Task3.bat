IF NOT EXIST bin MKDIR bin
javac -encoding utf8 -sourcepath src -d bin src/Task3/Main.java
java -classpath bin Task3.Main
pause