# Steps to be followed:
1) Install tomcat server, if it is not in your system. The link for installing tomcat is https://archive.apache.org/dist/tomcat/tomcat-8/v8.5.51/bin/apache-tomcat-8.5.51.zip
2) Pick the war file loaded in this github path and store it in your system
3) Upload the war file in the tomcat's webapps folder
4) Start the tomcat server by running the command "catalina.bat run" from the commandline prompt. Eg:D:\>tomcat\bin\catalina.bat run
5) We can see a folder created with all the files after war file deployment
6) Now open a browser and run http://localhost:<port>/<war file name>/<initial html/jsp/servlet file name>. Eg:http://localhost:8080/SimpleLoginScreen/simplelogin.jsp
7) After entering the login/pwd values as ravi/kumar, we can see the success screen. Otherwise, a failure login screen appears.
