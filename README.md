# jdbc-backdoor
A fake JDBC driver that allows OS command execution. Can be used on systems that allow you to upload JDBC drivers for database connections (usually due to licensing issues with re-distributing the drivers).

Read more here: https://medium.com/@airman604/introducing-jdbc-backdoor-175fbb509f62

# Building
To build **jdbc-backdoor** you need to have Java installed:
`make`

To test:
`make test`

# Customizing
Review `oracle/jdbc/OracleDriver.java` and update commands to be executed.
