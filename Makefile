
all:
	./gradlew build

run:
	java -cp retrofit-2.5.0.jar:converter-gson-2.5.0.jar:okhttp-3.14.0.jar:logging-interceptor-3.14.0.jar -jar build/libs/foo-boot-0.1.0.jar
