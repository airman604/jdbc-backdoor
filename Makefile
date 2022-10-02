
jdbcbackdoor.jar: oracle/jdbc/OracleDriver.class META-INF/services/java.sql.Driver
	jar cf jdbcbackdoor.jar oracle/jdbc/OracleDriver.class META-INF/services/java.sql.Driver

oracle/jdbc/OracleDriver.class: oracle/jdbc/OracleDriver.java
	javac --release 8 oracle/jdbc/OracleDriver.java

JDBCBackdoorTest.class: JDBCBackdoorTest.java
	javac JDBCBackdoorTest.java

test: jdbcbackdoor.jar JDBCBackdoorTest.class
	java JDBCBackdoorTest

clean:
	-rm oracle/jdbc/OracleDriver.class JDBCBackdoorTest.class jdbcbackdoor.jar

.PHONY: clean, test
