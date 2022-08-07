# BikerNet-Java-API
This is the Api App for my personal project BikerNet implemented with Java
It features a Controller with all the CRUD Operations


## What I've learned:
- How to create Api endpoints
- How to create Database Models
- How to connect Database to Api


## How to install:
1. Clone this repo

2. Have Intellij Installed https://www.jetbrains.com/idea/download/

3. Install Maven:
   - Download Maven: https://maven.apache.org/download.cgi
   - Install Maven: https://maven.apache.org/install.html

4. Install MySql: 
   - Install MySql Installer: https://dev.mysql.com/downloads/installer/
   - Install MySql Workbecnch: https://dev.mysql.com/downloads/workbench/

5. Upon the installation of the mysql installer it was asked for a root password
  - Now configure the application.propreties like this:
   ```
      spring.datasource.url=jdbc:mysql://localhost:3306/bikernet?useSSL=false&serverTimezone=UTC
      spring.datasource.username=root
      spring.datasource.password=<<your root password>>
      spring.jpa.hibernate.ddl-auto=update
   ```

6. Create a connection on Mysql workbench and create a schema within it called 'bikernet'

6. Run the project

## What it does:

#### It is the server application for a website where users can upload, edit, delete, and view posts (created by other users)

 - A post created by a user:
![image](https://user-images.githubusercontent.com/70013669/183280079-2cf1f16f-1a7a-4bf4-8b38-5a23dc1b7f7a.png)
![image](https://user-images.githubusercontent.com/70013669/183280244-e32b9ce2-c757-4fd5-8163-8e7f76ca41c4.png)

 - A post edited by a user:
![image](https://user-images.githubusercontent.com/70013669/183280333-e12b9194-bcd1-4668-a78a-8f8b08a6761f.png)
![image](https://user-images.githubusercontent.com/70013669/183280356-7f52ca22-077a-449a-bade-5c15cce05912.png)

 - A post deleted by a user:
![image](https://user-images.githubusercontent.com/70013669/183280552-961eaac2-bb8d-4fae-bf7a-99a5baf45722.png)
![image](https://user-images.githubusercontent.com/70013669/183280410-fb22dca7-af56-4ce3-aa1f-614c14a7997c.png)


#### The app was tested with Postman

<!-- questions:  -->
