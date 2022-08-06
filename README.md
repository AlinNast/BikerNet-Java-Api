# BikerNet-Java-API
This is the Api App for my personal project BikerNet implemented with Java


## What I've learned:
- How to create Api endpoints in the controllers


## How to install:
1. Clone this repo

2. Have Intellij Installed https://www.jetbrains.com/idea/download/

3. Install Maven:
   - Download Maven: https://maven.apache.org/download.cgi
   - Install Maven: https://maven.apache.org/install.html

4. Install MySql: 
https://dev.mysql.com/downloads/installer/
https://dev.mysql.com/downloads/workbench/

5. On the installation of the mysql installer it was asked for a root password
  - Now configure the application.propreties like this:
   `spring.datasource.url=jdbc:mysql://localhost:3306/bikernet?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=<<your root password>>
   spring.jpa.hibernate.ddl-auto=update`

6. Create a connection on Mysql workbench and create a schema within it called 'bikernet'

6. Run the project




<!-- questions:  -->