IF NOT EXIST bin MKDIR bin
javac -encoding utf8 -sourcepath src -d bin src/Task1/Main.java
java -classpath bin Task1.Main
pause