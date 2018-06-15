IF NOT EXIST bin MKDIR bin
javac -encoding utf8 -sourcepath src -d bin src/Task2/Main.java
java -classpath bin Task2.Main
pause