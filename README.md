# Kaiburr-test

<b>Files:</b><br/>
<b>Screenshot</b> - It contains the Screenshot of the application.<br/>
<b>Server</b> - It the Spring project with Task 1, Task 4. And for Task 2, it contains the JAR file and the dockerfile to create the image.<br/>
<b>docker-compose.yml</b> -Contains YML code to compose teh setup. <br/>
<b>swagger.yaml</b> - Contains the YAML code.<br/>
<br/><br/>

<b>Dependencies Used</b><br/>
1. Web<br/>
2. DevTools<br/>
3. Lombook<br/>
4. Swagger<br/>
5. MongoDB<br/>
6. Thymeleaf<br/>

<b>Task 1 & Task 4</b><br>
I have created the project using Spring Framework and for the backend mongoDB is used. The endpoints for the project are <br/>
1. /add (Add the details to the database) <br/>
2. /getById (Retrive the data using ID) <br/>
3. /getByName ( Retrive the Data using name) <br/>
4. /deleteById (Delete from the Database using ID) <br/>

The Restfull API's which are beign called were tested using postman. And these are:<br/>
1. /addServer <br/>
2. /findByName <br/>
3. /findByID <br/>
4. /deleteByID <br/>

<b>Controller: /Server/src/main/java/com/spring/test/controller</b><br/>

<b> Task 3 </b></br>
To Run in docker.</br>
Open terminal</br>
Go to Server/target </br>
And run <i>docker build . -t server </i> </br>
This will create a image of the JAR file. </br>
Now run the docker-compose.yml using <i> docker-compose up. </i> </br>
Now using web Browser at localhost:8086 we can use the endpoints.</br>

<b> Task 2 </b></br>
To create the Swagger API is Used the online edittor. And downloaded the code as Server for Spring. But was unable to make it work. So I Have upload the YAML file which I was able to create. </br>

<b>Screenshots</b><br>

1. /add : used to add details<br/>
<img src="Screenshots/Docker/1)%20Add%20the%20data.png"> <br/>

2. /done : after the data for successfull inserted <br/>
<img src="Screenshots/Docker/2)%20Confirmation%20of%20data.png"> <br/>

3. /getById : To get the server detials by ID <br/>
<img src="Screenshots/Docker/3)%20Find%20by%20id.png"> <br/>

4. /getByName : To get the server detials by Name <br/>
<img src="Screenshots/Docker/5)%20Find%20by%20name.png"> <br/>

5. /deleteById : To delete the server details by ID <br/>
<img src="Screenshots/Docker/7)%20Delete%20by%20id.png"> <br/>

For More Screenshots please check the folder. <br/>

