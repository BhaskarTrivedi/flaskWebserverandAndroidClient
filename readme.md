I have created my environment on windows 10, I hope step will almost remain same for mac and Linux machine.<br/>
Install anaconda if you do not have it. <br/>
Open anaconda command prompt in admin mode <br/>
Create virtual env  <br/>
conda create -n Datamining python 3.6 <br/>
Activate your anaconda virtual env <br/>
  Activate Datamining <br/>
Install flask <br/>
  pip install flask <br/>
install android studio  <br/>
If you haven’t created any project in android, please follow hello world for android  <br/>
    https://google-developer-training.gitbooks.io/android-developer-fundamentals-course-practicals/content/en/Unit%201/11_p_hello_world.html <br/>
Server Code using flask and saved it as server.py  <br/>
execute python DataMiningServer.py <br/>
it will start your basic server, for me generated URL was http://127.0.0.1:5000/  <br/>
![](https://github.com/BhaskarTrivedi/flaskWebserverandAndroidClient/blob/master/flaskServer.JPG)
create some basic android project you can fork my project also. <br/>
If you are using my project use user name as Bhaskar and password as imbhaskar at login screen. <br/>
Click on login button, it will send and received JSON object to and from flask web server <br/>

Android side API
ReadReceivedJson : parse received JSON Object from server <br/>
CreateDatatoSend : Create JSON data to send to server <br/>
getResponseFromServer :  Will create URL connection and request POST message from server <br/>
AsyncTask : will start Asynchronous connection request with server <br/>
doInBackground : Will run the thread in background <br/>
onPostExecute :  Execute after it receive response from server <br/>

I have printed received JSON object at log an android editor

![](https://github.com/BhaskarTrivedi/flaskWebserverandAndroidClient/blob/master/LogServer.JPG)

